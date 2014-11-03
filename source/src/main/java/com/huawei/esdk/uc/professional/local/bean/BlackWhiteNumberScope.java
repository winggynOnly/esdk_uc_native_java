
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlackWhiteNumberScope complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlackWhiteNumberScope">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blackWhiteNumberScopeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlackWhiteNumberScope", propOrder = {
    "blackWhiteNumberScopeType",
    "number",
    "numberEnd"
})
public class BlackWhiteNumberScope {

    @XmlElement(required = true)
    protected String blackWhiteNumberScopeType = "";
    @XmlElement(required = true)
    protected String number = "";
    @XmlElement(required = true)
    protected String numberEnd = "";

    /**
     * Gets the value of the blackWhiteNumberScopeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackWhiteNumberScopeType() {
        return blackWhiteNumberScopeType;
    }

    /**
     * Sets the value of the blackWhiteNumberScopeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackWhiteNumberScopeType(String value) {
        this.blackWhiteNumberScopeType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the numberEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberEnd() {
        return numberEnd;
    }

    /**
     * Sets the value of the numberEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberEnd(String value) {
        this.numberEnd = value;
    }

}
