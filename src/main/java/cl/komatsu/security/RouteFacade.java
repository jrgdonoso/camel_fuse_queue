package cl.komatsu.security;

import org.apache.camel.Exchange;

public class RouteFacade {

	public void basicAuth(Exchange ex) {

		try {
			String soapSecurity = ex.getIn().getHeader("soap_security", String.class);
			String usernameTag = soapSecurity.substring(soapSecurity.lastIndexOf("<wsse:Username"),
					soapSecurity.indexOf("<wsse:Password"));
			String passwordTag = soapSecurity.substring(soapSecurity.lastIndexOf("<wsse:Password"),
					soapSecurity.indexOf("<wsse:Nonce"));
	
			String username = usernameTag.substring(usernameTag.indexOf(">") + 1, usernameTag.indexOf("</"));
			String password = passwordTag.substring(passwordTag.indexOf(">") + 1, passwordTag.indexOf("</"));
	
			if (validarCredenciales(username, password, ex)) {
				ex.getIn().setHeader("validacionOK", true);
			} else {
				ex.getIn().setHeader("validacionOK", false);
			}
		}catch(Exception e) {
			ex.getIn().setHeader("validacionOK", false);
		}

	}

	public Boolean validarCredenciales(String user, String password, Exchange ex) {
		if (ex.getIn().getHeader("username", String.class).equals(user)
				&& ex.getIn().getHeader("password", String.class).equals(password))
			return true;
		else
			return false;
	}

}
