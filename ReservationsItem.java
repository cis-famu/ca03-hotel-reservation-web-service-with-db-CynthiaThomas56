/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.model;

import java.util.Date;

/*
 *
 * @author cynthia thomas
 */
public class ReservationsItem extends Room{
    
    
    public ReservationsItem(int floor, int roomNum, String bedType, Date submitted, String checkInDate, String checkOutDate) {
        super(floor, roomNum, bedType, submitted, checkInDate, checkOutDate);
    }
    
  }