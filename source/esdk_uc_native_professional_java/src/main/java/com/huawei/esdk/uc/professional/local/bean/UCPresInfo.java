
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UCPresInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UCPresInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherPhone" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headImageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presPublish" type="{esdk_uc_professional_server}PresPublishInfo"/>
 *         &lt;element name="functionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pinyinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userFullNumUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presExchange" type="{esdk_uc_professional_server}PresPublishInfo" minOccurs="0"/>
 *         &lt;element name="statusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UCPresInfo", propOrder = {
    "ucAccount",
    "signature",
    "mobilePhone",
    "otherPhone",
    "email",
    "nickName",
    "headImageId",
    "deptDesc",
    "presPublish",
    "functionId",
    "pinyinName",
    "officePhone",
    "userUri",
    "userFullNumUri",
    "presExchange",
    "statusFlag"
})
public class UCPresInfo {

    @XmlElement(required = true)
    protected String ucAccount = "";
    protected String signature = "";
    protected String mobilePhone = "";
    protected List<String> otherPhone;
    protected String email = "";
    protected String nickName = "";
    protected String headImageId = "";
    protected String deptDesc = "";
    @XmlElement(required = true)
    protected PresPublishInfo presPublish;
    protected String functionId = "";
    protected String pinyinName = "";
    protected List<ContactNumberBase> officePhone;
    protected String userUri = "";
    protected String userFullNumUri = "";
    protected PresPublishInfo presExchange;
    protected String statusFlag = "";

    /**
     * Gets the value of the ucAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcAccount() {
        return ucAccount;
    }

    /**
     * Sets the value of the ucAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcAccount(String value) {
        this.ucAccount = value;
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
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherPhone() {
        if (otherPhone == null) {
            otherPhone = new ArrayList<String>();
        }
        return this.otherPhone;
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
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
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
     * Gets the value of the presPublish property.
     * 
     * @return
     *     possible object is
     *     {@link PresPublishInfo }
     *     
     */
    public PresPublishInfo getPresPublish() {
        return presPublish;
    }

    /**
     * Sets the value of the presPublish property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresPublishInfo }
     *     
     */
    public void setPresPublish(PresPublishInfo value) {
        this.presPublish = value;
    }

    /**
     * Gets the value of the functionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionId() {
        return functionId;
    }

    /**
     * Sets the value of the functionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionId(String value) {
        this.functionId = value;
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
     * Gets the value of the userUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserUri() {
        return userUri;
    }

    /**
     * Sets the value of the userUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserUri(String value) {
        this.userUri = value;
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
     * Gets the value of the presExchange property.
     * 
     * @return
     *     possible object is
     *     {@link PresPublishInfo }
     *     
     */
    public PresPublishInfo getPresExchange() {
        return presExchange;
    }

    /**
     * Sets the value of the presExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresPublishInfo }
     *     
     */
    public void setPresExchange(PresPublishInfo value) {
        this.presExchange = value;
    }

    /**
     * Gets the value of the statusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusFlag() {
        return statusFlag;
    }

    /**
     * Sets the value of the statusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusFlag(String value) {
        this.statusFlag = value;
    }

	public void setOtherPhone(List<String> otherPhone) {
		this.otherPhone = otherPhone;
	}

	public void setOfficePhone(List<ContactNumberBase> officePhone) {
		this.officePhone = officePhone;
	}

}
