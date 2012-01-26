package org.apache.jsp.vues.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ajouterEntite_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("        <h2>Ajouter une entite </h2>\r\n");
      out.write("        <p> \r\n");
      out.write("        \r\n");
      out.write("        <form name=\"ajouterEntite\" action=\"AjouterEntite.Piece\" method=\"post\">\r\n");
      out.write("        \r\n");
      out.write("        Reference :<br />\r\n");
      out.write("        <input name=\"refEntite\" type=\"text\" />\r\n");
      out.write("        Fournisseur :<br />\r\n");
      out.write("        <input name=\"FournisseurEntite\" type=\"text\" />\r\n");
      out.write("        <br />\r\n");
      out.write("        <input name=\"envoyer\" type=\"submit\" />\r\n");
      out.write("        \r\n");
      out.write("        </form>\r\n");
      out.write("         </p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("        <p>&nbsp;</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("      <ul class=\"body_menu_nav\">\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("    <div class=\"clr\"></div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
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
