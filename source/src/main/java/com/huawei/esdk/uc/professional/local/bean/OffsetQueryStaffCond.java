
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffsetQueryStaffCond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffsetQueryStaffCond">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchCond" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetQueryStaffCond", propOrder = {
    "corpId",
    "deptId",
    "searchCond"
})
public class OffsetQueryStaffCond {

    protected String corpId = "";
    protected String deptId = "";
    protected String searchCond = "";

    /**
     * Gets the value of the corpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpId() {
        return corpId;
    }

    /**
     * Sets the value of the corpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpId(String value) {
        this.corpId = value;
    }

    /**
     * Gets the value of the deptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * Sets the value of the deptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptId(String value) {
        this.deptId = value;
    }

    /**
     * Gets the value of the searchCond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCond() {
        return searchCond;
    }

    /**
     * Sets the value of the searchCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCond(String value) {
        this.searchCond = value;
    }

}
