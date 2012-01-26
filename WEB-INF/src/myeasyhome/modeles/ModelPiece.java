package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.ResultSet;

import javax.sql.DataSource;

import myeasyhome.javabean.Entite;
import myeasyhome.javabean.Piece;

public class ModelPiece {

	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;
	
	public ModelPiece() {
		// TODO Auto-generated constructor stub
	}

	public ModelPiece(DataSource ds) {
		
		this.ds = ds;
	}
	
	// cette Permet de savoir est ce qu'on a le droit d'ajouter l'entite
	public boolean isAtoriserToAddEntite(Piece p)
	{
		
		
		return true;
	}
	
	
	public int ajouterEntite(Entite e)
	{
		/*Attente de la mise en place de la BD*/
		
		return 1;
	}
	
}
