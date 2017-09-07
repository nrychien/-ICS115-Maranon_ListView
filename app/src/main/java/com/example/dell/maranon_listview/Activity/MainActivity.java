package com.example.dell.maranon_listview.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.dell.maranon_listview.R;

public class MainActivity extends AppCompatActivity {
    String[] colleges;
    ListView lv_colleges;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colleges = getResources().getStringArray(R.array.Colleges);
        lv_colleges  = (ListView) findViewById(R.id.listCollege);
        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        lv_colleges.setAdapter(adapter);
        lv_colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "Ya clicked " + colleges[i];
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
