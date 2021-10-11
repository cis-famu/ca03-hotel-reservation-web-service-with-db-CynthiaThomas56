/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Cynthia Thomas
 */

/*Class Rooms*/
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

public class Room {
    private final @XmlAttribute int floor;
    private  @XmlAttribute int roomNum;
    private final String bedType;
    private Date submitted;
    private String checkInDate;
    private String checkOutDate;
   
/*Constructor*/   

    public Room(int floor, int roomNum, String bedType, Date submitted, String checkInDate, String checkOutDate) {
        this.floor = floor;
        this.roomNum = roomNum;
        this.bedType = bedType;
        this.submitted = submitted;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public String getBedType() {
        return bedType;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
 } 