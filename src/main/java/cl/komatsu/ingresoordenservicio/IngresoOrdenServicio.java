
package cl.komatsu.ingresoordenservicio;

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
 *         &lt;element name="AUFNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FKDAT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MAUFNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AUART" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KDAUF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ERDAT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KTEXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SYSST" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BUKRS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VAPLZ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PLGRP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KUNUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NAME1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EQUNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SHTXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EQART" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SERNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MATNR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RECDV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ILART" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TYPBZ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SWERK" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STORT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KOSTV" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRCTR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OPERACIONES" type="{http://ingresoordenservicio.komatsu.cl}listaoperacionesType"/&gt;
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
    "aufnr",
    "fkdat",
    "maufnr",
    "auart",
    "kdauf",
    "erdat",
    "ktext",
    "sysst",
    "bukrs",
    "vaplz",
    "plgrp",
    "kunum",
    "name1",
    "equnr",
    "shtxt",
    "eqart",
    "sernr",
    "matnr",
    "recdv",
    "ilart",
    "typbz",
    "swerk",
    "stort",
    "kostv",
    "prctr",
    "operaciones"
})
@XmlRootElement(name = "IngresoOrdenServicio")
public class IngresoOrdenServicio {

    @XmlElement(name = "AUFNR", required = true)
    protected String aufnr;
    @XmlElement(name = "FKDAT", required = true)
    protected String fkdat;
    @XmlElement(name = "MAUFNR", required = true)
    protected String maufnr;
    @XmlElement(name = "AUART", required = true)
    protected String auart;
    @XmlElement(name = "KDAUF", required = true)
    protected String kdauf;
    @XmlElement(name = "ERDAT", required = true)
    protected String erdat;
    @XmlElement(name = "KTEXT", required = true)
    protected String ktext;
    @XmlElement(name = "SYSST", required = true)
    protected String sysst;
    @XmlElement(name = "BUKRS", required = true)
    protected String bukrs;
    @XmlElement(name = "VAPLZ", required = true)
    protected String vaplz;
    @XmlElement(name = "PLGRP", required = true)
    protected String plgrp;
    @XmlElement(name = "KUNUM", required = true)
    protected String kunum;
    @XmlElement(name = "NAME1", required = true)
    protected String name1;
    @XmlElement(name = "EQUNR", required = true)
    protected String equnr;
    @XmlElement(name = "SHTXT", required = true)
    protected String shtxt;
    @XmlElement(name = "EQART", required = true)
    protected String eqart;
    @XmlElement(name = "SERNR", required = true)
    protected String sernr;
    @XmlElement(name = "MATNR", required = true)
    protected String matnr;
    @XmlElement(name = "RECDV", required = true)
    protected String recdv;
    @XmlElement(name = "ILART", required = true)
    protected String ilart;
    @XmlElement(name = "TYPBZ", required = true)
    protected String typbz;
    @XmlElement(name = "SWERK", required = true)
    protected String swerk;
    @XmlElement(name = "STORT", required = true)
    protected String stort;
    @XmlElement(name = "KOSTV", required = true)
    protected String kostv;
    @XmlElement(name = "PRCTR", required = true)
    protected String prctr;
    @XmlElement(name = "OPERACIONES", required = true)
    protected ListaoperacionesType operaciones;

