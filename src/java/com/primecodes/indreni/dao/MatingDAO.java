/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.DogSale;
import com.primecodes.indreni.beans.Mating;
import java.sql.SQLException;

/**
 *
 * @author kiran
 */
public interface MatingDAO {
    public int insertMatingRecord(Mating m) throws SQLException;
    
}
