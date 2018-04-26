package com.dinghaoguoji.com.frame_app.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2018/3/16.
 */

public abstract class BaseAdapterUtils<E> extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private List<E> list;
    private int layoutId;

    public BaseAdapterUtils(Context context,int layoutId) {
        inflater = LayoutInflater.from(context);
        list = new ArrayList<E>();
        this.layoutId = layoutId;
    }

    public LayoutInflater getInflater() {
        return inflater;
    }

    public void setInflater(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    /**
     * 添加元素 --- 一个
     *
     * @param data
     */
    public void addElement(E data) {
        list.add(data);
    }

    /**
     * 添加元素 ---多个
     *
     * @param datas
     */
    public void addElements(List<E> datas) {
        list.addAll(datas);
    }

    /**
     * 移除元素 ---一个
     *
     * @param data
     */
    public void removeElement(E data) {
        list.remove(data);
    }

    /**
     * 移除元素 --- 多个
     *
     * @param datas
     */
    public void removeElements(List<E> datas) {
        for (E data : datas) {
            list.remove(data);
        }
    }

    /**
     * 移除所有元素
     *
     * @param datas
     */
    public void removeAllElement(List<E> datas) {
        list.clear();
    }

    @Override
    public E getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderHelper viewHolderHelper = null;
        if (convertView == null){
            viewHolderHelper = new ViewHolderHelper(context,inflater,layoutId);
            convertView = viewHolderHelper.loadconvertView(parent,false);
            convertView.setTag(viewHolderHelper);
        }else{
            viewHolderHelper = (ViewHolderHelper) convertView.getTag();
        }
        E element = getItem(position);
        bindData(position,element,viewHolderHelper);
        return convertView;
    }
    public abstract void bindData(int position,E element,ViewHolderHelper viewHolderHelper);
}
