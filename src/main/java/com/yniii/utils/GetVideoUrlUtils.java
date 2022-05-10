package com.yniii.utils;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author yNsLuHan
 */
public class GetVideoUrlUtils {

    /**
     * 获取播放地址，轮训使用获取中的所有方法
     *
     * @return map
     */
    public static String getVideoUrl(String url) {

        //
        Class<GetVideoUrl> getVideoUrlClass = GetVideoUrl.class;
        //
        int i = 0;
        //
        try {
            while (true) {
                i = i + 1;
                //
                String m = "getVideoUrl" + i;
                //
                Method method = getVideoUrlClass.getMethod(m, String.class);
                //
                Map map = (Map) method.invoke(null, url);
                //

                if (map == null || "null".equals(map)) {
                    continue;
                }
                String m3u8Url;
                try {
                    m3u8Url = (String) map.get("url");

                } catch (Exception e) {
                    continue;
                }
                if (m3u8Url == null) {
                    continue;
                }
                Integer code = MyHttpclient.checkUrlStatus(m3u8Url);
                //
                if (code != 200) {
                    continue;
                }
                if (map != null && code == 200) {
                    System.out.println("使用的方法" + m);
                    System.out.println("res： " + map);
                    return m3u8Url;
                }
            }
        } catch (Exception e) {
            return null;
        }
    }

}
