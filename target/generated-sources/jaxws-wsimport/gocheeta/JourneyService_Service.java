
package gocheeta;

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
@WebServiceClient(name = "JourneyService", targetNamespace = "http://GoCheeta/", wsdlLocation = "http://localhost:8080/GoCheeta-service/JourneyService?wsdl")
public class JourneyService_Service
    extends Service
{

    private final static URL JOURNEYSERVICE_WSDL_LOCATION;
    private final static WebServiceException JOURNEYSERVICE_EXCEPTION;
    private final static QName JOURNEYSERVICE_QNAME = new QName("http://GoCheeta/", "JourneyService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/GoCheeta-service/JourneyService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JOURNEYSERVICE_WSDL_LOCATION = url;
        JOURNEYSERVICE_EXCEPTION = e;
    }

    public JourneyService_Service() {
        super(__getWsdlLocation(), JOURNEYSERVICE_QNAME);
    }

    public JourneyService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), JOURNEYSERVICE_QNAME, features);
    }

    public JourneyService_Service(URL wsdlLocation) {
        super(wsdlLocation, JOURNEYSERVICE_QNAME);
    }

    public JourneyService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JOURNEYSERVICE_QNAME, features);
    }

    public JourneyService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JourneyService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JourneyService
     */
    @WebEndpoint(name = "JourneyServicePort")
    public JourneyService getJourneyServicePort() {
        return super.getPort(new QName("http://GoCheeta/", "JourneyServicePort"), JourneyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JourneyService
     */
    @WebEndpoint(name = "JourneyServicePort")
    public JourneyService getJourneyServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://GoCheeta/", "JourneyServicePort"), JourneyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JOURNEYSERVICE_EXCEPTION!= null) {
            throw JOURNEYSERVICE_EXCEPTION;
        }
        return JOURNEYSERVICE_WSDL_LOCATION;
    }

}
