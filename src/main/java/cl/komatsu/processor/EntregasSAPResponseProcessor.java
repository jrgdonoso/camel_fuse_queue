package cl.komatsu.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import cl.komatsu.entregassap.EntregasSapResponse;

@Component
public class EntregasSAPResponseProcessor implements Processor {
	
	private static final Logger LOGGER = Logger.getLogger(EntregasSAPRequestProcessor.class);
	
	public void processEntregasSAP(Exchange exchange) throws Exception {

		EntregasSapResponse entregasSapResponse = new EntregasSapResponse();
		
		String retorno = exchange.getIn().getBody(String.class);
		System.out.println("RESULTADO==> "+retorno);
		if(retorno.contains("OK")) {
			entregasSapResponse.setRESPONSE("OK");
			entregasSapResponse.setDETAIL("Entrega SAP ingresada correctamente");
		}
		else {
			entregasSapResponse.setRESPONSE("NOK");
			entregasSapResponse.setDETAIL("Entrega SAP ingresada incorrectamente");
		}
		
		exchange.getIn().setBody(entregasSapResponse);
	}

	public void processSalidaError(Exchange exchange) throws Exception {

		EntregasSapResponse entregasSapResponse = new EntregasSapResponse();
		entregasSapResponse.setRESPONSE("NOK");
		entregasSapResponse.setDETAIL("Entrega SAP ingresada incorrectamente");
		exchange.getIn().setBody(entregasSapResponse);

	}
	
	@Override
	public void process(Exchange arg0) throws Exception {
		
	}
}
