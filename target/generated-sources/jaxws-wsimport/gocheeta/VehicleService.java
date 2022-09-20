
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
@WebService(name = "VehicleService", targetNamespace = "http://GoCheeta/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VehicleService {


    /**
     * 
     * @param vehicle
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addVehicle", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddVehicle")
    @ResponseWrapper(localName = "addVehicleResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.AddVehicleResponse")
    @Action(input = "http://GoCheeta/VehicleService/addVehicleRequest", output = "http://GoCheeta/VehicleService/addVehicleResponse")
    public boolean addVehicle(
        @WebParam(name = "vehicle", targetNamespace = "")
        Vehicle vehicle);

    /**
     * 
     * @param id
     * @return
     *     returns gocheeta.Vehicle
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVehicle", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetVehicle")
    @ResponseWrapper(localName = "getVehicleResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.GetVehicleResponse")
    @Action(input = "http://GoCheeta/VehicleService/getVehicleRequest", output = "http://GoCheeta/VehicleService/getVehicleResponse")
    public Vehicle getVehicle(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteVehicle", targetNamespace = "http://GoCheeta/", className = "gocheeta.DeleteVehicle")
    @ResponseWrapper(localName = "deleteVehicleResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.DeleteVehicleResponse")
    @Action(input = "http://GoCheeta/VehicleService/deleteVehicleRequest", output = "http://GoCheeta/VehicleService/deleteVehicleResponse")
    public boolean deleteVehicle(
        @WebParam(name = "id", targetNamespace = "")
        String id);

    /**
     * 
     * @param vehicle
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateVehicle", targetNamespace = "http://GoCheeta/", className = "gocheeta.UpdateVehicle")
    @ResponseWrapper(localName = "updateVehicleResponse", targetNamespace = "http://GoCheeta/", className = "gocheeta.UpdateVehicleResponse")
    @Action(input = "http://GoCheeta/VehicleService/updateVehicleRequest", output = "http://GoCheeta/VehicleService/updateVehicleResponse")
    public boolean updateVehicle(
        @WebParam(name = "vehicle", targetNamespace = "")
        Vehicle vehicle);

}
