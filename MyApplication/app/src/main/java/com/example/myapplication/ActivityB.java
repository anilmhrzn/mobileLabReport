package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {
    private TextView intentResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        this.intentResult = findViewById(R.id.intentResult);
        Intent intent = getIntent();
        if(intent!= null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String name = bundle.getString("name");
                String age = Integer.toString(bundle.getInt("age"));
                this.intentResult.setText("name:- " + name + "\n" + "age:- " + age);
            } else {
                this.intentResult.setText("no data found from bundle");
            }
        }else{
            this.intentResult.setText("no data found from intent");
        }
    }
}