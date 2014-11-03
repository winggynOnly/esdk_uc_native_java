
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forwardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forwardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userNumber",
    "forwardType",
    "forwardNumber"
})
@XmlRootElement(name = "setForwardService")
public class SetForwardService {

    @XmlElement(required = true)
    protected String userNumber;
    @XmlElement(required = true)
    protected String forwardType;
    protected String forwardNumber;

    /**
     * Gets the value of the userNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Sets the value of the userNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNumber(String value) {
        this.userNumber = value;
    }

    /**
     * Gets the value of the forwardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardType() {
        return forwardType;
    }

    /**
     * Sets the value of the forwardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardType(String value) {
        this.forwardType = value;
    }

    /**
     * Gets the value of the forwardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardNumber() {
        return forwardNumber;
    }

    /**
     * Sets the value of the forwardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardNumber(String value) {
        this.forwardNumber = value;
    }

}
