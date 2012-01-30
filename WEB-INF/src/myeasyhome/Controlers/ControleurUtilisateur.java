package myeasyhome.Controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import myeasyhome.exceptions.UserException;
import myeasyhome.javabean.Utilisateur;
import myeasyhome.modeles.ModeleUtilisateur;

 
public class ControleurUtilisateur extends HttpServlet {
      private static final long serialVersionUID = 1L;
      public HttpSession session ;
 
      // Si on tente d'accéder directement à la Servlet, on redirige vers index.jsp
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            getServletContext().getRequestDispatcher("/index.jsp")
                        .forward(request, response);
      }
 
      protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  	DataSource ds=null;
  			ds=(DataSource)getServletContext().getAttribute("datasource");  
    	  // Récupération des données du formulaire de login.jsp
            String login = request.getParameter("userLogin");
            String passwd = request.getParameter("userPasswd");
 
            // Si tous les champs du formulaire ont été remplis
            if (!"".equals(login) && !"".equals(passwd)) {
            	Utilisateur user = new Utilisateur();
            	user.setLogin(login);
            	user.setPasswd(passwd);
            	ModeleUtilisateur modeleLogin = new ModeleUtilisateur(ds);
                  try {
                        // Si le service valide l'utilisateur on r'envois le type d'utlisateur
                	  	// 1 : pour un simple utlisateur : user.
                	  	// 2 : pour un administrateur 
                	  
                        if (modeleLogin.checkUserPassword(user) == 1 || modeleLogin.checkUserPassword(user) == 2) {
                             session = request.getSession(true);
                             session.setAttribute("loggedUser", login); 
                             String type = null;
                             if(modeleLogin.checkUserPassword(user)== 1){
                            	  type="user";
                             }else{
                            	type="admin";	 
                             }
                             session.setAttribute("typeUser", type); 
                             getServletContext().getRequestDispatcher("/vues/index.jsp?page=accueil")
                             .forward(request, response);
                        }
                  } catch (UserException e) {
                        // Sinon, renvoi vers le formulaire avec le message d'erreur retourné par le service
                        request.setAttribute("erreur", e.getMessage());
                        getServletContext().getRequestDispatcher("/index.jsp")
                                   .forward(request, response);
                  }
            }
            // Si le formulaire est incomplet, renvoi vers le formulaire avec un message d'erreur
            else {
                  request.setAttribute("erreur", "Saisies insuffisantes");
                  getServletContext().getRequestDispatcher("/vues/index.jsp?page=login")
                             .forward(request, response);
            }
      }


      
}
