package com.xiaofan.rxretrofit_mvp_demo.entity.resulte;

import java.util.List;

/**
 * @author: 范建海
 * @createTime: 2017/3/30 11:15
 * @className:  RetrofitEntity
 * @description: 直接请求返回数据格式
 * @changed by:
 */
public class RetrofitEntity {
    private int ret;
    private String msg;
    private List<SubjectResulte> data;

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<SubjectResulte> getData() {
        return data;
    }

    public void setData(List<SubjectResulte> data) {
        this.data = data;
    }
}
