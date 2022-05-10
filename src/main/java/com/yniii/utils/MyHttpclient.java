package com.yniii.utils;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author yNsLuHan
 */
public class MyHttpclient {

    public static String get(String url) {
        // 创建httpClient实例
        CloseableHttpClient httpClient = null;
        // 执行http get请求
        CloseableHttpResponse response = null;
        try {
            // httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建http get实例
            HttpGet httpGet = new HttpGet(url);
            //  设置请求头

            httpGet.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.80 Safari/537.36 Edg/86.0.622.43");
            //设置超时时间
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(10000).setConnectionRequestTimeout(10000)
                    .setSocketTimeout(10000).build();
            httpGet.setConfig(requestConfig);
            // 执行http get请求
            response = httpClient.execute(httpGet);
            // 获取返回实体
            HttpEntity entity = response.getEntity();
            // 获取网页内容
            return EntityUtils.toString(entity, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (response != null) {
                try {
                    // response关闭
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient != null) {
                try {
                    // httpClient关闭
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 检查url地址可用性
     *
     * @param url url
     * @return 状态
     */
    public static Integer checkUrlStatus(String url) {
        // 创建httpClient实例
        CloseableHttpClient httpClient = null;
        // 执行http get请求
        CloseableHttpResponse response = null;
        try {
            // httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建http get实例
            HttpGet httpGet = new HttpGet(url);
            //  设置请求头

            httpGet.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.80 Safari/537.36 Edg/86.0.622.43");
            //设置超时时间
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(10000).setConnectionRequestTimeout(10000)
                    .setSocketTimeout(10000).build();
            httpGet.setConfig(requestConfig);
            // 执行http get请求
            response = httpClient.execute(httpGet);
            // 获取状态码
            return response.getStatusLine().getStatusCode();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (response != null) {
                try {
                    // response关闭
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient != null) {
                try {
                    // httpClient关闭
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * post请求
     *
     * @param url    url
     * @param params 参数
     * @return 数据
     */
    public static String post(String url, List<NameValuePair> params) {
        // 创建httpClient实例
        CloseableHttpClient httpClient = null;
        // 执行http get请求
        CloseableHttpResponse response = null;
        try {
            // httpClient实例
            httpClient = HttpClients.createDefault();
            // 创建http post实例
            HttpPost httpPost = new HttpPost(url);
            // 对参数进行编码
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            // 设置格式
            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
            //  设置请求头
            httpPost.setHeader("User-Agent",
                    "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.80 Safari/537.36 Edg/86.0.622.43");
            //
            //设置超时时间
            RequestConfig requestConfig = RequestConfig.custom()
                    .setConnectTimeout(10000).setConnectionRequestTimeout(10000)
                    .setSocketTimeout(10000).build();
            httpPost.setConfig(requestConfig);
            // 执行http post请求
            response = httpClient.execute(httpPost);
            // 获取返回实体
            HttpEntity entity = response.getEntity();
            // 获取网页内容
            return EntityUtils.toString(entity, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (response != null) {
                try {
                    // response关闭
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient != null) {
                try {
                    // httpClient关闭
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
