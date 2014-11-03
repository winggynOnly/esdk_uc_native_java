
package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.callback.MessageInfo;


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
 *         &lt;element name="sendNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{esdk_uc_professional_server}MessageInfo"/>
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
    "sendNumber",
    "targetNumber",
    "message"
})
@XmlRootElement(name = "notifyAppMsg")
public class NotifyAppMsg {

    @XmlElement(required = true)
    protected String sendNumber;
    @XmlElement(required = true)
    protected String targetNumber;
    @XmlElement(required = true)
    protected MessageInfo message;

    /**
     * Gets the value of the sendNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendNumber() {
        return sendNumber;
    }

    /**
     * Sets the value of the sendNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendNumber(String value) {
        this.sendNumber = value;
    }

    /**
     * Gets the value of the targetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetNumber() {
        return targetNumber;
    }

    /**
     * Sets the value of the targetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetNumber(String value) {
        this.targetNumber = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessage(MessageInfo value) {
        this.message = value;
    }

}
