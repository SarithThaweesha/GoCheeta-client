<%-- 
    Document   : DriverHome
    Created on : 18 Sep 2022, 15:58:22
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Home Page</title>
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
         <link rel="stylesheet" href="./style.css" >
    </head>
    <body>
        <section id="header2">
	          <a href="#"><img src="photo/logoF.jpeg" class="logo" height="100" alt="" ></a>
        <div>
            <ul id="navbar2">
                <li><a href="index.jsp">Home</a></li>
                <li><a class="active" href="DriverHome.jsp">Driver Home</a></li>
                <li><a  href="driverLogin.jsp">Login</a></li>               
                <li><a href="about.php">About Us</a></li>
                    <a href="#" id="close2"><i class="fa fa-times"></i></a>
            </ul>
        </div>
	
	
	</section>
        <section id="back-header5" class="sale">
		
		<h2>#Welcome</h2>
		<p>Drive Towards success!</p>
		
	</section>
        <section id="view" class="section-p1">
            <form action="searchBookingServlet" method="post">
                <div><h3>
                    <label>Enter Assigned Branch</label>
                    <input type="text" placeholder="" name="start" value="${booking.start}">
                    <button type="submit" class="btn4">Search</button></h3>
                </div>
                
        <table width="100%" action="searchBookingServlet" method="post">
            <caption><h4>Received booking requests </h4></caption> 
            <thead>
            <tr>
                
                <th>Start</th><!-- comment -->
                <th>Destination</th>
                <th>Distance</th>
                <th>Price</th>    
            </tr>
            </thead>
            <tbody>
                <tr>
                    
                    <td name="start" >${booking.start}</td>
                    <td name="desVehi" >${booking.desVehi}</td>
                    <td name="distance" >${booking.distance}</td>
                    <td name="price" >${booking.price}</td>
                </tr>
                 <tr>
                    
                    <td name="start" >${booking.start}</td>
                    <td name="desVehi" >${booking.desVehi}</td>
                    <td name="distance" >${booking.distance}</td>
                    <td name="price" >${booking.price}</td>
                 </tr>
                  <tr>
                    
                    <td name="start" >${booking.start}</td>
                    <td name="desVehi" >${booking.desVehi}</td>
                    <td name="distance" >${booking.distance}</td>
                    <td name="price" >${booking.price}</td>
                </tr>
                 <tr>
                    
                    <td name="start" >${booking.start}</td>
                    <td name="desVehi" >${booking.desVehi}</td>
                    <td name="distance" >${booking.distance}</td>
                    <td name="price" >${booking.price}</td>
                </tr>
           
            </tbody>
        </table>
                </form>
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
