/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.Mating;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.MatingDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kiran
 */
public class MatingDAOImpl implements MatingDAO {

    private DBConnection connection;
    public MatingDAOImpl() throws ClassNotFoundException, SQLException {
         connection= new DBConnection();
    }
    @Override
    public int insertMatingRecord(Mating m) throws SQLException {
         String sql="INSERT INTO tbl_mating(m_o_id,male_dog_id,female_dog_id,charge,date,f_o_id) VALUES(?,?,?,?,?,?)"; 
        PreparedStatement stmt = connection.initStatement(sql);

     
        stmt.setInt(1, m.getMaleownerId());
        stmt.setInt(2,m.getMaleDogId());
        stmt.setInt(3, m.getFemaleDogId());

        stmt.setInt(4,m.getCharge());
        stmt.setString(5,m.getDate() );
        stmt.setInt(6, m.getFemaleOwnerId());
        
        int result=connection.execute();
        connection.close();
        return result;   
    }
    
   }
    

