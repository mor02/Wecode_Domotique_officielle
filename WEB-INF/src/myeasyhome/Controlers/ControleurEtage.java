package myeasyhome.Controlers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import myeasyhome.javabean.Etage;
import myeasyhome.javabean.Maison;
import myeasyhome.modeles.ModeleEtage;
import myeasyhome.modeles.ModeleUtilisateur;

public class ControleurEtage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpSession session;

	// Si on tente d'accéder directement à la Servlet, on redirige vers
	// index.jsp
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/index.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DataSource ds = null;
		ds = (DataSource) getServletContext().getAttribute("datasource");

		// liste etages par maison:
		session = request.getSession(true);
		String login = (String) session.getAttribute("loggedUser");
		System.out.println(login);
				
		int idMaison = 	new ModeleUtilisateur(ds).MaisonUser(login);
		
		Maison m = new Maison();
		m.setId_Maison(idMaison);
		ArrayList<Etage> etages = new ModeleEtage(ds).Lister_Etage(m);
		request.setAttribute("etages", etages);
		getServletContext().getRequestDispatcher("/vues/index.jsp?page=listEtage")
				.forward(request, response);

		// Ajouter étage par l'admin
		// n'oublie pas les sessions !!

		int num = Integer.parseInt(request.getParameter("num"));
		try {
			Etage et = new Etage();
			et.setNum_Etage(num);
			et.setM(m);

			if (new ModeleEtage(ds).Ajouter_Etage(et) == true) {
				System.out.println("Etage ajouté");
				getServletContext().getRequestDispatcher(
						"/vues/index.jsp?page=listEtage").forward(request, response);
			}

		} catch (Exception e) {
			System.out.println("Erreur bloc instruction Controleur Etage: "
					+ e.getMessage());
		}

	}
}
