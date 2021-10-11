package com.tugcearas.countdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textView);

        new CountDownTimer(10000,1000){


            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long millisUntilFinished) {
                    textview.setText("Left : " + millisUntilFinished/1000);
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFinish() {

                Toast.makeText(getApplicationContext(),"Done!",Toast.LENGTH_LONG).show();
                textview.setText("Finished!");
            }

        }.start();

    }
}