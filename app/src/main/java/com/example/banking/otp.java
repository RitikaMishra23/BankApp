package com.example.banking;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class otp extends AppCompatActivity {
    TextView countdownTimer;
    CountDownTimer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pages);
        countdownTimer = findViewById(R.id.countdown_timer);
        timer = new CountDownTimer(30000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long min = ((millisUntilFinished/1000)%3600)/60;
                long sec = (millisUntilFinished/1000) % 60;
                String timeformat = String.format(Locale.getDefault(),"%02d:%02d",min,sec);
                countdownTimer.setText(timeformat);
            }

            @Override
            public void onFinish() {
                countdownTimer.setText("00:00");
                Toast.makeText(otp.this,"Enter OTP",Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
    public void verify(View v){
        Toast.makeText(this,"Verification Successful",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}