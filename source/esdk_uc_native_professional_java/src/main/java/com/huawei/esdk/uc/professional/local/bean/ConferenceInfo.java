
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter1;
import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for ConferenceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConferenceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confAgenda" type="{esdk_uc_professional_server}ConfAgenda" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="initiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="chairman" type="{esdk_uc_professional_server}ConfUser" minOccurs="0"/>
 *         &lt;element name="chairmanUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confUser" type="{esdk_uc_professional_server}ConfUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSupportBgMusic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bgMusicId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isRecord" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chairmanPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxAttendee" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isInviteChairman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConferenceInfo", propOrder = {
    "confId",
    "confType",
    "confStatus",
    "subject",
    "confAgenda",
    "initiator",
    "initiatorName",
    "beginTime",
    "endTime",
    "chairman",
    "chairmanUri",
    "confUser",
    "isSupportBgMusic",
    "bgMusicId",
    "isRecord",
    "mediaType",
    "memberPassword",
    "chairmanPassword",
    "maxAttendee",
    "isInviteChairman",
    "timeZone"
})
public class ConferenceInfo {

    protected String confId = "";
    @XmlElement(required = true)
    protected String confType = "";
    protected String confStatus = "";
    @XmlElement(required = true)
    protected String subject = "";
    protected List<ConfAgenda> confAgenda;
    @XmlElement(required = true)
    protected String initiator = "";
    protected String initiatorName = "";
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    protected ConfUser chairman;
    protected String chairmanUri = "";
    protected List<ConfUser> confUser;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isSupportBgMusic;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer bgMusicId;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isRecord;
    @XmlElement(required = true)
    protected String mediaType = "";
    protected String memberPassword = "";
    protected String chairmanPassword = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer maxAttendee;
    protected String isInviteChairman = "";
    protected String timeZone = "";

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
     * Gets the value of the confType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfType() {
        return confType;
    }

    /**
     * Sets the value of the confType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfType(String value) {
        this.confType = value;
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
     * Gets the value of the confAgenda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confAgenda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfAgenda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfAgenda }
     * 
     * 
     */
    public List<ConfAgenda> getConfAgenda() {
        if (confAgenda == null) {
            confAgenda = new ArrayList<ConfAgenda>();
        }
        return this.confAgenda;
    }

    /**
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiator(String value) {
        this.initiator = value;
    }

    /**
     * Gets the value of the initiatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatorName() {
        return initiatorName;
    }

    /**
     * Sets the value of the initiatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatorName(String value) {
        this.initiatorName = value;
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
     * Gets the value of the chairman property.
     * 
     * @return
     *     possible object is
     *     {@link ConfUser }
     *     
     */
    public ConfUser getChairman() {
        return chairman;
    }

    /**
     * Sets the value of the chairman property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfUser }
     *     
     */
    public void setChairman(ConfUser value) {
        this.chairman = value;
    }

    /**
     * Gets the value of the chairmanUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChairmanUri() {
        return chairmanUri;
    }

    /**
     * Sets the value of the chairmanUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChairmanUri(String value) {
        this.chairmanUri = value;
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
     * Gets the value of the isSupportBgMusic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIsSupportBgMusic() {
        return isSupportBgMusic;
    }

    /**
     * Sets the value of the isSupportBgMusic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSupportBgMusic(Integer value) {
        this.isSupportBgMusic = value;
    }

    /**
     * Gets the value of the bgMusicId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getBgMusicId() {
        return bgMusicId;
    }

    /**
     * Sets the value of the bgMusicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgMusicId(Integer value) {
        this.bgMusicId = value;
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
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
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
     * Gets the value of the maxAttendee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMaxAttendee() {
        return maxAttendee;
    }

    /**
     * Sets the value of the maxAttendee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAttendee(Integer value) {
        this.maxAttendee = value;
    }

    /**
     * Gets the value of the isInviteChairman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsInviteChairman() {
        return isInviteChairman;
    }

    /**
     * Sets the value of the isInviteChairman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsInviteChairman(String value) {
        this.isInviteChairman = value;
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

	public void setConfAgenda(List<ConfAgenda> confAgenda) {
		this.confAgenda = confAgenda;
	}

	public void setConfUser(List<ConfUser> confUser) {
		this.confUser = confUser;
	}

}
