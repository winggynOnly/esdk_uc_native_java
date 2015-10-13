
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for LinkmanChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkmanChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="linkmanInfo" type="{esdk_uc_professional_server}LinkmanInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkmanChangeInfo", propOrder = {
    "changeType",
    "linkmanInfo"
})
public class LinkmanChangeInfo {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer changeType;
    @XmlElement(required = true)
    protected LinkmanInfo linkmanInfo;

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(Integer value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the linkmanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LinkmanInfo }
     *     
     */
    public LinkmanInfo getLinkmanInfo() {
        return linkmanInfo;
    }

    /**
     * Sets the value of the linkmanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkmanInfo }
     *     
     */
    public void setLinkmanInfo(LinkmanInfo value) {
        this.linkmanInfo = value;
    }

}
