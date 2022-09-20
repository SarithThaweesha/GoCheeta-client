/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acer
 */
@WebServlet(name = "CustomerRegisterServlet", urlPatterns = {"/CustomerRegisterServlet"})
public class CustomerRegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
          
        customerAutho service=new customerAutho();
        
        String FName = request.getParameter("Fname");
        String LName = request.getParameter("Lname");
        String Contact=  request.getParameter("contact");
        String Email = request.getParameter("email");
        String Username = request.getParameter("username"); 
        String Password = request.getParameter("password");
        String Cpw = request.getParameter("cpw");
       
        Customer user =new Customer();
        user.setFirstName(FName);
        user.setLastName(LName);
        user.setCNumber(Contact);
        user.setEmail(Email);
        user.setUsername(Username);
        user.setPassword(Password);
        user.setConPassword(Cpw);
        
        
        try {
            service.addCustomer(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("register.jsp");
    }
        
        
        
        }
    

   