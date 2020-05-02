package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class start extends AppCompatActivity {

    Intent intent;
    TextView getstarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);

        getstarted = (TextView)findViewById(R.id.start);
        intent = new Intent(start.this,login.class);

        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                //do  nothing
            }

            public void onFinish() {
                getstarted.setVisibility(View.VISIBLE);
            }
        }.start();

        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}
