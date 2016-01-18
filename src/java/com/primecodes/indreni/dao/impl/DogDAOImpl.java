/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.dao.impl;

import com.primecodes.indreni.beans.Dog;
import com.primecodes.indreni.connection.DBConnection;
import com.primecodes.indreni.dao.DogDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Bhanu
 */
public class DogDAOImpl implements DogDAO {
    DBConnection connection;
    DBConnection connection2;

    public DogDAOImpl() throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.jdbc.Driver");
         connection = new DBConnection();
    }

    public DogDAOImpl(DBConnection connection) throws ClassNotFoundException {
         Class.forName("com.mysql.jdbc.Driver");
        this.connection = connection;
    }
    
    @Override
    public List<Dog> getByOwnerId(int id) throws SQLException {
        List<Dog> dogs = new ArrayList<Dog>();
        
        String sql = "Select * from tbl_dog WHERE owner_id =?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet rs = connection.fetch();
        int breedId=1;
        Dog d = null;
        while(rs.next()){
            d=new Dog();
            if(rs.getInt("delete_flag")!=1){
            d.setId(rs.getInt("id"));
            d.setOwnerId(rs.getInt("owner_id"));
            d.setName(rs.getString("name"));
            d.setGender(rs.getString("sex"));
            d.setAge(rs.getFloat("age"));
            breedId = rs.getInt("breed_id");
            d.setBreed(getBreedName(breedId));
            dogs.add(d);
            }
        }
        
        return dogs;
    } 

    @Override
    public List<String> getAllBreeds() throws SQLException {
        List<String> breeds = new ArrayList<String>();
        
        String sql ="Select name from tbl_breed";
        PreparedStatement stmt = connection.initStatement(sql);
        
        ResultSet rs= connection.fetch();
        
        while(rs.next()){
            breeds.add(rs.getString("name"));
        }
        
        return breeds;
    }

    @Override
    public int getBreedId(String breed) throws SQLException {
            String sql ="Select id from tbl_breed where name = ?";        
            PreparedStatement stmt = connection.initStatement(sql);
            
            stmt.setString(1, breed);
            int breedId=1;
            ResultSet rs = connection.fetch();
                    while(rs.next()){
                        breedId= (rs.getInt("id"));
                    }
             return breedId;
    }

    @Override
    public int insert(Dog d,int breedId) throws SQLException {
        String sql = "INSERT into tbl_dog (owner_id,name,breed_id,age,sex,registered_date) values(?,?,?,?,?,?)";
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setInt(1, d.getOwnerId());
        stmt.setString(2, d.getName());
        stmt.setInt(3, breedId);
        stmt.setFloat(4, d.getAge());
        stmt.setString(5, d.getGender());
        stmt.setString(6, d.getRegisteredDate());
        
        return connection.execute();
    }

    @Override
    public int getDogId(int owner_id, String dog_name) throws SQLException {
      String sql = "Select id FROM tbl_dog WHERE owner_id = ? AND name = ?";
      PreparedStatement stmt = connection.initStatement(sql);
      stmt.setInt(1, owner_id);
      stmt.setString(2, dog_name);
      
      ResultSet rs = connection.fetch();
      int id= 0;
      while(rs.next()){
          id = rs.getInt("id");
      }
      
      return id;
    }

    @Override
    public String getBreedName(int id) throws SQLException {
         String sql = "Select name from tbl_breed WHERE id=?";
            PreparedStatement stmt = connection.initStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = connection.fetch();
            String breedName="";
            while(rs.next()){
                breedName = rs.getString("name");
            }
            
            return breedName;
    }

    @Override
    public List<Dog> getAll() throws SQLException {
         List<Dog> dogs = new ArrayList<Dog>();
        
        String sql = "Select * from tbl_dog";
        PreparedStatement stmt = connection.initStatement(sql);        
        
        ResultSet rs = connection.fetch();
        int breedId=1;
        Dog d = null;
        while(rs.next()){
            d=new Dog();
            if(rs.getInt("delete_flag")!=1){
            d.setId(rs.getInt("id"));
            d.setOwnerId(rs.getInt("owner_id"));
            d.setName(rs.getString("name"));
            d.setGender(rs.getString("sex"));
            d.setAge(rs.getFloat("age"));
            breedId = rs.getInt("breed_id");
            d.setBreed(getBreedName(breedId));
            dogs.add(d);
            }
        }
        
        return dogs;
    }
    public Dog getById(int id) throws SQLException{
        String sql = "Select * from tbl_dog WHERE id = ?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet rs = connection.fetch();
         int breedId=1;
         Dog d = null;
        while(rs.next()){
            d=new Dog();
            if(rs.getInt("delete_flag")!=1){
            d.setId(rs.getInt("id"));
            d.setOwnerId(rs.getInt("owner_id"));
            d.setName(rs.getString("name"));
            d.setGender(rs.getString("sex"));
            d.setAge(rs.getFloat("age"));
            breedId = rs.getInt("breed_id");
            d.setBreed(getBreedName(breedId));
            d.setRegisteredDate(rs.getString("registered_date"));
            }
        }
        
        return d;
    }

    @Override
    public int update(Dog d,int breedId) throws SQLException {
        String sql = "Update tbl_dog SET owner_id=?,name=?,breed_id=?,age=?,sex=?,registered_date=? WHERE id =?";
        PreparedStatement stmt = connection.initStatement(sql);
        
        stmt.setInt(1, d.getOwnerId());
        stmt.setString(2, d.getName());
        stmt.setInt(3, breedId);
        stmt.setFloat(4, d.getAge());
        stmt.setString(5, d.getGender());
        stmt.setString(6, d.getRegisteredDate());
        stmt.setInt(7,d.getId());
        
        return connection.execute();
    }

    @Override
    public int delete(int id) throws SQLException {
        String sql = "UPDATE tbl_dog SET delete_flag=1 WHERE id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        return connection.execute();
    }
    
    
    @Override
    public int checkDeleted(int id) throws SQLException {
        String sql = "SELECT delete_flag FROM tbl_dog WHERE id=?";
        PreparedStatement stmt = connection.initStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet rs = connection.fetch();
        int flag=0;
        while(rs.next()){
            if(rs.getInt("delete_flag") == 1){
                flag =1;
            }
        }
        return flag;
    }
}
