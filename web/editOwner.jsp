<%-- 
    Document   : editOwner
    Created on : Apr 13, 2015, 7:48:54 PM
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
				  <li role="navigation" class="active"><a href="addOwner?insertion=">Client</a></li>
                                  <li role="navigation"><a href="addDog?owner_id=1&insertion=">Dog</a></li>
				  <li role="navigation"><a href="marketting">Marketting</a></li>
				  <li role="navigation"><a href="technician.html">Technician</a></li>
				  <li role="navigation"><a href="dailyCase.html">Daily Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation"><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				 <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div>
                        
			<div id="body_div">
                            
                            <div id="form_div">
                            <form action="editOwnerCheck.jsp" method="get">

                                <table>
                                    
                                    <tr>
                                        	<th>ID  : </th>	
                                                <td><input type="text" name="id" value="${requestScope.owner.getId()}" required="required" class="" readonly="readonly"/></td>
                                    </tr>
                                        
					<tr>
						<th>First Name  : </th>	
                                                <td><input type="text" name="fname" value="${requestScope.owner.getFname()}" required="required" class=""/></td>
					</tr>
					<tr>
						<th>Middle Name  : </th>	
						<td><input type="text" name="mname" value="${requestScope.owner.getMname()}" /></td>
					</tr>
					<tr>
						<th>Last Name  : </th>	
						<td><input type="text" name="lname" value="${requestScope.owner.getLname()}" /></td>
					</tr>
					<tr>
						<th>Address  : </th>	
						<td><input type="text" name="address" value="${requestScope.owner.getAddress()}" /></td>
					</tr>
					<tr>
						<th>House No.  : </th>	
						<td><input type="text" name="house_number" value="${requestScope.owner.getHouseNumber()}" /></td>
					</tr>
					<tr>
						<th>Primary Contact No. :</th>
						<td><input type="text" name="primary_phone_number" required="required" value="${requestScope.owner.getPrimaryPhoneNumber()}" /></td>
					</tr>
					<tr>
						<th>Secondary Contact No. :</th>
						<td><input type="text" name="secondary_phone_number" value="${requestScope.owner.getSecondaryPhoneNumber()}" /></td>
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