/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.Marketting;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kiran
 */
public interface MarkettingDAO {
    public int insertMarkettingRecord(Marketting r) throws SQLException;
     public List<Marketting> getAll()throws SQLException;
}
