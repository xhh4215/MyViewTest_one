package com.example.xiaoheihei;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

/**
 * Created by xhh on 2017/10/9.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton {
    public MyButton(Context context) {
       this(context,null);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs,0);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

    }
}
