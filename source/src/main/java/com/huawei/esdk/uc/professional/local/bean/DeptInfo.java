
package com.huawei.esdk.uc.professional.local.bean;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter1;


/**
 * <p>Java class for DeptInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeptInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentCorpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ownerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secretaryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptPriority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeptInfo", propOrder = {
    "deptId",
    "deptNumber",
    "corpId",
    "parentCorpId",
    "deptLevel",
    "ownerId",
    "name",
    "fullName",
    "deptDesc",
    "fax",
    "secretaryId",
    "modifyTime",
    "createTime",
    "status",
    "deptPriority"
})
public class DeptInfo {

    @XmlElement(required = true)
    protected String deptId = "";
    @XmlElement(required = true)
    protected String deptNumber = "";
    @XmlElement(required = true)
    protected String corpId = "";
    @XmlElement(required = true)
    protected String parentCorpId = "";
    @XmlElement(required = true)
    protected String deptLevel = "";
    @XmlElement(required = true)
    protected String ownerId = "";
    @XmlElement(required = true)
    protected String name = "";
    @XmlElement(required = true)
    protected String fullName = "";
    @XmlElement(required = true)
    protected String deptDesc = "";
    @XmlElement(required = true)
    protected String fax = "";
    @XmlElement(required = true)
    protected String secretaryId = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date modifyTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createTime;
    @XmlElement(required = true)
    protected String status = "";
    @XmlElement(required = true)
    protected String deptPriority = "";

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
     * Gets the value of the deptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNumber() {
        return deptNumber;
    }

    /**
     * Sets the value of the deptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNumber(String value) {
        this.deptNumber = value;
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
     * Gets the value of the parentCorpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCorpId() {
        return parentCorpId;
    }

    /**
     * Sets the value of the parentCorpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCorpId(String value) {
        this.parentCorpId = value;
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
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the secretaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecretaryId() {
        return secretaryId;
    }

    /**
     * Sets the value of the secretaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecretaryId(String value) {
        this.secretaryId = value;
    }

    /**
     * Gets the value of the modifyTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * Sets the value of the modifyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyTime(Date value) {
        this.modifyTime = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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

}
