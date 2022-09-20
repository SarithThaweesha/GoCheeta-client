<%-- 
    Document   : manageVehicles
    Created on : 16 Sep 2022, 22:32:51
    Author     : acer
--%>

<%@page import="gocheeta.Vehicle"%>
<%@page import="gocheeta.VehicleService"%>
<%@page import="gocheeta.VehicleService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage vehicles Page</title>
         <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
         <link rel="stylesheet" href="./style.css" >
    </head>
    <body>
         <%
        String id= request.getParameter("id");
        String type= request.getParameter("type");
        String branch= request.getParameter("branch");
        String number= request.getParameter("number");
        String color= request.getParameter("color");
        String passengers= request.getParameter("passengers");
        
        if(id != null){
              VehicleService_Service service = new VehicleService_Service();
              VehicleService proxy = service.getVehicleServicePort();
              Vehicle st = proxy.getVehicle(id);
              id = st.getId();
              type = st.getType();
              branch = st.getBranch();
              number=st.getNumber();
              color=st.getColor();
              passengers = st.getPassengers();             
        }else{
              id = "";
              type = "";
              branch = "";
              number = "";
              color = "";
              passengers = "";             
        }
        %>
       <section id="header2">
	          <a href="#"><img src="photo/logoF.jpeg" class="logo" height="100" alt="" ></a>
        <div>
            <ul id="navbar2">
                <li><a href="index.jsp">Home</a></li>
                <li><a    href="ManageDrivers.jsp">Manage Drivers</a></li>
                <li><a class="active"  href="manageVehicles.jsp">Manage Vehicles</a></li>
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
                    <div class="left3"><h4>Manage Vehicles</h4></div>
            <div class="right4">
         <form  method="post">
            <label for="fname">ID &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</label>
            <input type="text" placeholder="ID" name="id" value="<%out.print(id);%>"><br><br>
          
            <input type="submit" formaction="manageVehicles.jsp" class="btn" value="Search"><br><br>
            
            <!-- <input type="text" name="id" value=""><br><br> -->
            <!-- comment -->
            <label for="fname">Vehicle Type &emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" class="style2" name="type" placeholder="Car/Van/Tuk" value="<%out.print(type);%>"><br><br>
            <label for="fname">Branch &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</label>
            <input type="text" class="style2" name="branch" value="<%out.print(branch);%>"><br><br>
            <label for="fname">Vehicle Number &emsp;&emsp;&nbsp;&nbsp;</label>
            <input type="text" class="style2" name="number" value="<%out.print(number);%>"><br><br>
            <label for="fname">Color  &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" class="style2" name="color"  value="<%out.print(color);%>"><br><br>
            <label for="fname">Maximum Passengers &nbsp;</label>
            <input type="text" class="style2" name="passengers"  value="<%out.print(passengers);%>"><br><br><!-- comment -->
          
            <input type="submit" formaction="AddVehicleServlet"  class="btn" value="Add Vehicle"><br><br>
            <input type="submit" formaction="UpdateVehicleServlet"  class="btn4" value="Update Vehicle"><br><br>
            <input type="submit" formaction="DeleteVehicleServlet"  class="btn3" value="Delete Vehicle">
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
