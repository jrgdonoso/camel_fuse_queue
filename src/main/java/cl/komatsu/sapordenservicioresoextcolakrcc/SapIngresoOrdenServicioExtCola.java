package cl.komatsu.sapordenservicioresoextcolakrcc;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SapIngresoOrdenServicioExtCola extends RouteBuilder {

    @Bean
    public CxfEndpoint serviceEndpoint() throws ClassNotFoundException {
        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress("http://localhost:8081/orde-servicio-replica/ws/");
        cxfEndpoint.setServiceClass("cl.komatsu.ingresoordenservicio.IngresoOrdenServicioPortType");
        cxfEndpoint.setDataFormat(DataFormat.PAYLOAD);
        return cxfEndpoint;
    }

    @Override
    public void configure() throws Exception {
        from("direct-vm:ingresoOrdenServicioResoExtCola")
            .setHeader("operationName", constant("IngresoOrdenServicio"))
            .setHeader("operationNamespace", constant("http://ingresoordenservicio.komatsu.cl"))
            .to("cxf:bean:serviceEndpoint");
    }
}
