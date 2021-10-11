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
 * @author cynthia thomas
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

//create class for selecting location//
public class hotelChoice{
        private String hname;
	private String hstreet1;
	private String hstreet2;
	private String hcity;
	private String hstate;
	private String hpostalcode;
        private String hphone;


//constructor to give the variable a value to pass through //
    public hotelChoice(String hname, String hstreet1, String hstreet2, String hcity, String hstate, String hpostalcode, String hphone) {this.hname = hname;    
        this.hstreet1 = hstreet1;
        this.hstreet2 = hstreet2;
        this.hcity = hcity;
        this.hstate = hstate;
        this.hpostalcode = hpostalcode;
        this.hphone = hphone;
}

    //get

    public String getHname() {
        return hname;
    }

    public String getHstreet1() {
        return hstreet1;
    }

    public String getHstreet2() {
        return hstreet2;
    }

    public String getHcity() {
        return hcity;
    }

    public String getHstate() {
        return hstate;
    }

    public String getHpostalcode() {
        return hpostalcode;
    }

    public String getHphone() {
        return hphone;
    }
    
    
    //set
    public void setHname(String hname) {
        this.hname = hname;
    }

    public void setHstreet1(String hstreet1) {
        this.hstreet1 = hstreet1;
    }

    public void setHstreet2(String hstreet2) {
        this.hstreet2 = hstreet2;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public void setHstate(String hstate) {
        this.hstate = hstate;
    }

    public void setHpostalcode(String hpostalcode) {
        this.hpostalcode = hpostalcode;
    }

    public void setHphone(String hphone) {
        this.hphone = hphone;
    }

}    
