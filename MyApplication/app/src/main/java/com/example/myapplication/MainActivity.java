package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.GridView;
public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView;
        String[] num = {
                "i","ii","iii","iv","v","vi","vii","viii"
                ,"ix","x","xi","xii","xiii","xiv","xv","xi","xvii",
                "xviii","xix","xx"
        };
        gridView = findViewById(R.id.gridView);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this,R.layout.grid_item,num);
        gridView.setAdapter(adapter);
    }
}