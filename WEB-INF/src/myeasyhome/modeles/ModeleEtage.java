package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import javax.sql.DataSource;

import myeasyhome.javabean.Etage;
import myeasyhome.javabean.Maison;

public class ModeleEtage {

	DataSource ds = null;
	Connection connection = null;
	PreparedStatement ps;

	public ModeleEtage(DataSource ds) {
		this.ds = ds;
	}

	public boolean Ajouter_Etage(Etage et) {

		String sql = "insert into etage (id_maison, numero) values ("
				+ et.getM().getId_Maison()+ "," +et.getNum_Etage()+ ")";
		System.out.println(sql);

		try {

			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			System.out.println("Erreur methode ajouter etage: "
					+ e.getMessage());
			return false;
		}

	}

	public boolean Supprimer_Etage(Etage et) {

		String sql = "delete from etage where numero=" + et.getNum_Etage();

		try {
			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
			connection.close();
			return true;

		} catch (Exception e) {
			System.out.println("Erreur methode supprimer etage: "
					+ e.getMessage());
			return false;
		}
	}

	// ArrayList

	public ArrayList<Etage> Lister_Etage(Maison m) {
		ArrayList<Etage> etages = new ArrayList<Etage>();
		// + m.getId_Maison()
		String sql = "select * from etage where id_maison =" + m.getId_Maison();
		
		try {
			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Etage et = new Etage();
				et.setNum_Etage(rs.getInt(3));
				et.setM(m);
				etages.add(et);
			}
			rs.close();
			ps.close();
			connection.close();
			return etages;

		} catch (Exception e) {
			System.out.println("Echec liste des étages par maison: "
					+ e.getMessage());
			return null;
		}

	}
}
