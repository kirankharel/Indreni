<%-- 
    Document   : editDogCheck
    Created on : Apr 14, 2015, 2:36:59 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.beans.Dog"%>
<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Dog Page</title>
    </head>
    <body>
        <%
            Dog d = new Dog();
            Class.forName("com.mysql.jdbc.Driver");
                DogDAO dDAO = new DogDAOImpl();
                float years = Integer.parseInt(request.getParameter("year_age"));
                float months =Integer.parseInt(request.getParameter("month_age"));
                float days = Integer.parseInt(request.getParameter("days_age"));
                
                
                d.setId(Integer.parseInt(request.getParameter("dog_id")));
                d.setName(request.getParameter("dog_name"));
                d.setAge((years+(months/12)+(days/365)));
                System.out.println("years: "+years+" months: "+(months/12)+" days: "+(days/365)+" Total : "+(years+(months/12)+(days/365)));
                d.setOwnerId(Integer.parseInt(request.getParameter("owner_id")));
                d.setBreed(request.getParameter("breed_name"));
                d.setGender(request.getParameter("gender"));
                d.setRegisteredDate(request.getParameter("registered_date"));
                
                  int breedId = dDAO.getBreedId(d.getBreed());
                  //System.out.println(d.toString());
                      dDAO.update(d, breedId);
                      
                    response.sendRedirect("viewOwner?owner_id="+request.getParameter("owner_id"));
                    //  out.print(d.toString()+breedId);
        %>
    </body>
</html>
