<%-- 
    Document   : search
    Created on : Apr 7, 2015, 8:31:12 PM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Searching Page</title>
		
		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
		<link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    
		<style type="text/css">
		body{
            background: rgba(233,231,211,1);
        }
       td{

            padding-top: 15px;
        }
        input{
        	width: 150px;
        	padding-left: 20px;
        	text-align:center;
        }
		</style>
		<script type="text/javascript"></script>
	</head>
	<body>
		<div id="content">
		<div class="well well-sm">
			<div class="page-header" id="title_text">
  				<h1><span id="indreni_heading">Indreni</span> <small>Kennel and Vet Service</small></h1>
			</div>
		</div>	

			<div id="navigation_bar">

				<ul class="nav nav-pills">
				  <li role="navigation"><a href="addOwner?insertion=">Client</a></li>
				  <li role="navigation"><a href="addDog?insertion=">Dog</a></li>
				  <li role="navigation"><a href="marketting">Marketting</a></li>
				  <li role="navigation"><a href="technician">Technician</a></li>
				  <li role="navigation"><a href="dailyCase">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation" ><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				  <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div>
                    <form class="navbar-form" role="search">
                        <div class="input-group" style="text-align:right;margin:20px;">
                            <input type="text" class="form-control" placeholder="Search by First Name" name="ownerName" style="height:40px;width:200px;">
                            <button type="submit" class="btn btn-danger btn-small">Go</button>
                            <input type="text" class="form-control" placeholder="Search By Last Name" name="ownerLName" style="height:40px;width:200px;">
                            <button type="submit" class="btn btn-danger btn-small">Go</button>
                            <br>
                            <input type="text" class="form-control" placeholder="Search By Phone Number" name="ownerNumber" style="height:40px;width:200px;">
                            <button type="submit" class="btn btn-danger btn-small">Go</button>
                            
                        </div>
                    </form>
			
				<table class="table table-striped">
					
					<tr>
                                            <th>Client Id: </th>
						<th>First Name  : </th>	
						<th>Middle Name :</th>
						<th>Last Name: </th>						
						<th>Address:</th>
						<th>House No.:</th>
						<th>Primary Contact No. : </th>
						<th colspan="3">Option</th>
					</tr>
                                        <c:forEach var="owner" items="${requestScope.ownersByName}">
					<tr>
                                            <td>${owner.getId()}</td>
                                            <td>${owner.getFname()}</td>
                                            <td>${owner.getMname()}</td>
                                            <td>${owner.getLname()}</td>
                                            <td>${owner.getAddress()}</td>
                                            <td>${owner.getHouseNumber()}</td>
                                            <TD>${owner.getPrimaryPhoneNumber()}</TD>
                                                <td><a href="viewOwner?owner_id=${owner.getId()}">View</a></td>
						<td><a href="editOwner?owner_id=${owner.getId()}&insertion=">Edit</a></td>
						<td><a href="deleteOwner.jsp?owner_id=${owner.getId()}" onClick="deleteCheckBox(${owner.getId()})">Delete</a></td>
					</tr>
                                        </c:forEach>
                                        
                                        
				</table>

                    <script>
                        function deleteCheckBox(ownerValue){
                            var x;
                                if (confirm("Are you sure you want to delete?") == true) {
                                    self.location=self.location.protocol+'//'+self.location.host+'deleteOwner.jsp'+'?owner_id='+ownerValue;
                                } else {
                                    x = "You pressed Cancel!";
                                }
                        }
                    </script>
		
		</div>
	</body>
</html>