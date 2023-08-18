package cl.komatsu.entregassap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.2
 * 2023-08-02T09:58:22.227-04:00
 * Generated source version: 3.5.2
 *
 */
@WebServiceClient(name = "EntregasSap",
                  wsdlLocation = "file:/C:/komatsu-proyectos/FUSE-Migraciones/1-morgado/KCC-Migracion-Integraciones-FUSE-Entregas-KCH/src/main/resources/static/wsdl/entregas_sap.wsdl",
                  targetNamespace = "http://entregassap.komatsu.cl")
public class EntregasSap_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://entregassap.komatsu.cl", "EntregasSap");
    public final static QName EntregasSapSoapEndpoint = new QName("http://entregassap.komatsu.cl", "EntregasSapSoapEndpoint");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/komatsu-proyectos/FUSE-Migraciones/1-morgado/KCC-Migracion-Integraciones-FUSE-Entregas-KCH/src/main/resources/static/wsdl/entregas_sap.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(EntregasSap_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/komatsu-proyectos/FUSE-Migraciones/1-morgado/KCC-Migracion-Integraciones-FUSE-Entregas-KCH/src/main/resources/static/wsdl/entregas_sap.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EntregasSap_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EntregasSap_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EntregasSap_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EntregasSap_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EntregasSap_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EntregasSap_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EntregasSapPortType
     */
    @WebEndpoint(name = "EntregasSapSoapEndpoint")
    public EntregasSapPortType getEntregasSapSoapEndpoint() {
        return super.getPort(EntregasSapSoapEndpoint, EntregasSapPortType.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EntregasSapPortType
     */
    @WebEndpoint(name = "EntregasSapSoapEndpoint")
    public EntregasSapPortType getEntregasSapSoapEndpoint(WebServiceFeature... features) {
        return super.getPort(EntregasSapSoapEndpoint, EntregasSapPortType.class, features);
    }

}
