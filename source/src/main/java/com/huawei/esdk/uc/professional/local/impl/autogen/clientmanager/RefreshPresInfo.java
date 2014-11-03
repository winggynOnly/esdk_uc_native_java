
package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="presPublish" type="{esdk_uc_professional_server}PresPublishInfo"/>
 *         &lt;element name="expires" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="etag" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "presPublish",
    "expires",
    "etag"
})
@XmlRootElement(name = "refreshPresInfo")
public class RefreshPresInfo {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected PresPublishInfo presPublish;
    @XmlSchemaType(name = "unsignedInt")
    protected long expires;
    @XmlElement(required = true)
    protected String etag;

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
     * Gets the value of the presPublish property.
     * 
     * @return
     *     possible object is
     *     {@link PresPublishInfo }
     *     
     */
    public PresPublishInfo getPresPublish() {
        return presPublish;
    }

    /**
     * Sets the value of the presPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresPublishInfo }
     *     
     */
    public void setPresPublish(PresPublishInfo value) {
        this.presPublish = value;
    }

    /**
     * Gets the value of the expires property.
     * 
     */
    public long getExpires() {
        return expires;
    }

    /**
     * Sets the value of the expires property.
     * 
     */
    public void setExpires(long value) {
        this.expires = value;
    }

    /**
     * Gets the value of the etag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Sets the value of the etag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtag(String value) {
        this.etag = value;
    }

}
