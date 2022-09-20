<%-- 
    Document   : ManageDrivers
    Created on : 16 Sep 2022, 17:36:10
    Author     : acer
--%>

<%@page import="com.mycompany.gocheeta.client.Driver"%>
<%@page import="com.mycompany.gocheeta.client.DriverService"%>
<%@page import="com.mycompany.gocheeta.client.DriverService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Drivers Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
    <link rel="stylesheet" href="./style.css" >
    </head>
    <body>
         <%
        String id= request.getParameter("id");
        String name= request.getParameter("name");
        String branch= request.getParameter("branch");
        String email= request.getParameter("email");
        String contact= request.getParameter("contact");
        String username= request.getParameter("username");
        String password= request.getParameter("password");
        
        if(id != null){
              DriverService_Service service = new DriverService_Service();
              DriverService proxy = service.getDriverServicePort();
              Driver st = proxy.getDriver(id);
              id = st.getId();
              name = st.getName();
              branch = st.getBranch();
              email=st.getEmail();
              contact=st.getContact();
              username = st.getUsername();
              password=st.getPassword();
        }else{
              id = "";
              name = "";
              branch = "";
              email = "";
              contact = "";
              username = "";
              password = "";
        }
            
        %>
       <section id="header2">
	          <a href="#"><img src="photo/logoF.jpeg" class="logo" height="100" alt="" ></a>
        <div>
            <ul id="navbar2">
                <li><a href="index.jsp">Home</a></li>
                <li><a class="active"   href="ManageDrivers.jsp">Manage Drivers</a></li>
                <li><a   href="manageVehicles.jsp">Manage Vehicles</a></li>
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
                <div class="contact-box3">
                    <div class="left3"><h4>Manage Drivers</h4></div>
            <div class="right4">
         <form  method="post">
            <label for="fname">ID &emsp;&emsp;&emsp;&nbsp;</label>
            <input type="text"  name="id" value="<%out.print(id);%>"><br><br>
          
            <input type="submit" formaction="ManageDrivers.jsp" class="btn" value="Search"><br><br>
            
            <!-- <input type="text" name="id" value=""><br><br> -->
            <!-- comment -->
            <label for="fname">Name &emsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" class="style" name="name" value="<%out.print(name);%>"><br><br>
            <label for="fname">Branch &emsp;&nbsp;&nbsp;</label>
            <input type="text" class="style" name="branch" value="<%out.print(branch);%>"><br><br>
            <label for="fname">E-mail &emsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" class="style" name="email" value="<%out.print(email);%>"><br><br>
            <label for="fname">Mobile  &emsp;&nbsp;&nbsp;</label>
            <input type="text" class="style" name="contact"  value="<%out.print(contact);%>"><br><br>
            <label for="fname">Username &nbsp;&nbsp;</label>
            <input type="text" class="style" name="username"  value="<%out.print(username);%>"><br><br><!-- comment -->
            <label for="fname">Password&nbsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="password" class="style" name="password"  value="<%out.print(password);%>"><br><br>
            <input type="submit" formaction="AddDriverServlet"  class="btn" value="Add Driver"><br><br>
            <input type="submit" formaction="UpdateDriverServlet"  class="btn4" value="Update Driver"><br><br>
            <input type="submit" formaction="DeleteDriverServlet"  class="btn3" value="Delete Driver">
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
		
		<a href="driverLogin.jsp.jsp">Driver Login</a>
		
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
