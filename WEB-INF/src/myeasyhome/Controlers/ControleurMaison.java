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
import myeasyhome.modeles.ModeleMaison;

//Date création: 27/01/2012

public class ControleurMaison extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HttpSession session;

	// Si on tente d'accéder directement à la Servlet, on redirige vers
	// index.jsp
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		DataSource ds = null;
		ds = (DataSource) getServletContext().getAttribute("datasource");
		
		
		//ArrayList<Maison> maisons = new ModeleMaison(ds).Lister_Maison();
		//request.setAttribute("maisons", maisons);

	/*	String op = request.getParameter("maison");
		if (op.equals("Ajouter")) {
			System.out.println("Controle Ajout");
			String adr = request.getParameter("ad");
			String pro = request.getParameter("pr");

			try {

				if (adr.equals("")) {
					System.out.println("Adresse obligatoire");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {

				if (pro.equals("")) {
					System.out.println("nom du propriétaire obligatoire");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				Maison m = new Maison();
				m.setAdresse_Maison(adr);
				m.setProprietaire_Maison(pro);

				if (new ModeleMaison(ds).Ajouter_Maison(m)) {
					System.out.println("Maison ajouté");
					getServletContext().getRequestDispatcher(
							"/admin/listMaison.jspf")
							.forward(request, response);
				}

			} catch (Exception e) {
				System.out
						.println("Erreur bloc instruction Controleur Maison: "
								+ e.getMessage());
			}
		}
*/
	}
}
