package myeasyhome.modeles;
import myeasyhome.javabean.Piece;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

import javax.servlet.SessionCookieConfig;
import javax.sql.DataSource;

import myeasyhome.javabean.Entite;
import myeasyhome.javabean.Etage;
import myeasyhome.javabean.Maison;
import myeasyhome.javabean.Piece;
import myeasyhome.javabean.Utilisateur;

public class ModelePiece {

	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;
	PreparedStatement ps;
	

	public ModelePiece(DataSource ds)
	{
		this.ds = ds;
	}
	
	
	public LinkedList listerPiece(int numEtage,int idMaison)
	{
		// le numero d'étage c'est le numero
		
		LinkedList listePieceParEtage = new LinkedList();
		
			String sql = "select * from piece p ,etage e where p.num_etage=e.numero and e.id_maison='"+idMaison+"'";
			
		
		try {
			connection = ds.getConnection();
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				
				// modification amine : parce que le shema de Etage est changé
				// on a ajouté idEtage
				Piece p = new Piece();
				p.setIdPiece(rs.getInt(1));
				p.setLibelle(rs.getString(2));
				p.setNumEtage(rs.getInt(3));
				listePieceParEtage.add(listePieceParEtage);
			}
			rs.close();
			ps.close();
			connection.close();
			return listePieceParEtage;

		} catch (Exception e) {
			System.out.println("Echec liste des étages par maison: "
					+ e.getMessage());
			return null;
		}
	}
	
	public int ajouterPieceDb(Piece p)
	{
		/*Attente de la mise en place de la BD*/
		
		
		PreparedStatement resultatRquete = null;
	
        String requete="insert into piece values( '"+p.getIdPiece()+"','"+p.getLibelle()+"','"+p.getNumEtage()+"')";
        System.out.println(requete);
	   
     try {
			// ouvrir une connexion
			System.out.println("0"); 
			//if(ds != null) System.out.println("hopla");
			this.connection = ds.getConnection();
			
			// enregistrements
			
			
			resultatRquete = this.connection.prepareStatement(requete);
			
			
			int resultat= resultatRquete.executeUpdate();
			
			
			if(resultat==1)
			{
				p.getListePiece().add(p);
				
				return 1;
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		return 0;
	}
	
}
