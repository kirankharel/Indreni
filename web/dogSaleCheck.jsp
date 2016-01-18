<%-- 
    Document   : dogSaleCheck
    Created on : Apr 15, 2015, 4:19:42 PM
    Author     : kiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.primecodes.indreni.connection.DBConnection"%>
<%@page import="com.primecodes.indreni.dao.impl.DogSaleDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogSaleDAO"%>
<%@page import="com.primecodes.indreni.beans.DogSale"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <%
        
        DogSale t=new DogSale();

//        
              t.setOwnerId(Integer.parseInt(request.getParameter("owner_id")));
              t.setdogId(Integer.parseInt(request.getParameter("dog_id")));
             
              t.setAmount(request.getParameter("amount"));
              t.setDate(request.getParameter("registered_date"));
               
                              
               
                
                Class.forName("com.mysql.jdbc.Driver");
              DogSaleDAO dao=new DogSaleDAOImpl();
                   dao.insertDogSaleRecord(t);
                    response.sendRedirect("addDogSale?owner_id=1&insertion=success");
    %>
    </body>
</html>
