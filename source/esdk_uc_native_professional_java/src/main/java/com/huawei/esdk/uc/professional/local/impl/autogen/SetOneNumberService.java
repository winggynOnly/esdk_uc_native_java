
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.OneNumberService;


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
 *         &lt;element name="oneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oneNumberService" type="{esdk_uc_professional_server}OneNumberService"/>
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
    "oneNumber",
    "oneNumberService"
})
@XmlRootElement(name = "setOneNumberService")
public class SetOneNumberService {

    @XmlElement(required = true)
    protected String oneNumber;
    @XmlElement(required = true)
    protected OneNumberService oneNumberService;

    /**
     * Gets the value of the oneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneNumber() {
        return oneNumber;
    }

    /**
     * Sets the value of the oneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneNumber(String value) {
        this.oneNumber = value;
    }

    /**
     * Gets the value of the oneNumberService property.
     * 
     * @return
     *     possible object is
     *     {@link OneNumberService }
     *     
     */
    public OneNumberService getOneNumberService() {
        return oneNumberService;
    }

    /**
     * Sets the value of the oneNumberService property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneNumberService }
     *     
     */
    public void setOneNumberService(OneNumberService value) {
        this.oneNumberService = value;
    }

}
