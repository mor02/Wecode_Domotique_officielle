package myeasyhome.javabean;

import java.util.LinkedList;

public class Piece {

	private int idPiece;
	private String libelle;
	private LinkedList listeEntite = new LinkedList();
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public Piece(int idPiece, String libelle, LinkedList listeEntite) {
		super();
		this.idPiece = idPiece;
		this.libelle = libelle;
		this.listeEntite = listeEntite;
	}

	public Piece(int idPiece, String libelle) {
		super();
		this.idPiece = idPiece;
		this.libelle = libelle;
		
	}
	public int getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public LinkedList getListeEntite() {
		return listeEntite;
	}

	public void setListeEntite(LinkedList listeEntite) {
		this.listeEntite = listeEntite;
	}

	@Override
	public String toString() {
		return "Piece [idPiece=" + idPiece + ", libelle=" + libelle
				+ ", listeEntite=" + listeEntite + "]";
	}
	
	
	
}
