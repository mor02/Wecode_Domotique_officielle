package org.apache.jsp.vues.commun;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jspf extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(1);
    _jspx_dependants.add("/vues/commun/../css/style.css");
  }

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


  String UserName=(String)session.getAttribute("loggedUser");
 String textLogin1 =null;
 String pageLogin1 =null;
 String textLogin2 =null;
 String pageLogin2 =null;
	
if(UserName !=null){
	textLogin1 ="Bienvenu : " +UserName  ;
	pageLogin1 ="deconnexion" ;
	textLogin2 ="deconnexion" ;
	pageLogin2 ="deconnexion" ;
	
}else{
	textLogin1 ="connexion"  ;
	pageLogin1 ="connexion" ;
	textLogin2 ="Apropo" ;
	pageLogin2 ="apropo" ;
}

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<style>\r\n");
      out.write("@charset \"utf-8\";\r\n");
      out.write("body { margin:0; padding:0; width:100%; background:url(/MyEasyHome/vues/images/bg_main.gif);}\r\n");
      out.write("html { padding:0; margin:0;}\r\n");
      out.write("\r\n");
      out.write("/* main */\r\n");
      out.write(".main {width:100%; padding:0; margin:0 auto; background:url(/MyEasyHome/vues/images/main_bg.jpg) top repeat-x; }\r\n");
      out.write(".resize { width:955px; margin:0 auto;}\r\n");
      out.write("\r\n");
      out.write("/********** header **********/\r\n");
      out.write(".header { }\r\n");
      out.write("\r\n");
      out.write(".block_header {margin:0 auto; width:980px;}\r\n");
      out.write(".top_menu { float:right; padding:4px 10px; font:normal 11px Tahoma, Geneva, sans-serif; color:#4e4e4e; line-height:1.6em;}\r\n");
      out.write(".top_menu a { font:normal 11px Tahoma, Geneva, sans-serif; color:#4e4e4e; text-decoration:none;}\r\n");
      out.write(".top_menu a:hover {text-decoration:underline;}\r\n");
      out.write("/* logo */\r\n");
      out.write(".logo { float:left; padding:0; margin:10px 0 0 0; width:232px;}\r\n");
      out.write(".login { float:right; padding:5px 5px; margin:70px 0 0 0; width:150px;}\r\n");
      out.write(".login p { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#948172; padding:0; margin:0;}\r\n");
      out.write(".login a { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#948172; text-decoration:none;}\r\n");
      out.write(".login a:hover { font:bold 11px Georgia, \"Times New Roman\", Times, serif; color:#948172; text-decoration: underline;}\r\n");
      out.write("\r\n");
      out.write("/* blog_menu */\r\n");
      out.write(".blog_menu {width:992px; height:70px; margin:0px auto 0 auto; padding:0; background: url(/MyEasyHome/vues/images/menu_bg.jpg) top no-repeat;}\r\n");
      out.write("\r\n");
      out.write("/* search */\r\n");
      out.write(".search { padding:0; margin:20px 0 0 0; width:250px; float:right; height:38px;}\r\n");
      out.write(".search span { display:block; float:left;}\r\n");
      out.write(".search a { display:block; float:left; padding:10px 10px 0 10px; line-height:1.6em; color:#4270a1; font:normal 11px Georgia, \"Times New Roman\", Times, serif; text-decoration:none;}\r\n");
      out.write(".search a:hover { text-decoration:underline;}\r\n");
      out.write(".search form { display:block; float:left; padding:5px 10px 0 10px;}\r\n");
      out.write(".search form .keywords { float:left; background: none; border:0; height:16px; width:140px; padding:5px 10px; line-height:16px; margin:0 10px 0 0; font:normal 12px Tahoma, Geneva, sans-serif; color:#000;}\r\n");
      out.write(".search form .button { float:left;}\r\n");
      out.write("\r\n");
      out.write("/* menu */\t\r\n");
      out.write(".menu { padding:0; margin:20px 0 0 0; width:550px; float:left; height:43px;}\r\n");
      out.write(".menu ul { padding:0; margin:0 20px; list-style:none; border:0;}\r\n");
      out.write(".menu ul li { float:left; margin:0; padding:0 3px; border:0;}\r\n");
      out.write(".menu ul li a { float:left; margin:0; padding:10px 0; color:#555555; font:bold 12px  Georgia, \"Times New Roman\", Times, serif; text-decoration:none;}\r\n");
      out.write(".menu ul li a span { padding:10px 20px; background:none;}\r\n");
      out.write(".menu ul li a:hover { background: url(/MyEasyHome/vues/images/r_menu.gif) no-repeat right top;}\r\n");
      out.write(".menu ul li a:hover span { background:url(/MyEasyHome/vues/images/l_menu.gif) no-repeat left top;}\r\n");
      out.write(".menu ul li a.active {  background:url(/MyEasyHome/vues/images/r_menu.gif) no-repeat right top;}\r\n");
      out.write(".menu ul li a.active span { background:url(/MyEasyHome/vues/images/l_menu.gif) no-repeat left top;}\r\n");
      out.write("\r\n");
      out.write("/********** slider **********/\r\n");
      out.write(".slider { background:#72941b url(/MyEasyHome/vues/images/screen_bg.jpg) top no-repeat; width:992px; margin:0 auto; padding:0;}\r\n");
      out.write("\r\n");
      out.write(".title_page { background:url(/MyEasyHome/vues/images/title_bg.jpg) top no-repeat; margin:0 auto; padding:0; height:83px; width:992px;}\r\n");
      out.write(".title_page h1 { margin:0; padding:0; color:#ffffff; font:normal 48px Georgia, \"Times New Roman\", Times, serif; text-indent:50px; line-height:1.6em;}\r\n");
      out.write("\r\n");
      out.write("/*simple text*/\r\n");
      out.write(".simple { width:992px; margin:0 auto; padding:0;}\r\n");
      out.write(".simple h2 { width:400px; float:left; font:normal 30px Georgia, \"Times New Roman\", Times, serif; color:#fff; padding:10px 0 0 30px; margin:0;}\r\n");
      out.write(".simple .text { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#fff; width:200px; float:left; margin:10px 0; padding:0;}\r\n");
      out.write("\r\n");
      out.write(".slider div.slice1 { margin:0 auto; width:952px; height:300px; padding:10px 10px;}\r\n");
      out.write(".slider div.slice1 p.img { float:left; padding:0; margin:0 30px;}\r\n");
      out.write(".slider div.slice1 h2 { font:normal 48px Georgia, \"Times New Roman\", Times, serif; color:#fff; margin:0; margin:0; padding:10px 0; line-height:1.2em; float:none;}\r\n");
      out.write(".slider div.slice1 p { font:normal 14px Georgia, \"Times New Roman\", Times, serif; color:#fff; margin:0; margin:0; line-height:1.6em;}\r\n");
      out.write("\r\n");
      out.write("ul.body_menu_nav { float:left; padding:10px 20px 0 20px; margin:0 auto; list-style:none; width:952px; background:url(/MyEasyHome/vues/images/menu_nav_bg.jpg) no-repeat top; height:70px;}\r\n");
      out.write("ul.body_menu_nav li { float:left; display:block; padding:20px 7px 0 7px; margin:0; width:224px;}\r\n");
      out.write("ul.body_menu_nav li span { display:block; padding:12px 10px;}\r\n");
      out.write("ul.body_menu_nav li img { padding:0 5px;}\r\n");
      out.write("ul.body_menu_nav li a { display:block; font:normal 18px Georgia, \"Times New Roman\", Times, serif; color:#484848; text-decoration:none; line-height:1.8em;}\r\n");
      out.write("ul.body_menu_nav li.tabs-selected { background:url(/MyEasyHome/vues/images/menu_nav_bg_h.gif) no-repeat center top;}\r\n");
      out.write("ul.body_menu_nav li.tabs-selected a { background:url(/MyEasyHome/vues/images/b_r_menu.gif) no-repeat right top;}\r\n");
      out.write("ul.body_menu_nav li.tabs-selected a span { background:url(/MyEasyHome/vues/images/b_l_menu.gif) no-repeat left top;}\r\n");
      out.write("ul.body_menu_nav li a:hover { background:url(/MyEasyHome/vues/images/b_r_menu.gif) no-repeat right top;}\r\n");
      out.write("ul.body_menu_nav li a:hover span { background:url(/MyEasyHome/vues/images/b_l_menu.gif) no-repeat left top;}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/********** block index **********/\r\n");
      out.write(".body { width:972px; margin:10px auto; padding:0; background:#fff url(/MyEasyHome/vues/images/body_b.gif) no-repeat bottom;}\r\n");
      out.write(".body_t_i { background:url(/MyEasyHome/vues/images/body_t.gif) no-repeat top;}\r\n");
      out.write(".body h2 { font:normal 18px Georgia, \"Times New Roman\", Times, serif; color:#2c2c2c; margin:0; padding: 10px 0;}\r\n");
      out.write(".body h3 { font:normal 18px Georgia, \"Times New Roman\", Times, serif; color:#545454; padding:10px 0; margin:0; line-height:1.2em;}\r\n");
      out.write(".body p { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#545454; line-height:1.8em;}\r\n");
      out.write(".body em { font:italic 12px Georgia, \"Times New Roman\", Times, serif; color:#797979; line-height:1.8em; padding:10px 0 0 10px;}\r\n");
      out.write(".body strong { color:#2c2c2c;}\r\n");
      out.write("\r\n");
      out.write("/*Welcome*/\r\n");
      out.write(".Welcome { width:570px; margin:5px auto; padding:10px 30px; float: right;}\r\n");
      out.write(".Welcome ul { list-style:none; margin:20px auto 20px auto; padding:10px 10px;}\r\n");
      out.write(".Welcome ul li { padding:5px 0 5px 20px; margin:0; font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#2c2c2c; line-height:1.8em;}\r\n");
      out.write(".Welcome ul li strong { color:#a63812; font:bold 11px Georgia, \"Times New Roman\", Times, serif; line-height:1.8em;}\r\n");
      out.write(".Welcome a { font:bold 11px Georgia, \"Times New Roman\", Times, serif; color:#7b9519;}\r\n");
      out.write("\r\n");
      out.write("/*navigation*/\r\n");
      out.write("ul.navigation  { margin:0; padding:0 10px;}\r\n");
      out.write("ul.navigation li { list-style:none; border-bottom:1px solid #d9d9d9; padding:5px 10px; margin:0;}\r\n");
      out.write("ul.navigation li a { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#2c2c2c; text-decoration:none;}\r\n");
      out.write("ul.navigation li a:hover { color:#99ac1e; text-decoration: underline;}\r\n");
      out.write("ul.navigation li a.active { color:#99ac1e; text-decoration: underline;}\r\n");
      out.write("\r\n");
      out.write("/* lister */\r\n");
      out.write(".lister { padding:10px; text-align:center;}\r\n");
      out.write("\r\n");
      out.write("/*BoX*/\r\n");
      out.write(".Box { width:280px; margin:5px auto; padding:10px 30px; float:left;}\r\n");
      out.write(".Box a { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#7b9519; text-decoration:underline;}\r\n");
      out.write(".Box .link { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#08896f; text-decoration:underline; float: none; background:none; padding:0;}\r\n");
      out.write(".Box span { font:bold 11px Georgia, \"Times New Roman\", Times, serif; color:#959595;}\r\n");
      out.write(".Box em { padding:0; margin:0; font:italic 11px Georgia, \"Times New Roman\", Times, serif; color:#505050; line-height:1.8em;}\r\n");
      out.write(".Box p.name { font:bold italic 11px Georgia, \"Times New Roman\", Times, serif; color:#505050; text-align:right; padding:0; margin:0;}\r\n");
      out.write("\r\n");
      out.write("/* testimonial */\r\n");
      out.write(".testimonial { background:url(/MyEasyHome/vues/images/bg_testimonials_c.gif) repeat-y left; width:257px; margin:0; border:0;}\r\n");
      out.write(".testimonial div { background:url(/MyEasyHome/vues/images/bg_testimonials_b.gif) no-repeat bottom left; width:257px; margin:0; border:0;}\r\n");
      out.write(".testimonial div div { background:url(/MyEasyHome/vues/images/bg_testimonials_t.gif) no-repeat top left; padding:5px 10px; width:237px;}\r\n");
      out.write(".testimonial p { margin:0; padding:10px; line-height:1.8em;}\r\n");
      out.write("\r\n");
      out.write("/********** contact form **********/\r\n");
      out.write("#contactform { margin:0; padding:5px 10px;}\r\n");
      out.write("#contactform * { color:#222222;}\r\n");
      out.write("#contactform ol { margin:0; padding:0; list-style:none;}\r\n");
      out.write("#contactform li { margin:0; padding:0; background:none; border:none; display:block;}\r\n");
      out.write("#contactform li.buttons { margin:5px 0 5px 110px;}\r\n");
      out.write("#contactform label { margin:0; width:110px; display:block; padding:10px 0; font:bold 11px Arial, Helvetica, sans-serif; color:#505050; text-transform:capitalize; float:left;}\r\n");
      out.write("#contactform label span { color:#ff0000;}\r\n");
      out.write("#contactform input.text { width:400px; border:1px solid #dcdcdc; margin:10px 0; padding:5px 2px; height:16px; background:#f5f5f5; float:left;}\r\n");
      out.write("#contactform textarea { width:400px; border:1px solid #dcdcdc; margin:10px 0; padding:2px; background:#f5f5f5; float:left;}\r\n");
      out.write("#contactform li.buttons input { padding:3px 0; margin:0; border:0; color:#FFF; float:left;}\r\n");
      out.write("p.response { text-align:center; color:#2c2c2c; font: bold 11px Arial, Helvetica, sans-serif; line-height:1.8em; width:auto;}\r\n");
      out.write("\r\n");
      out.write(".FBG { border-top:1px solid #fff; background:#e5e5e5; border-bottom:1px solid #c5c5c5;}\r\n");
      out.write(".FBG em { font:bold italic 11px Georgia, \"Times New Roman\", Times, serif; color:#616161; float: right;}\r\n");
      out.write(".FBG h2 { font:normal 18px Georgia, \"Times New Roman\", Times, serif; color:#0d0d0d; border-bottom:1px solid #c3c3c3; padding:20px 5px 20px 50px; margin:0;}\r\n");
      out.write(".FBG p { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#616161; line-height:1.6em;}\r\n");
      out.write(".FBG img { margin:5px 5px; padding:0; float:left;}\r\n");
      out.write(".FBG a { font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#08896f; text-decoration:none;}\r\n");
      out.write(".FBG_resize { width:980px; margin:10px auto; padding:0; }\r\n");
      out.write(".fbg_box { width:300px; float:left; margin:10px 5px; padding:5px 5px; }\r\n");
      out.write(".Contact { width:300px; float:left; margin:10px 5px; padding:5px 5px; }\r\n");
      out.write(".Contact h2 { background:url(/MyEasyHome/vues/images/h2_bg_Contact.gif) left no-repeat;}\r\n");
      out.write(".Say { width:300px; float:left; margin:10px 5px; padding:5px 5px;}\r\n");
      out.write(".Say h2 { background:url(/MyEasyHome/vues/images/h2_bg_They.gif) left no-repeat;}\r\n");
      out.write(".What { width:300px; float:left; margin:10px 5px; padding:5px 10px;}\r\n");
      out.write(".What h2 { background:url(/MyEasyHome/vues/images/h2_bg_What.gif) left no-repeat;}\r\n");
      out.write(".What a { float:right; background:url(/MyEasyHome/vues/images/bg_a_What.gif) left no-repeat; padding:0 0 0 20px; font: bold  11px Georgia, \"Times New Roman\", Times, serif; color:#0d0d0d;}\r\n");
      out.write("/********** footer **********/\r\n");
      out.write(".footer { background: url(/MyEasyHome/vues/images/bg_footer.gif); padding:0; width:972px; margin:0px auto; height:54px;}\r\n");
      out.write(".footer p { text-align:center; font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#2c2c2c; padding:15px 5px; margin:0;}\r\n");
      out.write(".footer a {font:normal 11px Georgia, \"Times New Roman\", Times, serif; color:#2c2c2c; text-decoration:none;}\r\n");
      out.write("\r\n");
      out.write("p.clr, .clr { clear:both; padding:0; margin:0; background:none;}\r\n");
      out.write("li.bg, .bg { clear:both; border-top:1px solid #d9d9d9; padding:0; margin:5px 0; background:none;}");
      out.write(" \r\n");
      out.write("</style>\r\n");
 String urlapplication =getServletContext().getInitParameter("urlapplication"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/jquery.tabs.css\" rel=\"stylesheet\" type=\"text/css\" media=\"print, projection, screen\" />\r\n");
      out.write("<script src=\"js/jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.tabs.pack.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#tabs_block').tabs({ fxFade: true, fxSpeed: 'fast' });\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- Additional IE/Win specific style sheet (Conditional Comments) -->\r\n");
      out.write("<!--[if lte IE 7]>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery.tabs-ie.css\" type=\"text/css\" media=\"projection, screen\">\r\n");
      out.write("<![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"block_header\">\r\n");
      out.write("      <div class=\"logo\"> <a href=\"");
