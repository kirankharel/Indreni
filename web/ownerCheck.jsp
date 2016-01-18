<%-- 
    Document   : ownerCheck
    Created on : Mar 4, 2015, 12:55:34 PM
    Author     : Bhanu
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="com.primecodes.indreni.connection.DBConnection"%>
<%@page import="com.primecodes.indreni.dao.impl.OwnerDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.OwnerDAO"%>
<%@page import="com.primecodes.indreni.beans.Owner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checking owner </title>
    </head>
    <%
        Owner o = new Owner();
                o.setFname(request.getParameter("fname"));
                o.setMname(request.getParameter("mname"));
                o.setLname(request.getParameter("lname"));
                o.setAddress(request.getParameter("address"));
                o.setHouseNumber(request.getParameter("house_number"));
                o.setPrimaryPhoneNumber(request.getParameter("primary_phone_number"));
                o.setSecondaryPhoneNumber(request.getParameter("secondary_phone_number"));
        
                
                Class.forName("com.mysql.jdbc.Driver");
                    OwnerDAO oDAO = new OwnerDAOImpl(new DBConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/indreni", "root", "")));
                    oDAO.insert(o);
                    
                    response.sendRedirect("addOwner.jsp?insertion=success");
    %>
    <body>
        <%
           /* 
            
            oDAO.insert(o);*/
            
        %>
        
        DATA INSERTED
        
        
    </body>
</html>
