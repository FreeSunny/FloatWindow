package com.example.yhao.floatwindow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.yhao.fixedfloatwindow.R;
import com.yhao.floatwindow.FloatWindow;

public class A_Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("A");

        FloatWindow.get().show();
    }

    public void change(View view) {
        startActivity(new Intent(this, B_Activity.class));
    }
}