    /**
     * Obtiene el valor de la propiedad aufnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUFNR() {
        return aufnr;
    }

    /**
     * Define el valor de la propiedad aufnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUFNR(String value) {
        this.aufnr = value;
    }

    /**
     * Obtiene el valor de la propiedad fkdat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFKDAT() {
        return fkdat;
    }

    /**
     * Define el valor de la propiedad fkdat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFKDAT(String value) {
        this.fkdat = value;
    }

    /**
     * Obtiene el valor de la propiedad maufnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAUFNR() {
        return maufnr;
    }

    /**
     * Define el valor de la propiedad maufnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAUFNR(String value) {
        this.maufnr = value;
    }

    /**
     * Obtiene el valor de la propiedad auart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUART() {
        return auart;
    }

    /**
     * Define el valor de la propiedad auart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUART(String value) {
        this.auart = value;
    }

    /**
     * Obtiene el valor de la propiedad kdauf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKDAUF() {
        return kdauf;
    }

    /**
     * Define el valor de la propiedad kdauf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKDAUF(String value) {
        this.kdauf = value;
    }

    /**
     * Obtiene el valor de la propiedad erdat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERDAT() {
        return erdat;
    }

    /**
     * Define el valor de la propiedad erdat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERDAT(String value) {
        this.erdat = value;
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
     * Obtiene el valor de la propiedad sysst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSST() {
        return sysst;
    }

    /**
     * Define el valor de la propiedad sysst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSST(String value) {
        this.sysst = value;
    }

    /**
     * Obtiene el valor de la propiedad bukrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUKRS() {
        return bukrs;
    }

    /**
     * Define el valor de la propiedad bukrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUKRS(String value) {
        this.bukrs = value;
    }

    /**
     * Obtiene el valor de la propiedad vaplz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVAPLZ() {
        return vaplz;
    }

    /**
     * Define el valor de la propiedad vaplz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVAPLZ(String value) {
        this.vaplz = value;
    }

    /**
     * Obtiene el valor de la propiedad plgrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLGRP() {
        return plgrp;
    }

    /**
     * Define el valor de la propiedad plgrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLGRP(String value) {
        this.plgrp = value;
    }

    /**
     * Obtiene el valor de la propiedad kunum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKUNUM() {
        return kunum;
    }

    /**
     * Define el valor de la propiedad kunum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKUNUM(String value) {
        this.kunum = value;
    }

    /**
     * Obtiene el valor de la propiedad name1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME1() {
        return name1;
    }

    /**
     * Define el valor de la propiedad name1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAME1(String value) {
        this.name1 = value;
    }

    /**
     * Obtiene el valor de la propiedad equnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUNR() {
        return equnr;
    }

    /**
     * Define el valor de la propiedad equnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUNR(String value) {
        this.equnr = value;
    }

    /**
     * Obtiene el valor de la propiedad shtxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHTXT() {
        return shtxt;
    }

    /**
     * Define el valor de la propiedad shtxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHTXT(String value) {
        this.shtxt = value;
    }

    /**
     * Obtiene el valor de la propiedad eqart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQART() {
        return eqart;
    }

    /**
     * Define el valor de la propiedad eqart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQART(String value) {
        this.eqart = value;
    }

    /**
     * Obtiene el valor de la propiedad sernr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERNR() {
        return sernr;
    }

    /**
     * Define el valor de la propiedad sernr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERNR(String value) {
        this.sernr = value;
    }

    /**
     * Obtiene el valor de la propiedad matnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATNR() {
        return matnr;
    }

    /**
     * Define el valor de la propiedad matnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATNR(String value) {
        this.matnr = value;
    }

    /**
     * Obtiene el valor de la propiedad recdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECDV() {
        return recdv;
    }

    /**
     * Define el valor de la propiedad recdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECDV(String value) {
        this.recdv = value;
    }

    /**
     * Obtiene el valor de la propiedad ilart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILART() {
        return ilart;
    }

    /**
     * Define el valor de la propiedad ilart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILART(String value) {
        this.ilart = value;
    }

    /**
     * Obtiene el valor de la propiedad typbz.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPBZ() {
        return typbz;
    }

    /**
     * Define el valor de la propiedad typbz.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPBZ(String value) {
        this.typbz = value;
    }

    /**
     * Obtiene el valor de la propiedad swerk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWERK() {
        return swerk;
    }

    /**
     * Define el valor de la propiedad swerk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWERK(String value) {
        this.swerk = value;
    }

    /**
     * Obtiene el valor de la propiedad stort.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTORT() {
        return stort;
    }

    /**
     * Define el valor de la propiedad stort.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTORT(String value) {
        this.stort = value;
    }

    /**
     * Obtiene el valor de la propiedad kostv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOSTV() {
        return kostv;
    }

    /**
     * Define el valor de la propiedad kostv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOSTV(String value) {
        this.kostv = value;
    }

    /**
     * Obtiene el valor de la propiedad prctr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRCTR() {
        return prctr;
    }

    /**
     * Define el valor de la propiedad prctr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRCTR(String value) {
        this.prctr = value;
    }

    /**
     * Obtiene el valor de la propiedad operaciones.
     * 
     * @return
     *     possible object is
     *     {@link ListaoperacionesType }
     *     
     */
    public ListaoperacionesType getOPERACIONES() {
        return operaciones;
    }

    /**
     * Define el valor de la propiedad operaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaoperacionesType }
     *     
     */
    public void setOPERACIONES(ListaoperacionesType value) {
        this.operaciones = value;
    }

}
