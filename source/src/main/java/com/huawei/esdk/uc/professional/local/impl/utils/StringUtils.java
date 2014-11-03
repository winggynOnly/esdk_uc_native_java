package com.huawei.esdk.uc.professional.local.impl.utils;

public class StringUtils
{
    public static boolean isNullOrEmpty(String str)
    {
        if (null == str || str.isEmpty() || "".equals(str.trim()))
        {
            return true;
        }
        return false;
    }
}
