package com.xiaofan.rxretrofit_mvp_demo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @author: 范建海
 * @createTime: 2017/3/30 11:06
 * @className:  HttpPostService
 * @description: 测试接口service-post相关
 * @changed by:
 */
public interface HttpPostService {

    @FormUrlEncoded
    @POST("AppFiftyToneGraph/videoLink")
    Observable<String> getAllVedioBy(@Field("once_no") boolean once_no);

}
