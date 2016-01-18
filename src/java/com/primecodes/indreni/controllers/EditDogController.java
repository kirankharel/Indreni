/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;

import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
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
 * @author Kiran
 */
@WebServlet(name = "editDogController", urlPatterns = {"/editDog"})
public class EditDogController extends HttpServlet {

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
            out.println("<title>Servlet editDogController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editDogController at " + request.getContextPath() + "</h1>");
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
        int dogId = Integer.parseInt(request.getParameter("dog_id"));
        try {
            OwnerDAO oDAO = new OwnerDAOImpl(); //Initialize DB Connection to owner table
            DogDAO dDAO = new DogDAOImpl(); //Initialize DB Connection to dog table
            
            //System.out.println(oDAO.getById(id).toString());
            request.setAttribute("owner", oDAO.getById(dDAO.getById(dogId).getOwnerId()));
            request.setAttribute("dog", dDAO.getById(dogId));
            
            request.setAttribute("breeds", dDAO.getAllBreeds());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(EditDogController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.getRequestDispatcher("editDog.jsp").forward(request, response);
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
        processRequest(request, response);
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
