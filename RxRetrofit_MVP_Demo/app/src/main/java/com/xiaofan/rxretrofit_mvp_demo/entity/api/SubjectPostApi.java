package com.xiaofan.rxretrofit_mvp_demo.entity.api;


import com.xiaofan.rxretrofit_mvp_demo.HttpPostService;
import com.xiaofan.rxretrofitlibrary.api.BaseApi;

import retrofit2.Retrofit;
import rx.Observable;

/**
 * @author: 范建海
 * @createTime: 2017/3/30 11:07
 * @className:  SubjectPostApi
 * @description: 测试数据
 * @changed by:
 */
public class SubjectPostApi extends BaseApi {
    //    接口需要传入的参数 可自定义不同类型
    private boolean all;
    /*任何你先要传递的参数*/
//    String xxxxx;
//    String xxxxx;
//    String xxxxx;
//    String xxxxx;


    /**
     * 默认初始化需要给定回调和rx周期类
     * 可以额外设置请求设置加载框显示，回调等（可扩展）
     * 设置可查看BaseApi
     */
    public SubjectPostApi() {
        setShowProgress(true);
        setCancel(true);
    }


    public boolean isAll() {
        return all;
    }

    public void setAll(boolean all) {
        this.all = all;
    }

    @Override
    public Observable getObservable(Retrofit retrofit) {
        HttpPostService httpService = retrofit.create(HttpPostService.class);
        return httpService.getAllVedioBy(isAll());
    }

}
