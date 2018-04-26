package com.dinghaoguoji.com.frame_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.dinghaoguoji.com.frame_app.R;
import com.dinghaoguoji.com.frame_app.base.BaseAdapterUtils;
import com.dinghaoguoji.com.frame_app.base.BaseFragment;
import com.dinghaoguoji.com.frame_app.base.ViewHolderHelper;
import com.dinghaoguoji.com.frame_app.config.Urls;
import com.dinghaoguoji.com.frame_app.entity.PeriodicalBean;
import com.dinghaoguoji.com.frame_app.ui.periodical.PeriodicalContract;
import com.dinghaoguoji.com.frame_app.ui.periodical.PeriodicalPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by pc on 2018/3/9.
 */

public class PatentFragment extends BaseFragment implements PeriodicalContract.PeriodicalView {
    @BindView(R.id.lv_patentfragment)
    ListView lvPatentfragment;
    Unbinder unbinder;
    private PeriodicalPresenter periodicalPresenter;
    private List<PeriodicalBean.DatasBean> list;
    private BaseAdapterUtils<PeriodicalBean.DatasBean> adapterUtils;

    @Override
    protected int getLayout() {
        return R.layout.patent_fragment;
    }

    @Override
    protected void initDate() {
        list = new ArrayList<PeriodicalBean.DatasBean>();
        periodicalPresenter = new PeriodicalPresenter(this);
        periodicalPresenter.getPeriodical();

        adapterUtils = new BaseAdapterUtils<PeriodicalBean.DatasBean>(getContext(), R.layout.patent_list_item) {
            @Override
            public void bindData(int position, PeriodicalBean.DatasBean element, ViewHolderHelper viewHolderHelper) {
                viewHolderHelper.setText(R.id.tv_patent_title,element.getTitle());
                viewHolderHelper.setText(R.id.tv_patent_id,String.valueOf(element.getId()));
                viewHolderHelper.loadImage(R.id.iv_patent_thumb, Urls.IMGURL+element.getThumb());
            }
        };
    }

    @Override
    public void showPeriodical(PeriodicalBean periodicalBean) {
        list.addAll(periodicalBean.getDatas());
        adapterUtils.addElements(list);
        lvPatentfragment.setAdapter(adapterUtils);

    }
}
