package com.example.cashconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click(View view){
        Log.i("Info","its pressed!");
        EditText moneyEditText = (EditText) findViewById(R.id.moneyEditText);
        Log.i("Info", moneyEditText.getText().toString());
        String amountInRupees =  moneyEditText.getText().toString();
        Double amountInRupeesDouble = Double.parseDouble(amountInRupees);
        Double amountInDollar = amountInRupeesDouble / 73.96;
        String amountInDollarString = String.format("%.3f", amountInDollar);
        Toast.makeText(this, "Rs "+ amountInRupees+" is $ " + amountInDollarString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}