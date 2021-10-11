/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author cynth
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

public class Customer {
    private int customerId;
    private String customName;
    private String customAddress;
    private String ccity;
    private String cstate;
    private String cpostalCode;

    public Customer(int customerId, String customName, String customAddress, String city, String state, String postalCode) {
        this.customerId = customerId;
        this.customName = customName;
        this.customAddress = customAddress;
        this.ccity = city;
        this.cstate = state;
        this.cpostalCode = postalCode;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomName() {
        return customName;
    }

    public String getCustomAddress() {
        return customAddress;
    }

    public String getCity() {
        return ccity;
    }

    public String getState() {
        return cstate;
    }

    public String getPostalCode() {
        return cpostalCode;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public void setCustomAddress(String customAddress) {
        this.customAddress = customAddress;
    }

    public void setCity(String city) {
        this.ccity = city;
    }

    public void setState(String state) {
        this.cstate = state;
    }

    public void setPostalCode(String postalCode) {
        this.cpostalCode = postalCode;
    }
   
}   
