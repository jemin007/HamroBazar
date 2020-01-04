package com.example.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FirstAgreement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_agreement);

        getSupportActionBar().setTitle("Terms & Condition for Use");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
