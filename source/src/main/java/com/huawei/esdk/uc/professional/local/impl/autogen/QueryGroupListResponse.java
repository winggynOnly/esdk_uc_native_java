
package com.huawei.esdk.uc.professional.local.impl.autogen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.huawei.esdk.uc.professional.local.bean.GroupInfoBase;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;


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
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageInfo" type="{esdk_uc_professional_server}PageInfo" minOccurs="0"/>
 *         &lt;element name="groupInfoBase" type="{esdk_uc_professional_server}GroupInfoBase" maxOccurs="unbounded" minOccurs="0"/>
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
    "resultCode",
    "pageInfo",
    "groupInfoBase"
})
@XmlRootElement(name = "queryGroupListResponse")
public class QueryGroupListResponse {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "int")
    protected Integer resultCode;
    protected PageInfo pageInfo;
    protected List<GroupInfoBase> groupInfoBase;

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(Integer value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the pageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PageInfo }
     *     
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    /**
     * Sets the value of the pageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageInfo }
     *     
     */
    public void setPageInfo(PageInfo value) {
        this.pageInfo = value;
    }

    /**
     * Gets the value of the groupInfoBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupInfoBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupInfoBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupInfoBase }
     * 
     * 
     */
    public List<GroupInfoBase> getGroupInfoBase() {
        if (groupInfoBase == null) {
            groupInfoBase = new ArrayList<GroupInfoBase>();
        }
        return this.groupInfoBase;
    }

}
