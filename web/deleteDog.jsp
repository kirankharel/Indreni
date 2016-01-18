<%-- 
    Document   : deleteDog
    Created on : Apr 14, 2015, 3:17:51 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
                
                
                Class.forName("com.mysql.jdbc.Driver");
                    DogDAO dDAO = new DogDAOImpl();
                    dDAO.delete(Integer.parseInt(request.getParameter("dog_id")));
                    
                    response.sendRedirect("viewOwner?owner_id="+request.getParameter("owner_id"));
    %>
    </body>
</html>
