package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.class_schedule);

        ArrayList<String> array = new ArrayList<String>();

        array.add("CSCI 310");
        array.add("CSCI 320");
        array.add("CSCI 380");
        array.add("CSCI 230");
        array.add("CSCI 250");
        array.add("CSCI 221");
        array.add("CSCI 220");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,array);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "You Clicked Something", Toast.LENGTH_SHORT).show();
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "You Long-Pressed Something", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }
}
