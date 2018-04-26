package com.dinghaoguoji.com.frame_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioButton;

import com.dinghaoguoji.com.frame_app.base.BaseActivity;
import com.dinghaoguoji.com.frame_app.fragment.HomeFragment;
import com.dinghaoguoji.com.frame_app.fragment.MineFragment;
import com.dinghaoguoji.com.frame_app.fragment.PatentFragment;
import com.dinghaoguoji.com.frame_app.fragment.PeriodicalFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.fl_framelayout)
    FrameLayout framelayout;
    @BindView(R.id.rb_home)
    RadioButton rbhome;
    @BindView(R.id.rb_periodeical)
    RadioButton rbperiodical;
    @BindView(R.id.rb_patent)
    RadioButton rbpatent;
    @BindView(R.id.rb_mine)
    RadioButton rbmine;


    private FragmentManager fragmentManager;
    private Fragment currentFragment = new Fragment();
    private PeriodicalFragment periodicalFragment;
    private HomeFragment homeFragment;
    private PatentFragment patentFragment;
    private MineFragment mineFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    public void init() {
        homeFragment = new HomeFragment();
        periodicalFragment = new PeriodicalFragment();
        patentFragment = new PatentFragment();
        mineFragment = new MineFragment();

        showFragment(homeFragment);
        rbhome.setTextColor(getResources().getColor(R.color.activity_rbbutton_text_color));

    }


    @OnClick({R.id.rb_home, R.id.rb_periodeical, R.id.rb_patent, R.id.rb_mine})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rb_home:
                showFragment(homeFragment);
                clearText();
                rbhome.setTextColor(getResources().getColor(R.color.activity_rbbutton_text_color));
                break;
            case R.id.rb_periodeical:
                showFragment(periodicalFragment);
                clearText();
                rbperiodical.setTextColor(getResources().getColor(R.color.activity_rbbutton_text_color));
                break;
            case R.id.rb_patent:
                showFragment(patentFragment);
                clearText();
                rbpatent.setTextColor(getResources().getColor(R.color.activity_rbbutton_text_color));
                break;
            case R.id.rb_mine:
                showFragment(mineFragment);
                clearText();
                rbmine.setTextColor(getResources().getColor(R.color.activity_rbbutton_text_color));
                break;
        }
    }

    private void showFragment(Fragment fragment) {
        fragmentManager = getSupportFragmentManager();
        if (currentFragment != fragment) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.hide(currentFragment);
            currentFragment = fragment;
            if (!fragment.isAdded()) {
                transaction.add(R.id.fl_framelayout, fragment).show(fragment).commit();
            } else {
                transaction.show(fragment).commit();
            }
        }
    }
    public void clearText(){
        rbhome.setTextColor(getResources().getColor(R.color.app_text_color));
        rbperiodical.setTextColor(getResources().getColor(R.color.app_text_color));
        rbpatent.setTextColor(getResources().getColor(R.color.app_text_color));
        rbmine.setTextColor(getResources().getColor(R.color.app_text_color));
    }

}
