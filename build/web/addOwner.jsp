<%-- 
    Document   : addOwner
    Created on : Feb 18, 2015, 9:09:52 AM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Heading Page</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.3.min.js"></script>
    
    
		<style type="text/css">
                    body{
                        background: rgba(233,231,211,1);
                    }
                    td{

                        padding-top: 15px;
                    }

                    input[type=text]{
                        width: 350px;        	
                        height: 25px;
                        /*padding: 10px;
                        */        	
                        margin-left: 5px;        	
                        text-align:center;
                    }
                    
                    #body_div{
                        background: #d5d8e1;
                    }

                </style>
                <script type="text/javascript">
                    
                </script>
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
				  <li role="navigation"  class="active"><a href="addOwner?insertion=">Client</a></li>
				  <li role="navigation"><a href="addDog?owner_id=1&insertion=">Dog</a></li>
				  <li role="navigation"><a href="marketting?owner_id=1">Marketting</a></li>
				  <li role="navigation" ><a href="technician.html">Technician</a></li>
				  <li role="navigation"><a href="dailyCase.html">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation" ><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				  <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div>
                        
			<div id="body_div">
                            
                            <div id="form_div">
                            <form action="ownerCheck.jsp" method="get">
				<table>
					<tr>
						<th>First Name  : </th>	
                                                <td><input type="text" name="fname" placeholder="Enter First Name" required="required" class=""/></td>
					</tr>
					<tr>
						<th>Middle Name  : </th>	
						<td><input type="text" name="mname" placeholder="Enter Middle Name" /></td>
					</tr>
					<tr>
						<th>Last Name  : </th>	
						<td><input type="text" name="lname" placeholder="Enter Last Name" /></td>
					</tr>
					<tr>
						<th>Address  : </th>	
						<td><input type="text" name="address" placeholder="Enter Address" /></td>
					</tr>
					<tr>
						<th>House No.  : </th>	
						<td><input type="text" name="house_number" placeholder="Enter House No" /></td>
					</tr>
					<tr>
						<th>Primary Contact No. :</th>
						<td><input type="text" name="primary_phone_number" required="required" placeholder="Enter Phone no." /></td>
					</tr>
					<tr>
						<th>Secondary Contact No. :</th>
						<td><input type="text" name="secondary_phone_number" placeholder="Enter Phone no." /></td>
					</tr>
					
					<tr>
                                            <td>
                                               
                                                 
                                                
                                            </td>
						<td><Button style="position:absolute;margin-left: -343px;margin-top: -12;"type="Submit" value="submit" class="btn btn-success">Submit</button></td>
						<td><Button style="position:absolute;margin-left: -137px;margin-top: -12;" type="Reset" class="btn btn-danger">Reset</button></td>
					</tr>
                                        
                                        <!-- To notify Insertion Success  -->
                                        <%
                                            if (request.getParameter("insertion").equalsIgnoreCase("success")) {
                                        %>
                                        <span class="alert alert-success" role="alert" id="success_alert">
                                            Record Inserted Successfully!!
                                        </span>
                                        <script type="text/javascript">
                                            $("#success_alert").show();
                                            $("#success_alert").fadeOut(5000);
                                        </script>
                                        <%
                                            }
                                        %>
				</table>
                                </form>
                                </div>
                                
                            
                        </div>
                        
		</div>
	</body>
</html>