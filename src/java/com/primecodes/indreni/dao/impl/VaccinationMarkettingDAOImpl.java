/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.Employee;
import com.primecodes.indreni.beans.VaccinationCaseDetails;
import com.primecodes.indreni.beans.VaccinationCaseInfo;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.VaccinationMarkettingDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bhanu
 */
public class VaccinationMarkettingDAOImpl implements VaccinationMarkettingDAO {
    DBConnection connection;
    
    public VaccinationMarkettingDAOImpl() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = new DBConnection();
    }
    
    @Override
    public int insert(VaccinationCaseDetails v,int dog_id,int owner_id,int marketter_id) throws SQLException {

        String sql = "INSERT into tbl_vaccination_case_details(o_id,d_id,m_id,r_flag,c_flag,d_flag,t_flag,marketted_date) values (?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, owner_id);
        stmt.setInt(2, dog_id);
        stmt.setInt(3, marketter_id);
        stmt.setInt(4, v.getrFlag());
        stmt.setInt(5, v.getcFlag());
        stmt.setInt(6, v.getdFlag());
        stmt.setInt(7, v.gettFlag());
        stmt.setString(8, v.getMarkettedDate());
        
        return connection.execute();
    }

    @Override
    public List<VaccinationCaseDetails> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<VaccinationCaseDetails> getAllByDate(String date) throws SQLException{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public VaccinationCaseDetails getById(int id) throws SQLException{
        String sql = "SELECT FROM tbl_vaccination_case_details WHERE id = ?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        
        VaccinationCaseDetails testCase = null;
        
        ResultSet rs = connection.fetch();
        
        while(rs.next()){
            testCase = new VaccinationCaseDetails();
            
            testCase.setId(rs.getInt("id"));
            testCase.setMarkettedDate(rs.getDate("marketted_date").toString());
            testCase.setrFlag(rs.getInt("r_flag"));
            testCase.setcFlag(rs.getInt("c_flag"));
            testCase.setdFlag(rs.getInt("d_flag"));
            testCase.settFlag(rs.getInt("t_flag"));
            testCase.setoId(rs.getInt("o_id"));
            testCase.setdId(rs.getInt("d_id"));
            testCase.setmId(rs.getInt("m_id"));
            
            
        }
             
        return testCase;
    }
    
    
    
    
    @Override
    public List<VaccinationCaseInfo> getCaseAllByDate(String date) throws SQLException {
        String sql = "SELECT FROM tbl_vaccination_case_info WHERE assigned_date=?";
        List<VaccinationCaseInfo> cases = new ArrayList<VaccinationCaseInfo>();
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setString(1, date);
        
        ResultSet rs = connection.fetch();
        while(rs.next()){
            VaccinationCaseInfo testCase = new VaccinationCaseInfo();
            
            testCase.setId(rs.getInt("id"));
            testCase.setVaccinationCaseId(rs.getInt("v_id"));
            testCase.setType(rs.getString("type"));
            testCase.setAssignedDate(rs.getDate("assigned_date").toString());
            testCase.setDetails(rs.getString("details"));
            testCase.setStatus(rs.getString("status"));
            
            cases.add(testCase);
        }
        
        rs.close();
        return cases;
    }

    @Override
    public VaccinationCaseDetails getByDogId(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertVaccinationCaseInfo(VaccinationCaseInfo v) throws SQLException {
        String sql = "INSERT INTO tbl_vaccination_case_info(v_id,type,assigned_date,details,status) values (?,?,?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, v.getVaccinationCaseId());
        stmt.setString(2,v.getType());
        stmt.setString(3,v.getAssignedDate());
        stmt.setString(4,v.getDetails());
        stmt.setString(5, v.getStatus());
        
        return connection.execute();
    }

    @Override
    public List<Employee> getAllMarketter() throws SQLException {
        String sql = "SELECT * FROM tbl_marketting";
        PreparedStatement stmt = connection.initStatement(sql);
        
        ResultSet rs = connection.fetch();
        List<Employee> employees = new ArrayList<Employee>();
        while(rs.next()){
            Employee e = new Employee();
            e.setId(rs.getInt("id"));
            e.setFname(rs.getString("fname"));
            e.setLname(rs.getString("lname"));
            e.setPhoneNumber(rs.getString("phone_number"));
            employees.add(e);
        }
        return employees;
    }

    @Override
    public List<Employee> getAllTechnician() throws SQLException {
        String sql = "SELECT * FROM tbl_technician";
        PreparedStatement stmt = connection.initStatement(sql);
        
        ResultSet rs = connection.fetch();
        List<Employee> employees = new ArrayList<Employee>();
        while(rs.next()){
            Employee e = new Employee();
            e.setId(rs.getInt("id"));
            e.setFname(rs.getString("fname"));
            e.setLname(rs.getString("lname"));
            e.setPhoneNumber(rs.getString("phone_number"));
            employees.add(e);
        }
        return employees;
    }

    @Override
    public int getLastId() throws SQLException {
        String sql = "Select Max(id) from tbl_vaccination_case_details";
        PreparedStatement stmt = connection.initStatement(sql);
        
        ResultSet rs = connection.fetch();
        int id=1;
        while(rs.next()){
            id = rs.getInt("Max(id)");
        }
        
        return id;
    }

    
}
