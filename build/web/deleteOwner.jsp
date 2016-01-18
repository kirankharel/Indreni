<%-- 
    Document   : deleteOwner
    Created on : Apr 13, 2015, 8:47:25 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.dao.impl.OwnerDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.OwnerDAO"%>
<%@page import="com.primecodes.indreni.beans.Owner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Owner Page</title>
    </head>
    <body>
        <%
        
                
                
                Class.forName("com.mysql.jdbc.Driver");
                    OwnerDAO oDAO = new OwnerDAOImpl();
                    oDAO.delete(Integer.parseInt(request.getParameter("owner_id")));
                    
                    response.sendRedirect("searchOwner?ownerName=&ownerNumber=");
    %>
    </body>
</html>
