package cl.komatsu.sqsordenservicioresoextcolakrcc;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqsIngresoOrdenServicioExtCola extends RouteBuilder {

    @Autowired
    private CamelContext camelContext;

    
    @Override
    public void configure() throws Exception {
       String sqsEndpoint = "aws2-sqs://reso-ingresarordenservicio?" +
                             "accessKey=AKIA6OKOMF5WE4VZ6O7J&" +
                             "secretKey=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&" +
                             "region=US_WEST_2&" +
                             "messageAttributeNames=auth&" +
                             "visibilityTimeout=1800";

                             //azure-storage-queue://accountName[/queueName][?options]


       /* from(sqsEndpoint)
            .to("direct-vm:ingresoOrdenServicioResoExtCola");*/
    }
}
