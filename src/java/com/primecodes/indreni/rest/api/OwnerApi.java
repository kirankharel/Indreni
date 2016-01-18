/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.rest.api;

import com.primecodes.indreni.beans.Owner;

import com.primecodes.indreni.dao.OwnerDAO;
import com.primecodes.indreni.dao.impl.OwnerDAOImpl;


import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Kiran
 */

@Path("ownerService")
public class OwnerApi {
    
    
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Owner> getOwners() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        OwnerDAO oDAO = new OwnerDAOImpl();        
        
        return oDAO.getAll();
    }
    
    
    
}
