package com.github.dan4ik95dv.famousartists.ui.widget;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class FragmentViewPager extends android.support.v4.view.ViewPager {

    public FragmentViewPager(Context context) {
        super(context);
    }

    public FragmentViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}

