
package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgInfo;


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
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msg" type="{esdk_uc_professional_server}MsgInfo"/>
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
    "recver",
    "msg"
})
@XmlRootElement(name = "withdrawMessage")
public class WithdrawMessage {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer msgUserType;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    protected String recver;
    @XmlElement(required = true)
    protected MsgInfo msg;

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
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link MsgInfo }
     *     
     */
    public MsgInfo getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgInfo }
     *     
     */
    public void setMsg(MsgInfo value) {
        this.msg = value;
    }

}
