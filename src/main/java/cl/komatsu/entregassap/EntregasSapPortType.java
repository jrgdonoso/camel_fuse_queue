package cl.komatsu.entregassap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-08-02T09:58:22.173-04:00
 * Generated source version: 3.5.2
 *
 */
@WebService(targetNamespace = "http://entregassap.komatsu.cl", name = "EntregasSapPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface EntregasSapPortType {

    @WebMethod(operationName = "EntregasSap", action = "urn:EntregasSap")
    @Action(input = "urn:EntregasSap", output = "urn:EntregasSapResponse")
    @RequestWrapper(localName = "EntregasSap", targetNamespace = "http://entregassap.komatsu.cl", className = "cl.komatsu.entregassap.EntregasSap")
    @ResponseWrapper(localName = "EntregasSapResponse", targetNamespace = "http://entregassap.komatsu.cl", className = "cl.komatsu.entregassap.EntregasSapResponse")
    public void entregasSap(

        @WebParam(name = "NUM_ORDEN", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String numORDEN,
        @WebParam(name = "BUDAT", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String budat,
        @WebParam(name = "RESERVA", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String reserva,
        @WebParam(name = "RSPOS", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String rspos,
        @WebParam(name = "DOC_MATERIAL", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String docMATERIAL,
        @WebParam(name = "MATERIAL", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String material,
        @WebParam(name = "CANT_ENTREGADA", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String cantENTREGADA,
        @WebParam(name = "COSTO", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String costo,
        @WebParam(name = "CLASE_MOV", targetNamespace = "http://entregassap.komatsu.cl")
        java.lang.String claseMOV,
        @WebParam(mode = WebParam.Mode.OUT, name = "RESPONSE", targetNamespace = "http://entregassap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> response,
        @WebParam(mode = WebParam.Mode.OUT, name = "DETAIL", targetNamespace = "http://entregassap.komatsu.cl")
        javax.xml.ws.Holder<java.lang.String> detail
    );
}
