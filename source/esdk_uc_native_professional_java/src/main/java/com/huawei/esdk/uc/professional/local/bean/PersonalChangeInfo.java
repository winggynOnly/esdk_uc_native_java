
package com.huawei.esdk.uc.professional.local.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.impl.autogen.Adapter1;


/**
 * <p>Java class for PersonalChangeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalChangeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="linkmanChange" type="{esdk_uc_professional_server}LinkmanChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teamChange" type="{esdk_uc_professional_server}PersonalTeamChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="teamMemberChange" type="{esdk_uc_professional_server}TeamMemberChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupChange" type="{esdk_uc_professional_server}GroupChangeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalChangeInfo", propOrder = {
    "timeStamp",
    "linkmanChange",
    "teamChange",
    "teamMemberChange",
    "groupChange"
})
public class PersonalChangeInfo {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date timeStamp;
    protected List<LinkmanChangeInfo> linkmanChange;
    protected List<PersonalTeamChangeInfo> teamChange;
    protected List<TeamMemberChangeInfo> teamMemberChange;
    protected List<GroupChangeInfo> groupChange;

    /**
     * Gets the value of the timeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the value of the timeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(Date value) {
        this.timeStamp = value;
    }

    /**
     * Gets the value of the linkmanChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkmanChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkmanChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkmanChangeInfo }
     * 
     * 
     */
    public List<LinkmanChangeInfo> getLinkmanChange() {
        if (linkmanChange == null) {
            linkmanChange = new ArrayList<LinkmanChangeInfo>();
        }
        return this.linkmanChange;
    }

    /**
     * Gets the value of the teamChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonalTeamChangeInfo }
     * 
     * 
     */
    public List<PersonalTeamChangeInfo> getTeamChange() {
        if (teamChange == null) {
            teamChange = new ArrayList<PersonalTeamChangeInfo>();
        }
        return this.teamChange;
    }

    /**
     * Gets the value of the teamMemberChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamMemberChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamMemberChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamMemberChangeInfo }
     * 
     * 
     */
    public List<TeamMemberChangeInfo> getTeamMemberChange() {
        if (teamMemberChange == null) {
            teamMemberChange = new ArrayList<TeamMemberChangeInfo>();
        }
        return this.teamMemberChange;
    }

    /**
     * Gets the value of the groupChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupChangeInfo }
     * 
     * 
     */
    public List<GroupChangeInfo> getGroupChange() {
        if (groupChange == null) {
            groupChange = new ArrayList<GroupChangeInfo>();
        }
        return this.groupChange;
    }

	public void setLinkmanChange(List<LinkmanChangeInfo> linkmanChange) {
		this.linkmanChange = linkmanChange;
	}

	public void setTeamChange(List<PersonalTeamChangeInfo> teamChange) {
		this.teamChange = teamChange;
	}

	public void setTeamMemberChange(List<TeamMemberChangeInfo> teamMemberChange) {
		this.teamMemberChange = teamMemberChange;
	}

	public void setGroupChange(List<GroupChangeInfo> groupChange) {
		this.groupChange = groupChange;
	}

}
