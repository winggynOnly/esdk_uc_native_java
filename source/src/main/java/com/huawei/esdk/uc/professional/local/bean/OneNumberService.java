
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OneNumberService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OneNumberService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ringMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priorityMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="busySelectMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OneNumberService", propOrder = {
    "ringMode",
    "priorityMode",
    "busySelectMode"
})
public class OneNumberService {

    @XmlElement(required = true)
    protected String ringMode = "";
    @XmlElement(required = true)
    protected String priorityMode = "";
    @XmlElement(required = true)
    protected String busySelectMode = "";

    /**
     * Gets the value of the ringMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingMode() {
        return ringMode;
    }

    /**
     * Sets the value of the ringMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingMode(String value) {
        this.ringMode = value;
    }

    /**
     * Gets the value of the priorityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityMode() {
        return priorityMode;
    }

    /**
     * Sets the value of the priorityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityMode(String value) {
        this.priorityMode = value;
    }

    /**
     * Gets the value of the busySelectMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusySelectMode() {
        return busySelectMode;
    }

    /**
     * Sets the value of the busySelectMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusySelectMode(String value) {
        this.busySelectMode = value;
    }

}
