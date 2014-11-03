
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="memberUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userFullNumUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherPhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="officePhone" type="{esdk_uc_professional_server}ContactNumberBase" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="voip" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="webSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seatNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deptDescEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfo", propOrder = {
    "memberUri",
    "staffNumber",
    "fax",
    "userFullNumUri",
    "clientNumber",
    "homePhone",
    "mobilePhone",
    "otherPhone",
    "officePhone",
    "voip",
    "address",
    "email",
    "zipcode",
    "webSite",
    "noteMail",
    "seatNum",
    "deptDesc",
    "deptDescEng",
    "otherInfo"
})
public class ContactInfo {

    protected String memberUri = "";
    protected String staffNumber = "";
    protected List<ContactNumberBase> fax;
    protected String userFullNumUri = "";
    protected String clientNumber = "";
    protected String homePhone = "";
    protected List<ContactNumberBase> mobilePhone;
    protected List<ContactNumberBase> otherPhone;
    protected List<ContactNumberBase> officePhone;
    protected List<String> voip;
    protected String address = "";
    protected String email = "";
    protected String zipcode = "";
    protected String webSite = "";
    protected String noteMail = "";
    protected String seatNum = "";
    protected String deptDesc = "";
    protected String deptDescEng = "";
    protected String otherInfo = "";

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

	public void setFax(List<ContactNumberBase> fax) {
		this.fax = fax;
	}

	public void setMobilePhone(List<ContactNumberBase> mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public void setOtherPhone(List<ContactNumberBase> otherPhone) {
		this.otherPhone = otherPhone;
	}

	public void setOfficePhone(List<ContactNumberBase> officePhone) {
		this.officePhone = officePhone;
	}

	public void setVoip(List<String> voip) {
		this.voip = voip;
	}

}
