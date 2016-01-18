<%-- 
    Document   : training
    Created on : Apr 10, 2015, 10:10:56 AM
    Author     : kiran
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.primecodes.indreni.connection.DBConnection"%>
<%@page import="com.primecodes.indreni.dao.impl.TrainingDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.TrainingDAO"%>
<%@page import="com.primecodes.indreni.beans.TrainingRecord"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Heading page</title>
    </head>
    <body>
        <%
        TrainingRecord t=new TrainingRecord();

//        
               t.setOwnerId(Integer.parseInt(request.getParameter("owner_id")));
               t.setDogId(Integer.parseInt(request.getParameter("dog_id")));
               t.setCharge(request.getParameter("charge"));
               t.setStartDate(request.getParameter("nepaliDate4"));
               t.setEndDate(request.getParameter("nepaliDate5"));
               
                              
               
                
                Class.forName("com.mysql.jdbc.Driver");
                TrainingDAO dao=new TrainingDAOImpl();
                   dao.insertTrainingRecord(t);
                    response.sendRedirect("addTraining?owner_id=1&insertion=success");
    %>
     
            
    </body>
</html>
