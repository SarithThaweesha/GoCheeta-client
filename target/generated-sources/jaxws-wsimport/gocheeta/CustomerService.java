
package gocheeta;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CustomerService", targetNamespace = "http://GoCheeta/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CustomerService {


    /**
     * 
     * @param customerID
     * @return
     *     returns gocheeta.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomer", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetCustomer")
    @ResponseWrapper(localName = "getCustomerResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetCustomerResponse")
    @Action(input = "http://GoCheeta/CustomerService/getCustomerRequest", output = "http://GoCheeta/CustomerService/getCustomerResponse")
    public Customer getCustomer(
        @WebParam(name = "CustomerID", targetNamespace = "")
        String customerID);

    /**
     * 
     * @param customer
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateCustomer", targetNamespace = "http://GoCheeta/", className = "gocheeta.UpdateCustomer")
    @ResponseWrapper(localName = "updateCustomerResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.UpdateCustomerResponse")
    @Action(input = "http://GoCheeta/CustomerService/updateCustomerRequest", output = "http://GoCheeta/CustomerService/updateCustomerResponse")
    public boolean updateCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        Customer customer);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteCustomer", targetNamespace = "http://GoCheeta/", className = "gocheeta.DeleteCustomer")
    @ResponseWrapper(localName = "deleteCustomerResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.DeleteCustomerResponse")
    @Action(input = "http://GoCheeta/CustomerService/deleteCustomerRequest", output = "http://GoCheeta/CustomerService/deleteCustomerResponse")
    public boolean deleteCustomer(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param password
     * @param username
     * @return
     *     returns gocheeta.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginCustomer", targetNamespace = "http://GoCheeta/", className = "gocheeta.LoginCustomer")
    @ResponseWrapper(localName = "loginCustomerResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.LoginCustomerResponse")
    @Action(input = "http://GoCheeta/CustomerService/loginCustomerRequest", output = "http://GoCheeta/CustomerService/loginCustomerResponse")
    public Customer loginCustomer(
        @WebParam(name = "Username", targetNamespace = "")
        String username,
        @WebParam(name = "Password", targetNamespace = "")
        String password);

    /**
     * 
     * @return
     *     returns java.util.List<gocheeta.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomers", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetCustomers")
    @ResponseWrapper(localName = "getCustomersResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetCustomersResponse")
    @Action(input = "http://GoCheeta/CustomerService/getCustomersRequest", output = "http://GoCheeta/CustomerService/getCustomersResponse")
    public List<Customer> getCustomers();

    /**
     * 
     * @param customer
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addCustomer", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddCustomer")
    @ResponseWrapper(localName = "addCustomerResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddCustomerResponse")
    @Action(input = "http://GoCheeta/CustomerService/addCustomerRequest", output = "http://GoCheeta/CustomerService/addCustomerResponse")
    public boolean addCustomer(
        @WebParam(name = "customer", targetNamespace = "")
        Customer customer);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://GoCheeta/", className = "gocheeta.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.HelloResponse")
    @Action(input = "http://GoCheeta/CustomerService/helloRequest", output = "http://GoCheeta/CustomerService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
