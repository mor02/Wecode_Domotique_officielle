package myeasyhome.modeles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import myeasyhome.boiteoutils.OutilsBaseDeDonnees;
import myeasyhome.exceptions.UserException;

public class ModeleLogin {
	DataSource ds = null;
	Connection connection = null;
	ResultSet rs = null;
	public ModeleLogin(DataSource ds) {
		this.ds = ds;
	}
	
	
public String checkUserPassword (String login , String passwd)throws UserException{
		
		
		PreparedStatement requete = null;
		
		String sql="SELECT * FROM USER Where login=" + login +" AND passwd="+ passwd;
		return "eee"; 
	}	
	

}
