<%-- 
    Document   : register
    Created on : 11 Sep 2022, 18:44:48
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
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
                <li><a class="active"  href="register.jsp">Register</a></li>
                <li><a href="about.php">About Us</a></li>
                    <a href="#" id="close2"><i class="fa fa-times"></i></a>
            </ul>
        </div>
	<div id="mobile2">
	           <a href=""><i class="fas fa-cart-arrow-down"></i></a>
		<i id="bar2" class="fas fa-outdent"></i>	
        </div>	
	
	</section>
       <section id="regform" class="section-p1">
	<div class="container2">
	<div class="contact-box2">
        <div class="left2"></div>
        <div class="right2">
       <form name="registration_form" method="POST" action="CustomerRegisterServlet" onSubmit="return validate_form(); ">
	<h4>Create an account</h4>
	<label>
	<h5><b> First Name</b></h5></label>
        <input type="text" required="" name="Fname" class="style" placeholder="Enter your First Name">
        <br>
	<label>
	<h5><b> Last Name</b></h5></label>
	<input type="text" required="" name="Lname" class="style" placeholder="Enter your Last Name">
	<br>
	<label>
	<h5><b> Contact Number</b></h5></label>
	<input type="text" required="" name="contact" class="style" placeholder="Enter your contact number">
	<br>
	<label>
	<h5><b> E-mail</b></h5></label>
	<input type="text" required="" name="email" class="style" placeholder="Enter your e-mail">
	<br>
	<label>
	<h5><b> Username</b></h5></label>
	<input type="text" required="" name="username" class="style" placeholder="Enter your username">
	<br>
        <label>
	<h5><b> Password</b></h5></label>
	<input type="password" required=""  name="password" class="style" placeholder="Enter your password">
	<br>
	<label>
	<h5><b> Confirm Password</b></h5></label>
	<input type="password" required=""  name="cpw" class="style" placeholder="confirm your password">
        <br><br>			
	<input type="reset" name="clear" class="btn" value="clear">
	<br><br>
        <input type="submit"   name="submit" class="btn" value="Register">
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
