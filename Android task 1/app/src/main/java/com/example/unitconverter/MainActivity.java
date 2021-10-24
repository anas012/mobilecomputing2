package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner myspiner1 = findViewById(R.id.spineer1);
        ArrayAdapter<String>myadpter=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.unitnames1));
    myadpter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    myspiner1.setAdapter(myadpter);


        Spinner myspiner2 = findViewById(R.id.spineer2);
        ArrayAdapter<String>myadpter2=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.unitnames2));
        myadpter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspiner2.setAdapter(myadpter2);
    }
}