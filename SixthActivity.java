package com.battleofsunnygmail.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {

    String username;
    int correctanswers;
    EditText answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        correctanswers = getIntent().getExtras().getInt("correctanswers");
        username = getIntent().getExtras().getString("username");
        answer = (EditText) findViewById(R.id.answer);
    }

    public void wow(View view) {
        String b = new String();
        b = answer.getText().toString();
        if (b.matches("")) {
            Toast.makeText(getBaseContext(), "Please write something", Toast.LENGTH_SHORT).show();
        } else if (b.matches("6")) {
            Intent intent5 = new Intent(SixthActivity.this, ResultActivity.class);
            intent5.putExtra("correctanswers", (correctanswers + 1));
            intent5.putExtra("username", username);
            startActivity(intent5);
        } else {
            Intent intent4 = new Intent(SixthActivity.this, ResultActivity.class);
            intent4.putExtra("correctanswers", correctanswers);
            intent4.putExtra("username", username);
            startActivity(intent4);
        }
    }
}
