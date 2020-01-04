package com.example.hamrobazar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class AgreementActivity extends AppCompatActivity {

    CheckBox checkOne, checkTwo, checkThree;
    Button btnAgree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        getSupportActionBar().hide();

        checkOne = findViewById(R.id.checkFirst);
        checkTwo = findViewById(R.id.checkSecond);
        checkThree= findViewById(R.id.checkThird);

        btnAgree= findViewById(R.id.btnAgreement);

        checkOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent firstAgreement = new Intent(AgreementActivity.this,FirstAgreement.class);
                startActivity(firstAgreement);

            }
        });

        checkTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondAgreement = new Intent(AgreementActivity.this,SecondAgreement.class);
                startActivity(secondAgreement);
            }
        });

        checkThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thirdAgreement = new Intent(AgreementActivity.this, ThirdAgreement.class);
                startActivity(thirdAgreement);
            }
        });
    }
}
