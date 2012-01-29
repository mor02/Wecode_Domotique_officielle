package myeasyhome.Controlers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import myeasyhome.exceptions.PieceException;
import myeasyhome.javabean.Lampe;
import myeasyhome.modeles.ModeleLampe;;

 
public class ControleurLampe extends HttpServlet {
      private static final long serialVersionUID = 1L;
 
      // Si on tente d'accéder directement à la Servlet, on redirige vers index.jsp
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //getServletContext().getRequestDispatcher("/index.jsp")
              //          .forward(request, response);
    	  doPost(request, response);
      }
 
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  	DataSource ds=null;
  			ds=(DataSource)getServletContext().getAttribute("datasource"); 
			
  			if( request.getParameter("envoyerAjouterLampe")!=null){

	    	  // Récupération des données du formulaire
	            String refLampe = request.getParameter("refLampe");
	            String FournisseurLampe = request.getParameter("FournisseurLampe");
	 
	            // Si tous les champs du formulaire ont été remplis
	            if (!"".equals(refLampe) && !"".equals(FournisseurLampe))
	            {
	            	// construction de l'entite Lampe à ajouter
	            	Lampe nouvelleLampe = new Lampe(refLampe,FournisseurLampe,1,1,1,1,1,1,1);
	            	
	            	//instanciation du model
	            	
	            	ModeleLampe modeleLampe = new ModeleLampe(ds);
	            	
	            	//ajout de la nouvelle entite Lampe dans la BD
	            		
	            		if(modeleLampe.ajouterLampe(nouvelleLampe)==1)
	            		
	            		{
	            			request.setAttribute("messageValide", "la Lampe est bien ajoutée");
	            			getServletContext().getRequestDispatcher("/vues/index.jsp?page=ajouterLampe").forward(request, response);
	            		}
	            		
	            		else 
	            		{
	            			request.setAttribute("messageValide", "la Lampe n'est pas bien ajoutée");
	            			getServletContext().getRequestDispatcher("/vues/index.jsp?page=ajouterLampe").forward(request, response);
	            		}
	            	 }
	            // Si le formulaire est incomplet, renvoi vers le formulaire avec un message d'erreur
	            else {
	                  request.setAttribute("erreur", "Saisies insuffisantes");
	                  getServletContext().getRequestDispatcher("ajouterEntite.jspf")
	                             .forward(request, response);
	            }
      }
			
  			
	else 
	//plus d'info
	if (request.getParameter("listerLampe")!=null){
				
					//System.out.println("jjjj");
		ModeleLampe modeleLampe=new ModeleLampe(ds);
		ArrayList<Lampe> listeLampe=(ArrayList<Lampe>) modeleLampe.listerLampe();
	    request.setAttribute("listeLampe", listeLampe);         
	    getServletContext().getRequestDispatcher("/vues/index.jsp?page=afficherLampe").forward(request, response);
			            	            
	}	
				
   }		
}
