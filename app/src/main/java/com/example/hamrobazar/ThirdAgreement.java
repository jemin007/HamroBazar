package com.example.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ThirdAgreement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_agreement);

        getSupportActionBar().setTitle("Rules for Posting Ad");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
