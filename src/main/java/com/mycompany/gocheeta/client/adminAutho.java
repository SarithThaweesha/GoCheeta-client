/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Admin;
import gocheeta.AdminService;
import gocheeta.AdminService_Service;

/**
 *
 * @author acer
 */
public class adminAutho {
     public Admin loginAdmin(String username, String password) {
		
		// defining the dao object
		AdminService_Service service = new  AdminService_Service();
                AdminService proxy=service.getAdminServicePort();		
		// calling the validate admin method		
                return proxy.loginAdmin(username, password);
	}
}
