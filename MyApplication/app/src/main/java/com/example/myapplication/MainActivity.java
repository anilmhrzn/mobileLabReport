package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.GridView;
public class MainActivity extends AppCompatActivity {

    public List<ContactItem> contactItemList = new ArrayList<>();
    public RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = findViewById(R.id.recyclerView);
        for (int i = 1;i<=10;i++){
            String iVal = Integer.toString(i);
            this.contactItemList.add(new
                    ContactItem("xyz person"+iVal,"xyz address"+iVal,"98236737"+iVal,20+i));
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        PersonAdapter adapter = new PersonAdapter(contactItemList);
        recyclerView.setAdapter(adapter);
    }
}