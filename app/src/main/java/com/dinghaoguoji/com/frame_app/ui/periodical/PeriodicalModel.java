package com.dinghaoguoji.com.frame_app.ui.periodical;

import com.dinghaoguoji.com.frame_app.app.App;
import com.dinghaoguoji.com.frame_app.config.Urls;
import com.dinghaoguoji.com.frame_app.entity.PeriodicalBean;
import com.dinghaoguoji.com.frame_app.net.Api;
import com.dinghaoguoji.com.frame_app.net.NetHttpCallBack;
import com.dinghaoguoji.com.frame_app.net.RetrofitUtils;
import com.dinghaoguoji.com.frame_app.utils.ToastUtils;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by pc on 2018/3/21.
 */

public class PeriodicalModel implements PeriodicalContract.PeriodicalModel {
    @Override
    public void getPeriodical(String signature, final NetHttpCallBack<PeriodicalBean> netHttpCallBack) {
        RetrofitUtils.newInstence(Urls.BASEURL)
                .create(Api.class)
                .showPeriodical(signature)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Subscriber<PeriodicalBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        ToastUtils.showToast(App.getContext(), e.toString());
                    }

                    @Override
                    public void onNext(PeriodicalBean periodicalBean) {
                        netHttpCallBack.onSuccessful(periodicalBean);
                    }
                });
    }
}
