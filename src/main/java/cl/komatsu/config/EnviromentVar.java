package cl.komatsu.config;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class EnviromentVar {

    private String ENDPOINTSOAPENTREGAS;
    private String SQLHOST;
    private Integer SQLPORT;
    private String SQLDBNAME;
    private String SQLUSER;
    private String SQLPASS;
    private String SOAPUSERENTREGAS;
    private String SOAPPASSWORDENTREGAS;
    private String ENDPOINTSOAPENTREGASWSDL;
    private Integer PORTFUSE;
    private Integer APPPORT;

    /**
     * 
     */
    public EnviromentVar() {

        Map<String, String> variables = System.getenv();
        System.out.println("Variables de entorno::");

        this.SQLHOST = variables.get("SQLHOST");
        this.SQLPORT = Integer.parseInt(variables.get("SQLPORT"));
        this.SQLDBNAME = variables.get("SQLDBNAME");
        this.SQLUSER = variables.get("SQLUSER");
        this.SQLPASS = variables.get("SQLPASS");

        this.PORTFUSE = Integer.parseInt(variables.get("PORTFUSE"));
        this.APPPORT = Integer.parseInt(variables.get("APPPORT"));
        this.ENDPOINTSOAPENTREGAS = variables.get("ENDPOINTSOAPENTREGAS").toString().replace("-PORTFUSE-",
                this.PORTFUSE.toString());

        try {

            this.ENDPOINTSOAPENTREGASWSDL = variables.get("ENDPOINTSOAPENTREGASWSDL").toString().replace(
                    "-PORTFUSE-",
                    this.PORTFUSE.toString());

        } catch (Exception e) {
            this.ENDPOINTSOAPENTREGASWSDL = this.ENDPOINTSOAPENTREGAS;
        }

        this.SOAPUSERENTREGAS = variables.get("SOAPUSERENTREGAS");
        this.SOAPPASSWORDENTREGAS = variables.get("SOAPPASSWORDENTREGAS");

        System.out.println("SQLHOST " + this.SQLHOST);
        System.out.println("SQLPORT " + this.SQLPORT);
        System.out.println("SQLDBNAME " + this.SQLDBNAME);
        System.out.println("PORTFUSE " + this.PORTFUSE);
        System.out.println("APPPORT " + this.APPPORT);
        System.out.println("ENDPOINTSOAPENTREGAS " + this.ENDPOINTSOAPENTREGAS);
        System.out.println("ENDPOINTSOAPENTREGASWSDL " + this.ENDPOINTSOAPENTREGASWSDL);
        System.out.println("SOAPUSERENTREGAS " + this.SOAPUSERENTREGAS);

    }

    public String getENDPOINTSOAPENTREGAS() {
        return ENDPOINTSOAPENTREGAS;
    }

    public String getSQLHOST() {
        return SQLHOST;
    }

    public Integer getSQLPORT() {
        return SQLPORT;
    }

    public String getSQLDBNAME() {
        return SQLDBNAME;
    }

    public String getSQLUSER() {
        return SQLUSER;
    }

    public String getSQLPASS() {
        return SQLPASS;
    }

    public String getSOAPUSERENTREGAS() {
        return SOAPUSERENTREGAS;
    }

    public String getSOAPPASSWORDENTREGAS() {
        return SOAPPASSWORDENTREGAS;
    }

    public Integer getPORTFUSE() {
        return PORTFUSE;
    }

    public Integer getAPPPORT() {
        return APPPORT;
    }

    public String getENDPOINTSOAPENTREGASWSDL() {
        return ENDPOINTSOAPENTREGASWSDL;
    }

}
