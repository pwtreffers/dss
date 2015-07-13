//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.13 at 11:55:40 AM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptographicConstraint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptableEncryptionAlgo" type="{http://dss.esig.europa.eu/validation/diagnostic}ListAlgo" minOccurs="0"/>
 *         &lt;element name="MiniPublicKeySize" type="{http://dss.esig.europa.eu/validation/diagnostic}ListAlgo" minOccurs="0"/>
 *         &lt;element name="AcceptableDigestAlgo" type="{http://dss.esig.europa.eu/validation/diagnostic}ListAlgo" minOccurs="0"/>
 *         &lt;element name="AlgoExpirationDate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Algo" type="{http://dss.esig.europa.eu/validation/diagnostic}Algo" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Level" type="{http://dss.esig.europa.eu/validation/diagnostic}level" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicConstraint", propOrder = {
    "acceptableEncryptionAlgo",
    "miniPublicKeySize",
    "acceptableDigestAlgo",
    "algoExpirationDate"
})
public class CryptographicConstraint {

    @XmlElement(name = "AcceptableEncryptionAlgo")
    protected ListAlgo acceptableEncryptionAlgo;
    @XmlElement(name = "MiniPublicKeySize")
    protected ListAlgo miniPublicKeySize;
    @XmlElement(name = "AcceptableDigestAlgo")
    protected ListAlgo acceptableDigestAlgo;
    @XmlElement(name = "AlgoExpirationDate")
    protected AlgoExpirationDate algoExpirationDate;
    @XmlAttribute(name = "Level")
    protected Level level;

    /**
     * Gets the value of the acceptableEncryptionAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableEncryptionAlgo() {
        return acceptableEncryptionAlgo;
    }

    /**
     * Sets the value of the acceptableEncryptionAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableEncryptionAlgo(ListAlgo value) {
        this.acceptableEncryptionAlgo = value;
    }

    /**
     * Gets the value of the miniPublicKeySize property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getMiniPublicKeySize() {
        return miniPublicKeySize;
    }

    /**
     * Sets the value of the miniPublicKeySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setMiniPublicKeySize(ListAlgo value) {
        this.miniPublicKeySize = value;
    }

    /**
     * Gets the value of the acceptableDigestAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableDigestAlgo() {
        return acceptableDigestAlgo;
    }

    /**
     * Sets the value of the acceptableDigestAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableDigestAlgo(ListAlgo value) {
        this.acceptableDigestAlgo = value;
    }

    /**
     * Gets the value of the algoExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public AlgoExpirationDate getAlgoExpirationDate() {
        return algoExpirationDate;
    }

    /**
     * Sets the value of the algoExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public void setAlgoExpirationDate(AlgoExpirationDate value) {
        this.algoExpirationDate = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link Level }
     *     
     */
    public Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link Level }
     *     
     */
    public void setLevel(Level value) {
        this.level = value;
    }

}
