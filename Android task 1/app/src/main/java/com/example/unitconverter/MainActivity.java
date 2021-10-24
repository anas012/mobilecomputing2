package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
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
    public void btnclick(View view)
    {
        EditText gold=findViewById(R.id.editText1);
        EditText silver=findViewById(R.id.editText2);
        EditText cash=findViewById(R.id.editText3);
        EditText otheramt=findViewById(R.id.editText4);
        String strgold=gold.getText().toString();
        Double doublegold=Double.parseDouble(strgold);
        String strsilver=silver.getText().toString();
        Double doublesilver=Double.parseDouble(strsilver);
        String strcash=cash.getText().toString();
        Double doublecash=Double.parseDouble(strcash);
        String strotheramt=otheramt.getText().toString();
        Double doubleotheramt=Double.parseDouble(strotheramt);

        Double sum=doublesilver+doublegold+doublecash+doubleotheramt;

        if(gold.equals("")&&silver.equals("")&&cash.equals("")&&otheramt.equals(""))
        {
            Toast.makeText(this,"Please enter the values",Toast.LENGTH_SHORT).show();
        }
        else {
            Double zakat = sum * 0.025;
            String toasttext = "Your amount of zakat is " + zakat.toString() +" "+ "Rs";
            Toast.makeText(this, toasttext, Toast.LENGTH_SHORT).show();
        }


    }
}