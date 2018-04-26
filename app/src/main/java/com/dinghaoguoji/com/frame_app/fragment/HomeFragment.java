package com.dinghaoguoji.com.frame_app.fragment;

import android.widget.ListView;

import com.dinghaoguoji.com.frame_app.R;
import com.dinghaoguoji.com.frame_app.base.BaseAdapterUtils;
import com.dinghaoguoji.com.frame_app.base.BaseFragment;
import com.dinghaoguoji.com.frame_app.base.ViewHolderHelper;
import com.dinghaoguoji.com.frame_app.entity.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2018/3/9.
 */

public class HomeFragment extends BaseFragment{

    private ListView listView;
    private UserBean userBean;

    @Override
    protected int getLayout() {
        return R.layout.home_fragment;
    }

    @Override
    protected void initDate() {
        listView = getActivity().findViewById(R.id.lv_homefragment);
        List<UserBean> list = new ArrayList<>();
        userBean = new UserBean();
        userBean.setName("东方霸道");
        userBean.setAge(30000);
        list.add(userBean);

        userBean = new UserBean();
        userBean.setName("西门吹雪");
        userBean.setAge(256);
        list.add(userBean);

        userBean = new UserBean();
        userBean.setName("第五惆怅");
        userBean.setAge(98700);
        list.add(userBean);

        userBean = new UserBean();
        userBean.setName("诸葛逍遥");
        userBean.setAge(123000);
        list.add(userBean);

        BaseAdapterUtils<UserBean> adapterUtils = new BaseAdapterUtils<UserBean>(getContext(),R.layout.home_list_item) {
            @Override
            public void bindData(int position, UserBean element, ViewHolderHelper viewHolderHelper) {
                viewHolderHelper.setText(R.id.tv_home_name,element.getName());
                viewHolderHelper.setText(R.id.tv_home_age,String.valueOf(element.getAge()));
            }
        };
        adapterUtils.addElements(list);
        listView.setAdapter(adapterUtils);
    }
}
