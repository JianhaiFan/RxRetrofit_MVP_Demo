package com.xiaofan.rxretrofitlibrary;

import android.app.Application;

/**
 * @author: 范建海
 * @createTime: 2017/3/26 19:05
 * @className:  RxRetrofitApp
 * @description: 全局App
 * @changed by:
 */
public class RxRetrofitApp {
    private static Application application;

    public static void init(Application app){
        setApplication(app);
    }

    public static Application getApplication() {
        return application;
    }

    private static void setApplication(Application application) {
        RxRetrofitApp.application = application;
    }
}
