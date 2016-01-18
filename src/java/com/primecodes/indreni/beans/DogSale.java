/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.beans;

/**
 *
 * @author kiran
 */
public class DogSale {
    private int ownerId;
    private int dogId;
    private String dogName;
    private String dogBreed;
   
    private String amount;
    private String date;

    public DogSale() {
    }

    public DogSale(int ownerId, int dogId, String amount, String date) {
        this.ownerId = ownerId;
        this.dogId = dogId;
        
        this.amount = amount;
        this.date = date;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    
    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getdogId() {
        return dogId;
    }

    public void setdogId(int dogId) {
        this.dogId = dogId;
    }

   

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DogSale{" + "ownerId=" + ownerId + ", dogId=" + dogId  + ", amount=" + amount + ", date=" + date + '}';
    }
    

   
    
}
