/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.Employee;
import com.primecodes.indreni.beans.VaccinationCaseDetails;
import com.primecodes.indreni.beans.VaccinationCaseInfo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bhanu
 */
public interface VaccinationMarkettingDAO {
    public int insert (VaccinationCaseDetails v,int dog_id,int owner_id,int marketter_id) throws SQLException;
    
    public int insertVaccinationCaseInfo(VaccinationCaseInfo v) throws SQLException; //insert details of Vaccination case
    
    public VaccinationCaseDetails getById(int id) throws SQLException;
    
    public List<VaccinationCaseDetails> getAll() throws SQLException;
    public List<VaccinationCaseDetails> getAllByDate(String date) throws SQLException;
    public List<VaccinationCaseInfo> getCaseAllByDate(String date) throws SQLException;
    public VaccinationCaseDetails getByDogId(int id) throws SQLException;
    public List<Employee> getAllMarketter() throws SQLException;
    public List<Employee> getAllTechnician() throws SQLException;
    public int getLastId() throws SQLException;
}
