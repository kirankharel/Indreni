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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kiran
 */
@WebServlet(name = "TrainingController", urlPatterns = {"/addTraining"})
public class TrainingController extends HttpServlet  {
   

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
            out.println("<title>Servlet TrainingController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TrainingController at " + request.getContextPath() + "</h1>");
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
          int oId = Integer.parseInt(request.getParameter("owner_id"));
         try {
            
            Class.forName("com.mysql.jdbc.Driver");
           
            OwnerDAO oDAO = new OwnerDAOImpl();
            DogDAO dDAO = new DogDAOImpl(); 
           
            
            request.setAttribute("ownerAll", oDAO.getAll());
     
             request.setAttribute("dog", dDAO.getByOwnerId(oId));

            request.getRequestDispatcher("addTraining.jsp").forward(request, response);
        } 
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
       
       
    }


  


