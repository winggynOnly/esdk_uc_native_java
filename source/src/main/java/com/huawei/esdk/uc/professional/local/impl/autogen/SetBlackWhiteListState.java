
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
 *         &lt;element name="blackWhiteListFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "blackWhiteListFlag"
})
@XmlRootElement(name = "setBlackWhiteListState")
public class SetBlackWhiteListState {

    @XmlElement(required = true)
    protected String userNumber;
    @XmlElement(required = true)
    protected String blackWhiteListFlag;

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
     * Gets the value of the blackWhiteListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackWhiteListFlag() {
        return blackWhiteListFlag;
    }

    /**
     * Sets the value of the blackWhiteListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackWhiteListFlag(String value) {
        this.blackWhiteListFlag = value;
    }

}
