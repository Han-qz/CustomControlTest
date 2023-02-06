package com.example.customcontroltest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Method2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method2);

        ItemView iv1 = (ItemView)findViewById(R.id.iv1);
        ItemView iv2 = (ItemView)findViewById(R.id.iv2);
        ItemView iv3 = (ItemView)findViewById(R.id.iv3);

//        iv1.setView("姓名","hann",true);
//        iv2.setView("年龄","null",true);
//        iv3.setView("学校","陕西",false);

        iv1.setOnItemViewClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Method2.this,iv1.getRightText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}