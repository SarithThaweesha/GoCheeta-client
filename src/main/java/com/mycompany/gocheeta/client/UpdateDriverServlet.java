/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

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
@WebServlet(name = "UpdateDriverServlet", urlPatterns = {"/UpdateDriverServlet"})
public class UpdateDriverServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
        DriverAutho service=new DriverAutho();
        
        String Id = request.getParameter("id");
        String Name = request.getParameter("name");
        String Branch=  request.getParameter("branch");
        String Email=  request.getParameter("email");
        String Contact=  request.getParameter("contact");
        String Username = request.getParameter("username");
        String Password=  request.getParameter("password");
        
       
        Driver user =new Driver();
        user.setId(Id);
        user.setName(Name);
        user.setBranch(Branch);
        user.setEmail(Email);
        user.setContact(Contact);
        user.setUsername(Username);
        user.setPassword(Password);
      
        
        
        try {
            service.updateDriver(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("ManageDrivers.jsp");
    }
        
        
        
        }