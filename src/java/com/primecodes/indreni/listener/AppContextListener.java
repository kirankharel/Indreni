/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.listener;

import com.primecodes.indreni.connection.DBConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author Bhanu
 */
@WebListener
public class AppContextListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        
                
        try {
            ServletContext ctx = sce.getServletContext();
            
            String url = ctx.getInitParameter("DBURL");
            String user = ctx.getInitParameter("DBUSER");
            String pwd = ctx.getInitParameter("DBPWD");
            
            DBConnection dBConnection = new DBConnection(url, user, pwd);
            ctx.setAttribute("dBConn", dBConnection);
            System.out.println("DB Connection Initialized");
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
