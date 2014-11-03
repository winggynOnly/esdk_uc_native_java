
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for NumberInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corpInterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberFuncFlagId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="publicNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outgoingRights" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberInfo", propOrder = {
    "corpInterNumber",
    "memberFuncFlagId",
    "terminalType",
    "publicNumber",
    "sourceId",
    "outgoingRights",
    "languageName"
})
public class NumberInfo {

    @XmlElement(required = true)
    protected String corpInterNumber = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer memberFuncFlagId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer terminalType;
    protected String publicNumber = "";
    protected String sourceId = "";
    protected String outgoingRights = "";
    protected String languageName = "";

    /**
     * Gets the value of the corpInterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpInterNumber() {
        return corpInterNumber;
    }

    /**
     * Sets the value of the corpInterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpInterNumber(String value) {
        this.corpInterNumber = value;
    }

    /**
     * Gets the value of the memberFuncFlagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMemberFuncFlagId() {
        return memberFuncFlagId;
    }

    /**
     * Sets the value of the memberFuncFlagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberFuncFlagId(Integer value) {
        this.memberFuncFlagId = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(Integer value) {
        this.terminalType = value;
    }

    /**
     * Gets the value of the publicNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicNumber() {
        return publicNumber;
    }

    /**
     * Sets the value of the publicNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicNumber(String value) {
        this.publicNumber = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the outgoingRights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutgoingRights() {
        return outgoingRights;
    }

    /**
     * Sets the value of the outgoingRights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutgoingRights(String value) {
        this.outgoingRights = value;
    }

    /**
     * Gets the value of the languageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Sets the value of the languageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

}
