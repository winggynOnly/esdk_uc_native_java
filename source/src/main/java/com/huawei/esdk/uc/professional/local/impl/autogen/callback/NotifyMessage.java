
package com.huawei.esdk.uc.professional.local.impl.autogen.callback;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.bean.callback.MessageInfo;


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
 *         &lt;element name="msgUserType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="message" type="{esdk_uc_professional_server}MessageInfo"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "msgUserType",
    "sender",
    "senderName",
    "groupId",
    "recver",
    "message",
    "creator",
    "creatorUrl"
})
@XmlRootElement(name = "notifyMessage")
public class NotifyMessage {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer msgUserType;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected String senderName;
    @XmlElement(required = true)
    protected List<String> groupId;
    @XmlElement(required = true)
    protected String recver;
    @XmlElement(required = true)
    protected MessageInfo message;
    @XmlElement(required = true)
    protected String creator;
    @XmlElement(required = true)
    protected String creatorUrl;

    /**
     * Gets the value of the msgUserType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMsgUserType() {
        return msgUserType;
    }

    /**
     * Sets the value of the msgUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUserType(Integer value) {
        this.msgUserType = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * Gets the value of the senderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets the value of the senderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGroupId() {
        if (groupId == null) {
            groupId = new ArrayList<String>();
        }
        return this.groupId;
    }

    /**
     * Gets the value of the recver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecver() {
        return recver;
    }

    /**
     * Sets the value of the recver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecver(String value) {
        this.recver = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageInfo }
     *     
     */
    public MessageInfo getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageInfo }
     *     
     */
    public void setMessage(MessageInfo value) {
        this.message = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

	public String getCreatorUrl() {
		return creatorUrl;
	}

	public void setCreatorUrl(String creatorUrl) {
		this.creatorUrl = creatorUrl;
	}

}
