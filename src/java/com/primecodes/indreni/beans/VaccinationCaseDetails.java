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
public class VaccinationCaseDetails {
    
    private int id;    
    private int oId;
    private int dId;
    private int mId;
    private int rFlag;
    private int cFlag;
    private int dFlag;
    private int tFlag;
    private String markettedDate;
    

    public VaccinationCaseDetails() {
    }

    public VaccinationCaseDetails(int id, int rFlag, int cFlag, int dFlag, int tFlag, String markettedDate) {
        this.id = id;
        this.rFlag = rFlag;
        this.cFlag = cFlag;
        this.dFlag = dFlag;
        this.tFlag = tFlag;
        this.markettedDate = markettedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getrFlag() {
        return rFlag;
    }

    public void setrFlag(int rFlag) {
        this.rFlag = rFlag;
    }

    public int getcFlag() {
        return cFlag;
    }

    public void setcFlag(int cFlag) {
        this.cFlag = cFlag;
    }

    public int getdFlag() {
        return dFlag;
    }

    public void setdFlag(int dFlag) {
        this.dFlag = dFlag;
    }

    public String getMarkettedDate() {
        return markettedDate;
    }

    public void setMarkettedDate(String markettedDate) {
        this.markettedDate = markettedDate;
    }

    public int gettFlag() {
        return tFlag;
    }

    public void settFlag(int tFlag) {
        this.tFlag = tFlag;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
    
    

    @Override
    public String toString() {
        return "VaccinationCaseDetails{" + "id=" + id + ", rFlag=" + rFlag + ", cFlag=" + cFlag + ", dFlag=" + dFlag + ", tFlag=" + tFlag + ", markettedDate=" + markettedDate + '}';
    }
    
    
    
}
