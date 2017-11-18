package com.example.c4q.newyorkquiz;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by c4q on 11/18/17.
 */

public class NewYorkPics  extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       txt = (TextView)findViewById(R.id.txt);
       txt.setText("Welcome To The NY Quiz");

    }
}
