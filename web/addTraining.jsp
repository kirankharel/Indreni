<%-- 
    Document   : addTraining
    Created on : Apr 15, 2015, 5:48:38 AM
    Author     : kiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
       		padding-top: 15px;
       		padding-bottom: 5px;
       		padding-left:10px;
        }
        input{
        	width: 150px;
        	margin-left: 5px;        	
        	text-align:center;
        }
        h1
	    {
		    color: #0261A6;
		    text-transform: uppercase;
		    font-size: 18px;
		    text-align: center;
	    }

	    


		</style>
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
                     var id = $("#ownerSelected").val(); //Gives value of Owner ID dropdownd
                     //Setting value on page load
                            $.get("api/ownerService",function(data){
                                var output="";
                               /*for(i=0;i<data.length;i++){
                                   output+= data[i].name + "<br/>";
                               }*/
                               $.each(data,function(i,o){
                                   if(o.id == id){
                                        output+= o.fname + " " +o.mname +" "+o.lname + ", "+o.address+ " - " +o.houseNumber; 
                                    }
                               });

                               $('#contacts').html(output);
                            },"json");   
                            
                            
                            //Changing value on dropdown value change
                            $("#ownerSelected").on('change',function(){
                            var id = $("#ownerSelected").val();
                            $.get("api/ownerService",function(data){
                                var output="";
                               /*for(i=0;i<data.length;i++){
                                   output+= data[i].name + "<br/>";
                               }*/
                               $.each(data,function(i,o){
                                   if(o.id == id){
                                        output+= o.fname + " " +o.mname +" "+o.lname + " "+o.address+ o.houseNumber + o.primaryPhoneNumber; 
                                    }
                               });

                               $('#contacts').html(output);
                            },"json");          

                        });
                    });
			          
                function ownerSelected(){
                        
				var ownerValue = document.getElementById("ownerSelected").value;
                                self.location=self.location.protocol+'//'+self.location.host+self.location.pathname+'?insertion=&owner_id='+ownerValue;
        	}
                        
                        //Reading from URL
                         function getUrlParameter(sParam)
                            {
                                var sPageURL = window.location.search.substring(1);
                                var sURLVariables = sPageURL.split('&');
                                for (var i = 0; i < sURLVariables.length; i++) 
                                {
                                    var sParameterName = sURLVariables[i].split('=');
                                    if (sParameterName[0] == sParam) 
                                    {                                       
                                        return sParameterName[1];
                                    }
                                }
                            }
                                   
                        
                        
                        //To set the value of Owner ID select drop down the same as owner Detail
                        
                        function  checkURL(){                           
                        
                            var ownerId = getUrlParameter('owner_id');
                            document.getElementById("ownerSelected").value = ownerId;
                        }
                      
                                 
                    
		</script>


		
    </head>
    <body onload="checkURL();">
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
				  <li role="navigation"><a href="marketting">Marketing</a></li>
				  <li role="navigation"><a href="technician">Technician</a></li>
				  <li role="navigation"><a href="dailyCase">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation" ><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation" class="active"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				  <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div> 

			<div id="form_div">
				<table>
			        	<form action="trainingCheck.jsp" method="get">				
					
					<tr>
						<th>Owner Id  : </th>	
                                                <td colspan="2"><select id="ownerSelected" name="owner_id" style=" margin-left: 0px;" onchange="ownerSelected()">
                                                        <c:forEach var="ownersAll" items="${requestScope.ownerAll}">
                                                           
                                                            <option value="${ownersAll.getId()}">${ownersAll.getId()}</option>

                                                        </c:forEach></td>
					</tr>
					<tr>
						<th>Owner Detais :</th>
						<td><span id="contacts"></span></td>
					</tr>
					<tr>
						<th>Dog Name : </th>	
						<td colspan="2"><select name="dog_id" id="dog_options" style=" margin-left: 0px;">
                                                <c:forEach var="dog" items="${requestScope.dog}">
                                                    <option value="${dog.getId()}">${dog.getName()}</option>
                                                    </c:forEach>
                                                </select></td>
					</tr>
					<tr>
						<th>Charge :</th>
						<td><input type="text" name="charge" style="height:20px;font-size:20px;width:75.5%; margin-left: 0px;"></td>
					</tr>
					
					
					
					<tr>
						<th>Training Start Date  : </th>
                                                <td><input type="text" placeholder="yyyy-mm-dd" required="true" name="nepaliDate4" id="nepaliDate4" class="nepali-calendar" style="height:20px;font-size:15px; width:75.5%; margin-left: 0px;">
						</td>
					</tr>

					<tr>
						<th>Training End Date : </th>	
						<td><input type="text" placeholder="yyyy-mm-dd" required="true" name="nepaliDate5" id="nepaliDate5" class="nepali-calendar" style="height:20px;font-size:15px; width:75.5%; margin-left: 0px;">
						</td>
					</tr>

					
					<tr>
						<td><Button style="position: relative;left: 120;" type="Submit" value="submit" class="btn btn-success">Submit</button></td>
						<td><Button style="position: relative;left: 120;" type="Reset" class="btn btn-danger">Reset</button></td>
					</tr>



					</form>

				</table>

			</div>
		
		</div>
    </body>
</html>
