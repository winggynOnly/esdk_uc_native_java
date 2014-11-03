
package com.huawei.esdk.uc.professional.local.impl.autogen.clientmanager;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.clientmanager.MsgHistoryCondition;


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
 *         &lt;element name="msgHistoryCond" type="{esdk_uc_professional_server}MsgHistoryCondition"/>
 *         &lt;element name="msgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "msgHistoryCond",
    "msgId"
})
@XmlRootElement(name = "markMsgReadFlag")
public class MarkMsgReadFlag {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected MsgHistoryCondition msgHistoryCond;
    @XmlElement(required = true)
    protected String msgId;

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
     * Gets the value of the msgHistoryCond property.
     * 
     * @return
     *     possible object is
     *     {@link MsgHistoryCondition }
     *     
     */
    public MsgHistoryCondition getMsgHistoryCond() {
        return msgHistoryCond;
    }

    /**
     * Sets the value of the msgHistoryCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgHistoryCondition }
     *     
     */
    public void setMsgHistoryCond(MsgHistoryCondition value) {
        this.msgHistoryCond = value;
    }

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

}
