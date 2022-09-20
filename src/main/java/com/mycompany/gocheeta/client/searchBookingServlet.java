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
@WebServlet(name = "searchBookingServlet", urlPatterns = {"/searchBookingServlet"})
public class searchBookingServlet extends HttpServlet {

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
       
      
        String start = request.getParameter("start");
        String desVehi = request.getParameter("desVehi");
        String distance = request.getParameter("distance");
        String price = request.getParameter("price");
       
       
        bookingAutho service=new bookingAutho();
        Booking booking=service.getBooking(start);
       
        start=booking.getStart();
        desVehi=booking.getDesVehi();
        distance=booking.getDistance();
        price=booking.getPrice();
        request.setAttribute("booking", booking);
        request.getRequestDispatcher("DriverHome.jsp").forward(request, response);
    }

}
