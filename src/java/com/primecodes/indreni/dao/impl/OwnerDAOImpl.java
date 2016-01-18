/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.Owner;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.OwnerDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bhanu
 */
public class OwnerDAOImpl implements OwnerDAO{

    private DBConnection connection;
    
    public OwnerDAOImpl() throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        connection = new DBConnection();
    }

    public OwnerDAOImpl(DBConnection connection) throws ClassNotFoundException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = connection;
    }
    
    @Override
    public Owner getById(int id) throws SQLException {
       Owner c= null;
        String sql = "Select * from tbl_owner WHERE id = ?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet rs = connection.fetch();
        
        while(rs.next()){
            if(rs.getInt("delete_flag") != 1){
            c= new Owner();
            c.setId(rs.getInt("id"));
            c.setFname(rs.getString("fname"));
            c.setMname(rs.getString("mname"));
            c.setLname(rs.getString("lname"));
            c.setAddress(rs.getString("address"));
            c.setHouseNumber(rs.getString("house_number"));
            c.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
            c.setSecondaryPhoneNumber(rs.getString("secondary_contact_number"));
            }
        }
        
        return c; 
    }

    @Override
    public List<Owner> getAll() throws SQLException {
        List<Owner> owners = new ArrayList<Owner>();
            String sql = "Select * from tbl_owner ORDER BY fname DESC";
             PreparedStatement stmt = connection.initStatement(sql);
                
             ResultSet rs = connection.fetch();
             
             while(rs.next()){
                 
                 if(rs.getInt("delete_flag") != 1){
                     Owner c = new Owner();
                 c.setId(rs.getInt("id"));
                 c.setFname(rs.getString("fname"));
                 c.setMname(rs.getString("mname"));
                 c.setLname(rs.getString("lname"));
                 c.setAddress(rs.getString("address"));
                 c.setHouseNumber(rs.getString("house_number"));
                 c.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
                 c.setSecondaryPhoneNumber(rs.getString("secondary_contact_number"));
                 owners.add(c);
                 }
             }
             
        return owners;
    }

    @Override
    public int insert(Owner o) throws SQLException {
       String sql = "INSERT into tbl_owner(id,fname,mname,lname,address,house_number,primary_contact_number,secondary_contact_number) values (0,?,?,?,?,?,?,?)";
       PreparedStatement stmt = connection.initStatement(sql);
       stmt.setString(1, o.getFname());
       stmt.setString(2, o.getMname());
       stmt.setString(3, o.getLname());
       stmt.setString(4, o.getAddress());
       stmt.setString(5, o.getHouseNumber()); 
       stmt.setString(6, o.getPrimaryPhoneNumber());
       stmt.setString(7, o.getSecondaryPhoneNumber());
      
       return connection.execute();
    }

    @Override
    public List<Owner> getByName(String name) throws SQLException {
        String sql = "SELECT id,fname,mname,lname,address,house_number,primary_contact_number FROM tbl_owner WHERE fname LIKE ?";       
        
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setString(1, "%"+name+"%");
        ResultSet rs = connection.fetch();
        List<Owner> owners = new ArrayList<Owner>();
        while(rs.next()){
            
           
                Owner o = new Owner();
            o.setId(rs.getInt("id"));
            o.setFname(rs.getString("fname"));
            o.setMname(rs.getString("mname"));
            o.setLname(rs.getString("lname"));
            o.setAddress(rs.getString("address"));
            o.setHouseNumber(rs.getString("house_number"));
            o.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
             
            owners.add(o);
            
        }
        
        return owners;
    }

    @Override
    public List<Owner> getByNumber(String number) throws SQLException {
        String sql = "SELECT id,fname,mname,lname,address,house_number,primary_contact_number FROM tbl_owner WHERE primary_contact_number LIKE ?";       
        
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setString(1, "%"+number+"%");
        ResultSet rs = connection.fetch();
        List<Owner> owners = new ArrayList<Owner>();
        while(rs.next()){
            
            
                Owner o = new Owner();
            o.setId(rs.getInt("id"));
            o.setFname(rs.getString("fname"));
            o.setMname(rs.getString("mname"));
            o.setLname(rs.getString("lname"));
            o.setAddress(rs.getString("address"));
            o.setHouseNumber(rs.getString("house_number"));
            o.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
            owners.add(o);
            
        }
        
        return owners;
    }

    @Override
    public int update(Owner o) throws SQLException {
        String sql = "Update tbl_owner SET fname=?,mname=?,lname=?,address=?,house_number=?,primary_contact_number=?,secondary_contact_number=? WHERE id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setString(1, o.getFname());
        stmt.setString(2,o.getMname());
        stmt.setString(3,o.getLname());
        stmt.setString(4,o.getAddress());
        stmt.setString(5,o.getHouseNumber());
        stmt.setString(6,o.getPrimaryPhoneNumber());
        stmt.setString(7,o.getSecondaryPhoneNumber());
        stmt.setInt(8,o.getId());
        
        return connection.execute();
    }

    @Override
    public int delete(int ownerId) throws SQLException {
        
            String sql ="UPDATE tbl_owner SET delete_flag = 1 WHERE id = ?";
            PreparedStatement stmt = connection.initStatement(sql);
            stmt.setInt(1, ownerId);
            
        return connection.execute();
    }

    @Override
    public List<Owner> getByLastName(String name) throws SQLException {
        String sql = "SELECT id,fname,mname,lname,address,house_number,primary_contact_number FROM tbl_owner WHERE lname LIKE ?";       
        
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setString(1, "%"+name+"%");
        ResultSet rs = connection.fetch();
        List<Owner> owners = new ArrayList<Owner>();
        while(rs.next()){
            
           
                Owner o = new Owner();
            o.setId(rs.getInt("id"));
            o.setFname(rs.getString("fname"));
            o.setMname(rs.getString("mname"));
            o.setLname(rs.getString("lname"));
            o.setAddress(rs.getString("address"));
            o.setHouseNumber(rs.getString("house_number"));
            o.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
             
            owners.add(o);
            
        }
        
        return owners;
    }

    @Override
    public List<Owner> getAllSortedById() throws SQLException {
        List<Owner> owners = new ArrayList<Owner>();
            String sql = "Select * from tbl_owner ORDER BY id DESC";
             PreparedStatement stmt = connection.initStatement(sql);
                
             ResultSet rs = connection.fetch();
             
             while(rs.next()){
                 
                 if(rs.getInt("delete_flag") != 1){
                     Owner c = new Owner();
                 c.setId(rs.getInt("id"));
                 c.setFname(rs.getString("fname"));
                 c.setMname(rs.getString("mname"));
                 c.setLname(rs.getString("lname"));
                 c.setAddress(rs.getString("address"));
                 c.setHouseNumber(rs.getString("house_number"));
                 c.setPrimaryPhoneNumber(rs.getString("primary_contact_number"));
                 c.setSecondaryPhoneNumber(rs.getString("secondary_contact_number"));
                 owners.add(c);
                 }
             }
             
        return owners;
    }
    
}
