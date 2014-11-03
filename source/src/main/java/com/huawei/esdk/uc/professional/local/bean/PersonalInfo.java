
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="team" type="{esdk_uc_professional_server}PersonalTeamInfo" maxOccurs="unbounded"/>
 *         &lt;element name="linkman" type="{esdk_uc_professional_server}LinkmanInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInfo", propOrder = {
    "version",
    "team",
    "linkman"
})
public class PersonalInfo {

    protected String version = "";
    @XmlElement(required = true)
    protected List<PersonalTeamInfo> team;
    @XmlElement(required = true)
    protected List<LinkmanInfo> linkman;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the team property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the team property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalTeamInfo }
     * 
     * 
     */
    public List<PersonalTeamInfo> getTeam() {
        if (team == null) {
            team = new ArrayList<PersonalTeamInfo>();
        }
        return this.team;
    }

    /**
     * Gets the value of the linkman property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkman property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkman().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkmanInfo }
     * 
     * 
     */
    public List<LinkmanInfo> getLinkman() {
        if (linkman == null) {
            linkman = new ArrayList<LinkmanInfo>();
        }
        return this.linkman;
    }

	public void setTeam(List<PersonalTeamInfo> team) {
		this.team = team;
	}

	public void setLinkman(List<LinkmanInfo> linkman) {
		this.linkman = linkman;
	}

}
