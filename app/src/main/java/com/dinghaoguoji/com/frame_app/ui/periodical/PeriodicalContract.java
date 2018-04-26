package com.dinghaoguoji.com.frame_app.ui.periodical;

import com.dinghaoguoji.com.frame_app.entity.PeriodicalBean;
import com.dinghaoguoji.com.frame_app.net.NetHttpCallBack;
import com.dinghaoguoji.com.frame_app.utils.PostUtil;

import java.util.List;

/**
 * Created by pc on 2018/3/21.
 */

public interface PeriodicalContract {

    interface PeriodicalView {
        void showPeriodical(PeriodicalBean periodicalBean);
    }

    interface PeriodicalPresenter {
        void getPeriodical();
    }

    interface PeriodicalModel {
        void getPeriodical(String signature, NetHttpCallBack<PeriodicalBean> netHttpCallBack);
    }
}
