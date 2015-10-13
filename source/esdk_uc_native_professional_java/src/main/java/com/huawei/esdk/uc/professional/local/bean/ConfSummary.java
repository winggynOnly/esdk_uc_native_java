
package com.huawei.esdk.uc.professional.local.bean;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter1;
import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for ConfSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="confType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chairman" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chairmanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="confStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rtpPolicy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tlsPolicy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chairmanPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extConfType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cycleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfSummary", propOrder = {
    "confId",
    "confType",
    "initiator",
    "initiatorName",
    "chairman",
    "chairmanName",
    "beginTime",
    "endTime",
    "subject",
    "isRecord",
    "confStatus",
    "rtpPolicy",
    "tlsPolicy",
    "chairmanPassword",
    "memberPassword",
    "accessCode",
    "recordCode",
    "areaId",
    "extConfType",
    "timeZone",
    "mediaType",
    "cycleId"
})
public class ConfSummary {

    @XmlElement(required = true)
    protected String confId = "";
    @XmlElement(required = true)
    protected String confType = "";
    @XmlElement(required = true)
    protected String initiator = "";
    protected String initiatorName = "";
    @XmlElement(required = true)
    protected String chairman = "";
    protected String chairmanName = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date beginTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endTime;
    @XmlElement(required = true)
    protected String subject = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer isRecord;
    @XmlElement(required = true)
    protected String confStatus = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer rtpPolicy;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer tlsPolicy;
    protected String chairmanPassword = "";
    protected String memberPassword = "";
    protected String accessCode = "";
    protected String recordCode = "";
    protected String areaId = "";
    protected String extConfType = "";
    protected String timeZone = "";
    protected String mediaType = "";
    protected String cycleId = "";

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
     * Gets the value of the chairman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChairman() {
        return chairman;
    }

    /**
     * Sets the value of the chairman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChairman(String value) {
        this.chairman = value;
    }

    /**
     * Gets the value of the chairmanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChairmanName() {
        return chairmanName;
    }

    /**
     * Sets the value of the chairmanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChairmanName(String value) {
        this.chairmanName = value;
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
     * Gets the value of the rtpPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getRtpPolicy() {
        return rtpPolicy;
    }

    /**
     * Sets the value of the rtpPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtpPolicy(Integer value) {
        this.rtpPolicy = value;
    }

    /**
     * Gets the value of the tlsPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getTlsPolicy() {
        return tlsPolicy;
    }

    /**
     * Sets the value of the tlsPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlsPolicy(Integer value) {
        this.tlsPolicy = value;
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
     * Gets the value of the accessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessCode() {
        return accessCode;
    }

    /**
     * Sets the value of the accessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessCode(String value) {
        this.accessCode = value;
    }

    /**
     * Gets the value of the recordCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordCode() {
        return recordCode;
    }

    /**
     * Sets the value of the recordCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordCode(String value) {
        this.recordCode = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * Sets the value of the areaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaId(String value) {
        this.areaId = value;
    }

    /**
     * Gets the value of the extConfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtConfType() {
        return extConfType;
    }

    /**
     * Sets the value of the extConfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtConfType(String value) {
        this.extConfType = value;
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
     * Gets the value of the cycleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCycleId() {
        return cycleId;
    }

    /**
     * Sets the value of the cycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCycleId(String value) {
        this.cycleId = value;
    }

}
