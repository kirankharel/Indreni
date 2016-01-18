/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.Owner;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bhanu
 */
public interface OwnerDAO{
    
    public int insert(Owner o) throws SQLException;
    public int update(Owner o) throws SQLException;
    public int delete(int ownerId) throws SQLException;
    public List<Owner> getAll() throws SQLException;
    public List<Owner> getAllSortedById() throws SQLException;
    public Owner getById(int id) throws SQLException;
    public List<Owner> getByName(String name) throws SQLException;
    public List<Owner> getByLastName(String name) throws SQLException;
    public List<Owner> getByNumber (String number) throws SQLException;
}
