
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.NumberInfo;


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
 *         &lt;element name="numberInfo" type="{esdk_uc_professional_server}NumberInfo"/>
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
    "numberInfo"
})
@XmlRootElement(name = "queryNumber")
public class QueryNumber {

    @XmlElement(required = true)
    protected NumberInfo numberInfo;

    /**
     * Gets the value of the numberInfo property.
     * 
     * @return
     *     possible object is
     *     {@link NumberInfo }
     *     
     */
    public NumberInfo getNumberInfo() {
        return numberInfo;
    }

    /**
     * Sets the value of the numberInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberInfo }
     *     
     */
    public void setNumberInfo(NumberInfo value) {
        this.numberInfo = value;
    }

}
