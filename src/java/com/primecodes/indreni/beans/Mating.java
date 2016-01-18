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
public class Mating {
    private int id;
    private int maleownerId;
    private int femaleOwnerId;
    private int maleDogId;
    private int  femaleDogId;
   
    private int charge;
    private String Date;

    public Mating() {
    }

    public Mating(int id, int maleownerId, int femaleOwnerId, int maleDogId, int  femaleDogId, int charge, String Date) {
        this.id = id;
        this.maleownerId = maleownerId;
        this.femaleOwnerId = femaleOwnerId;
        this.maleDogId = maleDogId;
        this. femaleDogId =  femaleDogId;
        
        this.charge = charge;
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaleownerId() {
        return maleownerId;
    }

    public void setMaleownerId(int maleownerId) {
        this.maleownerId = maleownerId;
    }

    public int getFemaleOwnerId() {
        return femaleOwnerId;
    }

    public void setFemaleOwnerId(int femaleOwnerId) {
        this.femaleOwnerId = femaleOwnerId;
    }

    public int getMaleDogId() {
        return maleDogId;
    }

    public void setMaleDogId(int maleDogId) {
        this.maleDogId = maleDogId;
    }

    public int getFemaleDogId() {
        return  femaleDogId;
    }

    public void setFemaleDogId(int  femaleDogId) {
        this. femaleDogId =  femaleDogId;
    }

    

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Mating{" + "id=" + id + ", maleownerId=" + maleownerId + ", femaleOwnerId=" + femaleOwnerId + ", maleDogId=" + maleDogId + ", femaleDogId=" + femaleDogId + ", charge=" + charge + ", Date=" + Date + '}';
    }



}
