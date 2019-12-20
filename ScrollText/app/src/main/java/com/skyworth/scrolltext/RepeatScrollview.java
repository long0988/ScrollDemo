package com.skyworth.scrolltext;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;

public class RepeatScrollview extends ScrollView {
    private int maxHeight;
    private int mDistance = 0;
    private int step = 100;
    private Handler mHandler = new Handler();
    private int mTime;
    private int totalTime = 3;
    private TextView mTv;
    private int mDifferVaule;

    public RepeatScrollview(Context context) {
        this(context, null);
    }

    public RepeatScrollview(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RepeatScrollview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mTv = new TextView(context);
        addView(mTv);
    }

    public void setContextText(String text) {
        mTv.setText(text);
        mTv.post(new Runnable() {
            @Override
            public void run() {
                maxHeight = mTv.getMeasuredHeight();
                startScroll();
            }
        });
    }

    private void startScroll() {
        if (maxHeight > getHeight()) {
            mHandler.postDelayed(handerRun, 1000);
            mDifferVaule=maxHeight-getHeight();
            step = mDifferVaule/ totalTime;

            mTime = totalTime * 1000;
        }
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    //设置字体大小
    public void setFontSize(int size) {
        mTv.setTextSize(size);
    }

    //设置颜色
    public void setTextColor(int color) {
        mTv.setTextColor(getResources().getColor(color));
    }

    public int getScroViewHeight() {
        return getHeight();
    }

    //设置重复时间
    public void setRepeatTieme(int totaltime) {
        this.totalTime = totaltime;
    }

    public Runnable handerRun = new Runnable() {
        @Override
        public void run() {
            mDistance += step;
            if (mDistance >= mDifferVaule) {
                mDistance = 0;
            }
            smoothScrollTo(0, mDistance);
            mHandler.postDelayed(this, mTime / totalTime);
        }
    };

    public void close() {
        if (mHandler != null) {
            mHandler.removeCallbacks(handerRun);
            mHandler = null;
        }
    }
}
