
package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

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
 *         &lt;element name="headImageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "headImageId"
})
@XmlRootElement(name = "uploadHeadImageId")
public class UploadHeadImageId {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected String headImageId;

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
     * Gets the value of the headImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadImageId() {
        return headImageId;
    }

    /**
     * Sets the value of the headImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadImageId(String value) {
        this.headImageId = value;
    }

}
