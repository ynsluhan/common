package com.yniii.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yNsLuHan
 */
public class OList {

    /**
     * object 转 List
     *
     * @param obj
     * @param clazz
     * @param <T>
     * @return
     */
//    public static <T> List<T> castList(Object obj, Class<T> clazz) {
//        List<T> result = new ArrayList<T>();
//        if (obj instanceof List<?>) {
//            for (Object o : (List<?>) obj) {
//                result.add(clazz.cast(o));
//            }
//            return result;
//        }
//        return null;
//    }


    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        List<T> result = new ArrayList<T>();
        if (obj instanceof List<?>) {
            for (Object o : (List<?>) obj) {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return null;
    }
}
