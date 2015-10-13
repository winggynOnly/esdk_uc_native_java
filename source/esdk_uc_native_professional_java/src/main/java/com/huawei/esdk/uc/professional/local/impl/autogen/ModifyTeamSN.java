
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.PersonalTeam;


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
 *         &lt;element name="personalTeam" type="{esdk_uc_professional_server}PersonalTeam"/>
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
    "personalTeam"
})
@XmlRootElement(name = "modifyTeamSN")
public class ModifyTeamSN {

    @XmlElement(required = true)
    protected String ucAccount;
    @XmlElement(required = true)
    protected PersonalTeam personalTeam;

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
     * Gets the value of the personalTeam property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalTeam }
     *     
     */
    public PersonalTeam getPersonalTeam() {
        return personalTeam;
    }

    /**
     * Sets the value of the personalTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalTeam }
     *     
     */
    public void setPersonalTeam(PersonalTeam value) {
        this.personalTeam = value;
    }

}
