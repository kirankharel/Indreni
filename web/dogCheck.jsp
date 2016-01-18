<%-- 
    Document   : dogCheck
    Created on : Mar 4, 2015, 6:13:22 PM
    Author     : Bhanu
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.primecodes.indreni.beans.Dog,com.primecodes.indreni.connection.DBConnection,com.primecodes.indreni.dao.DogDAO,com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Data Inserted</h1>
        <%
            Dog d = new Dog();
            Class.forName("com.mysql.jdbc.Driver");
            DogDAO dDAO = new DogDAOImpl(new DBConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/indreni","root","")));
                
                int years = Integer.parseInt(request.getParameter("year_age"));
                int months =Integer.parseInt(request.getParameter("month_age"));
                int days = Integer.parseInt(request.getParameter("days_age"));
                
                d.setName(request.getParameter("dog_name"));
                d.setAge((years+(months/12)+(days/365)));
                d.setOwnerId(Integer.parseInt(request.getParameter("owner_id")));
                d.setBreed(request.getParameter("breed_name"));
                d.setGender(request.getParameter("gender"));
                d.setRegisteredDate(request.getParameter("registered_date"));
                
                  int breedId = dDAO.getBreedId(d.getBreed());
                      dDAO.insert(d, breedId);
                      out.print(d.toString());
                    response.sendRedirect("addDog?insertion=success&owner_id=1");
    %>

    </body>
</html>
