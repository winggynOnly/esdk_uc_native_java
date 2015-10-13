
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for PresInfoResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresInfoResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryRes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="presInfo" type="{esdk_uc_professional_server}UCPresInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresInfoResult", propOrder = {
    "queryRes",
    "presInfo"
})
public class PresInfoResult {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer queryRes;
    @XmlElement(required = true)
    protected List<UCPresInfo> presInfo;

    /**
     * Gets the value of the queryRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getQueryRes() {
        return queryRes;
    }

    /**
     * Sets the value of the queryRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryRes(Integer value) {
        this.queryRes = value;
    }

    /**
     * Gets the value of the presInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UCPresInfo }
     * 
     * 
     */
    public List<UCPresInfo> getPresInfo() {
        if (presInfo == null) {
            presInfo = new ArrayList<UCPresInfo>();
        }
        return this.presInfo;
    }

	public void setPresInfo(List<UCPresInfo> presInfo) {
		this.presInfo = presInfo;
	}

}
