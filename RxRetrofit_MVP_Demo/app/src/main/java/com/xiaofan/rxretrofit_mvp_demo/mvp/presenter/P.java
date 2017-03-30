package com.xiaofan.rxretrofit_mvp_demo.mvp.presenter;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import com.xiaofan.rxretrofit_mvp_demo.mvp.model.M;
import com.xiaofan.rxretrofit_mvp_demo.mvp.model.Mlistener;
import com.xiaofan.rxretrofit_mvp_demo.mvp.ui.Vlistener;
import com.xiaofan.rxretrofitlibrary.api.BaseApi;
import com.xiaofan.rxretrofitlibrary.exception.ApiException;

/**
 * @author: 范建海
 * @createTime: 2017/3/30 10:44
 * @className:  P
 * @description:  presenter两个接口，一个请求一个回调
 *               目的：确保Model层不直接操作View层
 * @changed by:
 */
public class P implements Plistener,PVlistener {

    private Vlistener vlistener;

    private Mlistener mlistener;

    public P(Vlistener vlistener) {
        this.vlistener = vlistener;
        mlistener = new M(this);
    }

    @Override
    public void onNext(String resulte, String mothead) {
        vlistener.onNext(resulte,mothead);
        vlistener.dismissProg();
    }

    @Override
    public void onError(ApiException e) {
        vlistener.onError(e);
        vlistener.dismissProg();
    }

    @Override
    public void startPost(RxAppCompatActivity rxAppCompatActivity, BaseApi baseApi) {
        vlistener.showProg();
        mlistener.startPost(rxAppCompatActivity,baseApi);
    }

    @Override
    public void doTest(String msg) {
        mlistener.testDo(msg);
    }

    @Override
    public void testPSuc(String msg) {
        vlistener.onTestNext(msg);
    }
}
