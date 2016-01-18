<%-- 
    Document   : markettingCheck
    Created on : Mar 15, 2015, 7:02:26 PM
    Author     : Bhanu
--%>

<%@page import="com.primecodes.indreni.dao.MarkettingDAO"%>
<%@page import="com.primecodes.indreni.dao.impl.MarkettingDAOImpl"%>
<%@page import="com.primecodes.indreni.beans.Marketting"%>
<%@page import="com.primecodes.indreni.beans.VaccinationCaseInfo"%>
<%@page import="com.primecodes.indreni.beans.VaccinationCaseDetails"%>
<%@page import="com.primecodes.indreni.dao.impl.VaccinationMarkettingDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.VaccinationMarkettingDAO"%>
<%@page import="com.primecodes.indreni.dao.impl.DogDAOImpl"%>
<%@page import="com.primecodes.indreni.dao.DogDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            MarkettingDAO dao=new MarkettingDAOImpl();
            Marketting m=new Marketting();
            DogDAO dDAO = new DogDAOImpl();
            
            String marketter=request.getParameter("marketter");
            int clientId=Integer.parseInt(request.getParameter("owner_id"));
            String dogName=request.getParameter("dog_name");
            //taking dates
            String c_date=request.getParameter("c_date");
            String d_date=request.getParameter("d_date");
            String r_date=request.getParameter("r_date");
            
            String treatment=request.getParameter("treatment_details");
            if(c_date.equals(d_date)&&c_date.equals(r_date))
            {
                String[] services=request.getParameterValues("service");
                String ser="";
                   if(services!=null){
           
                       for(String s:services)
                          {
                            ser=s+" "+ser; 
                          }
                                     }
                      m.setServices(ser);
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);
            }
            if(r_date.equals(d_date))
            {{
                String ser="Anti-Rabbies"+" "+"Diaptheria";
                      m.setServices(ser);
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);
            }      if(c_date!=null){
                      m.setServices("Corona");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m); 
            }
            }
            if(r_date.equals(c_date))
            {{
                String ser="Anti-Rabbies"+" "+"Corona";
                      m.setServices(ser);
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);
            }   if(d_date!=null){
                      m.setServices("Diaptheria");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);   
            }
            }
            if(c_date.equals(d_date))
            {{
                String ser="Diaptheria"+" "+"Corona";
                      m.setServices(ser);
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);
            }if(r_date!=null){
                      m.setServices("Anti-Rabbies");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);  
            }
            }else{
                {     m.setServices("Anti-Rabbies");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);   
                 }
                 {    m.setServices("Diaptheria");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);   
                  }
                  {   m.setServices("Corona");
                      m.setClientId(clientId);
                      m.setDogName(dogName);
                      m.setMarketter(marketter);
          
                      m.setTreatment(treatment);
                      dao.insertMarkettingRecord(m);   
                   }
                
                
                
                
                
                
            }
                
            
            
            
            
            
            
            
            
            
           
          
          
           
            
           
            
         
            
            %>
        Success!!
    </body>
</html>
