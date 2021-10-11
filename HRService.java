/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.b2bhotelservice.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.mycompany.b2bhotelservice.model.Customer;
import com.mycompany.b2bhotelservice.model.Receipt;
import com.mycompany.b2bhotelservice.model.Room;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
/**
 *
 * @author cynth
 */

public class HRService extends DBConnection{
  private final ArrayList<Room> List = new ArrayList(); 
    
  public HRService(){
      super();
  }
      
     /* hotelChoice name = new hotelChoice("Helping", "N Jack Street", null, "Tallahassee", "FL", "33333", "850-414-9000");
     private String name;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postalcode;
        private String phone; */
      
     
  /*All*/
  public List<Receipt> all() throws InterruptedException, ExecutionException {
	List<Receipt> results = new ArrayList<>();
  
	// asynchronously retrieve all users
	ApiFuture<QuerySnapshot> query = db.collection("HotelReserve").get();
	
	// query.get() blocks (stops other processes from excuting) on response 
	// call to firebase
	QuerySnapshot querySnapshot = query.get();
	
	//getting the result set 
	List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
   
      //loop over result set and add them to list
      documents.forEach(document -> {
          results.add(document.toObject(Receipt.class));
      });
	
	return results;
  }
   
  
      public Customer findBycustomerId(int customerId) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  receipt = db.collection("HotelReserve");
	//query where clause
	Query query = receipt.whereEqualTo("customerId", customerId);
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
	return documents.get(0).toObject(Customer.class);
  
  return null;
}
      
       public Receipt findByConfirmationNo(int ConfirmationNo) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  receipt = db.collection("HotelReserve");
	//query where clause
	Query query = receipt.whereEqualTo("ConfirmationNo", ConfirmationNo);
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
	return documents.get(0).toObject(Receipt.class);
  
  return null;
}
        
    public String createHotelReserve(int ConfirmationNo, ArrayList<Receipt>roomNum, String paidStatus)
            throws ParseException, InterruptedException, ExecutionException {
        
        SimpleDateFormat formatter =  new SimpleDateFormat ("yyyy-MM-dd 00:00:00");
        String now = 
              formatter.format(new Date(System.currentTimeMillis()));
        Date submitted = formatter.parse(now);
        
        Random rand = new Random();
        int customerId = rand.nextInt(10000);
        
       Receipt newReceipt = 
          new Receipt(ConfirmationNo, submitted, roomNum, paidStatus);
        
        ApiFuture<DocumentReference> future =
                db.collection("HotelReserve").add(newReceipt);
        
        DocumentReference doc = future.get();
        
        return doc.getId();
    }  
 
    
 public ArrayList<Receipt> findBySubmittedDate(Date submitted) throws InterruptedException, ExecutionException{
    
	ArrayList<Receipt> resultList = new ArrayList<>();
   
	CollectionReference  receipt = db.collection("HotelReserve");
	Query query = receipt.whereEqualTo("submitted", submitted);
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	
        documents.forEach(document -> {
            resultList.add(document.toObject(Receipt.class));
      });
   
   return resultList;
    } 

    public String createreserveRoom(int customerId, int ConfirmationNo, Customer customAddress, ArrayList<Room> roomNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }