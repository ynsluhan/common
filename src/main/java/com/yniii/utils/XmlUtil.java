package com.yniii.utils;

import java.util.Map;
import java.util.Map.Entry;

/**
 * @author yNsluhan
 * @date 2021/8/6 4:38 下午
 */
public class XmlUtil {
    private static final String PREFIX_XML = "<xml>";
    private static final String SUFFIX_XML = "</xml>";

    private static final String PREFIX_CDATA = "<![CDATA[";

    private static final String SUFFIX_CDATA = "]]>";

    /**
     * 转化成xml, 单层无嵌套
     *
     * @param parm       parm
     * @param isAddCDATA isAddCDATA
     * @return s
     */
    public static String mapToXml(Map<Object, Object> parm, boolean isAddCDATA) {
        StringBuffer strBuff = new StringBuffer(PREFIX_XML);
        if (null != parm) {
            for (Entry<Object, Object> entry : parm.entrySet()) {
                strBuff.append("<").append(entry.getKey()).append(">");
                if (isAddCDATA) {
                    strBuff.append(PREFIX_CDATA);
                    if (null != entry.getValue()) {
                        strBuff.append(entry.getValue());
                    }
                    strBuff.append(SUFFIX_CDATA);
                } else {
                    if (null != entry.getValue()) {
                        strBuff.append(entry.getValue());
                    }
                }
                strBuff.append("</").append(entry.getKey()).append(">");
            }
        }
        return strBuff.append(SUFFIX_XML).toString();
    }
}
