<%-- 
    Document   : technician
    Created on : Apr 7, 2015, 3:15:10 PM
    Author     : Bhanu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title>Heading Page</title>
		
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/style.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
                <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
                <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.3.min.js"></script>
                <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/nepali.datepicker.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/nepali.datepicker.css" />
    
		<style type="text/css">
		input[type=checkbox]{
            width:20px; height:25px;text-align:left; margin-right:10px;
        }
		body{
            background: rgba(233,231,211,1);
        }
       td{
       		text-align: left;
            padding-top: 15px;
        }
       input[type=date]{
        	height: 40px;
        	font-size: 18px;
        }
        input[type=checkbox]{
            width:20px; height:25px;
            text-align:left;
        }
        input[type=number]{
        	height:30px;font-size:20px;
        }

        .t_block{

        }

        #visit_date{
        	height: 40px;
        	font-size: 20px;
        }
		</style>

		<script type="text/javascript">
			$('.nepali-calendar').nepaliDatePicker();
		</script>
		<script type="text/javascript">

		$('document').ready(function(){

			$('.nepali-calendar').nepaliDatePicker(); 


			$('.t_block').css('visibility','hidden'); //css() not hide() because casues design prblm
			$('.r_block').hide();
			$('.c_block').hide();
			$('.d_block').hide();

			//Toggle according to check or uncheck in checkbox
			$('input[type="checkbox"]').click( function(){
            if($(this).attr("name")=="r_vaccination"){
                $(".r_block").toggle();
            }
            if($(this).attr("name")=="c_vaccination"){
                $(".c_block").toggle();
            }
            if($(this).attr("name")=="d_vaccination"){
                $(".d_block").toggle();
            }
            if($(this).attr("name")=="treatment_check"){
                //$(".t_block").toggle();

                if($('.t_block').css('visibility') == 'hidden'){
                	$('.t_block').css('visibility','visible');
                }else{
                	$('.t_block').css('visibility','hidden');
                }
            }
        	});

        	//Check debit and Credit amount

        	$('input[type="number"]').on('change',function() {

        			var rAmount = parseInt($('#r_price').val());
        			var cAmount = parseInt($('#c_price').val());
        			var dAmount = parseInt($('#d_price').val());
        			var tAmount = parseInt($('#t_price').val());
        			totalDebt = rAmount+cAmount+dAmount+tAmount;

        		if(!($(this).attr("name") == "credit_amount")){ // If credit not changed just add
        			
        			$('#debit_amount').val(totalDebt);
        		}
        		else{
        				credAmount = parseInt($(this).val()); //Credit amount changed so sub from debit
        			$('#debit_amount').val(totalDebt - credAmount);
        		}
        	});

		});

		/*	function initElements(){
					document.getElementById("treatment_detail_box").style.visibility = "hidden";
				        document.getElementById("treatment_date").style.visibility = "hidden";
				       }
				function checkboxValidate(checkbox) {
				//var treatmentChoice = document.getElementById('treatment');
				    if (checkbox.checked){
				        document.getElementById("treatment_detail_box").style.visibility = "visible";
				        document.getElementById("treatment_date").style.visibility = "visible";
				    }else{
				        document.getElementById("treatment_detail_box").style.visibility = "hidden";
				        document.getElementById("treatment_date").style.visibility = "hidden";
				    }
			};*/
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
				  <li role="navigation"><a href="client.html">Client</a></li>
				  <li role="navigation"><a href="dog.html">Dog</a></li>
				  <li role="navigation"><a href="marketting.html">Marketting</a></li>
				  <li role="navigation"  class="active"><a href="technician.html">Technician</a></li>
				  <li role="navigation"><a href="dailyCase.html">Daily Case</a></li>
				  <li role="navigation"><a href="pendingCase.html">Pending Case</a></li>
				  <li><a href="dogSale.html">Dog Sale</a></li>
				  <li role="navigation"><a href="mating.html">Mating</a></li>
				  <li role="navigation"><a href="training.html">Training</a></li>
				  <li role="navigation"><a href="search.html">Search for Client</a></li>	
				</ul>
			</div>

			<div id="form_div" class="col-md-6">
				<table>
                                    
					<form>
					<tr>
						<th>Technician's Name  : </th>	
						<td>
							<select name="technician_name">
								<option value="none">Enter Technician Name</option>
								<option value="JohnDoe">John Doe</option>
								<option value="JaneRoe">Jane Roe</option>
							</select>
						</td>
					</tr>
					<tr>
						<th>Client Name  : </th>	
						<td>
                                                    <input type="text" name="uname" value="<%= request.getParameter("p1")%>" readonly>	
						</td>
					</tr>
					<tr>
						<th>Dog Name  : </th>	
						<td>
							<input type="text" name="uname" value="<%= request.getParameter("p2")%>" readonly>
						</td>
					</tr>
					<tr>
						<th rowspan="4">Vaccination Type  : </th>
					</tr>
					<tr>
						<td>
							<input  type="checkbox" name="r_vaccination" class="custom_checkbox">Anti-Rabies</input>
						</td>
						
						<td class="r_block" colspan="2">
							<span style="position:relative;bottom:4px;">Nrs: </span>
							<input type="number" id="r_price"name="r_price" style="height:30px;font-size:20px;" value="0"/>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" name="c_vaccination" class="custom_checkbox">
								Corona
						</td>
						
						<td class="c_block" colspan="2">
							<span style="position:relative;bottom:4px;">Nrs: </span>
							<input type="number" id="c_price"name="c_price" style="height:30px;font-size:20px;" value="0"/>
						</td>
					</tr>
					<tr>
						<td>
							<input type="checkbox" name="d_vaccination" class="custom_checkbox">
							Diptheria
						</td>
						
						<td class="d_block" colspan="2">
							<span style="position:relative;bottom:4px;">Nrs: </span>
							<input type="number" id="d_price"name="d_price" style="height:30px;font-size:20px;" value="0"/>
						</td>
					</tr>
					
					<tr>
						<th>Treatment  : </th>	
						<td >
							<input type="checkbox" name="treatment_check" class="custom_checkbox"/>
						</td>
						<td class="t_block">

							<textarea name="treatment_details" rows="3" id="treatment_detail_box" style="margin-top: 12px; margin-left: -190px;"></textarea>
						</td>
						
						<td class="t_block">
							<span style="position:relative;bottom:4px;margin-left:20px;">Nrs: </span>
							<input type="number" id="t_price" name="t_price" style="height:30px;font-size:20px;"value="0"/>
						</td>
					</tr>
					
					<tr>
						<th>
							Date:
						</th>
						<td>
							
							<input type="text" placeholder="yyyy-mm-dd" required="true" name="visit_date" 	id="visit_date" class="nepali-calendar" >

						</td>
					</tr>

					<tr>
						<th>Total Debit: </th>
						<td>NRS: 
							<input type="number" name="debit_amount" id="debit_amount" value="0">
						</td>
					</tr>
					<tr>
						<th>Total Credit: </th>
						<td>NRS: 
							<input type="number" name="credit_amount" id="credit_amount" value="0">
						</td>
					</tr>
					<tr>
						<td>
							<Button style="position: relative;left: 158;" type="Submit" value="submit" class="btn btn-success">Submit</button>
						</td>
		       				<td>
							<Button type="Reset" class="btn btn-danger" style="position:relative;left:200;">Reset</button>
							</td>
					</tr>

					</form>
				</table>

			</div>
		
		</div>
	</body>
</html>