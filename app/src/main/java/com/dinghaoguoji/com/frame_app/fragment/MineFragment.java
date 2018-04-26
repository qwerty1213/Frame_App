package com.dinghaoguoji.com.frame_app.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.dinghaoguoji.com.frame_app.R;
import com.dinghaoguoji.com.frame_app.base.BaseAdapterUtils;
import com.dinghaoguoji.com.frame_app.base.BaseFragment;
import com.dinghaoguoji.com.frame_app.base.ViewHolderHelper;
import com.dinghaoguoji.com.frame_app.entity.MineBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2018/3/9.
 */

public class MineFragment extends BaseFragment {
    private List<MineBean> list;
    private MineBean mineBean;

    @Override
    protected int getLayout() {
        return R.layout.mine_fragment;
    }

    @Override
    protected void initDate() {
        ListView listView = getActivity().findViewById(R.id.lv_minefragment);
        list = new ArrayList<>();
        mineBean = new MineBean();
        mineBean.setName("小机器人");
        mineBean.setImage(R.mipmap.ic_launcher);
        list.add(mineBean);

        mineBean = new MineBean();
        mineBean.setName("小机器人");
        mineBean.setImage(R.mipmap.ic_launcher);
        list.add(mineBean);

        mineBean = new MineBean();
        mineBean.setName("小机器人");
        mineBean.setImage(R.mipmap.ic_launcher);
        list.add(mineBean);

        mineBean = new MineBean();
        mineBean.setName("小机器人");
        mineBean.setImage(R.mipmap.ic_launcher);
        list.add(mineBean);

        mineBean = new MineBean();
        mineBean.setName("小机器人");
        mineBean.setImage(R.mipmap.ic_launcher);
        list.add(mineBean);

        BaseAdapterUtils<MineBean> adapterUtils = new BaseAdapterUtils<MineBean>(getContext(), R.layout.mine_list_item) {
            @Override
            public void bindData(int position, MineBean element, ViewHolderHelper viewHolderHelper) {
                viewHolderHelper.setText(R.id.tv_mine_name, element.getName());
                viewHolderHelper.setImage(R.id.iv_mine_img, element.getImage());
                viewHolderHelper.setOnCliectListener(R.id.iv_mine_img, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getContext(), "我是头像", Toast.LENGTH_LONG).show();
                    }
                });
            }
        };
        adapterUtils.addElements(list);
        listView.setAdapter(adapterUtils);

    }
}
