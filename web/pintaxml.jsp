    <%@ page import="paqueteServlet.*" %>
    <%@ page import="java.util.ArrayList" %>
<%
ArrayList<Contacto> lista=(ArrayList<Contacto>)request.getAttribute("lista");
String xml=CreadorXML.crear(lista);
%>
<%=xml%>
