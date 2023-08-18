package cl.komatsu.rutas.sap;
import java.io.IOException;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import cl.komatsu.processor.EntregasSAPRequestProcessor;
import cl.komatsu.processor.EntregasSAPResponseProcessor;

@Component
public class RutaSapEntregas extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct-vm:entregasSAP")
                .routeId("entregas-SAP")
                .doTry()
                .bean(EntregasSAPRequestProcessor.class, "process")
                .to("sql-stored:SP_INSERTA_ENTREGA(VARCHAR ${headers.REQUEST.getNUMORDEN},VARCHAR ${headers.REQUEST.getRESERVA},VARCHAR ${headers.REQUEST.getDOCMATERIAL},VARCHAR ${headers.REQUEST.getMATERIAL},NUMERIC ${headers.REQUEST.getCANTENTREGADA},VARCHAR ${headers.REQUEST.getCOSTO},VARCHAR ${headers.REQUEST.getCLASEMOV})?dataSource=#dataSourceSql")
                .bean(EntregasSAPResponseProcessor.class, "processEntregasSAP")
                .endDoTry()
                .doCatch(IOException.class)
                .bean(EntregasSAPResponseProcessor.class, "processSalidaError")
                .doFinally();

    }

}
