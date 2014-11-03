
package com.huawei.esdk.uc.professional.local.impl.autogen;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.parseDateTime(value));
    }

    public String marshal(Date value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.printDateTime(value));
    }

}
