package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import javax.sql.DataSource;

import myeasyhome.javabean.Maison;

public class ModeleMaison {

	DataSource ds = null;
	Connection connection = null;
	PreparedStatement ps;

	public ModeleMaison(DataSource ds) {
		this.ds = ds;
	}

	public boolean Ajouter_Maison(Maison m) {

		String sql = "insert into maison (Adresse,proprietaire) values ('"
				+ m.getAdresse_Maison() + "','" + m.getProprietaire_Maison()
				+ "')";
		try {
			connection = ds.getConnection();

			ps = connection.prepareStatement(sql);
			ps.executeUpdate();

			return true;

		} catch (Exception e) {
			System.out.println("Erreur methode ajouter maison: "
					+ e.getMessage());
			return false;
		}

	}

	public boolean Supprimer_Maison(Maison m) {

		String sql = "delete from maison where id_maison=" + m.getId_Maison();

		try {
			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
			connection.close();
			return true;

		} catch (Exception e) {
			System.out.println("Erreur methode supprimer maison: "
					+ e.getMessage());
			return false;
		}
	}

	public ArrayList<Maison> Lister_Maison() {
		ArrayList<Maison> maisons = new ArrayList<Maison>();

		String sql = "select * from maison";
		System.out.println(sql);

		try {
			connection = ds.getConnection();
			System.out.println("1");
			ps = connection.prepareStatement(sql);
			System.out.println("1");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Maison m = new Maison();
				m.setId_Maison(rs.getInt(0));
				m.setAdresse_Maison(rs.getString(1));
				m.setProprietaire_Maison(rs.getString(2));

				maisons.add(m);
			}
			rs.close();
			ps.close();
			connection.close();
			return maisons;

		} catch (Exception e) {
			System.out.println("Echec liste des maisons:" + e.getMessage());
			return null;
		}

	}

}
