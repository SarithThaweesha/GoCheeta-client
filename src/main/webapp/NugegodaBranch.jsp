<%-- 
    Document   : NugegodaBranch
    Created on : 17 Sep 2022, 22:15:37
    Author     : acer
--%>

<%@page import="gocheeta.Destination"%>
<%@page import="gocheeta.JourneyService"%>
<%@page import="gocheeta.JourneyService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nugegoda Branch Page</title>
          <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
          <link rel="stylesheet" href="./style.css" >
    </head>
    <body>
        <%
        String id= request.getParameter("id");
        String start= request.getParameter("StCity");
        String name= request.getParameter("destype");
        String distance= request.getParameter("Distance");
        String price= request.getParameter("price");
        
        if(name != null){
              JourneyService_Service service = new JourneyService_Service();
              JourneyService proxy = service.getJourneyServicePort();
              Destination st = proxy.getDestinationNugegoda(name);
              id = st.getId();
              start=st.getStCity();
              name = st.getDestype();
              distance=st.getDistance();
              price = st.getPrice();
        }else{
              id = "";
              start="";
              name = "";
              distance = "";
              price = "";
        }
            
        %>
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
         
        <section id="regform" class="section-p1">
            <div class="container2">
                <div class="contact-box2">
                <div class="left3"><h4>Select Destination & Vehicle type from the drop down</h4><br><h2>Nugegoda Branch</h2></div>
            <div class="right2">
         <form  method="post">
            <label for="fname">Destination & Vehicle type</label>
            <select name="destype" id="category" class="dropc">
                <option>Kurunagala-Car</option>
                <option>Kurunagala-Van</option>
                <option>Kurunagala-Tuk</option>
                <option>Galle-Car</option>
                <option>Galle-Van</option>
                <option>Galle-Tuk</option>
                <option>Jaffna-Car</option>
                <option>Jaffna-Van</option>
                <option>Jaffna-Tuk</option>
                <option>Kandy-Car</option>
                <option>Kandy-Van</option>
                <option>Kandy-Tuk</option>
                <option>Gampaha-Car</option>
                <option>Gampaha-Van</option>
                <option>Gampaha-Tuk</option>
            </select><br><br>
            <input type="submit" formaction="NugegodaBranch.jsp" class="btn" value="Get Journey Details"><br><br>
            <!-- <input type="text" name="id" value=""><br><br> -->
            <!-- comment -->
            <label for="fname">Start from &emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;</label>
            <input type="text" name="start" value="<%out.print(start);%>"><br><br>
            <label for="fname">Destination & Vehicle</label>
            <input type="text" name="desVehi" value="<%out.print(name);%>"><br><br>
            <label for="fname">Distance(km)&emsp;&emsp;&ensp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" name="distance" value="<%out.print(distance);%>"><br><br>
            <label for="fname">Price(Rs.)&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;</label>
            <input type="text" name="price"  value="<%out.print(price);%>"><br><br>
            			
            <input type="submit" formaction="BookingNugegodaServlet"  class="btn" value="Book Now"><br><br>
            
         </form>
            </div>
            </div>
            </div>
         
        </section>
         <footer class="section-p1">
		<div class="col">
		<img src="photo/logo1.jpeg" class="logo " height="100" alt="" >
		<h4>About</h4>
		<a href="about.jsp">About us</a>
		<a href="about.jsp">Contact us</a>
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
