package myeasyhome.boiteoutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class OutilsBaseDeDonnees
{
	private static ResultSet rs;
	private String url;

	/***********************************************************
	 * Methode utile pour les requetes: SELECT
	 ***********************************************************/
	
	  public static ResultSet selection(String sql, PreparedStatement st)
	  {
		  try 
		  {
			return rs=st.executeQuery(sql);
		  } catch (SQLException e) 
		       { e.printStackTrace();System.out.println("erreur dans l'executeQuery...!");
		          return null;}
		  
	  }
	  
	  /***********************************************************
		 * Methode utile pour les requetes: DELETE,UPDATE
		 ***********************************************************/
		
	  
	  public static boolean Maj(String sql,PreparedStatement st)
	  {
		try {
			int maj=st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {e.printStackTrace();System.out.println("erreur dans la mise a jour...!");
		                           return false;
		                         }
		
	  }
	  
	/***********************************************************
	 * fermer correctement un resultset
	 ***********************************************************/
	public static void fermerConnexion(ResultSet rs)
	{
		if(rs!=null)
		{
			try
			{
				rs.close();
			}
			catch(Exception e)
			{
				System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(ResultSet)");
			}
		}
	}
	/***********************************************************
	 * fermer correctement un statement
	 ***********************************************************/
	public static void fermerConnexion(Statement stmt)
	{
		if(stmt!=null)
		{
			try
			{
				stmt.close();
			}
			catch(Exception e)
			{
				System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Statement)");
			}
		}
	}
	/***********************************************************
	 * fermer correctement une connection
	 ***********************************************************/
	public static void fermerConnexion(Connection con)
	{
		if(con!=null)
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{

				System.out.println("Erreur lors de la fermeture d’une connexion dans fermerConnexion(Connection)");
			}
		}
	}
}