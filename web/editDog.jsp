<%-- 
    Document   : editDog
    Created on : Apr 13, 2015, 10:19:55 PM
    Author     : Bhanu
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
            <title>Heading Page</title>

            <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
            <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
            <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
            <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.3.min.js"></script>
            <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
            <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
            <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.11.2.min.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/nepali.datepicker.js"></script>
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/nepali.datepicker.css"/>

		<style type="text/css">
                    body{
                        background: rgba(233,231,211,1);
                    }
                    table{
                        text-align:right;
                    }
                    td{
                        text-align:left;
                        padding-top: 5px;
                        padding-bottom: 5px;
                        padding-left:10px;
                    }
                    input,select{
                        width: 150px;
                        margin-left: 5px;        	
                        text-align:center;
                    }
                </style>
		<script type="text/javascript">
                     $(document).ready(function(){
                        $('.nepali-calendar').nepaliDatePicker(); 
                        
                        $('#breed_name').val('${requestScope.dog.getBreed()}');
                    });
                    
//                  $(document).ready(function(){
//                    $('.nepali-calendar').nepaliDatePicker(); 
//                     var id = $("#ownerSelected").val(); //Gives value of Owner ID dropdownd
//                     //Setting value on page load
//                            $.get("api/ownerService",function(data){
//                                var output="";
//                               /*for(i=0;i<data.length;i++){
//                                   output+= data[i].name + "<br/>";
//                               }*/
//                               $.each(data,function(i,o){
//                                   if(o.id == id){
//                                        output+= o.fname + " " +o.mname +" "+o.lname + ", "+o.address+ " - " +o.houseNumber; 
//                                    }
//                               });
//
//                               $('#contacts').html(output);
//                            },"json");   
//                            
//                            
//                            //Changing value on dropdown value change
//                            $("#ownerSelected").on('change',function(){
//                            var id = $("#ownerSelected").val();
//                            $.get("api/ownerService",function(data){
//                                var output="";
//                               /*for(i=0;i<data.length;i++){
//                                   output+= data[i].name + "<br/>";
//                               }*/
//                               $.each(data,function(i,o){
//                                   if(o.id == id){
//                                        output+= o.fname + " " +o.mname +" "+o.lname + " "+o.address+ " - "+o.houseNumber +" - " +o.primaryPhoneNumber; 
//                                    }
//                               });
//
//                               $('#contacts').html(output);
//                            },"json");          
//
//                        });
//                    });
			
//                       function ownerSelected(){
//				var ownerValue = document.getElementById("ownerSelected").value;
//                                self.location=self.location.protocol+'//'+self.location.host+self.location.pathname+'?insertion=';
//			}
//                        
//                        //Reading from URL
//                         function getUrlParameter(sParam)
//                            {
//                                var sPageURL = window.location.search.substring(1);
//                                var sURLVariables = sPageURL.split('&');
//                                for (var i = 0; i < sURLVariables.length; i++) 
//                                {
//                                    var sParameterName = sURLVariables[i].split('=');
//                                    if (sParameterName[0] == sParam) 
//                                    {
//                                        return sParameterName[1];
//                                    }
//                                }
//                            }       
//                        
//                        
//                        To set the value of Owner ID select drop down the same as owner Detail
//                        
//                            function  checkURL(){
//
//                            var ownerId = getUrlParameter('owner_id');
//
//                            document.getElementById("ownerSelected").value = ownerId;
//                        }
		</script>
              
	</head>
	<body >
		<div id="content">
		<div class="well well-sm">
			<div class="page-header" id="title_text">
  				<h1>Indreni <small>Kennel and Vet Service</small></h1>
			</div>
		</div>	

			<div id="navigation_bar">

				<ul class="nav nav-pills">
				  <li role="navigation"><a href="addOwner?insertion=">Client</a></li>
                                  <li role="navigation"  class="active"><a href="addDog?owner_id=1&insertion=">Dog</a></li>
				  <li role="navigation"><a href="marketting">Marketting</a></li>
				  <li role="navigation"><a href="technician.html">Technician</a></li>
				  <li role="navigation"><a href="dailyCase.html">Daily Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation"><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				  <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div>

			<div id="form_div">
				<table>
                                    <form action = "editDogCheck.jsp" method="get">
					
					<tr>
						<th>Owner ID  : </th>	
						<td colspan="2" >
                                                    <select id="ownerSelected" name="owner_id" readonly='readonly'>
                                                        
                                                        <option value="${requestScope.owner.getId()}">${requestScope.owner.getId()}</option>
						</select></td>
					</tr>
                                        
                                        <tr>
                                            <th>Owner Details:</th>
                                            <td><span id="contacts">
                                                    ${requestScope.owner.getFname()} 
                                                    ${requestScope.owner.getMname()}
                                                    ${requestScope.owner.getLname()}
                                                    ${requestScope.owner.getAddress()}
                                                </span>
                                            </td>
                                            
                                        </tr>
                                        <tr>
                                            <th>Dog Id:</th>
                                            <td><input type="text" readonly="readonly" value="${requestScope.dog.getId()}" name="dog_id"/></td>
                                        </tr>
                                        <tr>
						<th>Dog Name  : </th>	
                                                <td colspan="2">
                                                    <input type="text" name="dog_name" class="form-control" value='${requestScope.dog.getName()}' class=""/>
                                                </td>
					</tr>
					<tr>
						<th>Breed  : </th>	
                                                <td colspan="2">
                                                    <select name="breed_name" id="breed_name">
                                                        <c:forEach var="breed" items="${requestScope.breeds}">
                                                            <option value="${breed}">${breed}</option>
                                                        </c:forEach>
                                                    </select>
                                                </td>
					</tr>
					<tr>
						<th>Gender  : </th>	
						<td style="padding-left:15px;">
                                                    <input type="radio" name="gender" value="m" checked />Male
<!--                                                </td>
                                                <td>-->
                                                    <input type="radio" name="gender" value="f" />Female
						</td>
					</tr>
                                        <tr>
                                            <c:set var="dgYr" value="${requestScope.dog.getAge()}"/>
                                            <fmt:parseNumber var="year" integerOnly="true" type="number" value="${dgYr}"/>
                                            
                                                    
                                            <th>Age : </th>
                                            <td colspan="2">
                                                <input type="text" name="year_age" class="form-control" value="<c:out value="${year}"/>"/>
                                                <input type="text" name="month_age" class="form-control" value="0"/>
                                                <input type="text" name="days_age" class="form-control" value="0"/>
                                            </td>
                                        </tr>
                                        
					<tr>
						<th>Registered Date : </th>
						<td><input type="text" value="${requestScope.dog.getRegisteredDate()}" required="true" name="registered_date" id="registered_date" class="nepali-calendar"></td>
					</tr>

					<tr>
                                            
						<td ><Button type="Submit" value="submit" class="btn btn-success">Submit</button></td>
						<td colspan="2" style="text-align:center"><Button type="Reset" class="btn btn-danger">Reset</button></td>
					</tr>

					</form>
                                            
                                        
				</table>

			</div>
		
		</div>
	</body>
</html>