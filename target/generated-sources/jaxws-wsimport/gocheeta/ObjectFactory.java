
package gocheeta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gocheeta package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBooking_QNAME = new QName("http://GoCheeta/", "getBooking");
    private final static QName _GetDestinationNugegoda_QNAME = new QName("http://GoCheeta/", "getDestinationNugegoda");
    private final static QName _AddBookingResponse_QNAME = new QName("http://GoCheeta/", "addBookingResponse");
    private final static QName _GetDestinationK_QNAME = new QName("http://GoCheeta/", "getDestinationK");
    private final static QName _AddBooking_QNAME = new QName("http://GoCheeta/", "addBooking");
    private final static QName _GetDestinationKResponse_QNAME = new QName("http://GoCheeta/", "getDestinationKResponse");
    private final static QName _GetDestinationGampaha_QNAME = new QName("http://GoCheeta/", "getDestinationGampaha");
    private final static QName _GetDestinationGaResponse_QNAME = new QName("http://GoCheeta/", "getDestinationGaResponse");
    private final static QName _GetDestinationJaffna_QNAME = new QName("http://GoCheeta/", "getDestinationJaffna");
    private final static QName _GetDestinationJaffnaResponse_QNAME = new QName("http://GoCheeta/", "getDestinationJaffnaResponse");
    private final static QName _GetDestinationKandy_QNAME = new QName("http://GoCheeta/", "getDestinationKandy");
    private final static QName _GetBookingResponse_QNAME = new QName("http://GoCheeta/", "getBookingResponse");
    private final static QName _GetDestinationGa_QNAME = new QName("http://GoCheeta/", "getDestinationGa");
    private final static QName _GetDestinationNugegodaResponse_QNAME = new QName("http://GoCheeta/", "getDestinationNugegodaResponse");
    private final static QName _GetDestinationKandyResponse_QNAME = new QName("http://GoCheeta/", "getDestinationKandyResponse");
    private final static QName _GetDestinationGampahaResponse_QNAME = new QName("http://GoCheeta/", "getDestinationGampahaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gocheeta
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBooking }
     * 
     */
    public AddBooking createAddBooking() {
        return new AddBooking();
    }

    /**
     * Create an instance of {@link GetDestinationKResponse }
     * 
     */
    public GetDestinationKResponse createGetDestinationKResponse() {
        return new GetDestinationKResponse();
    }

    /**
     * Create an instance of {@link GetDestinationGampaha }
     * 
     */
    public GetDestinationGampaha createGetDestinationGampaha() {
        return new GetDestinationGampaha();
    }

    /**
     * Create an instance of {@link AddBookingResponse }
     * 
     */
    public AddBookingResponse createAddBookingResponse() {
        return new AddBookingResponse();
    }

    /**
     * Create an instance of {@link GetDestinationNugegoda }
     * 
     */
    public GetDestinationNugegoda createGetDestinationNugegoda() {
        return new GetDestinationNugegoda();
    }

    /**
     * Create an instance of {@link GetDestinationK }
     * 
     */
    public GetDestinationK createGetDestinationK() {
        return new GetDestinationK();
    }

    /**
     * Create an instance of {@link GetBooking }
     * 
     */
    public GetBooking createGetBooking() {
        return new GetBooking();
    }

    /**
     * Create an instance of {@link GetDestinationKandyResponse }
     * 
     */
    public GetDestinationKandyResponse createGetDestinationKandyResponse() {
        return new GetDestinationKandyResponse();
    }

    /**
     * Create an instance of {@link GetDestinationGampahaResponse }
     * 
     */
    public GetDestinationGampahaResponse createGetDestinationGampahaResponse() {
        return new GetDestinationGampahaResponse();
    }

    /**
     * Create an instance of {@link GetBookingResponse }
     * 
     */
    public GetBookingResponse createGetBookingResponse() {
        return new GetBookingResponse();
    }

    /**
     * Create an instance of {@link GetDestinationNugegodaResponse }
     * 
     */
    public GetDestinationNugegodaResponse createGetDestinationNugegodaResponse() {
        return new GetDestinationNugegodaResponse();
    }

    /**
     * Create an instance of {@link GetDestinationGa }
     * 
     */
    public GetDestinationGa createGetDestinationGa() {
        return new GetDestinationGa();
    }

    /**
     * Create an instance of {@link GetDestinationJaffnaResponse }
     * 
     */
    public GetDestinationJaffnaResponse createGetDestinationJaffnaResponse() {
        return new GetDestinationJaffnaResponse();
    }

    /**
     * Create an instance of {@link GetDestinationKandy }
     * 
     */
    public GetDestinationKandy createGetDestinationKandy() {
        return new GetDestinationKandy();
    }

    /**
     * Create an instance of {@link GetDestinationJaffna }
     * 
     */
    public GetDestinationJaffna createGetDestinationJaffna() {
        return new GetDestinationJaffna();
    }

    /**
     * Create an instance of {@link GetDestinationGaResponse }
     * 
     */
    public GetDestinationGaResponse createGetDestinationGaResponse() {
        return new GetDestinationGaResponse();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link Destination }
     * 
     */
    public Destination createDestination() {
        return new Destination();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getBooking")
    public JAXBElement<GetBooking> createGetBooking(GetBooking value) {
        return new JAXBElement<GetBooking>(_GetBooking_QNAME, GetBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationNugegoda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationNugegoda")
    public JAXBElement<GetDestinationNugegoda> createGetDestinationNugegoda(GetDestinationNugegoda value) {
        return new JAXBElement<GetDestinationNugegoda>(_GetDestinationNugegoda_QNAME, GetDestinationNugegoda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addBookingResponse")
    public JAXBElement<AddBookingResponse> createAddBookingResponse(AddBookingResponse value) {
        return new JAXBElement<AddBookingResponse>(_AddBookingResponse_QNAME, AddBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationK }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationK")
    public JAXBElement<GetDestinationK> createGetDestinationK(GetDestinationK value) {
        return new JAXBElement<GetDestinationK>(_GetDestinationK_QNAME, GetDestinationK.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addBooking")
    public JAXBElement<AddBooking> createAddBooking(AddBooking value) {
        return new JAXBElement<AddBooking>(_AddBooking_QNAME, AddBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationKResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationKResponse")
    public JAXBElement<GetDestinationKResponse> createGetDestinationKResponse(GetDestinationKResponse value) {
        return new JAXBElement<GetDestinationKResponse>(_GetDestinationKResponse_QNAME, GetDestinationKResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationGampaha }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationGampaha")
    public JAXBElement<GetDestinationGampaha> createGetDestinationGampaha(GetDestinationGampaha value) {
        return new JAXBElement<GetDestinationGampaha>(_GetDestinationGampaha_QNAME, GetDestinationGampaha.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationGaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationGaResponse")
    public JAXBElement<GetDestinationGaResponse> createGetDestinationGaResponse(GetDestinationGaResponse value) {
        return new JAXBElement<GetDestinationGaResponse>(_GetDestinationGaResponse_QNAME, GetDestinationGaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationJaffna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationJaffna")
    public JAXBElement<GetDestinationJaffna> createGetDestinationJaffna(GetDestinationJaffna value) {
        return new JAXBElement<GetDestinationJaffna>(_GetDestinationJaffna_QNAME, GetDestinationJaffna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationJaffnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationJaffnaResponse")
    public JAXBElement<GetDestinationJaffnaResponse> createGetDestinationJaffnaResponse(GetDestinationJaffnaResponse value) {
        return new JAXBElement<GetDestinationJaffnaResponse>(_GetDestinationJaffnaResponse_QNAME, GetDestinationJaffnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationKandy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationKandy")
    public JAXBElement<GetDestinationKandy> createGetDestinationKandy(GetDestinationKandy value) {
        return new JAXBElement<GetDestinationKandy>(_GetDestinationKandy_QNAME, GetDestinationKandy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getBookingResponse")
    public JAXBElement<GetBookingResponse> createGetBookingResponse(GetBookingResponse value) {
        return new JAXBElement<GetBookingResponse>(_GetBookingResponse_QNAME, GetBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationGa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationGa")
    public JAXBElement<GetDestinationGa> createGetDestinationGa(GetDestinationGa value) {
        return new JAXBElement<GetDestinationGa>(_GetDestinationGa_QNAME, GetDestinationGa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationNugegodaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationNugegodaResponse")
    public JAXBElement<GetDestinationNugegodaResponse> createGetDestinationNugegodaResponse(GetDestinationNugegodaResponse value) {
        return new JAXBElement<GetDestinationNugegodaResponse>(_GetDestinationNugegodaResponse_QNAME, GetDestinationNugegodaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationKandyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationKandyResponse")
    public JAXBElement<GetDestinationKandyResponse> createGetDestinationKandyResponse(GetDestinationKandyResponse value) {
        return new JAXBElement<GetDestinationKandyResponse>(_GetDestinationKandyResponse_QNAME, GetDestinationKandyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationGampahaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDestinationGampahaResponse")
    public JAXBElement<GetDestinationGampahaResponse> createGetDestinationGampahaResponse(GetDestinationGampahaResponse value) {
        return new JAXBElement<GetDestinationGampahaResponse>(_GetDestinationGampahaResponse_QNAME, GetDestinationGampahaResponse.class, null, value);
    }

}
