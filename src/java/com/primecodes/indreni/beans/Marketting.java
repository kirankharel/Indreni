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
public class Marketting {
    private int id;
    private int clientId;
    private String dogName;
    private String marketter;
    private String services;
    private String treatment;
    private String name;
    private String address;
    public Marketting() {
    }

    public Marketting(int id, int clientId, String dogName, String marketter, String services, String treatment) {
        this.id = id;
        this.clientId = clientId;
        this.dogName = dogName;
        this.marketter = marketter;
        this.services = services;
        this.treatment = treatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }
    

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getMarketter() {
        return marketter;
    }

    public void setMarketter(String marketter) {
        this.marketter = marketter;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    public void setName(String name){
        this.name=name;
        
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "Marketting{" + "id=" + id + ", clientId=" + clientId + ", dogName=" + dogName + ", marketter=" + marketter + ", services=" + services + ", treatment=" + treatment + '}';
    }
    
    

    
}
