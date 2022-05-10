package com.yniii.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yNsLuHan
 */
public class PageUtils {

    public static Map<String, Integer> getPage(Integer page, Integer size, Integer defaultLimit) {
        Integer intSize = null;
        Integer intPage = null;
        // 判断size
        if (size == null) {
            intSize = defaultLimit;
        } else if (size != null && "undefined".equals(size)) {
            intSize = defaultLimit;
        } else {
            intSize = size;
        }
        // 判断page
        if (page == null || page <= 1) {
            intPage = 0;
        } else if (page != null && "undefined".equals(page)) {
            intPage = 0;
        } else if (page != null && page > 1) {
            intPage = (page - 1) * intSize;
        }
        HashMap<String, Integer> res = new HashMap<String, Integer>();
        res.put("page", intPage);
        res.put("limit", intSize);
        return res;
    }

    public static int mybatisPage(Integer page) {
        int intPage = 0;
        // 判断page
        if (page == null || page <= 1) {
            intPage = 0;
        } else if (page != null && "undefined".equals(page)) {
            intPage = 0;
        } else if (page != null && !"undefined".equals(page) && page > 1) {
            intPage = page;
        }
        return intPage;
    }

    public static int mybatisLimit(Integer limit, Integer defaultLimit) {
        int intSize = 0;
        // 判断size
        if (limit == null) {
            intSize = 20;
        } else if (limit != null && "undefined".equals(limit)) {
            intSize = defaultLimit;
        } else {
            intSize = limit;
        }
        return intSize;
    }
}

