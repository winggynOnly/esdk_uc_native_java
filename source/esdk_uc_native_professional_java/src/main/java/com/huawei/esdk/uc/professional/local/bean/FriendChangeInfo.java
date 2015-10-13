
package com.huawei.esdk.uc.professional.local.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter3;


/**
 * <p>Java class for FriendChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FriendChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="friendInfo" type="{esdk_uc_professional_server}FriendInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FriendChangeInfo", propOrder = {
    "changeType",
    "friendInfo"
})
public class FriendChangeInfo {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer changeType;
    @XmlElement(required = true)
    protected FriendInfo friendInfo;

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(Integer value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the friendInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FriendInfo }
     *     
     */
    public FriendInfo getFriendInfo() {
        return friendInfo;
    }

    /**
     * Sets the value of the friendInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FriendInfo }
     *     
     */
    public void setFriendInfo(FriendInfo value) {
        this.friendInfo = value;
    }

}
