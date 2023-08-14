package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ActivityB extends AppCompatActivity {
    private TextView intentResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        this.intentResult = findViewById(R.id.intentResult);
        Intent intent = getIntent();
        if(intent !=null){
            ArrayList<Student> studentList = (ArrayList<Student>)
                    intent.getSerializableExtra("studentData");
            if(studentList!=null){
                StringBuilder builder = new StringBuilder();
                for(Student student : studentList){
                    builder.append("name: "+student.getName()+"/n Age: "+ student.getAge());
                }
                this.intentResult.setText(builder.toString());
            }else{
                this.intentResult.setText("no data found from modal array class");
            }
        }else{
            this.intentResult.setText("no data found from intent");
        }
    }
}