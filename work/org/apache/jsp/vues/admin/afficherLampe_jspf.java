package org.apache.jsp.vues.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import myeasyhome.javabean.Lampe;
import myeasyhome.modeles.ModeleLampe;

public final class afficherLampe_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" <div class=\"slider\" id=\"tabs_block\">\r\n");
      out.write("      <div class=\"slice1\" id=\"section-1\">\r\n");
      out.write("        <p class=\"img\">&nbsp;</p>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <h2>Liste des Lampes </h2>\r\n");
      out.write("        <p> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");



// on récupère les données
ArrayList listeLampe=(ArrayList)request.getAttribute("listeLampe");


      out.write("\r\n");
      out.write("\r\n");
      out.write("<table  border=\"1\" cellspacing=\"0\" cellpadding=\"4\">\r\n");
      out.write("  <tr bgcolor=\"#2e597b\">\r\n");
      out.write("    <td width=\"150\">REFERENCE </td>\r\n");
      out.write("    <td width=\"150\">ID PIECE</td>\r\n");
      out.write("    <td width=\"150\">ETAT </td>\r\n");
      out.write("    <td width=\"150\">FOURNISSEUR</td>\r\n");
      out.write("    <td width=\"150\">ETAT FCT</td>\r\n");
      out.write("    \r\n");
      out.write("  </tr>\r\n");
      out.write("   ");

for(int i=0;i<listeLampe.size();i++)
{
Lampe lampe=(Lampe)listeLampe.get(i);
String etat="off";
String etatfct="en panne";
if(lampe.getEtat()==1) etat="on"; 
if(lampe.getEtatFct()==1) etatfct="ok"; 

out.println("<tr>");
out.println("<td>"+lampe.getReference()+"</td>");
out.println("<td>"+lampe.getIdPiece()+"</td>");
out.println("<td>"+etat+"</td>");
out.println("<td>"+lampe.getFournisseur()+"</td>");
out.println("<td>"+etatfct+"</td>");
out.println("</tr>");
}
out.println("</table>");


      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("         </p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"body_menu_nav\">\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("    <div class=\"clr\"></div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