out.println(urlapplication);
      out.write("\"><img src=\"/MyEasyHome/vues/images/logo.png\" width=\"355\" height=\"75\" border=\"0\" alt=\"logo\" /></a> </div>\r\n");
      out.write("      <div class=\"login\">\r\n");
      out.write("        <p>\r\n");
      out.write("        <a href=\"");
out.println(urlapplication);
      out.write("vues/index.jsp?page=");
out.println(pageLogin1);
      out.write('"');
      out.write('>');
out.println(textLogin1);
      out.write("</a>\r\n");
      out.write("         | <a href=\"");
out.println(urlapplication);
      out.write("vues/index.jsp?page=");
out.println(pageLogin2);
      out.write('"');
      out.write('>');
out.println(pageLogin2);
      out.write("</a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"blog_menu\">\r\n");
      out.write("        <!-- Affiche Message d'erreur s'il ya une erreur sur une page...-->\r\n");
      out.write("      \r\n");
      out.write("      ");

      String ErreurMessage=(String)request.getAttribute("erreur");
      if(ErreurMessage!=null){
      
      out.write("\r\n");
      out.write("      <div class=\"menu\">\r\n");
      out.write("      <ul>\r\n");
      out.write("      <li><span>\r\n");
      out.write("      ");
      out.print(ErreurMessage );
      out.write("\r\n");
      out.write("      </span>\r\n");
      out.write("      </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
} 
      out.write("\r\n");
      out.write("      <div class=\"clr\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   ");
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
