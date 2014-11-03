
package com.huawei.esdk.uc.professional.local.bean.callback;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.callback.Adapter1;
import com.huawei.esdk.uc.professional.local.impl.autogen.callback.Adapter3;


/**
 * <p>Java class for ConfInfoNotify complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfInfoNotify">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="chairmanPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confUser" type="{esdk_uc_professional_server}ConfUser" maxOccurs="unbounded"/>
 *         &lt;element name="isLock" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isMute" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="confStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxVoice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfInfoNotify", propOrder = {
    "confId",
    "subject",
    "beginTime",
    "endTime",
    "chairmanPassword",
    "memberPassword",
    "confUser",
    "isLock",
    "isMute",
    "isRecord",
    "confStatus",
    "maxVoice"
})
public class ConfInfoNotify {

    @XmlElement(required = true)
    protected String confId = "";
    @XmlElement(required = true)
    protected String subject = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    @XmlElement(required = true)
    protected String chairmanPassword = "";
    @XmlElement(required = true)
    protected String memberPassword = "";
    @XmlElement(required = true)
    protected List<ConfUser> confUser;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isLock;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isMute;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isRecord;
    @XmlElement(required = true)
    protected String confStatus = "";
    @XmlElement(required = true)
    protected String maxVoice = "";

    /**
     * Gets the value of the confId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfId() {
        return confId;
    }

    /**
     * Sets the value of the confId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfId(String value) {
        this.confId = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the beginTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * Sets the value of the beginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginTime(Date value) {
        this.beginTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(Date value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the chairmanPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChairmanPassword() {
        return chairmanPassword;
    }

    /**
     * Sets the value of the chairmanPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChairmanPassword(String value) {
        this.chairmanPassword = value;
    }

    /**
     * Gets the value of the memberPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberPassword() {
        return memberPassword;
    }

    /**
     * Sets the value of the memberPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberPassword(String value) {
        this.memberPassword = value;
    }

    /**
     * Gets the value of the confUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfUser }
     * 
     * 
     */
    public List<ConfUser> getConfUser() {
        if (confUser == null) {
            confUser = new ArrayList<ConfUser>();
        }
        return this.confUser;
    }

    /**
     * Gets the value of the isLock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIsLock() {
        return isLock;
    }

    /**
     * Sets the value of the isLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLock(Integer value) {
        this.isLock = value;
    }

    /**
     * Gets the value of the isMute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIsMute() {
        return isMute;
    }

    /**
     * Sets the value of the isMute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMute(Integer value) {
        this.isMute = value;
    }

    /**
     * Gets the value of the isRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIsRecord() {
        return isRecord;
    }

    /**
     * Sets the value of the isRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRecord(Integer value) {
        this.isRecord = value;
    }

    /**
     * Gets the value of the confStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfStatus() {
        return confStatus;
    }

    /**
     * Sets the value of the confStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfStatus(String value) {
        this.confStatus = value;
    }

    /**
     * Gets the value of the maxVoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxVoice() {
        return maxVoice;
    }

    /**
     * Sets the value of the maxVoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxVoice(String value) {
        this.maxVoice = value;
    }

	public void setConfUser(List<ConfUser> confUser) {
		this.confUser = confUser;
	}

}
