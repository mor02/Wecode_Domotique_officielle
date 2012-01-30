package myeasyhome.Controlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import myeasyhome.exceptions.UserException;
import myeasyhome.javabean.Etage;
import myeasyhome.javabean.Maison;
import myeasyhome.javabean.Piece;
import myeasyhome.javabean.Utilisateur;
import myeasyhome.modeles.ModeleEtage;
import myeasyhome.modeles.ModelePiece;
import myeasyhome.modeles.ModeleUtilisateur;

 
public class ControleurPiece extends HttpServlet {
      private static final long serialVersionUID = 1L;
      public HttpSession session ;
 
      // Si on tente d'accéder directement à la Servlet, on redirige vers index.jsp
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  this.doPost(request, response); 

           
      }
 
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
      {
    	  	DataSource ds=null;
  			ds=(DataSource)getServletContext().getAttribute("datasource"); 
  			
  			// l'instanciation du modele pour l'ajout dans la BD	
  			ModelePiece modelePiece = new ModelePiece(ds);
  			
  			/*recupération de l'opération*/
  			String operation = request.getParameter("operation");
  			
  			if(operation.equals("ajouterPiece"))
  			{
  				
  				//Enumeration<String> t = request.getParameterNames();
  				int idPiece = Integer.parseInt(request.getParameter("idPiece"));
  				//System.out.println(idPiece);
  				String libelle = request.getParameter("libelle");
  				//System.out.println(libelle);
  				int idEtage = Integer.parseInt(request.getParameter("idEtage"));
  				//System.out.println("moi = "+idEtage);
  				System.out.println("coucou");
  				//int idEtage =1;
  				// la creation de l'objet 
  				
  				Piece pCourante = new Piece(idPiece, libelle,idEtage);
  				
  				
  				
  				int resltBD = modelePiece.ajouterPieceDb(pCourante);
  				
  				if(resltBD==1)
  				{
  					request.setAttribute("titre", "Ajout d'une piece");
  					request.setAttribute("message", "Piece bien ajoutee");
  					getServletContext().getRequestDispatcher("/vues/index.jsp?page=PieceAjouter").forward(request, response);
  				}
  				else
  				{
  					request.setAttribute("titre", "Probleme d'ajout");
  					request.setAttribute("message", "Probleme d'ajout d'une nouvelle piece");
  					getServletContext().getRequestDispatcher("/vues/index.jsp?page=ajouterPiece").forward(request, response);
  				}
  			}
  			
  			// pour lister les piece on doit recevoir le num de l'étage.
  			
  			/*le lien : /vues/listerPiece.Piece?operation=listerPiece&numEtage=3*/
  			
  			else if(operation.equals("listerPiece"))
  			{
  				
  				int numEtage = Integer.parseInt(request.getParameter("numEtage"));
  				
  				if(!Piece.getListePiece().isEmpty())
  				{
  					request.setAttribute("numEtage", numEtage);
  					request.setAttribute("titre", "Liste des pieces");
  	  				request.setAttribute("message", "la liste du piece :");
  	  				getServletContext().getRequestDispatcher("/vues/index.jsp?page=listerPiece").forward(request, response);
  				}
  				else
  				{
  					request.setAttribute("titre", "Liste des pieces");
  	  				request.setAttribute("message", "Aucune piece n'est crée pour le moment dans cet etage");
  	  				getServletContext().getRequestDispatcher("/vues/index.jsp?page=listerPiece").forward(request, response);
  				}
  				
  			}
  			/*
  			 * vues/ajouterPiece.Piece?operation=demandeAjouterPiece
  			 */
  			else if(operation.equals("demandeAjouterPiece"))
  			{
  				//session = request.getSession(true);
  				//Utilisateur userConnecte = (Utilisateur) session.getAttribute("userConnecte");
  				/*a supprimer*/
  				//System.out.println(userConnecte.getLogin());
  				//userConnecte.getM().setId_Maison(2);
  		        //ArrayList<Etage> etages = new ModeleEtage(ds).Lister_Etage(userConnecte.getM());
  		       //System.out.println("1");
  		        //System.out.println(etages.get(1).getIdEtage());
  		        
  		        //request.setAttribute("listeEtage", etages);
  				
  				session = request.getSession(true);
  				String login = (String) session.getAttribute("loggedUser");
  				
  				int idMaison = 	new ModeleUtilisateur(ds).MaisonUser(login);
  				Maison m = new Maison();
  				m.setId_Maison(idMaison);
  				ArrayList<Etage> etages = new ModeleEtage(ds).Lister_Etage(m);
  				request.setAttribute("etages", etages);
  				
  				//System.out.println("je suis la "+etages.get(1).getNum_Etage());
  				getServletContext().getRequestDispatcher("/vues/index.jsp?page=ajouterPiece").forward(request, response);
  		        
  			}
  			
  			
      }
 
}
