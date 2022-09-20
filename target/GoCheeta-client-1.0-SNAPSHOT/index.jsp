<%-- 
    Document   : index
    Created on : 11 Sep 2022, 16:19:56
    Author     : acer
--%>

<%@page import="gocheeta.Customer"%>
<%@page import="gocheeta.CustomerService"%>
<%@page import="gocheeta.CustomerService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
         <link rel="stylesheet" href="./style.css" >
        <title>Home Page</title>
    </head>
    <body>
           	
	<section id="header2">
	   <a href="#"><img src="photo/logoF.jpeg" class="logo" height="100" alt="" ></a>
        <div>
           <ul id="navbar2">
              <li><a class="active"  href="index.jsp">Home</a></li>
              <li><a  href="login.jsp">Login</a></li>
              <li><a href="register.jsp">Register</a></li>
              <li><a href="about.jsp">About Us</a></li>                             
	          <a href="#" id="close2"><i class="fa fa-times"></i></a>
            </ul>
        </div>
	<div id="mobile2">
	          <a href=""><i class="fas fa-cart-arrow-down"></i></a>
	      <i id="bar2" class="fas fa-outdent"></i>	
	</div>	
	
	</section>
        
        <section id="Hero">
            <h2>GoCheeta Cab Service</h2>
	    <h4>Safe,Fast & Trustworthy</h4>
            <p>The best online cab service</p><br>
	    <a href="register.jsp"><button class="normal">REGISTER NOW</button></a>
	</section>
	
	<section id="table1" class="section-p1">
		<table width="20%">
		  <thead>
		    <tr>
                        <td ><h4><i class="fas fa-car fa-lg"></i>Cars</h4></td>
			<td><h4><i class="fas fa-bus fa-lg"></i>Vans</h4></td>
			<td><h4><i class="fas fa-truck fa-lg"></i>Tuk Tuks</h4></td>
		    </tr>
		  </thead>
		</table>
	</section>
        <section id="feature" class="section-p1">
	<div class="fe-box">
	    <img src="photo/car.jpg" width="150" height="120" alt="">	
	</div>
    <div class="fe-box">
	    <img src="photo/van.jpg" width="150" height="120"  alt="">
		
	</div>
        <div class="fe-box">
	    <img src="photo/tuk.jpg" width="150" height="120" alt="">
		
	</div>
	</section>
	<section id="table2" class="section-p1">
	    <table width="100%">
		<thead>
		    <tr>
                        <td></td>
			<td> Branches in 6 major cities</td>
                        <td></td>
		    </tr>
		</thead>
	    </table>
		
	
	</section>
	
	<section id="product1" class="section-p1">
		
	<div class="pro-container">
	   <a href=""><div class="fe-box">
	     <h4>Galle</h4>	
	</div></a>
       <a href=""><div class="fe-box fe-box1">
	     	<h4>Kandy</h4>
	   </div></a>
	   <a href=""><div class="fe-box fe-box2">
	     	<h4>Nugegoda</h4>
	   </div></a>
		
	   <a href=""><div class="fe-box fe-box3">
	    	<h4>Gampaha</h4>
	   </div></a>
	   <a href=""><div class="fe-box fe-box4">
	     	<h4>Kurunagala</h4>
	   </div></a>
	   <a href=""><div class="fe-box fe-box5">
	     	<h4>Jaffna</h4>
	   </div></a>
		</div>
	</section>
	<footer class="section-p1">
		<div class="col">
			<img src="photo/logo1.jpeg" class="logo " height="100" alt="" >
			
		<h4>Official Logins</h4>
		<a href="adminLogin.jsp">Admin Login</a>
		
		<a href="driverLogin.jsp">Driver Login</a>
		
	</div>
		<div class="col">
		<h4>Find it fast</h4>
		<a href="Index.jsp">Home</a>
		<a href="login.jsp">Login</a>
		<a href="register.jsp">Register</a>
		<a href="about.jsp">About us</a>
		
	</div>
		<div class="col">
			<h4>Contact</h4>
			<p><strong>Address:</strong>23,Colombo road, ratnapura</p>
			<p><strong>Phone:</strong>+90909009</p>
			<p><strong>Hours:</strong>10.00-18.00,Mon-Sat</p>
			
		</div>
		<div class="col">
		<div class="follow">
				<h4>Follow us</h4>
				<div class="icon">
					<i class="fab fa-facebook-f"></i>
					<i class="fab fa-twitter"></i>
					<i class="fab fa-instergram"></i>
					<i class="fab fa-pinterest-p"></i>
					<i class="fab fa-youtube"></i>
				</div>
			</div>
	
		</div>
	
		<div class="copyright">
			<p>2022 <strong>GoCheeta </strong>all rights reserved</p>
		
		</div>
	</footer>
       
    </body>
</html>
