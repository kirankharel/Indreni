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
       		padding-top: 5px;
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
	    h2
	    {
		    color: #0261A6;
		    text-transform: uppercase;
		    font-size: 18px;
		    text-align: center;
                    left: 34px;
                    background: yellow;
                    margin-left: 170%;
                   
	    }
	    #male
	    {
	    	margin-top: 10px;
	    	position: absolute;
	    	right: 635;

	    }
	    #female
	    {
	    	position: absolute;
	    	margin-left: 0px;
                right: 1035; top:410;
                


	    }



		</style>
                <script type="text/javascript">
                    
                  $(document).ready(function(){
                      
                       $('#female_ownerSelected').on('change',function(){
                        	var ownerValue = document.getElementById("female_ownerSelected").value;
                                var maleOwnerValue = document.getElementById("male_ownerSelected").value;
                                if(maleOwnerValue == "") 
                                    maleOwnerValue=10;
                                
                                
                                self.location=self.location.protocol+'//'+self.location.host+self.location.pathname+'?insertion=&female_owner_id='+ownerValue+"&male_owner_id="+maleOwnerValue;
                    });
                    $('#male_ownerSelected').on('change',function(){
                        	var ownerValue = document.getElementById("female_ownerSelected").value;
                                var maleOwnerValue = document.getElementById("male_ownerSelected").value;
                                if(maleOwnerValue == "")
                                    maleOwnerValue=10;
                                if(ownerValue == "") 
                                    ownerValue=10;
                                self.location=self.location.protocol+'//'+self.location.host+self.location.pathname+'?insertion=&female_owner_id='+ownerValue+"&male_owner_id="+maleOwnerValue;
                    });

               
                      
                    $('.nepali-calendar').nepaliDatePicker(); 
                     var id = $("#ownerSelected").val(); //Gives value of Owner ID dropdownd
                     //Setting value on page load
                            $.get("api/ownerService",function(data){
                                var output="";
                               
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
                        
                            var male_ownerId = getUrlParameter('male_owner_id');
                            var female_ownerId = getUrlParameter('female_owner_id');
                            document.getElementById("male_ownerSelected").value = male_ownerId;
                            document.getElementById("female_ownerSelected").value = female_ownerId;
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
				  <li role="navigation"><a href="marketting">Marketting</a></li>
				  <li role="navigation"><a href="technician">Technician</a></li>
				  <li role="navigation"><a href="dailyCase">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li role="navigation"><a href="addDogSale?insertion=&owner_id=1" >Dog Sale</a></li>
				  <li role="navigation" class="active" ><a href="addMating?insertion=&male_owner_id=1&female_owner_id=2">Mating</a></li>
				  <li role="navigation"><a href="addTraining?insertion=&owner_id=1">Training</a></li>
				  <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div> 

			<div id="form_div">
				<table>
			        				
					
				        <form action="matingCheck.jsp" method="get">					
					<h1 ><u>Female</u></h1>
                                      <div id="male">

					<tr>
						<th>Client's Name  : </th>	
                                                <td colspan="2"><select id="female_ownerSelected" name="female_owner_id" style=" margin-left: 0px;">
                                                        <c:forEach var="ownersAll" items="${requestScope.ownerAll}">
                                                           
                                                            <option value="${ownersAll.getId()}">
                                                                ${ownersAll.getFname()}
                                                                ${ownersAll.getLname()}
                                                            </option>

                                                        </c:forEach></td>
					</tr>
					<tr>
						<th>Dog Name  : </th>	
						<td colspan="2"><select name="female_dog_name" id="dog_options" style=" margin-left: 0px;">
                                                <c:forEach var="dogf" items="${requestScope.dogf}">
                                                    <option value="${dogf.getId()}">${dogf.getName()}</option>
                                                    </c:forEach></select></td>
					</tr>
					
					<tr>
						<th>Charge : </th>
						<td><span>Nrs: </span><input type="number" name="charge" style="height:20px;font-size:20px; margin-left: 0px; width: 62%"/>
						</td>
					</tr>
					</div>
					

					
					
					<div id="female">
                                            	
                                                <tr>
						<td >
                                                    <h2 ><u>Male</u></h2>
                                                <td></br>
					</tr>

					<tr>
						<th>Client's Name  : </th>	
						<td colspan="2"><select id="male_ownerSelected" name="male_owner_id" style=" margin-left: 0px;">
                                                        <c:forEach var="ownersAll" items="${requestScope.ownerAll}">
                                                           
                                                            <option value="${ownersAll.getId()}">
                                                                ${ownersAll.getFname()}
                                                                ${ownersAll.getLname()}
                                                            </option>

                                                        </c:forEach></td>
					</tr>
					<tr>
						<th>Dog Name  : </th>	
						<td colspan="2"><select name="male_dog_name" id="dog_options" style=" margin-left: 0px;">
                                                <c:forEach var="dogm" items="${requestScope.dogm}">
                                                    <option value="${dogm.getId()}" selected="selected">${dogm.getName()}</option>
                                                    </c:forEach></select></td>
					</tr>
					

					<tr>
						<th>Date  : </th>
						<td><input type="text" placeholder="yyyy-mm-dd" required="true" name="matingDate" id="nepaliDate4" class="nepali-calendar" style="height:20px;font-size:15px; width:72%;  margin-left: 0px;">
						</td>	
						
					</tr>
					</div>
					
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
