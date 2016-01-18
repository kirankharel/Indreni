<%-- 
    Document   : marketting
    Created on : Mar 5, 2015, 4:06:11 PM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Marketting Page</title>
		
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.11.2.min.js"></script>
    	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/nepali.datepicker.js"></script>
    	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/nepali.datepicker.css"/>
		
            	
		<style type="text/css">
                    body{
                        background: rgba(233,231,211,1);
                    }



                    td{
                        text-align: left;

                        padding: 7px;
                    }

                    input[type=text]{
                        height: 36px;
                        font-size: 18px;
                    }
                    input[type=checkbox]{
                        width:20px; 
                        height:25px;
                        text-align:left; 
                        margin-right:10px;
                        padding: 0;
                    }
                    #tbox{
                        position: relative;
                        left: -105;

                    }
                    .box{

                        display: none;
                        /*margin-top: 20px;*/

                    }
                    td.Treatment{
                        display: none;
                    }

                </style>
                
		<script type="text/javascript">
                    
                    $('document').ready(function(){        
                        //Checkbox tick for checking if vaccines are checked
                            $('input[type="checkbox"]').click(function(){
                              
                                if($(this).attr("name")=="treatment_check"){
                                    $(".Treatment").toggle();
                                }

                            });
                    
                    $('.nepali-calendar').nepaliDatePicker();
                    
                    $('#ownerSelected').on('change',function(){
                        	var ownerValue = document.getElementById("ownerSelected").value;
                                self.location=self.location.protocol+'//'+self.location.host+self.location.pathname+'?insertion=&owner_id='+ownerValue;
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
        <body onload="checkURL()">
		<div id="content">
		<div class="well well-sm">
			<div class="page-header" id="title_text">
  				<h1><span id="indreni_heading">Indreni</span> <small>Kennel and Vet Service</small></h1>
			</div>
		</div>	

			<div id="navigation_bar">

				<ul class="nav nav-pills">
				  <li role="navigation"><a href="client.html">Client</a></li>
				  <li role="navigation"><a href="dog.html">Dog</a></li>
				  <li role="navigation"  class="active"><a href="marketting.html">Marketting</a></li>
				  <li role="navigation"><a href="technician.jsp">Technician</a></li>
				  <li role="navigation"><a href="dailyCase.jsp">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li><a href="dogSale.html">Dog Sale</a></li>
				  <li role="navigation"><a href="mating.html">Mating</a></li>
				  <li role="navigation"><a href="training.html">Training</a></li>
				 <li role="navigation"><a href="searchOwner?ownerName=&ownerNumber=&ownerLName=">Search for Client</a></li>	
				</ul>
			</div>

			<div id="form_div">
					<table>
                                            <form id="marketting_form" action="markettingCheck.jsp" method="get">
					<tr>
						<th>Marketting personell  : </th>	
                                                <td><select name="marketter">								
                                                        <c:forEach var="marketter" items="${requestScope.allMarketter}">
                                                            <option value="${marketter.getFname()}">${marketter.getFname()}</option>                                                            
                                                        </c:forEach>
							</select>
						</td>

					</tr>
					<tr>
						<th>Client ID  : </th>	
                                                <td colspan="2">
                                                    <select name="owner_id" id="ownerSelected" onchange="ownerSelected()">
                                                        <c:forEach var="ownerAll" items="${requestScope.ownerAll}">
                                                        <option value="${ownerAll.getId()}">${ownerAll.getId()}</option>
                                                        </c:forEach>
                                                    </select>
                                                </td>
						<td>
                                        </tr>
                                        <tr>
                                                <th>
                                                    Client Details :
                                                </th>
                                                <td>
                                                    <span id="contacts">
                                                        ${requestScope.ownerDetails.getFname()}
                                                        ${requestScope.ownerDetails.getLname()}
                                                        ${requestScope.ownerDetails.getAddress()}
                                                        ${requestScope.ownerDetails.getHouseNumber()}
                                                    </span>
                                                </td>
						
					</tr>
                                        <tr>
                                      
                                            <th>Dog Name : </th>
                                            
                                            
                                            <td colspan="2"><select name="dog_name" id="dog_options">
                                                <c:forEach var="dog" items="${requestScope.dog}">
                                                    <option value="${dog.getName()}">${dog.getName()}</option>
                                                    </c:forEach>
                                                </select></td>
                                        </tr>
					<tr>
						<th rowspan="4">Vaccination Type  : </th>	</tr>
					<tr>
						
						<td>
							<input  type="checkbox" name="service" value="Anti-Rabbies" class="custom_checkbox">
								Anti-Rabies
						</td>

						<td> 
                                                    <input id="Anti-Rabies" type="text" class="nepali-calendar" name="r_date" id="r_vaccination_date" placeholder="Enter Date" style="position: inherit;"/>
						</td>

					</tr>
                                        
                                        <tr>
					
						<td>
							<input type="checkbox" name="service" value="Diptheria" class="custom_checkbox">
							Diptheria
						</td>

						<td>
							<input  placeholder="Enter Date" style="position:inherit;" type="text" class="nepali-calendar" name="d_date" id="d_vaccination_date"/>
							
						</td>
					</tr>

					<tr>
					
						<td>
							<input type="checkbox" name="service" value="Corona" class="custom_checkbox">
								Corona
						</td>

						<td>
							<input  placeholder="Enter Date" style="position:inherit;" type="text" class="nepali-calendar" name="c_date" id="c_vaccination_date"/>
							
						</td>

					</tr>

					

					<tr>
						<th>Treatment : </th>	
						<td style="padding: 30px;padding-left: 7px;"><input type="checkbox" name="treatment_check" id="treatment"/></td>
						<td class="Treatment">
						<textarea style="position: relative;left:-200;" placeholder="Enter Details" name="treatment_details" rows="3" id="treatment_detail_box"></textarea></td>
						<td class="Treatment"><input style="position: relative;left:-150;"type="text" class="nepali-calendar" name="treatment_date" placeholder="Enter Date" id="treatment_date"/></td>
					
					</tr>


					<tr>
						<th>Marketted Date  : </th>	
                                                <td><input style="height:35px" type="text" id="nepaliDate" name="marketted_date" class="nepali-calendar" placeholder="Enter Date"/></td>
					</tr>
					
					
					<tr>
						<br/>
						<td><Button style="position: relative; left: 141;"type="Submit" value="submit" class="btn btn-success">Submit</button></td>
						<td><Button style="position: relative; left: 120;"type="Reset" class="btn btn-danger">Reset</button></td>
					</tr>

					</form>
				</table>

			</div>
		
		</div>
	</body>

</html>
