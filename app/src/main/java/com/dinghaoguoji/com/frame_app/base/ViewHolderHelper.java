package com.dinghaoguoji.com.frame_app.base;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dinghaoguoji.com.frame_app.app.App;
import com.dinghaoguoji.com.frame_app.net.Api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pc on 2018/3/19.
 */

public class ViewHolderHelper {
    private final Context context;
    private LayoutInflater inflater;
    private View convertView;
    private int layoutId;
    private Map<Integer, View> viewMap;

    public ViewHolderHelper(Context context, LayoutInflater inflater, int layoutId) {
        this.context = context;
        this.inflater = inflater;
        this.layoutId = layoutId;
        this.viewMap = new HashMap<Integer, View>();
    }

    public View loadconvertView(ViewGroup parent, boolean attachToRoot) {
        if (convertView == null) {
            convertView = inflater.inflate(layoutId, parent, attachToRoot);
        }
        return convertView;
    }

    //方法泛型  获取View
    public <T extends View> T getView(int viewId) {
        View view = viewMap.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            viewMap.put(viewId, view);
        }
        return (T) view;
    }

    //加载TextView
    public void setText(int viewId, String text) {
        TextView textView = getView(viewId);
        textView.setText(text);
    }

    //加载本地图片
    public void setImage(int viewId, int image) {
        ImageView imageView = getView(viewId);
        imageView.setImageResource(image);
    }

    public void setOnCliectListener(int viewId, View.OnClickListener onClickListener) {
        getView(viewId).setOnClickListener(onClickListener);
    }

    //加载网络图片
    public void loadImage(int viewId, String url) {
        ImageView imageView = getView(viewId);
        Glide.with(App.getContext()).load(url).into(imageView);
    }
}
