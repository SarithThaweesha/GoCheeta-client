/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

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
@WebServlet(name = "DriverLoginServlet", urlPatterns = {"/DriverLoginServlet"})
public class DriverLoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        private String username = null;
	private String password = null;
       @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
                username = request.getParameter("username");
		password = request.getParameter("password");
		
		// simple validation
		if((username != null && !username.isEmpty()) && (password != null && !password.isEmpty())) {
			
			// defining the object for AuthenticationService
			DriverAutho service = new DriverAutho();
			
			// validating the user input
			Driver driver = service.loginDriver(username, password);
			
			// dispatching the result based on the outcome 
			if(driver != null && driver.isValidDriver()) {
				
				HttpSession session = request.getSession();
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("DriverHome.jsp");
				
				// setting user details object in session based on the valid outcome
				session.setAttribute("driver", driver);
				
				dispatcher.forward(request, response);
				
				
                        }
		}
        }
    }
