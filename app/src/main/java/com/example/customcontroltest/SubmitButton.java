package com.example.customcontroltest;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;

//方法1：继承已有控件（和已有控件很相似，多出部分功能）
//自定义控件的时候会发现Android studio提示Button已被AppCompatButton取代.
//AppCompatButton继承自Button，新增加了对动态的背景颜色等功能的支持.

//eg1:自定义提交按钮(改变文字内容、背景图片和点击效果)
public class SubmitButton extends AppCompatButton {
    //构造函数
    public SubmitButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    //给button设置样式
    private void init(){
        //设置背景
        setBackgroundResource(R.drawable.btn_submit);
        //设置文字
        setText("提交");
        //设置文字大小
        setTextSize(18);
    }
}
