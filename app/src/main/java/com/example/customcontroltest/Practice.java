package com.example.customcontroltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

//案例：滚动渐变顶部条
public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        LinearLayout topBar = (LinearLayout) findViewById(R.id.topBar);
        ScrollChangeHeadView schv = (ScrollChangeHeadView) findViewById(R.id.schv);

        schv.setTopBar(topBar);

        schv.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 100;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                TextView tv = new TextView(Practice.this);
                tv.setText("+" + i);
                return tv;
            }
        });
    }
}