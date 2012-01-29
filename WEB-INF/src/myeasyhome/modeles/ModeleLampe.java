package myeasyhome.modeles;
// by yassin
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;
import java.util.ArrayList;

import myeasyhome.boiteoutils.OutilsBaseDeDonnees;
import myeasyhome.javabean.Entite;
import myeasyhome.javabean.Lampe;

public class ModeleLampe {

	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;

	ArrayList listeLampe = new ArrayList();
	
	public ModeleLampe(DataSource ds) {
		this.ds = ds;
	}
	
	
	//ajouter lampe
	public int ajouterLampe(Lampe l)
	{
		/*Attente de la mise en place de la BD*/
		PreparedStatement requete = null;
		PreparedStatement requete2 = null;
	 	
		String sql2="insert into entite values('"+l.getReference()+"','"+l.getEtatFct()+"','"+l.getFournisseur()+"','"+l.getIdPhysique()+"','"+l.getIdGroupe()+"', '"+l.getIdDroit()+"','"+l.getIdLigne()+"','"+l.getIdPiece()+"','"+l.getEtat()+"')";
        String sql="insert into lampe values( NULL,'"+l.getReference()+"');" ;
	    System.out.println(sql2);
     try {
			// ouvrir une connexion
			connection = ds.getConnection();
			// enregistrements
			int x=230;
			requete = connection.prepareStatement(sql);
			requete2= connection.prepareStatement(sql2);
			int j= requete2.executeUpdate();
			if(j!=0 ){
			int i= requete.executeUpdate();
			
			if (i != 0 ) {
				
	         // System.out.println("bien ajouter"); 
				return 1;
				}
			else //System.out.println(" pas bien ajouter");
				return 0;
			} else // System.out.println(" entité sa marche pas");
				     return 0;
			
		} catch (Exception e) {
			System.out.println("Erreur dans la classe ModeleLampe.java fonction ajouterLampe");
		
		}
		return 0;
	}
	
	public ArrayList listerLampe(){
		PreparedStatement requete = null;

		
		try {
			// ouvrir une connexion
			connection = ds.getConnection();
			// enregistrements
			requete = connection.prepareStatement("SELECT * FROM entite , lampe where entite.Reference=lampe.reference");
			rs = requete.executeQuery();
			// exécuter la requête
			
			if (rs != null) {
				// stocker tous les articles dans une liste
				while (rs.next()) {
					// créer un objet lampe
					Lampe lampe = new Lampe();
					// renseigner l’objet lampe avec ses accesseurs
                     
					 lampe.setReference(rs.getString("reference"));
					 lampe.setEtat(rs.getInt("etat"));
					 lampe.setEtatFct(rs.getInt("EtatFonc"));
					 lampe.setFournisseur(rs.getString("fournisseur"));
					 lampe.setIdPiece(rs.getInt("id_piece"));
					                    
					// stocker l’objet lampe dans la liste
					listeLampe.add((Lampe) lampe);

				}		
			} 
		} catch (Exception e) {
			System.out
					.println("Erreur dans la classe ModeleLampe.java fonction ListeLampe");
		}
		return listeLampe;
		}
	
	//lister lampe d'une piece 
	public ArrayList listerLampePiece(int idPiece){
		PreparedStatement requete = null;

		
		try {
			// ouvrir une connexion
			
			connection = ds.getConnection();
			// enregistrements
			requete = connection.prepareStatement("SELECT * FROM entite , lampe where entite.Reference=lampe.reference and entite.id_piece='"+idPiece+"'");
			rs = requete.executeQuery();
			// exécuter la requête
			
			if (rs != null) {
				// stocker tous les articles dans une liste
				while (rs.next()) {
					// créer un objet lampe
					Lampe lampe = new Lampe();
					// renseigner l’objet lampe avec ses accesseurs
                     
					 lampe.setReference(rs.getString("reference"));
					 lampe.setEtat(rs.getInt("etat"));
					 lampe.setEtatFct(rs.getInt("EtatFonc"));
					 lampe.setFournisseur(rs.getString("fournisseur"));
					 lampe.setIdPiece(rs.getInt("id_piece"));
					                    
					// stocker l’objet lampe dans la liste
					listeLampe.add((Lampe) lampe);

				}		
			} 
		} catch (Exception e) {
			System.out
					.println("Erreur dans la classe ModeleLampe.java fonction ListeLampe");
		}
		return listeLampe;
		}
	
}
