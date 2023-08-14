package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

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
                Bundle bundle=new Bundle();
                bundle.putString("name",input_name);
                bundle.putInt("age",Integer.parseInt(input_age));
                Intent intent =new Intent(ActivityA.this,ActivityB.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}






