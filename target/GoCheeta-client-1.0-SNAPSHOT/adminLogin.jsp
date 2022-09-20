<%-- 
    Document   : adminLogin
    Created on : 18 Sep 2022, 14:42:02
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login Page</title>
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
         <link rel="stylesheet" href="./style.css" >
    </head>
    <body>
         <section id="header2">
	          <a href="#"><img src="photo/logoF.jpeg" class="logo" height="100" alt="" ></a>
        <div>
            <ul id="navbar2">
                <li><a href="index.jsp">Home</a></li>
                <li><a  href="login.jsp">Login</a></li>
                <li><a   href="register.jsp">Register</a></li>
                <li><a href="about.php">About Us</a></li>
                    <a href="#" id="close2"><i class="fa fa-times"></i></a>
            </ul>
        </div>
	<div id="mobile2">
	        <a href=""><i class="fas fa-cart-arrow-down"></i></a>
		<i id="bar2" class="fas fa-outdent"></i>	
	</div>	
	
	</section>
        <section id="logform" class="section-p1">
	    <div class="container">
	    <div class="contact-box">
	    <div class="left5"></div>
	    <div class="right">
	<form name="registration_form" method="post" action="AdminLoginServlet" onSubmit="return validate_form(); ">
	<h4>Admin Login</h4>
	<label>
	<h5><strong>Username</strong></h5>
	<input type="text" required="" name="username" class="field" id="txtusername1" placeholder="Enter Username" />
	  <h5><strong>Password</strong></h5>
        <input type="password" required="" name="password" class="field" id="txtpassword2" placeholder="Enter password" />
	  
    </label>
    <br><br>
	
	<input type="submit" name="submit" class="btn" value="Login">
	
	</form>
	</div>
	</div>	
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
