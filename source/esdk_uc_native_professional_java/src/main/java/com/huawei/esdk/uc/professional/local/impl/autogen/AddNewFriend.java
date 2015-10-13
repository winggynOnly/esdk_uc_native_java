
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.CustomLinkmanInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ucAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="friendAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customLinkmanInfo" type="{esdk_uc_professional_server}CustomLinkmanInfo" minOccurs="0"/>
 *         &lt;element name="teamId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ucAccount",
    "friendAccount",
    "customLinkmanInfo",
    "teamId"
})
@XmlRootElement(name = "addNewFriend")
public class AddNewFriend {

    @XmlElement(required = true)
    protected String ucAccount;
    protected String friendAccount;
    protected CustomLinkmanInfo customLinkmanInfo;
    @XmlElement(required = true)
    protected String teamId;

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
     * Gets the value of the friendAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendAccount() {
        return friendAccount;
    }

    /**
     * Sets the value of the friendAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendAccount(String value) {
        this.friendAccount = value;
    }

    /**
     * Gets the value of the customLinkmanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomLinkmanInfo }
     *     
     */
    public CustomLinkmanInfo getCustomLinkmanInfo() {
        return customLinkmanInfo;
    }

    /**
     * Sets the value of the customLinkmanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomLinkmanInfo }
     *     
     */
    public void setCustomLinkmanInfo(CustomLinkmanInfo value) {
        this.customLinkmanInfo = value;
    }

    /**
     * Gets the value of the teamId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * Sets the value of the teamId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamId(String value) {
        this.teamId = value;
    }

}
