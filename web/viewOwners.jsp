<%-- 
    Document   : viewOwners
    Created on : Apr 13, 2015, 9:33:04 PM
    Author     : Bhanu
--%>

<%@page import="java.math.RoundingMode"%>
<%@page import="java.math.BigDecimal"%>
<%@page import="java.util.List"%>
<%@page import="com.primecodes.indreni.beans.Dog"%>
<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owner Page</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/basic-style.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style>
            #spaceSpan{
                width:50px;
            }
        </style>
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
                            
                            <div id="form_div" style="margin:0px auto;widht:800px;text-align: center;">
        <div class="well">
            <h3>Owner Details:</h3><button class="btn btn-danger" style="float:right;" onClick="goToLink(${requestScope.owner.getId()})">Edit</button>
            
            <h4>Full Name: 
                ${requestScope.owner.getFname()}<span id="spaceSpan"></span>
                ${requestScope.owner.getMname()}<span id="spaceSpan"></span>
                ${requestScope.owner.getLname()}
            </h4>
            <h4>Owner Id: 
                ${requestScope.owner.getId()}
            </h4>
            <h4>Address: 
                ${requestScope.owner.getAddress()}<span id="spaceSpan"></span>
                -<span id="spaceSpan"></span>
                ${requestScope.owner.getHouseNumber()}</h4>
            <h4>Contact details: ${requestScope.owner.getPrimaryPhoneNumber()}</h4>
            <h4>Secondary contact details: ${requestScope.owner.getSecondaryPhoneNumber()}</h4>
        </div>
            
        <div class="well well-sm">
            <table class="table table-hover">
                <tr>
                    <th>Dog Name</th>
                    <th>Dog breed</th>
                    <th>Dog Age</th>
                    <th>Dog gender</th>
                    <th colspan='2'>Options</th>
                </tr>
            <c:forEach var="dog" items="${requestScope.dog}">
                <tr>
                    <td>${dog.getName()}</td>
                    <td>${dog.getBreed()}</td>
                    <!--td>${dog.getAge()} years</td-->
                    <td><%
                        DogDAO dDAO = new DogDAOImpl();
                       List<Dog> dogs =  dDAO.getByOwnerId(Integer.parseInt(request.getParameter("owner_id")));
                       
                       for(Dog d: dogs){
                           out.print((int)d.getAge()+" years");
                           
                           BigDecimal bd = new BigDecimal( d.getAge() - Math.floor(d.getAge()));
                            bd = bd.setScale(4,RoundingMode.HALF_DOWN);
                            bd = new BigDecimal((bd.floatValue()/12));
                            bd =bd.setScale(2,RoundingMode.HALF_UP);
                            
                            int months = (int)(bd.floatValue()*100);
                            
                            out.print("  "+(months)+" Months");
                       }
                    
                    %>
                    </td>
                    <td>${dog.getGender()}</td>
                    <td><a href="editDog?dog_id=${dog.getId()}">Edit</a></td>
                    <td><a href="deleteDog.jsp?dog_id=${dog.getId()}&owner_id=${requestScope.owner.getId()}" onClick="deleteCheckBox(${dog.getId()},${requestScope.owner.getId()})">Delete</a></td>
                </tr>
                </c:forEach>
            </table>
            
        </div>
        
        <script>
            function goToLink(ownerValue){
                
                location.href='editOwner'+'?owner_id='+${requestScope.owner.getId()}+'&insertion=';
                        
            }
                        function deleteCheckBox(dogValue,ownerValue){
                            var x;
                                if (confirm("Are you sure you want to delete?") == true) {
                                    self.location=self.location.protocol+'//'+self.location.host+'deleteDog.jsp'+'?dog_id='+dogValue+'&owner_id='+ownerValue;
                                } else {
                                    x = "You pressed Cancel!";
                                }
                        }
                    </script>
                    <div class="well well-sm">
                        <h4 class="alert-success">Dog Sale</h4>
                        <table class="table table-hover">
                            <Tr>
                            <th>Dog Name</th>
                            <th>Dog Breed</th>
                            <th>Amount </th>
                            <th>Date </th>
                            </tr>
                        <c:forEach var="dogSale" items="${requestScope.dogSale}">
                            <tr>
                            <td>${dogSale.getDogName()}</td>
                            <td>${dogSale.getDogBreed()}</td>
                            <td>${dogSale.getAmount()}</td>
                            <td>${dogSale.getDate()}</td>
                            </tr>
                        </c:forEach>
                            </table>
                    </div>
        <div class='well well-sm'>
            <h2>Owner history of transaction will be displayed here</h2>
        </div>
             </div>
             </div>
        </div>
    </body>
</html>
