
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
 *         &lt;element name="ucAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recvType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ucAccount",
    "recvType",
    "recver",
    "msg"
})
@XmlRootElement(name = "sendMessage")
public class SendMessage {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer recvType;
    @XmlElement(required = true)
    protected String recver;
    @XmlElement(required = true)
    protected MsgInfo msg;

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
     * Gets the value of the recvType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getRecvType() {
        return recvType;
    }

    /**
     * Sets the value of the recvType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvType(Integer value) {
        this.recvType = value;
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
