
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
 * <p>Java class for CorpInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorpInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dutyPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkman" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanCardType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanCardNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanMobile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkmanMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="provinceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wapUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentCorpId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpForeignName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="corpRank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modifyTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorpInfo", propOrder = {
    "corpId",
    "dutyPhone",
    "linkman",
    "linkmanCardType",
    "linkmanCardNumber",
    "linkmanPhone",
    "linkmanMobile",
    "linkmanMail",
    "fax",
    "address",
    "zipcode",
    "provinceId",
    "areaId",
    "cityId",
    "webUrl",
    "wapUrl",
    "parentCorpId",
    "corpAccount",
    "corpDomain",
    "corpName",
    "shortName",
    "corpForeignName",
    "corpDesc",
    "corpType",
    "corpRank",
    "cancelDate",
    "cancelReason",
    "createTime",
    "modifyTime",
    "status"
})
public class CorpInfo {

    @XmlElement(required = true)
    protected String corpId = "";
    @XmlElement(required = true)
    protected String dutyPhone = "";
    @XmlElement(required = true)
    protected String linkman = "";
    @XmlElement(required = true)
    protected String linkmanCardType = "";
    @XmlElement(required = true)
    protected String linkmanCardNumber = "";
    @XmlElement(required = true)
    protected String linkmanPhone = "";
    @XmlElement(required = true)
    protected String linkmanMobile = "";
    @XmlElement(required = true)
    protected String linkmanMail = "";
    @XmlElement(required = true)
    protected String fax = "";
    @XmlElement(required = true)
    protected String address = "";
    @XmlElement(required = true)
    protected String zipcode = "";
    @XmlElement(required = true)
    protected String provinceId = "";
    @XmlElement(required = true)
    protected String areaId = "";
    @XmlElement(required = true)
    protected String cityId = "";
    @XmlElement(required = true)
    protected String webUrl = "";
    @XmlElement(required = true)
    protected String wapUrl = "";
    @XmlElement(required = true)
    protected String parentCorpId = "";
    @XmlElement(required = true)
    protected String corpAccount = "";
    @XmlElement(required = true)
    protected String corpDomain = "";
    @XmlElement(required = true)
    protected String corpName = "";
    @XmlElement(required = true)
    protected String shortName = "";
    @XmlElement(required = true)
    protected String corpForeignName = "";
    @XmlElement(required = true)
    protected String corpDesc = "";
    @XmlElement(required = true)
    protected String corpType = "";
    @XmlElement(required = true)
    protected String corpRank = "";
    @XmlElement(required = true)
    protected String cancelDate = "";
    @XmlElement(required = true)
    protected String cancelReason = "";
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date createTime;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date modifyTime;
    @XmlElement(required = true)
    protected String status = "";

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
     * Gets the value of the dutyPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyPhone() {
        return dutyPhone;
    }

    /**
     * Sets the value of the dutyPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyPhone(String value) {
        this.dutyPhone = value;
    }

    /**
     * Gets the value of the linkman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * Sets the value of the linkman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkman(String value) {
        this.linkman = value;
    }

    /**
     * Gets the value of the linkmanCardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanCardType() {
        return linkmanCardType;
    }

    /**
     * Sets the value of the linkmanCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanCardType(String value) {
        this.linkmanCardType = value;
    }

    /**
     * Gets the value of the linkmanCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanCardNumber() {
        return linkmanCardNumber;
    }

    /**
     * Sets the value of the linkmanCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanCardNumber(String value) {
        this.linkmanCardNumber = value;
    }

    /**
     * Gets the value of the linkmanPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    /**
     * Sets the value of the linkmanPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanPhone(String value) {
        this.linkmanPhone = value;
    }

    /**
     * Gets the value of the linkmanMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * Sets the value of the linkmanMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanMobile(String value) {
        this.linkmanMobile = value;
    }

    /**
     * Gets the value of the linkmanMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkmanMail() {
        return linkmanMail;
    }

    /**
     * Sets the value of the linkmanMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkmanMail(String value) {
        this.linkmanMail = value;
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
     * Gets the value of the provinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * Sets the value of the provinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceId(String value) {
        this.provinceId = value;
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
     * Gets the value of the cityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * Sets the value of the cityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityId(String value) {
        this.cityId = value;
    }

    /**
     * Gets the value of the webUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebUrl() {
        return webUrl;
    }

    /**
     * Sets the value of the webUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebUrl(String value) {
        this.webUrl = value;
    }

    /**
     * Gets the value of the wapUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWapUrl() {
        return wapUrl;
    }

    /**
     * Sets the value of the wapUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWapUrl(String value) {
        this.wapUrl = value;
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
     * Gets the value of the corpAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpAccount() {
        return corpAccount;
    }

    /**
     * Sets the value of the corpAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpAccount(String value) {
        this.corpAccount = value;
    }

    /**
     * Gets the value of the corpDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpDomain() {
        return corpDomain;
    }

    /**
     * Sets the value of the corpDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpDomain(String value) {
        this.corpDomain = value;
    }

    /**
     * Gets the value of the corpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * Sets the value of the corpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpName(String value) {
        this.corpName = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the corpForeignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpForeignName() {
        return corpForeignName;
    }

    /**
     * Sets the value of the corpForeignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpForeignName(String value) {
        this.corpForeignName = value;
    }

    /**
     * Gets the value of the corpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpDesc() {
        return corpDesc;
    }

    /**
     * Sets the value of the corpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpDesc(String value) {
        this.corpDesc = value;
    }

    /**
     * Gets the value of the corpType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpType() {
        return corpType;
    }

    /**
     * Sets the value of the corpType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpType(String value) {
        this.corpType = value;
    }

    /**
     * Gets the value of the corpRank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpRank() {
        return corpRank;
    }

    /**
     * Sets the value of the corpRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpRank(String value) {
        this.corpRank = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
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

}
