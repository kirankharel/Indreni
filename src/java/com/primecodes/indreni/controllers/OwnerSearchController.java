/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;

import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.impl.OwnerDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kiran
 */
@WebServlet(name = "ownerSearchController", urlPatterns = {"/searchOwner"})
public class OwnerSearchController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String oName = request.getParameter("ownerName");            
            System.out.println(oName);
            
            String oNumber = request.getParameter("ownerNumber");
            OwnerDAO oDAO = new OwnerDAOImpl();
            
            String oLName = request.getParameter("ownerLName");            
            System.out.println(oName);
            
            
            if(oNumber.isEmpty() && oName.isEmpty() && oLName.isEmpty()){
                request.setAttribute("ownersByName",oDAO.getAllSortedById()); //If just search clicked show all
            }            
            else if(!oNumber.isEmpty()){
                request.setAttribute("ownersByName",oDAO.getByNumber(oNumber)); // If number is searched
            }
            else if(!oName.isEmpty()){            
            request.setAttribute("ownersByName", oDAO.getByName(oName)); //If searched by name
            }
            else{
                request.setAttribute("ownersByName", oDAO.getByLastName(oLName));
            }
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OwnerSearchController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            request.getRequestDispatcher("search.jsp").forward(request, response);
        }
        
        
    }
    
}
