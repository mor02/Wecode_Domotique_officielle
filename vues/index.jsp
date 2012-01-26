<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String urlapplication=getServletContext().getInitParameter("urlapplication"); %>
<%
  String indexPage=(String)request.getParameter("page");
  if(indexPage==null) indexPage="principal";
  String nomPage= "pages/"+indexPage+".jspf";
  
%>
      <jsp:include page="header.jspf"/>
      <jsp:include page="<%=nomPage%>"/>
      <jsp:include page="footer.jspf"/>
