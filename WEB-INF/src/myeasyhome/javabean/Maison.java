package myeasyhome.javabean;

import java.util.Vector;

public class Maison {

	private int id_Maison;

	private String adresse_Maison;

	private String proprietaire_Maison;
	
	private Vector<Etage> etages = new Vector<Etage>();

	public Maison() {
		// TODO Auto-generated constructor stub
	}

	public Maison(int id_Maison, String adresse_Maison,
			String proprietaire_Maison) {
		this.id_Maison = id_Maison;
		this.adresse_Maison = adresse_Maison;
		this.proprietaire_Maison = proprietaire_Maison;
	}

	public int getId_Maison() {
		return id_Maison;
	}

	public void setId_Maison(int id_Maison) {
		this.id_Maison = id_Maison;
	}

	public String getAdresse_Maison() {
		return adresse_Maison;
	}

	public void setAdresse_Maison(String adresse_Maison) {
		this.adresse_Maison = adresse_Maison;
	}

	public String getProprietaire_Maison() {
		return proprietaire_Maison;
	}

	public void setProprietaire_Maison(String proprietaire_Maison) {
		this.proprietaire_Maison = proprietaire_Maison;
	}

	public Vector<Etage> getEtages() {
		return etages;
	}
	
	public void setEtages(Vector<Etage> etages) {
		this.etages = etages;
	}
}
