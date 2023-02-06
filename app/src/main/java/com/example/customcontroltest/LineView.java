package com.example.customcontroltest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

//方法3:继承根View（一些特殊的样式，继承已有控件和布局都无法实现）
public class LineView extends View {
    public LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint();
        p.setColor(Color.RED);

        int xPoint = 200;
        int yPoint = 600;

        //Y轴
        canvas.drawLine(xPoint,100, xPoint, yPoint, p);
        //X轴
        canvas.drawLine(xPoint, yPoint, xPoint + 500, yPoint, p);
        //第一条线;
        int xStart1 = xPoint;
        int yStart1 = yPoint;
        int xEnd1 = xStart1 + 100;
        int yEnd1 = yStart1 - 200;
        canvas.drawLine(xStart1, yStart1, xEnd1, yEnd1, p);
        //第二条线
        int xStart2 = xEnd1;
        int yStart2 = yEnd1;
        int xEnd2 = xStart2 + 100;
        int yEnd2 = yStart2 + 100;
        canvas.drawLine(xStart2, yStart2, xEnd2, yEnd2, p);
        //第三条线
        int xStart3 = xEnd2;
        int yStart3 = yEnd2;
        int xEnd3 = xStart3 + 100;
        int yEnd3 = yStart3 - 300;
        canvas.drawLine(xStart3, yStart3, xEnd3, yEnd3, p);
    }
}
