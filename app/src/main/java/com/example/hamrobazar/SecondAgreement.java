package com.example.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondAgreement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_agreement);

        getSupportActionBar().setTitle("Safety Tips for Transcation");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
