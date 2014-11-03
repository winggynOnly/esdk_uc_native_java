
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeptInfoBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeptInfoBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentDeptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptPriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptInfoBase", propOrder = {
    "id",
    "memberUri",
    "corpId",
    "deptId",
    "deptName",
    "deptLevel",
    "parentDeptId",
    "deptPriority",
    "deptDesc"
})
public class DeptInfoBase {

    @XmlElement(required = true)
    protected String id = "";
    @XmlElement(required = true)
    protected String memberUri = "";
    @XmlElement(required = true)
    protected String corpId = "";
    @XmlElement(required = true)
    protected String deptId = "";
    @XmlElement(required = true)
    protected String deptName = "";
    @XmlElement(required = true)
    protected String deptLevel = "";
    @XmlElement(required = true)
    protected String parentDeptId = "";
    @XmlElement(required = true)
    protected String deptPriority = "";
    @XmlElement(required = true)
    protected String deptDesc = "";

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the memberUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberUri() {
        return memberUri;
    }

    /**
     * Sets the value of the memberUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberUri(String value) {
        this.memberUri = value;
    }

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
     * Gets the value of the deptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Sets the value of the deptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * Gets the value of the deptLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptLevel() {
        return deptLevel;
    }

    /**
     * Sets the value of the deptLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptLevel(String value) {
        this.deptLevel = value;
    }

    /**
     * Gets the value of the parentDeptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDeptId() {
        return parentDeptId;
    }

    /**
     * Sets the value of the parentDeptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDeptId(String value) {
        this.parentDeptId = value;
    }

    /**
     * Gets the value of the deptPriority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptPriority() {
        return deptPriority;
    }

    /**
     * Sets the value of the deptPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptPriority(String value) {
        this.deptPriority = value;
    }

    /**
     * Gets the value of the deptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * Sets the value of the deptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptDesc(String value) {
        this.deptDesc = value;
    }

}
