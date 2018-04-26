package com.dinghaoguoji.com.frame_app.ui.periodical;

import com.dinghaoguoji.com.frame_app.entity.PeriodicalBean;
import com.dinghaoguoji.com.frame_app.fragment.PatentFragment;
import com.dinghaoguoji.com.frame_app.net.NetHttpCallBack;
import com.dinghaoguoji.com.frame_app.utils.PostUtil;

/**
 * Created by pc on 2018/3/21.
 */

public class PeriodicalPresenter implements PeriodicalContract.PeriodicalPresenter {
    private PeriodicalContract.PeriodicalView periodicalView;
    private PeriodicalContract.PeriodicalModel periodicalModel;

    public PeriodicalPresenter(PatentFragment patentFragment) {
        periodicalView = (PeriodicalContract.PeriodicalView) patentFragment;
        periodicalModel = new PeriodicalModel();
    }

    @Override
    public void getPeriodical() {
        String signature = PostUtil.getSignature("");
        periodicalModel.getPeriodical(signature, new NetHttpCallBack<PeriodicalBean>() {
            @Override
            public void onSuccessful(PeriodicalBean periodicalBean) {
                int status = periodicalBean.getStatus();
                if (status == 200) {
                    periodicalView.showPeriodical(periodicalBean);
                }
            }

            @Override
            public void onFaild(String errorMsg) {

            }
        });
    }
}
