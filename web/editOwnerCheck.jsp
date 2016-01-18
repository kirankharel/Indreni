<%-- 
    Document   : editOwnerCheck
    Created on : Apr 13, 2015, 7:58:11 PM
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
        <title>Edit Check</title>
    </head>
    <body>
        <%
        Owner o = new Owner();
                o.setId(Integer.parseInt(request.getParameter("id")));
                o.setFname(request.getParameter("fname"));
                o.setMname(request.getParameter("mname"));
                o.setLname(request.getParameter("lname"));
                o.setAddress(request.getParameter("address"));
                o.setHouseNumber(request.getParameter("house_number"));
                o.setPrimaryPhoneNumber(request.getParameter("primary_phone_number"));
                o.setSecondaryPhoneNumber(request.getParameter("secondary_phone_number"));
        
                
                Class.forName("com.mysql.jdbc.Driver");
                    OwnerDAO oDAO = new OwnerDAOImpl();
                    oDAO.update(o);
                    
                    response.sendRedirect("addOwner.jsp?insertion=success");
    %>
    </body>
</html>
