<%-- 
    Document   : login
    Created on : Apr 15, 2015, 8:53:22 AM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Indreni</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

       
        <style>
    			input[type=text],input[type=password]{
				height:30px;
			}
	</style>
        
        
    </head>
    <body>
         <div class="well well-sm">
            <div class="page-header" id="title_text">
                <h1><span id="indreni_heading">Indreni</span> <small>Kennel and Vet Service</small></h1>
            </div>
        </div>  
        <div class="well well-large">
            <div style="margin:0px auto;">
			<form action="${pageContext.request.contextPath}/loginCheck.jsp">
                <table class="table table-condensed" style="margin: 0px auto;width: 500px;background: #7D9C9F" align="center">
                    <tr>
                        <th>Username: </th>
                        <td><input type="text" name="user" id="user"/></td>                            
                    </tr>
                    <tr>
                        <th>Password: </th>
                        <td><input type="password" name="pass" id="pass"/></td>                            
                    </tr>   
						<tr>
							<td colspan=2 align=center><button id="submitButton" class="btn btn-success" STYLE="MARGIN:0px 0px 0px 200px">Login</button></td>
						</tr>
                </table>
			</form>
            </div>
        </div>
    </body>
</html>
