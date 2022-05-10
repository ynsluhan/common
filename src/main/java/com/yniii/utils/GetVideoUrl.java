package com.yniii.utils;

import com.google.gson.Gson;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.net.URLEncoder;
import java.util.*;

/**
 * 添加所有解析地址
 * @author  yNsluhan
 */

public class GetVideoUrl {

    public GetVideoUrl() {
    }

    public static Map<String, Object> getVideoUrl1(String realUrl) {
        // 进行参数设置
        long time = System.currentTimeMillis();
        String t = String.valueOf(time / 1000);
        // 详情页地址
        List<String> strings = Arrays.asList(realUrl.split("&"));
        String video_url = strings.get(0);
        // 加密
        String referer_url = "https://www.h8jx.com/";
        String referer = Base64.getEncoder().encodeToString(referer_url.getBytes());
        // other
        String other = Base64.getEncoder().encodeToString(video_url.getBytes());
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("url", video_url));
        params.add(new BasicNameValuePair("referer", referer));
        params.add(new BasicNameValuePair("ref", "0"));
        params.add(new BasicNameValuePair("type", ""));
        params.add(new BasicNameValuePair("ios", ""));
        params.add(new BasicNameValuePair("time", t));
        params.add(new BasicNameValuePair("other", other));
        // 发送请求
        String post = MyHttpclient.post("https://h8jx.bjtjr.net/api.php", params);
        // 转为map
//        Map<String, Object> map = JSONObject.parseObject(post, Map.class);
        Map<String, Object> map = new Gson().fromJson(post, Map.class);

        return map;
    }

    /**
     * 获取视频播放地址
     *
     * @param realUrl 详情页地址
     * @return
     */
    public static Map<String, Object> getVideoUrl3(String realUrl) {
        // 进行参数设置
        long time = System.currentTimeMillis();
        String t = String.valueOf(time / 1000);
        // 详情页地址
        List<String> strings = Arrays.asList(realUrl.split("&"));
        String video_url = strings.get(0);
        // 加密
        String referer_url = "https://jx.wzslw.cn/jiexi/?url=" + video_url;
        String referer = Base64.getEncoder().encodeToString(referer_url.getBytes());
        // other
        String other = Base64.getEncoder().encodeToString(video_url.getBytes());
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("url", video_url));
        params.add(new BasicNameValuePair("referer", referer));
        params.add(new BasicNameValuePair("ref", "0"));
        params.add(new BasicNameValuePair("type", ""));
        params.add(new BasicNameValuePair("ios", ""));
        params.add(new BasicNameValuePair("time", t));
        params.add(new BasicNameValuePair("other", other));
        // 发送请求
        String post = MyHttpclient.post("https://1717.ntryjd.net/0526/api.php", params);
        // 转为map
//        Map<String, Object> map = JSONObject.parseObject(post, Map.class);
        Map<String, Object> map = new Gson().fromJson(post, Map.class);
        return map;
    }


    /**
     * 获取视频播放地址
     *
     * @param realUrl 详情页地址
     * @return res
     */
    public static Map<String, Object> getVideoUrl4(String realUrl) {
        String encode = URLEncoder.encode(realUrl);
        String apiUrl = "https://api.okjx.cc:666/mtv/api.php?url=%s&danmu=0";
        String format = String.format(apiUrl, encode);
        String res = MyHttpclient.get(format);
        // 转为map
//        Map<String, Object> map = JSONObject.parseObject(res, Map.class);
        Map<String, Object> map = new Gson().fromJson(res, Map.class);

        return map;
    }


    public static Map<String, Object> getVideoUrl2(String realUrl) {
        // 进行参数设置
        long time = System.currentTimeMillis();
        String t = String.valueOf(time / 1000);
        // 详情页地址
        List<String> strings = Arrays.asList(realUrl.split("&"));
        String video_url = strings.get(0);
        // 加密
        String referer_url = "http://5.nmgbq.com/jx.php?url=" + video_url;
        String referer = Base64.getEncoder().encodeToString(referer_url.getBytes());
        // other
        String other = Base64.getEncoder().encodeToString(video_url.getBytes());
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("url", video_url));
        params.add(new BasicNameValuePair("referer", referer));
        params.add(new BasicNameValuePair("ref", "0"));
        params.add(new BasicNameValuePair("type", ""));
        params.add(new BasicNameValuePair("ios", ""));
        params.add(new BasicNameValuePair("time", t));
        params.add(new BasicNameValuePair("other", other));
        // 发送请求
        String post = MyHttpclient.post("http://5.nmgbq.com/2/api.php", params);
        // 转为map
//        Map<String, Object> map = JSONObject.parseObject(post, Map.class);
        Map<String, Object> map = new Gson().fromJson(post, Map.class);

        return map;
    }

}
