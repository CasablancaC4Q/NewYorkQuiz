package com.example.c4q.newyorkquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textview = (TextView)findViewById(R.id.welcome);
        textview.setText("Welcome To The NY Quiz");

    }

    public void onSplashActivityClick(){
        Intent intent = new Intent(SplashActivity.this, NewYorkMenu.class);
        startActivity(intent);
    }


}
