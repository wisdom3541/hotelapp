package com.example.hotelapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    Button login,sign;
    Intent intent;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        sign = (Button) findViewById(R.id.button);
        login = (Button) findViewById(R.id.button2);
        intent = new Intent(this, deals.class);


    }
        public void onClickedsignup(View view) {
            startActivity(intent);
        }

    public void onClickedlogin(View view) {
        startActivity(intent);
    }
}