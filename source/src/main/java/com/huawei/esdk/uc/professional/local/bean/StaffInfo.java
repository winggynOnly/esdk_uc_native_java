
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ucNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberUri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webSite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="staffForeignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deptName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="firstPinyin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pinyinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherPhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fax" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeZoneValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userFullNumUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assistant" type="{esdk_uc_professional_server}AssistantInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptDescEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffInfo", propOrder = {
    "staffId",
    "corpId",
    "deptId",
    "ucNumber",
    "memberUri",
    "staffNumber",
    "staffName",
    "webSite",
    "zipcode",
    "address",
    "sex",
    "staffForeignName",
    "occupation",
    "level",
    "deptName",
    "email",
    "vip",
    "firstPinyin",
    "pinyinName",
    "displayName",
    "timeZone",
    "noteMail",
    "homePhone",
    "mobilePhone",
    "seatNum",
    "contactDesc",
    "officePhone",
    "otherPhone",
    "fax",
    "voip",
    "timeZoneValue",
    "clientNumber",
    "otherInfo",
    "userFullNumUri",
    "assistant",
    "deptDesc",
    "deptDescEng"
})
public class StaffInfo {

    @XmlElement(required = true)
    protected String staffId = "";
    @XmlElement(required = true)
    protected String corpId = "";
    @XmlElement(required = true)
    protected String deptId = "";
    @XmlElement(required = true)
    protected String ucNumber = "";
    @XmlElement(required = true)
    protected String memberUri = "";
    @XmlElement(required = true)
    protected String staffNumber = "";
    @XmlElement(required = true)
    protected String staffName = "";
    @XmlElement(required = true)
    protected String webSite = "";
    @XmlElement(required = true)
    protected String zipcode = "";
    @XmlElement(required = true)
    protected String address = "";
    @XmlElement(required = true)
    protected String sex = "";
    @XmlElement(required = true)
    protected String staffForeignName = "";
    @XmlElement(required = true)
    protected String occupation = "";
    @XmlElement(required = true)
    protected String level = "";
    @XmlElement(required = true)
    protected String deptName = "";
    @XmlElement(required = true)
    protected String email = "";
    @XmlElement(required = true)
    protected String vip = "";
    @XmlElement(required = true)
    protected String firstPinyin = "";
    protected String pinyinName = "";
    protected String displayName = "";
    protected String timeZone = "";
    protected String noteMail = "";
    protected String homePhone = "";
    protected List<ContactNumberBase> mobilePhone;
    protected String seatNum = "";
    protected String contactDesc = "";
    protected List<ContactNumberBase> officePhone;
    protected List<ContactNumberBase> otherPhone;
    protected List<ContactNumberBase> fax;
    protected List<String> voip;
    protected String timeZoneValue = "";
    protected String clientNumber = "";
    protected String otherInfo = "";
    protected String userFullNumUri = "";
    protected List<AssistantInfo> assistant;
    protected String deptDesc = "";
    protected String deptDescEng = "";

    /**
     * Gets the value of the staffId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Sets the value of the staffId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffId(String value) {
        this.staffId = value;
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
     * Gets the value of the ucNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcNumber() {
        return ucNumber;
    }

    /**
     * Sets the value of the ucNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcNumber(String value) {
        this.ucNumber = value;
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
     * Gets the value of the staffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffNumber() {
        return staffNumber;
    }

    /**
     * Sets the value of the staffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffNumber(String value) {
        this.staffNumber = value;
    }

    /**
     * Gets the value of the staffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * Sets the value of the staffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffName(String value) {
        this.staffName = value;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     * Sets the value of the webSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebSite(String value) {
        this.webSite = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
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
     * Gets the value of the staffForeignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffForeignName() {
        return staffForeignName;
    }

    /**
     * Sets the value of the staffForeignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffForeignName(String value) {
        this.staffForeignName = value;
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
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVip(String value) {
        this.vip = value;
    }

    /**
     * Gets the value of the firstPinyin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPinyin() {
        return firstPinyin;
    }

    /**
     * Sets the value of the firstPinyin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPinyin(String value) {
        this.firstPinyin = value;
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
     * Gets the value of the noteMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMail() {
        return noteMail;
    }

    /**
     * Sets the value of the noteMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMail(String value) {
        this.noteMail = value;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Sets the value of the homePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactNumberBase }
     * 
     * 
     */
    public List<ContactNumberBase> getMobilePhone() {
        if (mobilePhone == null) {
            mobilePhone = new ArrayList<ContactNumberBase>();
        }
        return this.mobilePhone;
    }

    /**
     * Gets the value of the seatNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNum() {
        return seatNum;
    }

    /**
     * Sets the value of the seatNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNum(String value) {
        this.seatNum = value;
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
     * Gets the value of the officePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactNumberBase }
     * 
     * 
     */
    public List<ContactNumberBase> getOfficePhone() {
        if (officePhone == null) {
            officePhone = new ArrayList<ContactNumberBase>();
        }
        return this.officePhone;
    }

    /**
     * Gets the value of the otherPhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactNumberBase }
     * 
     * 
     */
    public List<ContactNumberBase> getOtherPhone() {
        if (otherPhone == null) {
            otherPhone = new ArrayList<ContactNumberBase>();
        }
        return this.otherPhone;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactNumberBase }
     * 
     * 
     */
    public List<ContactNumberBase> getFax() {
        if (fax == null) {
            fax = new ArrayList<ContactNumberBase>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the voip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the voip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVoip() {
        if (voip == null) {
            voip = new ArrayList<String>();
        }
        return this.voip;
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
     * Gets the value of the clientNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNumber() {
        return clientNumber;
    }

    /**
     * Sets the value of the clientNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNumber(String value) {
        this.clientNumber = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the userFullNumUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFullNumUri() {
        return userFullNumUri;
    }

    /**
     * Sets the value of the userFullNumUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFullNumUri(String value) {
        this.userFullNumUri = value;
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
     * Gets the value of the deptDescEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptDescEng() {
        return deptDescEng;
    }

    /**
     * Sets the value of the deptDescEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptDescEng(String value) {
        this.deptDescEng = value;
    }

	public void setMobilePhone(List<ContactNumberBase> mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public void setOfficePhone(List<ContactNumberBase> officePhone) {
		this.officePhone = officePhone;
	}

	public void setOtherPhone(List<ContactNumberBase> otherPhone) {
		this.otherPhone = otherPhone;
	}

	public void setFax(List<ContactNumberBase> fax) {
		this.fax = fax;
	}

	public void setVoip(List<String> voip) {
		this.voip = voip;
	}

	public void setAssistant(List<AssistantInfo> assistant) {
		this.assistant = assistant;
	}

}
