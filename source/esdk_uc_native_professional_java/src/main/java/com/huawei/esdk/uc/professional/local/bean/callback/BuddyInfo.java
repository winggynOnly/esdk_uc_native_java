
package com.huawei.esdk.uc.professional.local.bean.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.callback.Adapter3;


/**
 * <p>Java class for BuddyInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuddyInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="presentity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="presInfo" type="{esdk_uc_professional_server}UCPresInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuddyInfo", propOrder = {
    "presentity",
    "state",
    "presInfo"
})
public class BuddyInfo {

    @XmlElement(required = true)
    protected String presentity = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer state;
    @XmlElement(required = true)
    protected UCPresInfo presInfo;

    /**
     * Gets the value of the presentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentity() {
        return presentity;
    }

    /**
     * Sets the value of the presentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentity(String value) {
        this.presentity = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(Integer value) {
        this.state = value;
    }

    /**
     * Gets the value of the presInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UCPresInfo }
     *     
     */
    public UCPresInfo getPresInfo() {
        return presInfo;
    }

    /**
     * Sets the value of the presInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UCPresInfo }
     *     
     */
    public void setPresInfo(UCPresInfo value) {
        this.presInfo = value;
    }

}
