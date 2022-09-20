/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Vehicle;
import gocheeta.VehicleService;
import gocheeta.VehicleService_Service;

/**
 *
 * @author acer
 */
public class VehicleAutho {
    public boolean addVehicle(Vehicle vehicle){
        
        VehicleService_Service service=new VehicleService_Service();
        VehicleService proxy=service.getVehicleServicePort();
        
        return proxy.addVehicle(vehicle);
    }
     public boolean updateVehicle(Vehicle vehicle){
        
        VehicleService_Service service=new VehicleService_Service();
        VehicleService proxy=service.getVehicleServicePort();       
        return proxy.updateVehicle(vehicle);
    }
      public boolean deleteVehicle(String id){
        VehicleService_Service service=new VehicleService_Service ();
        VehicleService proxy=service.getVehicleServicePort();
        return proxy.deleteVehicle(id);
    }
}
