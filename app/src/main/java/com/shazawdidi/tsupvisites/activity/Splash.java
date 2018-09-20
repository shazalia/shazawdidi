package com.shazawdidi.tsupvisites.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.shazawdidi.tsupvisites.R;

public class Splash extends AppCompatActivity {

    private Intent myintent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_splash);
        myintent = new Intent(this, MainActivity.class);
        new Handler().postDelayed( new Runnable(){
            @Override
            public void run() {
                startActivity(myintent);
                finish();
            }
        }, 1000);
    }
}
