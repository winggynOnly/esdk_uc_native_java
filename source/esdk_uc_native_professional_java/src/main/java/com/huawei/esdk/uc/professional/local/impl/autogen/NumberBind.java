
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.BindInfo;


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
 *         &lt;element name="bindInfo" type="{esdk_uc_professional_server}BindInfo"/>
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
    "bindInfo"
})
@XmlRootElement(name = "numberBind")
public class NumberBind {

    @XmlElement(required = true)
    protected BindInfo bindInfo;

    /**
     * Gets the value of the bindInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BindInfo }
     *     
     */
    public BindInfo getBindInfo() {
        return bindInfo;
    }

    /**
     * Sets the value of the bindInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindInfo }
     *     
     */
    public void setBindInfo(BindInfo value) {
        this.bindInfo = value;
    }

}
