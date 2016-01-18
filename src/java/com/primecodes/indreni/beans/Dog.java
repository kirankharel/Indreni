/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.beans;

/**
 *
 * @author Kiran
 */
public class Dog {
    private int id;
    private int ownerId;
    private String name;
    private String breed;
    private float age;
    private String gender;
    private String registered_date;

    public Dog() {
    }

    public Dog(int id, int ownerId, String name, String breed, int age,String gender,String registered_date) {
        this.id = id;
        this.ownerId = ownerId;
        this.name = name;
        this.breed = breed;
        this.age = age;        
        this.gender = gender;
        this.registered_date = registered_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegisteredDate() {
        return registered_date;
    }

    public void setRegisteredDate(String registered_date) {
        this.registered_date = registered_date;
    }
    
    

    @Override
    public String toString() {
        return "Dog{" + "id=" + id + ", ownerId=" + ownerId + ", name=" + name + ", breed=" + breed + ", age=" + age + ", gender=" + gender + '}';
    }
        
    
    
}
