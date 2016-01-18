/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.controllers;

import com.primecodes.indreni.beans.VaccinationCaseDetails;
import com.primecodes.indreni.beans.VaccinationCaseInfo;
import com.primecodes.indreni.dao.MarkettingDAO;
import com.primecodes.indreni.dao.VaccinationMarkettingDAO;
import com.primecodes.indreni.dao.impl.MarkettingDAOImpl;
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
 * @author Kiran
 */
@WebServlet(name = "DailyCaseController", urlPatterns = {"/dailyCase"})
public class DailyCaseController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String caseDate = request.getParameter("view_case_date");
        
        
        try {
            VaccinationMarkettingDAO vDAO = new VaccinationMarkettingDAOImpl();
            MarkettingDAO mdao=new MarkettingDAOImpl();
            request.setAttribute("market", mdao.getAll());
            request.setAttribute("technicians", vDAO.getAllTechnician());
            request.setAttribute("caseDetails", vDAO.getCaseAllByDate(caseDate));
            List<VaccinationCaseDetails> cases = new ArrayList<VaccinationCaseDetails>();
            
            for(VaccinationCaseInfo vCase: vDAO.getCaseAllByDate(caseDate)){
                cases.add(vDAO.getById(vCase.getVaccinationCaseId()));
            }
            request.setAttribute("allCaseDetails", cases);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DailyCaseController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        request.getRequestDispatcher("dailyCase.jsp").forward(request, response);
    }
    
}
