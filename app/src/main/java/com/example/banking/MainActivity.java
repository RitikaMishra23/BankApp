package com.example.banking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Intent i = new Intent(this,register.class);
        startActivity(i);

    }
    public void Login(View v){
        Intent i = new Intent(this,content.class);
        startActivity(i);
    }
}