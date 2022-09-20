/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Booking;
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
@WebServlet(name = "bookingNugegodaServlet", urlPatterns = {"/bookingNugegodaServlet"})
public class BookingNugegodaServlet extends HttpServlet {

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
           
        bookingAutho service=new bookingAutho();
        
        String Start = request.getParameter("start");
        String DesVehi = request.getParameter("desVehi");
        String Distance=  request.getParameter("distance");
        String Price = request.getParameter("price");
        
       
        Booking user =new Booking();
        user.setStart(Start);
        user.setDesVehi(DesVehi);
        user.setDistance(Distance);
        user.setPrice(Price);
      
        try {
            service.addBooking(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        response.sendRedirect("NugegodaBranch.jsp");
    } 
  }