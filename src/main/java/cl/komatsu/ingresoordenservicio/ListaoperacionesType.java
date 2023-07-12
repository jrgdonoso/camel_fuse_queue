
package cl.komatsu.ingresoordenservicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listaoperacionesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listaoperacionesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OPERACION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VORNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="APLZL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ARBID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="STEUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="KTSCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="KTEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PLNNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ZAEHL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ARBEI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="FSAVD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RUECK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listaoperacionesType", propOrder = {
    "operacion"
})
public class ListaoperacionesType {

    @XmlElement(name = "OPERACION")
    protected List<ListaoperacionesType.OPERACION> operacion;

    /**
     * Gets the value of the operacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOPERACION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaoperacionesType.OPERACION }
     * 
     * 
     */
    public List<ListaoperacionesType.OPERACION> getOPERACION() {
        if (operacion == null) {
            operacion = new ArrayList<ListaoperacionesType.OPERACION>();
        }
        return this.operacion;
    }


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
     *         &lt;element name="VORNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="APLZL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ARBID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="STEUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="KTSCH" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="KTEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PLNNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ZAEHL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ARBEI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="FSAVD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RUECK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "vornr",
        "aplzl",
        "arbid",
        "steus",
        "ktsch",
        "ktext",
        "plnnr",
        "zaehl",
        "arbei",
        "fsavd",
        "rueck"
    })
    public static class OPERACION {

        @XmlElement(name = "VORNR", required = true)
        protected String vornr;
        @XmlElement(name = "APLZL", required = true)
        protected String aplzl;
        @XmlElement(name = "ARBID", required = true)
        protected String arbid;
        @XmlElement(name = "STEUS", required = true)
        protected String steus;
        @XmlElement(name = "KTSCH", required = true)
        protected String ktsch;
        @XmlElement(name = "KTEXT", required = true)
        protected String ktext;
        @XmlElement(name = "PLNNR", required = true)
        protected String plnnr;
        @XmlElement(name = "ZAEHL", required = true)
        protected String zaehl;
        @XmlElement(name = "ARBEI", required = true)
        protected String arbei;
        @XmlElement(name = "FSAVD", required = true)
        protected String fsavd;
        @XmlElement(name = "RUECK", required = true)
        protected String rueck;

        /**
         * Obtiene el valor de la propiedad vornr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVORNR() {
            return vornr;
        }

        /**
         * Define el valor de la propiedad vornr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVORNR(String value) {
            this.vornr = value;
        }

        /**
         * Obtiene el valor de la propiedad aplzl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPLZL() {
            return aplzl;
        }

        /**
         * Define el valor de la propiedad aplzl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPLZL(String value) {
            this.aplzl = value;
        }

        /**
         * Obtiene el valor de la propiedad arbid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARBID() {
            return arbid;
        }

        /**
         * Define el valor de la propiedad arbid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARBID(String value) {
            this.arbid = value;
        }

        /**
         * Obtiene el valor de la propiedad steus.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSTEUS() {
            return steus;
        }

        /**
         * Define el valor de la propiedad steus.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSTEUS(String value) {
            this.steus = value;
        }

        /**
         * Obtiene el valor de la propiedad ktsch.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKTSCH() {
            return ktsch;
        }

        /**
         * Define el valor de la propiedad ktsch.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKTSCH(String value) {
            this.ktsch = value;
        }

        /**
         * Obtiene el valor de la propiedad ktext.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKTEXT() {
            return ktext;
        }

        /**
         * Define el valor de la propiedad ktext.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKTEXT(String value) {
            this.ktext = value;
        }

        /**
         * Obtiene el valor de la propiedad plnnr.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPLNNR() {
            return plnnr;
        }

        /**
         * Define el valor de la propiedad plnnr.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPLNNR(String value) {
            this.plnnr = value;
        }

        /**
         * Obtiene el valor de la propiedad zaehl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getZAEHL() {
            return zaehl;
        }

        /**
         * Define el valor de la propiedad zaehl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setZAEHL(String value) {
            this.zaehl = value;
        }

        /**
         * Obtiene el valor de la propiedad arbei.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getARBEI() {
            return arbei;
        }

        /**
         * Define el valor de la propiedad arbei.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setARBEI(String value) {
            this.arbei = value;
        }

        /**
         * Obtiene el valor de la propiedad fsavd.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFSAVD() {
            return fsavd;
        }

        /**
         * Define el valor de la propiedad fsavd.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFSAVD(String value) {
            this.fsavd = value;
        }

        /**
         * Obtiene el valor de la propiedad rueck.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRUECK() {
            return rueck;
        }

        /**
         * Define el valor de la propiedad rueck.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRUECK(String value) {
            this.rueck = value;
        }

    }

}
