/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

/**
 *
 * @author acer
 */
public class DriverAutho {
    public boolean addDriver(Driver driver){
        
        DriverService_Service service=new DriverService_Service();
        DriverService proxy=service.getDriverServicePort();
        
        return proxy.addDriver(driver);
    }
     public boolean updateDriver(Driver driver){
        
        DriverService_Service service=new DriverService_Service();
        DriverService proxy=service.getDriverServicePort();
        
        return proxy.updateDriver(driver);
    }
      public boolean deleteDriver(String id){
        DriverService_Service service=new DriverService_Service ();
        DriverService proxy=service.getDriverServicePort();
        return proxy.deleteDriver(id);
    }
       public Driver loginDriver(String username, String password) {
		
		// defining the dao object
		DriverService_Service service = new  DriverService_Service();
                DriverService proxy=service.getDriverServicePort();		
		// calling the validate admin method		
                return proxy.loginDriver(username, password);
	}
}
