package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void btnclick(View View)
    {
        EditText gold=findViewById(R.id.editText1);
        EditText silver=findViewById(R.id.editText2);
        EditText cash=findViewById(R.id.editText3);
        EditText otheramt=findViewById(R.id.editText4);
        String strgold=gold.getText().toString();
        Double doublegold=Double.parseDouble(strgold);
        String strsilver=gold.getText().toString();
        Double doublesilver=Double.parseDouble(strsilver);
        String strcash=cash.getText().toString();
        Double doublecash=Double.parseDouble(strcash);
        String strotheramt=otheramt.getText().toString();
        Double doubleotheramt=Double.parseDouble(strotheramt);


    }
}