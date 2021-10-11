/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.endpoint;


import com.mycompany.b2bhotelservice.model.Customer;
import com.mycompany.b2bhotelservice.model.Receipt;
import com.mycompany.b2bhotelservice.model.Room;
import com.mycompany.b2bhotelservice.service.HRService;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author cynth
 */

@WebService
public class reserveRoom {
    
    private final HRService service = new HRService();
    
    /**
     *
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @WebMethod(operationName= "allHrs")
    @WebResult(name= "ReserveRoom")
    
    public List<Receipt> getAllreserveRoom()throws InterruptedException, ExecutionException{
        return service.all();
    }       
   
    @WebResult(name="reserveRoom")
    public Receipt getReserveRoomByConfirmationNo(@WebParam(name = "reserveRoomConfirmationNo")int ConfirmationNo) throws InterruptedException, ExecutionException{
        return service.findByConfirmationNo(ConfirmationNo);
    } 
    /**
     *
     * @param submitted
     * @return
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @WebResult(name="reserveRoom")
    public ArrayList<Receipt> getBySubmittedDate(@WebParam(name = "submitted") Date submitted) throws InterruptedException, ExecutionException{
        return service.findBySubmittedDate(submitted);    
 }
    /**
     *
     * @param customerId
     * @param ConfirmationNo
     * @param customAddress
     * @param roomNum
     * @return
     * @throws java.text.ParseException
     * @throws InterruptedException
     * @throws ExecutionException
     */
    @WebResult(name="objectcustomerID") 
        public String createReserveRoom
   (@WebParam(name = "customerId") int customerId,
    @WebParam(name = "ConfirmationNo") int ConfirmationNo,
    @WebParam(name = "customAddress") Customer customAddress,
    @WebParam(name = "roomNum") ArrayList<Room> roomNum)
         throws ParseException, InterruptedException,ExecutionException{
     return service.createreserveRoom(customerId, ConfirmationNo, customAddress, roomNum);
 }
}