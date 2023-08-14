package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class ActivityA extends AppCompatActivity {
    Button nextActivity;
    TextInputEditText name ;
    TextInputEditText age;
    String input_name;
    String input_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
//        getSupportActionBar().hide();
        nextActivity=findViewById(R.id.nextActivity);
        name=findViewById(R.id.name);

        age=findViewById(R.id.age);



        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_name=name.getText().toString();
                input_age=age.getText().toString();
                ArrayList<Student> studentList = new ArrayList<>();
                studentList.add(new Student(input_name,Integer.parseInt(input_age)));
                Intent intent =new Intent(ActivityA.this,ActivityB.class);
                startActivity(intent);

            }
        });
    }
}






