
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.OffsetQueryStaffCond;
import com.huawei.esdk.uc.professional.local.bean.PageQueryStaffCond;
import com.huawei.esdk.uc.professional.local.bean.QueryMode;


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
 *         &lt;element name="ucAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="queryMode" type="{esdk_uc_professional_server}QueryMode"/>
 *         &lt;element name="pageCond" type="{esdk_uc_professional_server}PageQueryStaffCond" minOccurs="0"/>
 *         &lt;element name="offsetCond" type="{esdk_uc_professional_server}OffsetQueryStaffCond" minOccurs="0"/>
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
    "queryMode",
    "pageCond",
    "offsetCond"
})
@XmlRootElement(name = "queryStaffList")
public class QueryStaffList {

    protected String ucAccount;
    @XmlElement(required = true)
    protected QueryMode queryMode;
    protected PageQueryStaffCond pageCond;
    protected OffsetQueryStaffCond offsetCond;

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
     * Gets the value of the queryMode property.
     * 
     * @return
     *     possible object is
     *     {@link QueryMode }
     *     
     */
    public QueryMode getQueryMode() {
        return queryMode;
    }

    /**
     * Sets the value of the queryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryMode }
     *     
     */
    public void setQueryMode(QueryMode value) {
        this.queryMode = value;
    }

    /**
     * Gets the value of the pageCond property.
     * 
     * @return
     *     possible object is
     *     {@link PageQueryStaffCond }
     *     
     */
    public PageQueryStaffCond getPageCond() {
        return pageCond;
    }

    /**
     * Sets the value of the pageCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageQueryStaffCond }
     *     
     */
    public void setPageCond(PageQueryStaffCond value) {
        this.pageCond = value;
    }

    /**
     * Gets the value of the offsetCond property.
     * 
     * @return
     *     possible object is
     *     {@link OffsetQueryStaffCond }
     *     
     */
    public OffsetQueryStaffCond getOffsetCond() {
        return offsetCond;
    }

    /**
     * Sets the value of the offsetCond property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetQueryStaffCond }
     *     
     */
    public void setOffsetCond(OffsetQueryStaffCond value) {
        this.offsetCond = value;
    }

}
