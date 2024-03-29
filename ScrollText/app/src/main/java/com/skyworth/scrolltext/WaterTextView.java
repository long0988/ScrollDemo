package com.skyworth.scrolltext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class WaterTextView extends TextView {
    public WaterTextView(Context context) {
        super(context);
    }

    public WaterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public WaterTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean isFocused() {
        return true;
    }
}
