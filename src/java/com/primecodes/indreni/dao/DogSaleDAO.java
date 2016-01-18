/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.DogSale;
import com.primecodes.indreni.beans.TrainingRecord;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kiran
 */
public interface DogSaleDAO {
     public int insertDogSaleRecord(DogSale r) throws SQLException;
     public List<DogSale> viewDogSaleRecordByOwnerId(int owner_id) throws SQLException;
}
