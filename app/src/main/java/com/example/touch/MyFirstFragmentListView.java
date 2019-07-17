package com.example.touch;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/17
 *@Time:21:44
 *@Description:作用:
 * */
public class MyFirstFragmentListView extends ListView {

    public MyFirstFragmentListView(Context context) {

        super(context);

    }



    public MyFirstFragmentListView(Context context, AttributeSet attrs) {

        super(context, attrs);

    }



    @Override

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2,MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }

}
