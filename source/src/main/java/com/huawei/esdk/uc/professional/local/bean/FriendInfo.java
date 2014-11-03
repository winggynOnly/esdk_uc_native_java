
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FriendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FriendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="headImageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pinyinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZoneValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assistant" type="{esdk_uc_professional_server}AssistantInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contactInfo" type="{esdk_uc_professional_server}ContactInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FriendInfo", propOrder = {
    "memberUri",
    "name",
    "signature",
    "sex",
    "occupation",
    "headImageId",
    "pinyinName",
    "foreignName",
    "location",
    "localTime",
    "contactDesc",
    "timeZone",
    "timeZoneValue",
    "displayName",
    "assistant",
    "contactInfo"
})
public class FriendInfo {

    @XmlElement(required = true)
    protected String memberUri = "";
    @XmlElement(required = true)
    protected String name = "";
    @XmlElement(required = true)
    protected String signature = "";
    @XmlElement(required = true)
    protected String sex = "";
    @XmlElement(required = true)
    protected String occupation = "";
    @XmlElement(required = true)
    protected String headImageId = "";
    protected String pinyinName = "";
    protected String foreignName = "";
    protected String location = "";
    protected String localTime = "";
    protected String contactDesc = "";
    protected String timeZone = "";
    protected String timeZoneValue = "";
    protected String displayName = "";
    protected List<AssistantInfo> assistant;
    protected ContactInfo contactInfo;

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
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the headImageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadImageId() {
        return headImageId;
    }

    /**
     * Sets the value of the headImageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadImageId(String value) {
        this.headImageId = value;
    }

    /**
     * Gets the value of the pinyinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinyinName() {
        return pinyinName;
    }

    /**
     * Sets the value of the pinyinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinyinName(String value) {
        this.pinyinName = value;
    }

    /**
     * Gets the value of the foreignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignName() {
        return foreignName;
    }

    /**
     * Sets the value of the foreignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignName(String value) {
        this.foreignName = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the localTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTime() {
        return localTime;
    }

    /**
     * Sets the value of the localTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTime(String value) {
        this.localTime = value;
    }

    /**
     * Gets the value of the contactDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactDesc() {
        return contactDesc;
    }

    /**
     * Sets the value of the contactDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactDesc(String value) {
        this.contactDesc = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the timeZoneValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneValue() {
        return timeZoneValue;
    }

    /**
     * Sets the value of the timeZoneValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneValue(String value) {
        this.timeZoneValue = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the assistant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assistant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssistant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssistantInfo }
     * 
     * 
     */
    public List<AssistantInfo> getAssistant() {
        if (assistant == null) {
            assistant = new ArrayList<AssistantInfo>();
        }
        return this.assistant;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

	public void setAssistant(List<AssistantInfo> assistant) {
		this.assistant = assistant;
	}

}
