/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;


import com.primecodes.indreni.beans.Employee;
import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.VaccinationMarkettingDAO;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
import com.primecodes.indreni.dao.impl.OwnerDAOImpl;
import com.primecodes.indreni.dao.impl.VaccinationMarkettingDAOImpl;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bhanu
 */

@WebServlet(name = "MarkettingController", urlPatterns = {"/marketting"})
public class MarkettingController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        
        int oId = Integer.parseInt(request.getParameter("owner_id"));
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
            
            VaccinationMarkettingDAO vMDAO = new VaccinationMarkettingDAOImpl();
            OwnerDAO oDAO = new OwnerDAOImpl(); //Initialize DB Connection to owner table
            DogDAO dDAO = new DogDAOImpl(); //Initialize DB Connection to dog table
            
            
            request.setAttribute("ownerAll", oDAO.getAll()); //Returns List of All Owners 
          //  request.setAttribute("dog", dDAO.getByOwnerId(oId)); //Returns Dog Name of Owners
            
            request.setAttribute("allMarketter", vMDAO.getAllMarketter()); //Returns all Marketteers
            //request.setAttribute("allMarketter", e);
            
            request.setAttribute("dog", dDAO.getByOwnerId(oId));
            request.setAttribute("ownerDetails", oDAO.getById(oId));
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MarkettingController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            request.getRequestDispatcher("marketting.jsp").forward(request, response);
        }
    }
    
}
