package com.example.customcontroltest;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

//方法2:继承布局（单独控件不好实现，由多个已有控件实现）
//eg:自定义Item控件（左边title，右边内容text，右边箭头，整体点击效果）
public class ItemView extends RelativeLayout {

    private TextView tv_left;
    private TextView tv_right;
    private ImageView iv_right;
    private RelativeLayout r1;

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //布局文件
        LayoutInflater.from(context).inflate(R.layout.item_layout,this);


        r1 = (RelativeLayout) findViewById(R.id.r1);
        tv_left = (TextView) findViewById(R.id.tv_left);
        tv_right = (TextView) findViewById(R.id.tv_right);
        iv_right = (ImageView) findViewById(R.id.iv_right);

        //自定义属性：1、attrs.xml中添加属性；2、绑定属性；3、xml中使用
        //绑定attrs中的值
        TypedArray a = context.obtainStyledAttributes(attrs,R.styleable.ItemView);
        String leftText = a.getString(R.styleable.ItemView_leftText);
        String rightText = a.getString(R.styleable.ItemView_rightText);
        Boolean showArrow = a.getBoolean(R.styleable.ItemView_showArrow,true);

        setView(leftText,rightText,showArrow);

        a.recycle();
    }

    //左边内容tvLeftStr
    //右边内容tvRightStr
    //是否显示小箭头isShowArrow
    public void setView(String tvLeftStr, String tvRightStr,boolean isShowArrow){

        if (tvLeftStr != null) {
            tv_left.setText(tvLeftStr);
        }

        if (tvRightStr != null) {
            tv_right.setText(tvRightStr);
        }

        if (isShowArrow) {
            iv_right.setVisibility(View.VISIBLE);
        }else {
            iv_right.setVisibility(View.GONE);
        }
    }

    //1、设置Item点击事件
    public void setOnItemViewClickListener(OnClickListener l) {
        r1.setOnClickListener(l);
    }
    //2、获取左边内容
    public String getLeftText(){
        return tv_left.getText().toString();
    }
    //3、获取右边内容
    public String getRightText(){
        return tv_right.getText().toString();
    }

}
