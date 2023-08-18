package cl.komatsu.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import cl.komatsu.entregassap.EntregasSap;

@Component
public class EntregasSAPRequestProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		EntregasSap entregasSapRequest = exchange.getIn().getBody(EntregasSap.class);

		//System.out.println("entregasSapRequest getNUMORDEN=> "+entregasSapRequest.getNUMORDEN());
		//System.out.println("entregasSapRequest getCANTENTREGADA => "+entregasSapRequest.getCANTENTREGADA());
		exchange.getIn().setHeader("REQUEST", entregasSapRequest);
		
	}

}
