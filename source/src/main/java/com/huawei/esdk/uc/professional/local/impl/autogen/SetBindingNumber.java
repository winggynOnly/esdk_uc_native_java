
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.BindingNumber;


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
 *         &lt;element name="oneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindingNumber" type="{esdk_uc_professional_server}BindingNumber"/>
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
    "oneNumber",
    "operationType",
    "bindingNumber"
})
@XmlRootElement(name = "setBindingNumber")
public class SetBindingNumber {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected String oneNumber;
    @XmlElement(required = true)
    protected String operationType;
    @XmlElement(required = true)
    protected BindingNumber bindingNumber;

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
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the bindingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BindingNumber }
     *     
     */
    public BindingNumber getBindingNumber() {
        return bindingNumber;
    }

    /**
     * Sets the value of the bindingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingNumber }
     *     
     */
    public void setBindingNumber(BindingNumber value) {
        this.bindingNumber = value;
    }

}
