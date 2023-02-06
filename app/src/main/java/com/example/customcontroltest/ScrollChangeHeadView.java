package com.example.customcontroltest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

//案例：滚动渐变顶部条
//1、拿到ListView滚动事件
//2、拿到高度变化
//3、根据高度变化，设置顶部条的背景
public class ScrollChangeHeadView extends ListView {

    private View viewHead;
    private View topBar;

    public ScrollChangeHeadView(Context context, AttributeSet attrs) {
        super(context, attrs);

        viewHead = LayoutInflater.from(context).inflate(R.layout.scroll_change_head, null);
        addHeaderView(viewHead);


        //滚动事件
        setOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }

            @Override
            public void onScroll(AbsListView absListView, int i, int i1, int i2) {
                if(topBar != null){
                    //滚动中。一旦滚动，这里就会被调用
                    int headTop = viewHead.getTop();
                    headTop = Math.abs(headTop);

                    //0-255,0是全透明，255是不透明
                    topBar.getBackground().setAlpha(headTop / 5 * (255 / 200));
                }
            }
        });
    }

    public void setTopBar(View view){
        topBar = view;
    }
}
