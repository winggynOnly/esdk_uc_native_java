
package com.huawei.esdk.uc.professional.local.impl.autogen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.huawei.esdk.uc.professional.local.bean.DeptKeyInfo;


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
 *         &lt;element name="deptInfo" type="{esdk_uc_professional_server}DeptKeyInfo"/>
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
    "deptInfo"
})
@XmlRootElement(name = "updateDept")
public class UpdateDept {

    @XmlElement(required = true)
    protected DeptKeyInfo deptInfo;

    /**
     * Gets the value of the deptInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DeptKeyInfo }
     *     
     */
    public DeptKeyInfo getDeptInfo() {
        return deptInfo;
    }

    /**
     * Sets the value of the deptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeptKeyInfo }
     *     
     */
    public void setDeptInfo(DeptKeyInfo value) {
        this.deptInfo = value;
    }

}
