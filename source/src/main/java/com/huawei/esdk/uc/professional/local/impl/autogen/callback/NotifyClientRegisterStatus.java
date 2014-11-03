
package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

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
 *         &lt;element name="ucAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="registerStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="handleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "ucAccount",
    "registerStatus",
    "handleId"
})
@XmlRootElement(name = "notifyClientRegisterStatus")
public class NotifyClientRegisterStatus {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected String registerStatus;
    @XmlElement(required = true)
    protected String handleId;

    /**
     * Gets the value of the ucAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcAccount() {
        return ucAccount;
    }

    /**
     * Sets the value of the ucAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcAccount(String value) {
        this.ucAccount = value;
    }

    /**
     * Gets the value of the registerStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterStatus() {
        return registerStatus;
    }

    /**
     * Sets the value of the registerStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterStatus(String value) {
        this.registerStatus = value;
    }

    /**
     * Gets the value of the handleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandleId() {
        return handleId;
    }

    /**
     * Sets the value of the handleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandleId(String value) {
        this.handleId = value;
    }

}
