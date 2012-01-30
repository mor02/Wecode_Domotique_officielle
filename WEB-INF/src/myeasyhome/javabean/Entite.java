/*DATE CREATION - 26/01/2012
 * PROGRAMMEUR - AMGHAR MOHAMED AMINE
 * 
 * 
 * */


package myeasyhome.javabean;

public class Entite {

	private String reference;
	private String fournisseur;
	private int etat;
	
	public Entite() {
		// TODO Auto-generated constructor stub
	}

	public Entite(String reference, String fournisseur, int etat) {
		super();
		this.reference = reference;
		this.fournisseur = fournisseur;
		this.etat = etat;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Entite [reference=" + reference + ", fournisseur="
				+ fournisseur + ", etat=" + etat + "]";
	}
	
	
}
