<%-- 
    Document   : loginCheck
    Created on : Apr 18, 2015, 7:02:03 PM
    Author     : Bhanu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.primecodes.indreni.connection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Class.forName("com.mysql.jdbc.Driver");
            String username =  request.getParameter("user");
            String password = request.getParameter("pass");
            
            DBConnection conn = new DBConnection();
            String sql = "Select password FROM tbl_login WHERE username =?";
            PreparedStatement stmt = conn.initStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = conn.fetch();
            while(rs.next()){
                if(rs.getString("password").equalsIgnoreCase(password)){
                    response.sendRedirect("addOwner?insertion=");
                }
                else{
                    response.sendRedirect("login.jsp");
                }
            }
        %>
    </body>
</html>
