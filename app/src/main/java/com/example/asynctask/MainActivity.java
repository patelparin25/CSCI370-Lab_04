package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView lview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lview = findViewById(R.id.student);
        StudentAsyncTask asyncTasking = new StudentAsyncTask(getApplicationContext(), lview);
        asyncTasking.execute();
    }
}