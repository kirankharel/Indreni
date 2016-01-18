/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.TrainingRecord;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.TrainingDAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kiran
 */
public class TrainingDAOImpl implements TrainingDAO{
    
    private DBConnection connection;
    public TrainingDAOImpl() throws ClassNotFoundException, SQLException {
         connection= new DBConnection();
    }

    @Override
    public int insertTrainingRecord(TrainingRecord r) throws SQLException {
        String sql="INSERT INTO tbl_training(id,o_id,d_id,training_start_date, training_end_date, charge) VALUES(0,?,?,?,?,?)"; 
        PreparedStatement stmt = connection.initStatement(sql);

     
        stmt.setInt(1, r.getOwnerId());
        stmt.setInt(2, r.getDogId());
        stmt.setString(3, r.getStartDate());
        stmt.setString(4, r.getEndDate());
        stmt.setString(5, r.getCharge());
        
        int result=connection.execute();
        connection.close();
        return result;
        
        
        
    }
    
}
