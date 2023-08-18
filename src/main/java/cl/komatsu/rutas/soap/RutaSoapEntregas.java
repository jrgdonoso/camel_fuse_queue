package cl.komatsu.rutas.soap;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import cl.komatsu.config.EnviromentVar;
import cl.komatsu.security.ResponseAuthErrrorProcessor;
import cl.komatsu.security.RouteFacade;

@Component
public class RutaSoapEntregas extends RouteBuilder {

    private EnviromentVar miEnviromentVar;
    private CamelContext miCamelContext;

    @Autowired
    public RutaSoapEntregas(EnviromentVar enviromentVar, CamelContext camelContext) {
        this.miEnviromentVar = enviromentVar;
        this.miCamelContext = camelContext;
    }

    @Bean
    public CxfEndpoint entregasSAPEndpoint() {

        System.out.println("USER=> " + this.miEnviromentVar.getSOAPUSERENTREGAS());
        System.out.println("PASS=> " + this.miEnviromentVar.getSOAPPASSWORDENTREGAS());
        System.out.println("URL endpoint=> " + this.miEnviromentVar.getENDPOINTSOAPENTREGAS());

        CxfEndpoint cxfEndpoint = new CxfEndpoint();
        cxfEndpoint.setAddress(this.miEnviromentVar.getENDPOINTSOAPENTREGAS());
        cxfEndpoint.setWsdlURL("static/wsdl/entregas_sap.wsdl");
        cxfEndpoint.setDataFormat(DataFormat.PAYLOAD);

        return cxfEndpoint;

    }

    @Override
    public void configure() throws Exception {
        from("cxf:bean:entregasSAPEndpoint?dataFormat=PAYLOAD")
                .routeId("entregas_sap")
                .setHeader("myBody", simple("${body}"))
                .setHeader("username", simple(this.miEnviromentVar.getSOAPUSERENTREGAS()))
                .setHeader("password", simple(this.miEnviromentVar.getSOAPPASSWORDENTREGAS()))
                .choice().when(header("auth"))
                      .setBody(simple("${headers.auth}"))
                .otherwise()
                    .setBody(simple("${headers." + CxfConstants.CAMEL_CXF_MESSAGE  + "[org.apache.cxf.headers.Header.list][0].getObject()}"))
                .end()
                .convertBodyTo(String.class)
                .setHeader("soap_security", simple("${body}"))
                .bean(RouteFacade.class, "basicAuth")
                .choice().when(simple("${headers.validacionOK}"))
                      .setBody(simple("${headers.myBody}"))
                      .to("direct-vm:entregasSAP")
                .otherwise()
                     .bean(ResponseAuthErrrorProcessor.class, "process")
                .end();
    }

}
