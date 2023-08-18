package cl.komatsu.security;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import cl.komatsu.entregassap.EntregasSapResponse;


public class ResponseAuthErrrorProcessor implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {

		EntregasSapResponse response = new EntregasSapResponse();

		response.setRESPONSE("NOK");
		response.setDETAIL("Error de autenticación");

		ex.getIn().setBody(response);
	}
}
