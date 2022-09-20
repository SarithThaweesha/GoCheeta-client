/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Customer;
import gocheeta.CustomerService;
import gocheeta.CustomerService_Service;

/**
 *
 * @author acer
 */
public class customerAutho {
   
    public boolean addCustomer(Customer customer){
        
        CustomerService_Service service=new CustomerService_Service();
        CustomerService proxy=service.getCustomerServicePort();
        
        return proxy.addCustomer(customer);
    }
    public Customer loginCustomer(String username, String password) {
		
		// defining the dao object
		CustomerService_Service service = new  CustomerService_Service();
                CustomerService proxy=service.getCustomerServicePort();
   
		
		// calling the validate user method
		
                return proxy.loginCustomer(username, password);
	}

  }
