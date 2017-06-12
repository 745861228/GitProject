package com.like.gitprojectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button textView = new Button(this);
        textView.setText("45" +
                "57" +
                "57");

        TextView textView1 = new TextView(this);
    }
}
