/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.beans;

/**
 *
 * @author Bhanu
 */
public class Employee {
    
    private int id;
    private String fname;
    private String lname;
    private String phoneNumber;

    public Employee() {
    }

    public Employee(int id, String fname, String lname, String phoneNumber) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", phoneNumber=" + phoneNumber + '}';
    }
}
