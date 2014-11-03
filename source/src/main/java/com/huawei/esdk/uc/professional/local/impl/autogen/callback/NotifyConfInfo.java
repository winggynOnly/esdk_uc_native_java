
package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.callback.ConfChangeEvent;
import com.huawei.esdk.uc.professional.local.bean.callback.ConfInfoNotify;


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
 *         &lt;element name="changeEvent" type="{esdk_uc_professional_server}ConfChangeEvent"/>
 *         &lt;element name="confInfoNotify" type="{esdk_uc_professional_server}ConfInfoNotify"/>
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
    "changeEvent",
    "confInfoNotify"
})
@XmlRootElement(name = "notifyConfInfo")
public class NotifyConfInfo {

    @XmlElement(required = true)
    protected ConfChangeEvent changeEvent;
    @XmlElement(required = true)
    protected ConfInfoNotify confInfoNotify;

    /**
     * Gets the value of the changeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ConfChangeEvent }
     *     
     */
    public ConfChangeEvent getChangeEvent() {
        return changeEvent;
    }

    /**
     * Sets the value of the changeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfChangeEvent }
     *     
     */
    public void setChangeEvent(ConfChangeEvent value) {
        this.changeEvent = value;
    }

    /**
     * Gets the value of the confInfoNotify property.
     * 
     * @return
     *     possible object is
     *     {@link ConfInfoNotify }
     *     
     */
    public ConfInfoNotify getConfInfoNotify() {
        return confInfoNotify;
    }

    /**
     * Sets the value of the confInfoNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfInfoNotify }
     *     
     */
    public void setConfInfoNotify(ConfInfoNotify value) {
        this.confInfoNotify = value;
    }

}
