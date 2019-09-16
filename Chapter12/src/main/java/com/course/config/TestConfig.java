package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * 获取用户基础信息配置变量对应application里面的
 */
public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;
    public static String addUserUrl;
    public static String getUserInfoUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore store;
}
