package com.example.customcontroltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Method1 extends AppCompatActivity {

    private static final String TAG = "Method1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method1);

        Button btn = (Button) findViewById(R.id.btn);
        SubmitButton sbtn = (SubmitButton) findViewById(R.id.sbtn);
        Log.d(TAG, "ok!");
    }
}