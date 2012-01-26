package myeasyhome.Controlers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import myeasyhome.exceptions.UserException;
import myeasyhome.modeles.ModeleLogin;

 
public class Login extends HttpServlet {
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
            String login = request.getParameter("loginSaisi");
            String pass = request.getParameter("passSaisi");
 
            // Si tous les champs du formulaire ont été remplis
            if (!"".equals(login) && !"".equals(pass)) {
            	ModeleLogin modeleLogin = new ModeleLogin(ds);
                  try {
                        // Si le service valide l'utilisateur
                        if (modeleLogin.checkUserPassword(login, pass) != null) {
                             request.setAttribute("loggedUser", login);
                             getServletContext().getRequestDispatcher("/logged.jsp")
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
                  getServletContext().getRequestDispatcher("/index.jsp")
                             .forward(request, response);
            }
      }
}
