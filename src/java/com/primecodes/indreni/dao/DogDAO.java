/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao;

import com.primecodes.indreni.beans.Dog;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author Bhanu
 */
public interface DogDAO {
    public int insert(Dog d,int breedId) throws SQLException;
    public int delete(int id) throws SQLException;
    public int update(Dog d,int breedId) throws SQLException;
    public int getBreedId(String breed) throws SQLException;
    public String getBreedName(int id) throws SQLException;
    public List<String> getAllBreeds() throws SQLException;
    public List<Dog> getByOwnerId(int id) throws SQLException;
    public List<Dog> getAll() throws SQLException;
    public Dog getById(int id) throws SQLException;
    public int getDogId(int owner_id, String dog_name)throws SQLException;
    public int checkDeleted(int id) throws SQLException;
}
