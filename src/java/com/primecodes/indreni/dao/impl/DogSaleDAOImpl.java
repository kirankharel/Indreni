/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.DogSale;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.DogDAO;
import com.primecodes.indreni.dao.DogSaleDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kiran
 */
public class DogSaleDAOImpl implements DogSaleDAO {
     private DBConnection connection;
    public DogSaleDAOImpl() throws ClassNotFoundException, SQLException {
         connection= new DBConnection();
    }


    @Override
    public int insertDogSaleRecord(DogSale r) throws SQLException {
        String sql="INSERT INTO tbl_dog_sales(o_id,d_id,amount,date) VALUES(?,?,?,?)"; 
        PreparedStatement stmt = connection.initStatement(sql);

     
        stmt.setInt(1, r.getOwnerId());
        stmt.setInt(2, r.getdogId());
        
        stmt.setString(3, r.getAmount());
        stmt.setString(4, r.getDate());
        
        int result=connection.execute();
        connection.close();
        return result;  
    }

    @Override
    public List<DogSale> viewDogSaleRecordByOwnerId(int owner_id) throws SQLException {
                     List<DogSale> ds = new ArrayList<DogSale>();

         try {
             String sql ="SELECT * FROM tbl_dog_sales where o_id =?";
             PreparedStatement stmt = connection.initStatement(sql);
             
             stmt.setInt(1,owner_id);
             DogDAO dDAO = new DogDAOImpl();
             ResultSet rs = connection.fetch();
             while(rs.next()){
                 if(dDAO.checkDeleted(rs.getInt("d_id")) == 0){
                 DogSale dsn = new DogSale();
                 dsn.setdogId(rs.getInt("d_id"));
                 dsn.setDogName((dDAO.getById(rs.getInt("d_id")).getName()));
                 dsn.setDogBreed((dDAO.getById(rs.getInt("d_id")).getBreed()));
                 Integer dId = rs.getInt("amount");
                 dsn.setAmount(dId.toString());
                 dsn.setDate(rs.getString("date"));
                 ds.add(dsn);
                 
                 }
             }
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DogSaleDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return ds;
    }
    
}
