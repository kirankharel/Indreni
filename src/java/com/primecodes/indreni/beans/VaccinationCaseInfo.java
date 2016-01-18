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
public class VaccinationCaseInfo {
 
    private int id;
    private int vaccinationCaseId;
    private String status;
    private String assignedDate;
    private String type;
    private String details;

    public VaccinationCaseInfo() {
    }

    public VaccinationCaseInfo(int id, int vaccinationCaseId, String status, String assignedDate, String type,String details) {
        this.id = id;
        this.vaccinationCaseId = vaccinationCaseId;
        this.status = status;
        this.assignedDate = assignedDate;
        this.type = type;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVaccinationCaseId() {
        return vaccinationCaseId;
    }

    public void setVaccinationCaseId(int vaccinationCaseId) {
        this.vaccinationCaseId = vaccinationCaseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(String assignedDate) {
        this.assignedDate = assignedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "VaccinationCaseInfo{" + "id=" + id + ", vaccinationCaseId=" + vaccinationCaseId + ", status=" + status + ", assignedDate=" + assignedDate + ", type=" + type + ", details=" + details + '}';
    }
    
    
    
}
