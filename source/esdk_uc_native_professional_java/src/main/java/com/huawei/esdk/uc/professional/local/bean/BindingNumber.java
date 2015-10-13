
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BindingNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BindingNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bindingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="useTimeRange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bindingTimeInfo" type="{esdk_uc_professional_server}BindingTimeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BindingNumber", propOrder = {
    "bindingNumber",
    "priority",
    "bindType",
    "useTimeRange",
    "bindingTimeInfo"
})
public class BindingNumber {

    @XmlElement(required = true)
    protected String bindingNumber = "";
    @XmlElement(required = true)
    protected String priority = "";
    @XmlElement(required = true)
    protected String bindType = "";
    @XmlElement(required = true)
    protected String useTimeRange = "";
    protected List<BindingTimeInfo> bindingTimeInfo;

    /**
     * Gets the value of the bindingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingNumber() {
        return bindingNumber;
    }

    /**
     * Sets the value of the bindingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingNumber(String value) {
        this.bindingNumber = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the bindType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindType() {
        return bindType;
    }

    /**
     * Sets the value of the bindType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindType(String value) {
        this.bindType = value;
    }

    /**
     * Gets the value of the useTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseTimeRange() {
        return useTimeRange;
    }

    /**
     * Sets the value of the useTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseTimeRange(String value) {
        this.useTimeRange = value;
    }

    /**
     * Gets the value of the bindingTimeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindingTimeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindingTimeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingTimeInfo }
     * 
     * 
     */
    public List<BindingTimeInfo> getBindingTimeInfo() {
        if (bindingTimeInfo == null) {
            bindingTimeInfo = new ArrayList<BindingTimeInfo>();
        }
        return this.bindingTimeInfo;
    }

	public void setBindingTimeInfo(List<BindingTimeInfo> bindingTimeInfo) {
		this.bindingTimeInfo = bindingTimeInfo;
	}

}
