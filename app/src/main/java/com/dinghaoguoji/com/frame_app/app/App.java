package com.dinghaoguoji.com.frame_app.app;

import android.app.Application;
import android.content.Context;

import com.dinghaoguoji.com.frame_app.base.BaseActivity;


/**
 * Created by pc on 2018/3/9.
 */

public class App extends Application{
    public static BaseActivity context = null;
    @Override
    public void onCreate() {
        super.onCreate();
        //获取Context
        context = (BaseActivity) getApplicationContext();
    }
    public static Context getContext(){
        return context;
    }
}
