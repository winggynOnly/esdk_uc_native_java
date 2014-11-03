
package com.huawei.esdk.uc.professional.local.impl.autogen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.BlackWhiteNumberScope;


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
 *         &lt;element name="userNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flowType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blackWhiteListFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="blackWhiteNumberScope" type="{esdk_uc_professional_server}BlackWhiteNumberScope" maxOccurs="unbounded" minOccurs="0"/>
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
    "userNumber",
    "operationType",
    "flowType",
    "blackWhiteListFlag",
    "blackWhiteNumberScope"
})
@XmlRootElement(name = "setBlackWhiteService")
public class SetBlackWhiteService {

    @XmlElement(required = true)
    protected String userNumber;
    @XmlElement(required = true)
    protected String operationType;
    @XmlElement(required = true)
    protected String flowType;
    @XmlElement(required = true)
    protected String blackWhiteListFlag;
    protected List<BlackWhiteNumberScope> blackWhiteNumberScope;

    /**
     * Gets the value of the userNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * Sets the value of the userNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNumber(String value) {
        this.userNumber = value;
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
     * Gets the value of the flowType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlowType() {
        return flowType;
    }

    /**
     * Sets the value of the flowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlowType(String value) {
        this.flowType = value;
    }

    /**
     * Gets the value of the blackWhiteListFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackWhiteListFlag() {
        return blackWhiteListFlag;
    }

    /**
     * Sets the value of the blackWhiteListFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackWhiteListFlag(String value) {
        this.blackWhiteListFlag = value;
    }

    /**
     * Gets the value of the blackWhiteNumberScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blackWhiteNumberScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlackWhiteNumberScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BlackWhiteNumberScope }
     * 
     * 
     */
    public List<BlackWhiteNumberScope> getBlackWhiteNumberScope() {
        if (blackWhiteNumberScope == null) {
            blackWhiteNumberScope = new ArrayList<BlackWhiteNumberScope>();
        }
        return this.blackWhiteNumberScope;
    }

}
