/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;

import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.beans.Owner;
import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
import com.primecodes.indreni.dao.impl.OwnerDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bhanu
 */
@WebServlet(name="DogController",urlPatterns = {"/addDog"})
public class DogController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        try {
           
            Class.forName("com.mysql.jdbc.Driver");
        
            
            OwnerDAO oDAO = new OwnerDAOImpl(); //Initialize DB Connection to owner table
            DogDAO dDAO = new DogDAOImpl(); //Initialize DB Connection to dog table
            
    
            request.setAttribute("ownerAll", oDAO.getAll());
           
            request.setAttribute("breeds", dDAO.getAllBreeds());

            request.getRequestDispatcher("addDog.jsp").forward(request, response);
        } 
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
