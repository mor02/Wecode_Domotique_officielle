package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import myeasyhome.boiteoutils.OutilsBaseDeDonnees;
import myeasyhome.exceptions.UserException;
import myeasyhome.javabean.Utilisateur;

public class ModeleUtilisateur {
	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;
	public ModeleUtilisateur(DataSource ds) {
		this.ds = ds;
	}
	
	
public int checkUserPassword (Utilisateur user)throws UserException{
		
		
		PreparedStatement requete = null;
		
		String sql="SELECT * FROM USER Where login=" + user.getLogin() +" AND passwd="+ user.getPasswd();
		return 2; 
	}	
	

}
