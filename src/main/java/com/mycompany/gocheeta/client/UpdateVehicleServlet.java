/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gocheeta.client;

import gocheeta.Vehicle;
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
@WebServlet(name = "UpdateVehicleServlet", urlPatterns = {"/UpdateVehicleServlet"})
public class UpdateVehicleServlet extends HttpServlet {

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
           
        VehicleAutho service=new VehicleAutho();
        
       String Id = request.getParameter("id");
        String type = request.getParameter("type");
        String Branch=  request.getParameter("branch");
        String number=  request.getParameter("number");
        String color=  request.getParameter("color");
        String passengers = request.getParameter("passengers");
       
        
       
        Vehicle user =new Vehicle();
        user.setId(Id);
        user.setType(type);
        user.setBranch(Branch);
        user.setNumber(number);
        user.setColor(color);
        user.setPassengers(passengers);
      
        
        
        try {
            service.updateVehicle(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("manageVehicles.jsp");
    }
      
}
