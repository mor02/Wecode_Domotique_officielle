<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% // un petit test pour voir le fonctionnement de GIT
  String indexPage=(String)request.getParameter("page");
   String chemin = (String)session.getAttribute("typeUser");
   
  if(indexPage==null) indexPage="accueil";   //premier connexion
  if(chemin==null)  chemin ="commun";		// utlisateur non authentifié

  String cheminPage= chemin+"/"+indexPage+".jspf";
  
%>
      <jsp:include page="commun/header.jspf"/>
      <jsp:include page="<%=cheminPage%>"/>
      <jsp:include page="commun/footer.jspf"/>
