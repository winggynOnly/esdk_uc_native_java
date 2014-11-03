
package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
    "mobilePhone"
})
@XmlRootElement(name = "uploadMobileAddress")
public class UploadMobileAddress {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected List<String> mobilePhone;

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
     * Gets the value of the mobilePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMobilePhone() {
        if (mobilePhone == null) {
            mobilePhone = new ArrayList<String>();
        }
        return this.mobilePhone;
    }

}
