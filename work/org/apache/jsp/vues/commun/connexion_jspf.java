package org.apache.jsp.vues.commun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connexion_jspf extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("        <div class=\"slider\" id=\"tabs_block\">\r\n");
      out.write("      <div class=\"slice1\" id=\"section-1\">\r\n");
      out.write("        <p class=\"img\">&nbsp;</p>\r\n");
      out.write("        <h2>Login </h2>\r\n");
      out.write("        <div style=\"position:absolute; width: 217px; height: 165px; left: 747px; top: 207px;\">&nbsp;<img src=\"images/remote.png\" /></div>\r\n");
      out.write("        <form id=\"connexionUser\" name=\"connexionUser\" method=\"post\" action=\"do.user\">\r\n");
      out.write("          <center>\r\n");
      out.write("            <table width=\"70%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"28%\" height=\"43\" style=\"padding-left:50px\"><p>Identifiant : </p></td>\r\n");
      out.write("              <td width=\"72%\">\r\n");
      out.write("                \t<input name=\"userLogin\" type=\"text\" id=\"login\" maxlength=\"50\"  style=\"height:25px; width:250px\" />\r\n");
      out.write("                </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"38\" style=\"padding-left:50px\"><p>Mot de passe : </p></td>\r\n");
      out.write("              <td>\r\n");
      out.write("                \t<input name=\"userPasswd\" type=\"text\" id=\"password\" maxlength=\"50\" style=\"height:25px; width:250px\" />\r\n");
      out.write("              </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td height=\"45\">&nbsp;</td>\r\n");
      out.write("              <td>\r\n");
      out.write("              <INPUT TYPE=\"image\" SRC=\"images/login.png\" HEIGHT=\"30\" WIDTH=\"120\" BORDER=\"0\" ALT=\"Submit Form\">\r\n");
      out.write("             </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("          </table>        \r\n");
      out.write("          </center>\r\n");
      out.write("        \r\n");
      out.write("        </form>\r\n");
      out.write("       <p>&nbsp;</p>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <ul class=\"body_menu_nav\">\r\n");
      out.write("       \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
      out.write("    <div class=\"clr\"></div>\r\n");
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
