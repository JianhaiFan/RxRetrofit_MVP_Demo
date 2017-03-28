package com.xiaofan.rxretrofit_mvp_demo;

import android.app.Application;
import android.content.Context;

import com.xiaofan.rxretrofitlibrary.RxRetrofitApp;

/**
 * @author: 范建海
 * @createTime: 2017/3/26 19:08
 * @className:  App
 * @description: 
 * @changed by:
 */
public class App extends Application {
    public static Context app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = getApplicationContext();
        RxRetrofitApp.init(this);

    }
}
