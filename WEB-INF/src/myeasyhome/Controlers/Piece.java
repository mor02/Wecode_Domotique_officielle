package myeasyhome.Controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import myeasyhome.exceptions.PieceException;;
import myeasyhome.javabean.Entite;
import myeasyhome.modeles.ModelPiece;;

 
public class Piece extends HttpServlet {
      private static final long serialVersionUID = 1L;
 
      // Si on tente d'accéder directement à la Servlet, on redirige vers index.jsp
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/index.jsp")
                        .forward(request, response);
      }
 
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  	DataSource ds=null;
  			ds=(DataSource)getServletContext().getAttribute("datasource");  
    	  // Récupération des données du formulaire d'index.jsp
            String refEntite = request.getParameter("refEntite");
            String FournisseurEntite = request.getParameter("FournisseurEntite");
 
            // Si tous les champs du formulaire ont été remplis
            if (!"".equals(refEntite) && !"".equals(FournisseurEntite))
            {
            	
            	//ToDo Reccupération de la piece dans laquelle on veut ajouter l'entite
            	
            	myeasyhome.javabean.Piece p1 = new myeasyhome.javabean.Piece("1", "cuisine");
            	
            	// construction de l'entite à ajouter
            	Entite nouvelleEntite = new Entite(refEntite, FournisseurEntite, 0);
            	
            	//instanciation du model
            	
            	ModelPiece modelePiece = new ModelPiece(ds);
            	
            	//on teste est qu'on a le droit d'ajouter une nouvelle entite dans la piece
            	if(modelePiece.isAtoriserToAddEntite(p1))
            	{
            		//ajout de la nouvelle entite dans la liste
            		p1.getListeEntite().add(nouvelleEntite);
            		
            		//ajout de la nouvelle entite dans la BD
            		
            		int result = modelePiece.ajouterEntite(nouvelleEntite);
            		
            		if(result == 1)
            		{
            			request.setAttribute("messageValide", "l'entite est bien ajouté");
            			getServletContext().getRequestDispatcher("/admin/RAjoutEntite.jsp").forward(request, response);
            		}
            	}
            	
                 /
            }
            // Si le formulaire est incomplet, renvoi vers le formulaire avec un message d'erreur
            else {
                  request.setAttribute("erreur", "Saisies insuffisantes");
                  getServletContext().getRequestDispatcher("/admin/AjouterPiece.jspf")
                             .forward(request, response);
            }
      }
}
