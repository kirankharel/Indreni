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
public class Owner {
    private int id;
    private String fname;
    private String mname;
    private String lname;
    private String address;
    private String houseNumber;
    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;

    public Owner() {
    }
    public Owner(int id, String fname, String mname, String lname, String address, String houseNumber, String primaryPhoneNumber, String secondaryPhoneNumber) {
        this.id = id;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.houseNumber = houseNumber;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.secondaryPhoneNumber = secondaryPhoneNumber;
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

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    @Override
    public String toString() {
        return "Owner{" + "id=" + id + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", address=" + address + ", houseNumber=" + houseNumber + ", primaryPhoneNumber=" + primaryPhoneNumber + ", secondaryPhoneNumber=" + secondaryPhoneNumber + '}';
    }
    
    
    

    
}
