<%-- 
    Document   : dailyCase
    Created on : Mar 16, 2015, 4:39:21 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.beans.Marketting"%>
<%@page import="com.primecodes.indreni.beans.Dog"%>
<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>
<%@page import="com.primecodes.indreni.beans.Owner"%>
<%@page import="com.primecodes.indreni.dao.impl.OwnerDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.OwnerDAO"%>
<%@page import="com.primecodes.indreni.dao.VaccinationMarkettingDAO"%>
<%@page import="com.primecodes.indreni.dao.impl.VaccinationMarkettingDAOImpl"%>
<%@page import="com.primecodes.indreni.beans.Marketting"%>
<%@page import="com.primecodes.indreni.dao.MarkettingDAO"%>
<%@page import="com.primecodes.indreni.dao.impl.MarkettingDAOImpl" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<title>Heading Page</title>

                <script type="text/javascript" href="${pageContext.request.contextPath}/jquery-1.11.2.min.js"></script>

                <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

            <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.11.2.min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/nepali.datepicker.js"></script>
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/nepali.datepicker.css"/>
            <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.3.min.js"></script>

    
		<style type="text/css">
		body{
            background: rgba(233,231,211,1);
        }
        table{
        	text-align:right;
        }
       td{
         	text-align:center;
       		padding-top: 5px;
       		padding-bottom: 5px;
       		padding-left:10px;
        }
        input{
        	width: 150px;
        	margin-left: 5px;        	
        	text-align:center;
        	padding: 13px 88px;
        }
        .table th, .table td{
        	text-align:center;
        }
        #form_div{
        	background-color: white;
        }

        input[type=date],input[type=text]{
        	height: 30px;
        	text-align: center;
        	font-size: 15px;
        }
        .btn-info{
        	margin-left: 35%;
        	width: 400px;
        }

        #technician_dropdown{
        	width: 150px;
        	margin: 5px 0px 10px 0px;
        	font-size: 16px;
        }
        

        #indreni_heading{
        	background-image: -webkit-gradient( linear, left top, right top, color-stop(0, #f22), color-stop(0.15, #f2f), color-stop(0.3, #22f), color-stop(0.45, #2ff), color-stop(0.6, #2f2),color-stop(0.75, #2f2), color-stop(0.9, #ff2), color-stop(1, #f22) );
  			color:transparent;
  			-webkit-background-clip: text;
  	
        }

        #daily_case_date{
        	margin-bottom: 20px;
        }

        #view_case_tech{
        	text-align: center;
        }        
        #daily_case_date{
        	text-align: center;
        }

                </style>

                <script type="text/javascript">
                    $(document).ready(function(){
                            $("#view_case").hide();
                            $("#evaluate_case").hide();
                            $("#create_case").hide();


                            //$("#view_case_date").hide();
                            $("#view_daily_case").hide();
                            $("#view_case_tech").hide();
                            //$("#create_case_date").hide();
                            $("#create_case_table").hide();
                            $("#evaluate_case_table").hide();
                            $("#postpone_date").hide();	

                            $("#view_daily").click(function(){
                                    $("#view_case_tech").toggle();
                                });

                            $("#go_button").click(function(){
                                    $("#view_daily_case").toggle();
                            });

                            $("#create_daily").click(function(){
                            $("#create_case_table").toggle();
                            });

                            $("#go_button_create").click(function(){
                                    $("#create_case_table").toggle();
                                });
                             $("#evalutate_daily").click(function(){
                    $("#evaluate_case_table").toggle();
                    });
                    
                    //$('.nepali-calendar').nepaliDatePicker();

                    $("#case_date_go").click(function(){
                            $("#view_case").show();
                                    $("#evaluate_case").show();
                                    $("#create_case").show();
                    });

                    function choosePostponeDate(){

                    var chosenOption =$('#evaluate_case :selected').val();

                            if(chosenOption== "postpone"){
                                    $("#postpone_date").show();
                            }
                            else{
                                    $("#postpone_date").hide();	
                            }
                    }

                    $("#evaluate_case").change(choosePostponeDate);
                    });

                </script>

	</head>
	<body >
		<div id="content" style="width: 1221px;">
		<div class="well well-sm">
			<div class="page-header" id="title_text">
  				<h1><span id="indreni_heading">Indreni</span> <small>Kennel and Vet Service</small></h1>
			</div>
		</div>	

			<div id="navigation_bar">

				<ul class="nav nav-pills">
				  <li role="navigation"><a href="client.html">Client</a></li>
				  <li role="navigation"><a href="dog.html">Dog</a></li>
				  <li role="navigation" ><a href="marketting.html">Marketting</a></li>
				  <li role="navigation"><a href="technician.html">Technician</a></li>
				  <li role="navigation"  class="active"><a href="dailyCase.html">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li role="navigation"><a href="dogSale.html" >Dog Sale</a></li>
				  <li role="navigation"><a href="mating.html">Mating</a></li>
				  <li role="navigation"><a href="training.html">Training</a></li>
				  <li role="navigation"><a href="search.html">Search for Client</a></li>	
				</ul>
			</div>

			<div id="form_div">
				
				<div id="daily_case_date">
					<span style="font-size:20px;">Date :</span>
                                        <form id="daily_case_date" name="daily_case_date" method="get">
                                            
                                            <input type="text"  class="nepali-calendar" name="view_case_date" style="margin:5px 10px 5px 20px;" />
                                            <button type="Submit" value="submit" class="btn btn-success" >Submit</button>
                                            
                                         </form>
					<div style="float:right;margin:4px 425px -40px 0px;"><button class="btn btn-danger" id="case_date_go">View</button></div>
				</div>
							
				<div id="view_case">
					<button id="view_daily" type="button" class="btn btn-info"><h3>View Daily Case</h3></button>

					<div id="view_table">
						<div id="view_case_tech">
							
							<div style="float:right;margin:64px 432px -20px -470px;"><button class="btn btn-danger" id="go_button">Go</button></div>
							<br><h4>Technician:</h4>
							<select id="technician_dropdown" >
                                                            <c:forEach var="technician" items="${requestScope.technicians}">
                                                                <option value="${technician.getId()}">${technician.getFname()}</option>
                                                            </c:forEach>
								
							</select>

						</div>
						<table class="table table-hover" id="view_daily_case">
							<tr>
								
								<th >Client Name</th>
                                                                <th> Address </th>
								<th >Dog Name</th>
								<th >Services</th>
								<th >Marketter</th>								
							</tr>
							
							<tr>
                                                            
								<td>Naresh Shrestha</td>
								<td>Tommy</td>
								<td>Full body check</td>
								<td>Mr. Shyam</td>
							</tr>
						</table>
					</div>
				</div>
				<div id="create_case">
					<button id="create_daily" class="btn btn-info"><h3>Create Daily Case</h3></button>

					<div id="create_case_table">
						

						<table class="table table-hover">
							<tr>
								
								<th>Client Name</th>
                                                                <th> Address </th>
								<th>Dog Name</th>
								<th>Services</th>
								<th>Marketter</th>								
								<th>Choose Doctor</th><!--Allow DropDown-->
							</tr>
                                                        <%
                                                            MarkettingDAO dao=new MarkettingDAOImpl();
                                                            Marketting marketting=new Marketting();
                                                            for(Marketting m: dao.getAll())
                                                            {%>
                                                            <tr>
                                                                <td><%= m.getName()  %></td>
                                                                <td><%= m.getAddress() %></td>
                                                                <td><%= m.getDogName() %></td>
                                                                <td><%= m.getServices() %></td>
                                                                <td><%= m.getTreatment() %></td>
                                                                <td><a href="technician.jsp?p1=<%= m.getName()%>&p2=<%= m.getDogName()%>" class="btn btn-success">Choose</a></td>
                                                            </tr>
                                                             <%
                                                            }
                                                        %>
                                                          
						</table>
					</div>
				</div>
				<div id="evaluate_case">
					<button id="evalutate_daily" class="btn btn-info"><h3>Evaluate Daily Case</h3></button>
					<div id="evaluate_case_table">
						<table class="table table-hover">
							<tr>
								<th rowspan=2>Client Name</th>
								<th rowspan=2>Dog Name</th>
								<th colspan=4>Services</th>
								<th rowspan=2>Marketter</th>								
								<th rowspan=2>Doctor</th>
								<th rowspan=2>Evaluate Case</th> <!-- Should have option done and postpone..if postpone then choose date-->
							</tr>
							<tr>
								<th>R</th>
								<th>C</th>
								<th>D</th>
								<th>Treatment</th>
							</tr>
							<tr>
								<td>Naresh Shrestha</td>
								<td>Tommy</td>
								<td><img src="assets/img/cross.jfif" style="width:15px;height:15px;"></td>
								<td><img src="assets/img/tickmark.png" style="width:15px;height:15px;"></td>
								<td><img src="assets/img/cross.jfif" style="width:15px;height:15px;"></td>
								<td>Full body check</td>
								<td>Mr. Shyam </td>
								<td>Dr. Ram Shrestha</td>
								<td>
									<select id="evaluate_case" name="evaluate_case">
										<option value="done">Done</option>
										<option value="dont">Don't Want</option>
										<option value="postpone">Postpone</option>
									</select></td><td>
									<input type="date" id="postpone_date">
								</td>
							</tr>
						</table>
					</div>
				</div>
			</div>
		
		</div>
	</body>

</html>

