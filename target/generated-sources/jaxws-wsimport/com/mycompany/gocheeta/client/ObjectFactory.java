
package com.mycompany.gocheeta.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.gocheeta.client package. 
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

    private final static QName _AddDriver_QNAME = new QName("http://GoCheeta/", "addDriver");
    private final static QName _GetDriver_QNAME = new QName("http://GoCheeta/", "getDriver");
    private final static QName _UpdateDriver_QNAME = new QName("http://GoCheeta/", "updateDriver");
    private final static QName _DeleteDriver_QNAME = new QName("http://GoCheeta/", "deleteDriver");
    private final static QName _LoginDriver_QNAME = new QName("http://GoCheeta/", "loginDriver");
    private final static QName _LoginDriverResponse_QNAME = new QName("http://GoCheeta/", "loginDriverResponse");
    private final static QName _AddDriverResponse_QNAME = new QName("http://GoCheeta/", "addDriverResponse");
    private final static QName _GetDriverResponse_QNAME = new QName("http://GoCheeta/", "getDriverResponse");
    private final static QName _UpdateDriverResponse_QNAME = new QName("http://GoCheeta/", "updateDriverResponse");
    private final static QName _DeleteDriverResponse_QNAME = new QName("http://GoCheeta/", "deleteDriverResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.gocheeta.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDriverResponse }
     * 
     */
    public GetDriverResponse createGetDriverResponse() {
        return new GetDriverResponse();
    }

    /**
     * Create an instance of {@link UpdateDriverResponse }
     * 
     */
    public UpdateDriverResponse createUpdateDriverResponse() {
        return new UpdateDriverResponse();
    }

    /**
     * Create an instance of {@link AddDriverResponse }
     * 
     */
    public AddDriverResponse createAddDriverResponse() {
        return new AddDriverResponse();
    }

    /**
     * Create an instance of {@link DeleteDriverResponse }
     * 
     */
    public DeleteDriverResponse createDeleteDriverResponse() {
        return new DeleteDriverResponse();
    }

    /**
     * Create an instance of {@link LoginDriverResponse }
     * 
     */
    public LoginDriverResponse createLoginDriverResponse() {
        return new LoginDriverResponse();
    }

    /**
     * Create an instance of {@link LoginDriver }
     * 
     */
    public LoginDriver createLoginDriver() {
        return new LoginDriver();
    }

    /**
     * Create an instance of {@link DeleteDriver }
     * 
     */
    public DeleteDriver createDeleteDriver() {
        return new DeleteDriver();
    }

    /**
     * Create an instance of {@link AddDriver }
     * 
     */
    public AddDriver createAddDriver() {
        return new AddDriver();
    }

    /**
     * Create an instance of {@link GetDriver }
     * 
     */
    public GetDriver createGetDriver() {
        return new GetDriver();
    }

    /**
     * Create an instance of {@link UpdateDriver }
     * 
     */
    public UpdateDriver createUpdateDriver() {
        return new UpdateDriver();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addDriver")
    public JAXBElement<AddDriver> createAddDriver(AddDriver value) {
        return new JAXBElement<AddDriver>(_AddDriver_QNAME, AddDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDriver")
    public JAXBElement<GetDriver> createGetDriver(GetDriver value) {
        return new JAXBElement<GetDriver>(_GetDriver_QNAME, GetDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "updateDriver")
    public JAXBElement<UpdateDriver> createUpdateDriver(UpdateDriver value) {
        return new JAXBElement<UpdateDriver>(_UpdateDriver_QNAME, UpdateDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "deleteDriver")
    public JAXBElement<DeleteDriver> createDeleteDriver(DeleteDriver value) {
        return new JAXBElement<DeleteDriver>(_DeleteDriver_QNAME, DeleteDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDriver }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "loginDriver")
    public JAXBElement<LoginDriver> createLoginDriver(LoginDriver value) {
        return new JAXBElement<LoginDriver>(_LoginDriver_QNAME, LoginDriver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "loginDriverResponse")
    public JAXBElement<LoginDriverResponse> createLoginDriverResponse(LoginDriverResponse value) {
        return new JAXBElement<LoginDriverResponse>(_LoginDriverResponse_QNAME, LoginDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "addDriverResponse")
    public JAXBElement<AddDriverResponse> createAddDriverResponse(AddDriverResponse value) {
        return new JAXBElement<AddDriverResponse>(_AddDriverResponse_QNAME, AddDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "getDriverResponse")
    public JAXBElement<GetDriverResponse> createGetDriverResponse(GetDriverResponse value) {
        return new JAXBElement<GetDriverResponse>(_GetDriverResponse_QNAME, GetDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "updateDriverResponse")
    public JAXBElement<UpdateDriverResponse> createUpdateDriverResponse(UpdateDriverResponse value) {
        return new JAXBElement<UpdateDriverResponse>(_UpdateDriverResponse_QNAME, UpdateDriverResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDriverResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://GoCheeta/", name = "deleteDriverResponse")
    public JAXBElement<DeleteDriverResponse> createDeleteDriverResponse(DeleteDriverResponse value) {
        return new JAXBElement<DeleteDriverResponse>(_DeleteDriverResponse_QNAME, DeleteDriverResponse.class, null, value);
    }

}
