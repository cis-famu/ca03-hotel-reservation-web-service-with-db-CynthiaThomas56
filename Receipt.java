/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.model;

import java.util.ArrayList;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author cynthia thomas
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)

//create class for address//
public class Receipt{
	private int ConfirmationNo; /*reservation confirmation number*/
        private Date submitted; /*date of reservation*/
        private ArrayList<ReservationItem> roomNum;
	private double paidStatus; /*Paid*/

    public Receipt(int ConfirmationNo, Date submitted, ArrayList<Receipt> roomNum, String paidStatus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
//constructor //

    public int getConfirmationNo() {
        return ConfirmationNo;
    }

    public Date getSubmitted() {
        return submitted;
    }

    public ArrayList<ReservationItem> getRoomNum() {
        return roomNum;
    }

    public double getPaidStatus() {
        return paidStatus;
    }

    public void setConfirmationNo(int ConfirmationNo) {
        this.ConfirmationNo = ConfirmationNo;
    }

    public void setSubmitted(Date submitted) {
        this.submitted = submitted;
    }

    public void setRoomNum(ArrayList<ReservationItem> roomNum) {
        this.roomNum = roomNum;
    }

    public void setPaidStatus(double paidStatus) {
        this.paidStatus = paidStatus;
    }
	
    

    
    private static class ReservationItem {

        public ReservationItem() {
        }
    }
}


