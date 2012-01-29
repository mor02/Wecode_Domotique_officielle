package myeasyhome.javabean;

public class Entite {

	private String reference;
	private String fournisseur;
	private int etat;
	//yassin  :   attribut etatFct avec les set et get
	private int etatFct;
	
	private int idGroupe;
	private int idDroit;
	private int idLigne;
	private int idPiece;
	private int idPhysique;  
	


	public Entite() {
		// TODO Auto-generated constructor stub
	}

	
//consthhh

	public Entite(String reference, String fournisseur, int etat, int etatFct,
			int idGroupe, int idDroit, int idLigne, int idPiece, int idPhysique) {
		super();
		this.reference = reference;
		this.fournisseur = fournisseur;
		this.etat = etat;
		this.etatFct = etatFct;
		this.idGroupe = idGroupe;
		this.idDroit = idDroit;
		this.idLigne = idLigne;
		this.idPiece = idPiece;
		this.idPhysique = idPhysique;
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

	public void setEtatFct(int etatFct) {
		this.etatFct = etatFct;
	}

	public int getEtatFct() {
		return etatFct;
	}
	
	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public int getIdDroit() {
		return idDroit;
	}

	public void setIdDroit(int idDroit) {
		this.idDroit = idDroit;
	}

	public int getIdLigne() {
		return idLigne;
	}

	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}

	public int getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
	}
	
	public int getIdPhysique() {
		return idPhysique;
	}


	public void setIdPhysique(int idPhysique) {
		this.idPhysique = idPhysique;
	}
}
