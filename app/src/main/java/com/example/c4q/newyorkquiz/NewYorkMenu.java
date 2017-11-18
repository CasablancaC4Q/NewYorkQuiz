package com.example.c4q.newyorkquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by c4q on 11/18/17.
 */

public class NewYorkMenu extends AppCompatActivity {
    // create instance
    private TextView choiceText;
    private Button newYorkPics;
    private Button newYorkQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newyorkmenu);

        choiceText = (TextView)findViewById(R.id.welcome);
        newYorkPics = (Button)findViewById(R.id.newyork_pics);
        newYorkQuiz = (Button)findViewById(R.id.newyork_quiz);

        choiceText.setText("Welcome To The NY Quiz");

    }

    // start new activitys based on button click
    public void onButtonClick(){

        newYorkPics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewYorkMenu.this, NewYorkPics.class);
                startActivity(intent);
            }
        });

        newYorkQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewYorkMenu.this, NewYorkQuiz.class);
                startActivity(intent);
            }
        });

    }
}
