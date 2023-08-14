package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] months= {
                "January","February","March","April","May","June","July","August","September","October","November","December"
        };

        this.listView = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,R.layout.listitem,months);
        listView.setAdapter(adapter);
    }
}