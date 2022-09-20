
package com.mycompany.gocheeta.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DriverService", targetNamespace = "http://GoCheeta/", wsdlLocation = "http://localhost:8080/GoCheeta-service/DriverService?wsdl")
public class DriverService_Service
    extends Service
{

    private final static URL DRIVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException DRIVERSERVICE_EXCEPTION;
    private final static QName DRIVERSERVICE_QNAME = new QName("http://GoCheeta/", "DriverService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GoCheeta-service/DriverService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DRIVERSERVICE_WSDL_LOCATION = url;
        DRIVERSERVICE_EXCEPTION = e;
    }

    public DriverService_Service() {
        super(__getWsdlLocation(), DRIVERSERVICE_QNAME);
    }

    public DriverService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DRIVERSERVICE_QNAME, features);
    }

    public DriverService_Service(URL wsdlLocation) {
        super(wsdlLocation, DRIVERSERVICE_QNAME);
    }

    public DriverService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DRIVERSERVICE_QNAME, features);
    }

    public DriverService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DriverService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DriverService
     */
    @WebEndpoint(name = "DriverServicePort")
    public DriverService getDriverServicePort() {
        return super.getPort(new QName("http://GoCheeta/", "DriverServicePort"), DriverService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DriverService
     */
    @WebEndpoint(name = "DriverServicePort")
    public DriverService getDriverServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://GoCheeta/", "DriverServicePort"), DriverService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DRIVERSERVICE_EXCEPTION!= null) {
            throw DRIVERSERVICE_EXCEPTION;
        }
        return DRIVERSERVICE_WSDL_LOCATION;
    }

}
