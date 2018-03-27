package com.battleofsunnygmail.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    String username;
    int correctanswers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        username = getIntent().getExtras().getString("username");
        correctanswers = getIntent().getExtras().getInt("correctanswers");
        TextView result =(TextView)findViewById(R.id.number2);
        TextView conclusion =(TextView)findViewById(R.id.number1);

        if(correctanswers >= 3)
        {
            conclusion.setText("Awesome you cracked it "+username);
            result.setText(correctanswers+" out of 5");
        }
        else
        {
           conclusion.setText("You loose and your score is");
           result.setText(correctanswers+" out of 5");
        }
    }


}
