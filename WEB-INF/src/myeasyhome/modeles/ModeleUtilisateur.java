package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import myeasyhome.exceptions.UserException;
import myeasyhome.javabean.Maison;
import myeasyhome.javabean.Utilisateur;

public class ModeleUtilisateur {
	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;
	PreparedStatement ps;

	public ModeleUtilisateur(DataSource ds) {
		this.ds = ds;
	}

	public int checkUserPassword(Utilisateur user) throws UserException {

		PreparedStatement requete = null;

		String sql = "SELECT * FROM USER Where login=" + user.getLogin()
				+ " AND passwd=" + user.getPasswd();
		return 2; // 1 user , 2 Admin
	}

	public int MaisonUser(String login) {
		String sql = "select id_maison from utilisateur where login ='"+login+"'";

		try {
			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			Utilisateur u = new Utilisateur();

			if (rs.next()) {
				Maison m = new Maison();
				m.setId_Maison(rs.getInt(1));
				u.setM(m);
			}
			
			rs.close();
			ps.close();
			connection.close();
			System.out.println(u.getM().getId_Maison());
			return u.getM().getId_Maison();

		} catch (Exception e) {
			System.out.println("Echec maison par user: "+ e.getMessage());
			return -1;
		}

	}

}
