/*DATE CREATION - 26/01/2012
 * PROGRAMMEUR - AMGHAR MOHAMED AMINE
 * 
 * 
 * */

package myeasyhome.javabean;

import java.util.Iterator;
import java.util.LinkedList;

public class Piece {

	private int idPiece;
	private String libelle;
	private int numEtage;
	static LinkedList listeEntite = new LinkedList();
	static LinkedList listePiece = null;
	
	
	public static LinkedList listerPieceParEtage(int numEtage)
	{
		LinkedList newListe = new LinkedList();
		
		Iterator it = listePiece.iterator();
		while(it.hasNext())
		{
			Piece p = (Piece)it.next();
			
			if(p.getNumEtage()==numEtage)
			newListe.add(p);
		}
		return newListe;
	}
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public Piece(int idPiece, String libelle,int numEtage) {
		super();
		this.idPiece = idPiece;
		this.libelle = libelle;
		this.numEtage = numEtage;
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
	public static LinkedList getListePiece() {
		return listePiece;
	}
	public static void setListePiece(LinkedList listePiece) {
		Piece.listePiece = listePiece;
	}
	public int getNumEtage() {
		return numEtage;
	}
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	@Override
	public String toString() {
		return "Piece [idPiece=" + idPiece + ", libelle=" + libelle
				+ ", listeEntite=" + listeEntite + "]";
	}
	
	
	
}
