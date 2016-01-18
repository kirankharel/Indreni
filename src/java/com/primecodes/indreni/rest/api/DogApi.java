/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.rest.api;

import com.primecodes.indreni.beans.Dog;
import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.impl.DogDAOImpl;
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
@Path("dogService")
public class DogApi {
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Dog> getDogs() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.jdbc.Driver");
        DogDAO dDAO = new DogDAOImpl();
        
        return dDAO.getAll();
    }
}
