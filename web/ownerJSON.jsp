<%-- 
    Document   : ownerJSON
    Created on : Mar 14, 2015, 4:58:30 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.beans.Dog"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="${pageContext.request.contextPath}/assets/js/jquery-2.1.3.min.js">            
        </script>
    </head>
    <body>
        <h1>Hello World 123!</h1>
        
        <span id="contacts"></span>
        
        <div>
            
            <select id="owner_id">
                <option value="2">2</option>
                <option value="1">1</option>
                
            </select>
                
        </div>
        
        <span id="dogs"></span>
        <div>   </div>
        <script>
            
            $(document).on('ready',function(){
                
//                $("#owner_id").on('change',function(){
//                    var id = $("#owner_id").val();
//                    $('#contacts').html(id);
//                   $.get("api/ownerService",function(data){
//                        var output="";
//                       /*for(i=0;i<data.length;i++){
//                           output+= data[i].name + "<br/>";
//                       }*/
//                       $.each(data,function(i,o){
//                           if(o.id == id){
//                                output+= o.fname + " " +o.mname +" "+o.lname + " "+o.address+ o.houseNumber + o.primaryPhoneNumber; 
//                            }
//                       });
//
//                       $('#contacts').html(output);
//                       $('#dogs').html(output);
//                    },"json"); 
//                });
                $('#dogs').html("What UP");
                $.get("api/dogService",function(data){
                    var output="";
                    $.each(data,function(i,o)){
                        output += o.name + o.id;
                    }
                   $('#dogs').html(output);
                },"json");
                
            });
            
        </script>
        
        <%
            DogDAO dDAO = new DogDAOImpl();
            out.print(dDAO.getAll());
        %>
       
    </body>
</html>

