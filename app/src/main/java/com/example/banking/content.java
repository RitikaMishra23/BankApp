package com.example.banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
    }
    public void displaypiechart(View v){
        Intent i = new Intent(this,piechart.class);
        startActivity(i);
    }
    public void MiniStatement(View v){
        Intent i = new Intent(this,ministatement.class);
        startActivity(i);
    }
    public void receiveMoney(View v){
        Intent i = new Intent(this,myqr.class);
        startActivity(i);
    }

    public void sendMoney(View v){
        Intent i = new Intent(this,scanner.class);
        startActivity(i);
    }

}