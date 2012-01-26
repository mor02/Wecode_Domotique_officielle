package myeasyhome.boiteoutils;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

public class InitialisationContext implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event)
	{
	//initaliser le contexte
	Context initCtx=null;
	try
	{
	//initaliser le contexte
	initCtx=new InitialContext();
	if(initCtx==null)
	{
	throw new Exception ("Il n’y a pas de contexte !");
	}
	else
	{
	System.out.println("Contexte chargé !");
	}
	//se connecter au JNDI
	Context envCtx=(Context) initCtx.lookup
	("java:comp/env");
	DataSource ds=(DataSource) envCtx.lookup
	("jdbc_myeasyhomesql");
	if(ds==null)
	{
	throw new Exception ("Il n’y a pas de DataSource !");
	}
	else
	{
	System.out.println("DataSource chargée !");
	}
	//stocker la DataSource dans un attribut nommé ’’datasource’’ du context
	ServletContext servletContext=event.getServletContext();
	servletContext.setAttribute("datasource",ds);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	}
	finally
	{
	try
	{
	//fermer le contexte
	if(initCtx!=null)
	{
	initCtx.close();
	System.out.println("initCtx correctement déchargé !");
	}
	}
	catch(Exception e)
	{
	System.out.println("Erreur lors de initCtx !");
	}
	}
	}

	// action qui permet de détruire le filtre
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("----------- Contexte détruit -----------");
		try {
			// fermeture
			System.out.println("DataSource fermée");
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

}
