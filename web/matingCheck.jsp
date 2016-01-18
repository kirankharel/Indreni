<%-- 
    Document   : matingCheck
    Created on : Apr 15, 2015, 5:02:46 PM
    Author     : kiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.primecodes.indreni.connection.DBConnection"%>
<%@page import="com.primecodes.indreni.dao.impl.MatingDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.MatingDAO"%>
<%@page import="com.primecodes.indreni.beans.Mating"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
             <%
        
      //  DogSale t=new DogSale();
        Mating t=new Mating();
        

//        
             //female
              t.setFemaleOwnerId(Integer.parseInt(request.getParameter("female_owner_id")));
              t.setFemaleDogId(Integer.parseInt(request.getParameter("female_dog_name")));
              
              t.setCharge(Integer.parseInt(request.getParameter("charge")));
              
              //male
              t.setMaleownerId(Integer.parseInt(request.getParameter("male_owner_id")));
              t.setMaleDogId(Integer.parseInt(request.getParameter("male_dog_name")));
            
              t.setDate(request.getParameter("matingDate"));
              
             
                Class.forName("com.mysql.jdbc.Driver");
                MatingDAO dao=new MatingDAOImpl();
            
                 dao.insertMatingRecord(t);
                    response.sendRedirect("addMating?female_owner_id=1&male_owner_id=1&insertion=success");
    %>
    </body>
</html>
