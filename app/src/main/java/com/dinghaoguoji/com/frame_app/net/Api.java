package com.dinghaoguoji.com.frame_app.net;


import com.dinghaoguoji.com.frame_app.entity.PeriodicalBean;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import rx.Observable;

/**
 * Created by xingge on 2017/8/15.
 */

public interface Api {

    //投稿列表
    @FormUrlEncoded
    @POST("home_periodical_list")
    Observable<PeriodicalBean> showPeriodical(@Field("signature") String signature);
}
