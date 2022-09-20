<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : newjsp
    Created on : 13 Sep 2022, 14:25:43
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <%
        CustomerService_Service service = new CustomerService_Service();
        CustomerService proxy = service.getCustomerServicePort();
        
        out.println(proxy.hello("george"));
        %>
        </h1>
         <%
            String CustomerID = "1";
            if(request.getParameter("CustomerID") != null){
                CustomerID= request.getParameter("CustomerID");
            }
        Customer st = proxy.getCustomer(CustomerID);
         %>
        <p><%out.print(st.getCustomerID());%></p>
        <p><%out.print(st.getFirstName());%></p><!-- comment -->
        <p><%out.print(st.getLastName());%></p>
    </body>
    <table border="1">
        <thead>
            <tr>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
            </tr>
        </tbody>
    </table>

</html>
