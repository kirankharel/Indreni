/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;

import com.primecodes.indreni.beans.DogSale;
import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.DogSaleDAO;
import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
import com.primecodes.indreni.dao.impl.DogSaleDAOImpl;
import com.primecodes.indreni.dao.impl.OwnerDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "viewOwnerController", urlPatterns = {"/viewOwner"})
public class viewOwnerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet viewOwnerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet viewOwnerController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int ownerId = Integer.parseInt(request.getParameter("owner_id"));
        try {
            OwnerDAO oDAO = new OwnerDAOImpl();
            request.setAttribute("owner", oDAO.getById(ownerId));
            DogDAO dDAO = new DogDAOImpl();
            request.setAttribute("dog", dDAO.getByOwnerId(ownerId));
            DogSaleDAO dsDAO = new DogSaleDAOImpl();
            request.setAttribute("dogSale",dsDAO.viewDogSaleRecordByOwnerId(ownerId));
                    
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(viewOwnerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.getRequestDispatcher("viewOwners.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
