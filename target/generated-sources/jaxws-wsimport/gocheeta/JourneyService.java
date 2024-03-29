
package gocheeta;

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
@WebService(name = "JourneyService", targetNamespace = "http://GoCheeta/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JourneyService {


    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationGampaha", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationGampaha")
    @ResponseWrapper(localName = "getDestinationGampahaResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationGampahaResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationGampahaRequest", output = "http://GoCheeta/JourneyService/getDestinationGampahaResponse")
    public Destination getDestinationGampaha(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationNugegoda", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationNugegoda")
    @ResponseWrapper(localName = "getDestinationNugegodaResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationNugegodaResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationNugegodaRequest", output = "http://GoCheeta/JourneyService/getDestinationNugegodaResponse")
    public Destination getDestinationNugegoda(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationJaffna", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationJaffna")
    @ResponseWrapper(localName = "getDestinationJaffnaResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationJaffnaResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationJaffnaRequest", output = "http://GoCheeta/JourneyService/getDestinationJaffnaResponse")
    public Destination getDestinationJaffna(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationKandy", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationKandy")
    @ResponseWrapper(localName = "getDestinationKandyResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationKandyResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationKandyRequest", output = "http://GoCheeta/JourneyService/getDestinationKandyResponse")
    public Destination getDestinationKandy(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationGa", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationGa")
    @ResponseWrapper(localName = "getDestinationGaResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationGaResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationGaRequest", output = "http://GoCheeta/JourneyService/getDestinationGaResponse")
    public Destination getDestinationGa(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param start
     * @return
     *     returns gocheeta.Booking
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBooking", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetBooking")
    @ResponseWrapper(localName = "getBookingResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetBookingResponse")
    @Action(input = "http://GoCheeta/JourneyService/getBookingRequest", output = "http://GoCheeta/JourneyService/getBookingResponse")
    public Booking getBooking(
        @WebParam(name = "start", targetNamespace = "")
        String start);

    /**
     * 
     * @param booking
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addBooking", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddBooking")
    @ResponseWrapper(localName = "addBookingResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddBookingResponse")
    @Action(input = "http://GoCheeta/JourneyService/addBookingRequest", output = "http://GoCheeta/JourneyService/addBookingResponse")
    public boolean addBooking(
        @WebParam(name = "booking", targetNamespace = "")
        Booking booking);

    /**
     * 
     * @param name
     * @return
     *     returns gocheeta.Destination
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDestinationK", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationK")
    @ResponseWrapper(localName = "getDestinationKResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetDestinationKResponse")
    @Action(input = "http://GoCheeta/JourneyService/getDestinationKRequest", output = "http://GoCheeta/JourneyService/getDestinationKResponse")
    public Destination getDestinationK(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
