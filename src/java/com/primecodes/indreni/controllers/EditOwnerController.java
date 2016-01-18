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
 * @author Bhanu
 */
@WebServlet(name = "editOwnerController", urlPatterns = {"/editOwner"})
public class EditOwnerController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ownerId  = Integer.parseInt(request.getParameter("owner_id"));
        
        try {
            OwnerDAO oDAO = new OwnerDAOImpl();
            
            request.setAttribute("owner", oDAO.getById(ownerId));
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EditOwnerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getRequestDispatcher("editOwner.jsp").forward(request, response);
        
    }
    
}
