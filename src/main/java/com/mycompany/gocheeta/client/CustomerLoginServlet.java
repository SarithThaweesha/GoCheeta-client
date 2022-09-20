/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author acer
 */
@WebServlet(name = "CustomerLoginServlet", urlPatterns = {"/CustomerLoginServlet"})
public class CustomerLoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        private String Username = null;
	private String Password = null;
       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                Username = request.getParameter("username");
		Password = request.getParameter("password");
		
		// simple validation
		if((Username != null && !Username.isEmpty()) && (Password != null && !Password.isEmpty())) {
			
			// defining the object for AuthenticationService
			customerAutho service = new customerAutho();
			
			// validating the user input
			Customer customer = service.loginCustomer(Username, Password);
			
			// dispatching the result based on the outcome 
			if(customer != null && customer.isValidUser()) {
				
				HttpSession session = request.getSession();
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("mainLog.jsp");
				
				// setting user details object in session based on the valid outcome
				session.setAttribute("customer", customer);
				
				dispatcher.forward(request, response);
				
				
                        }
		}
        }
    }
