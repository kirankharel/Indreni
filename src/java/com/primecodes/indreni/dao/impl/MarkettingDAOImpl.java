/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.Marketting;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.MarkettingDAO;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kiran
 */
public class MarkettingDAOImpl implements MarkettingDAO{

    private DBConnection connection;

    public MarkettingDAOImpl() throws ClassNotFoundException, SQLException {
      connection= new DBConnection();
    }
    
    
    @Override
    public int insertMarkettingRecord(Marketting r) throws SQLException {
      String sql="INSERT INTO tbl_marketting1(id,clientId,dogName,marketter,services, treatment) VALUES(0,?,?,?,?,?)"; 
        PreparedStatement stmt = connection.initStatement(sql);

     
        stmt.setInt(1, r.getClientId());
        stmt.setString(2, r.getDogName());
        
        stmt.setString(3, r.getMarketter());
        stmt.setString(4, r.getServices());
        stmt.setString(5, r.getTreatment());
        
        int result=connection.execute();
        connection.close();
        return result;  
    }

    @Override
    public List<Marketting> getAll() throws SQLException {
         List<Marketting> mlist=new ArrayList<>();
        String sql="SELECT * FROM tbl_marketting1 INNER JOIN tbl_owner ON tbl_marketting1.clientId=tbl_owner.id ";
        
        PreparedStatement stmt=connection.initStatement(sql);
        
        ResultSet rs=connection.fetch();
        while(rs.next())
        {
            Marketting s=new Marketting();
            String fname=rs.getString("fname");
            String mname=rs.getString("mname");
            String lname=rs.getString("lname");
            String address=rs.getString("address");
            s.setId(rs.getInt("id"));
            s.setClientId(rs.getInt("clientId"));
            s.setDogName(rs.getString("dogName"));
            s.setMarketter(rs.getString("marketter"));
            s.setServices(rs.getString("services"));
            s.setTreatment(rs.getString("treatment"));
            s.setName(fname+" "+mname+" "+lname);
            s.setAddress(address);
            mlist.add(s);
            
        }
        
        return mlist;    
    }
    
}
