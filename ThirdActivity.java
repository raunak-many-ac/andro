package com.battleofsunnygmail.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    int correctanswers;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        correctanswers = getIntent().getExtras().getInt("correctanswers");
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        username = getIntent().getExtras().getString("username");
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);

    }

    public void wow(View view)
    {
        if(checkBox.isChecked())
        {



            Intent intent3 = new Intent(ThirdActivity.this,FourthActivity.class);
            intent3.putExtra("correctanswers",(correctanswers));
            intent3.putExtra("username",username);
            startActivity(intent3);

        }
        else if(checkBox2.isChecked())
        {




            Intent intent3 = new Intent(ThirdActivity.this,FourthActivity.class);
            intent3.putExtra("correctanswers",correctanswers);
            intent3.putExtra("username",username);
            startActivity(intent3);

        }
        else if(checkBox3.isChecked() && checkBox4.isChecked())
        {
            Intent intent3 = new Intent(ThirdActivity.this,FourthActivity.class);
            intent3.putExtra("correctanswers",(correctanswers + 1));
            intent3.putExtra("username",username);
            startActivity(intent3);

        }
        else if(checkBox4.isChecked())
        {

            Intent intent3 = new Intent(ThirdActivity.this,FourthActivity.class);
            intent3.putExtra("correctanswers",correctanswers);
            intent3.putExtra("username",username);
            startActivity(intent3);

        }
        else if(!checkBox.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked())
        {
            Toast.makeText(getBaseContext(), "Please select a choice" , Toast.LENGTH_SHORT ).show();
        }
        else
        {
            Intent intent3 = new Intent(ThirdActivity.this,FourthActivity.class);
            intent3.putExtra("correctanswers",correctanswers);
            intent3.putExtra("username",username);
            startActivity(intent3);

        }
                /*if(checkBox.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked())
                {
                    Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                    intent2.putExtra("provalue",0);
                    startActivity(intent2);
                }*/

    }

}

