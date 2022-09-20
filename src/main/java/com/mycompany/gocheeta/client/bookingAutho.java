/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Booking;
import gocheeta.JourneyService;
import gocheeta.JourneyService_Service;

/**
 *
 * @author acer
 */
public class bookingAutho {
      public boolean addBooking(Booking booking){
        
        JourneyService_Service service=new JourneyService_Service();
        JourneyService proxy=service.getJourneyServicePort();
        
        return proxy.addBooking(booking);
    }
       public Booking getBooking(String start){
        
        JourneyService_Service service=new JourneyService_Service();
        JourneyService proxy=service.getJourneyServicePort();
        
        return proxy.getBooking(start);
    }
      
}
