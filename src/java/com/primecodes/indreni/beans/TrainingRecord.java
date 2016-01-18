/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primecodes.indreni.beans;

import java.sql.Date;

/**
 *
 * @author kiran
 */
public class TrainingRecord {
    private int ownerId;
    private int dogId;
    private String charge;
    private String startDate;
    private String endDate;

    public TrainingRecord() {
    }

    public TrainingRecord(int ownerId, int dogId, String charge, String startDate, String endDate) {
        this.ownerId = ownerId;
        this.dogId = dogId;
        this.charge = charge;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "TrainingRecord{" + "ownerId=" + ownerId + ", dogName=" + dogId + ", charge=" + charge + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
     
    
    
}
