package com.xiaofan.rxretrofit_mvp_demo.mvp.model;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.xiaofan.rxretrofit_mvp_demo.mvp.presenter.PVlistener;
import com.xiaofan.rxretrofitlibrary.api.BaseApi;
import com.xiaofan.rxretrofitlibrary.exception.ApiException;
import com.xiaofan.rxretrofitlibrary.http.HttpManager;
import com.xiaofan.rxretrofitlibrary.listener.HttpOnNextListener;

/**
 * @author: 范建海
 * @createTime: 2017/3/30 10:55
 * @className:  M
 * @description:  m层数据处理
 * @changed by:
 */
public class M implements Mlistener,HttpOnNextListener {

    private PVlistener pVlistener;

    public M(PVlistener pVlistener) {
        this.pVlistener = pVlistener;
    }

    @Override
    public void startPost(RxAppCompatActivity rxAppCompatActivity, BaseApi baseApi) {
        HttpManager manager = new HttpManager(this, rxAppCompatActivity);
        manager.doHttpDeal(baseApi);
    }

    @Override
    public void testDo(String s) {
        String msg = "Fan : " + s;
        pVlistener.testPSuc(msg);
    }

    @Override
    public void onNext(String resulte, String mothead) {
        pVlistener.onNext(resulte, mothead);
    }

    @Override
    public void onError(ApiException e) {
        pVlistener.onError(e);
    }
}
