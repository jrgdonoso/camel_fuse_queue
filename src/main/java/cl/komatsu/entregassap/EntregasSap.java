
package cl.komatsu.entregassap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUM_ORDEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BUDAT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RESERVA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RSPOS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOC_MATERIAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MATERIAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CANT_ENTREGADA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COSTO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLASE_MOV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numorden",
    "budat",
    "reserva",
    "rspos",
    "docmaterial",
    "material",
    "cantentregada",
    "costo",
    "clasemov"
})
@XmlRootElement(name = "EntregasSap")
public class EntregasSap {

    @XmlElement(name = "NUM_ORDEN", required = true)
    protected String numorden;
    @XmlElement(name = "BUDAT", required = true)
    protected String budat;
    @XmlElement(name = "RESERVA", required = true)
    protected String reserva;
    @XmlElement(name = "RSPOS", required = true)
    protected String rspos;
    @XmlElement(name = "DOC_MATERIAL", required = true)
    protected String docmaterial;
    @XmlElement(name = "MATERIAL", required = true)
    protected String material;
    @XmlElement(name = "CANT_ENTREGADA", required = true)
    protected String cantentregada;
    @XmlElement(name = "COSTO", required = true)
    protected String costo;
    @XmlElement(name = "CLASE_MOV", required = true)
    protected String clasemov;

    /**
     * Obtiene el valor de la propiedad numorden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMORDEN() {
        return numorden;
    }

    /**
     * Define el valor de la propiedad numorden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMORDEN(String value) {
        this.numorden = value;
    }

    /**
     * Obtiene el valor de la propiedad budat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUDAT() {
        return budat;
    }

    /**
     * Define el valor de la propiedad budat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUDAT(String value) {
        this.budat = value;
    }

    /**
     * Obtiene el valor de la propiedad reserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVA() {
        return reserva;
    }

    /**
     * Define el valor de la propiedad reserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVA(String value) {
        this.reserva = value;
    }

    /**
     * Obtiene el valor de la propiedad rspos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRSPOS() {
        return rspos;
    }

    /**
     * Define el valor de la propiedad rspos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRSPOS(String value) {
        this.rspos = value;
    }

    /**
     * Obtiene el valor de la propiedad docmaterial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOCMATERIAL() {
        return docmaterial;
    }

    /**
     * Define el valor de la propiedad docmaterial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOCMATERIAL(String value) {
        this.docmaterial = value;
    }

    /**
     * Obtiene el valor de la propiedad material.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIAL() {
        return material;
    }

    /**
     * Define el valor de la propiedad material.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIAL(String value) {
        this.material = value;
    }

    /**
     * Obtiene el valor de la propiedad cantentregada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANTENTREGADA() {
        return cantentregada;
    }

    /**
     * Define el valor de la propiedad cantentregada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANTENTREGADA(String value) {
        this.cantentregada = value;
    }

    /**
     * Obtiene el valor de la propiedad costo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOSTO() {
        return costo;
    }

    /**
     * Define el valor de la propiedad costo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOSTO(String value) {
        this.costo = value;
    }

    /**
     * Obtiene el valor de la propiedad clasemov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASEMOV() {
        return clasemov;
    }

    /**
     * Define el valor de la propiedad clasemov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASEMOV(String value) {
        this.clasemov = value;
    }

}
