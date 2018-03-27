package com.battleofsunnygmail.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {


    Button backbutton;
    String username;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    int correctanswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        backbutton = (Button) findViewById(R.id.button3);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        username = getIntent().getExtras().getString("username");
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);



    }


    public void wow(View view) {
                if(checkBox.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked())
                {



                        Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                        intent2.putExtra("correctanswers",(correctanswers + 1));
                        intent2.putExtra("username",username);
                        startActivity(intent2);

                }
                else if(checkBox2.isChecked())
                {




                        Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                        intent2.putExtra("correctanswers",correctanswers);
                        intent2.putExtra("username",username);
                        startActivity(intent2);

                }
                else if(checkBox3.isChecked())
                {
                        Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                        intent2.putExtra("correctanswers",correctanswers);
                        intent2.putExtra("username",username);
                        startActivity(intent2);

                }
                else if(checkBox4.isChecked())
                {

                        Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                        intent2.putExtra("correctanswers",correctanswers);
                        intent2.putExtra("username",username);
                        startActivity(intent2);

                }
                else if(!checkBox.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() && !checkBox4.isChecked())
                {
                    Toast.makeText(getBaseContext(), "Please select a choice" , Toast.LENGTH_SHORT ).show();
                }
                /*if(checkBox.isChecked() || checkBox2.isChecked() || checkBox3.isChecked() || checkBox4.isChecked())
                {
                    Intent intent2 = new Intent(NextActivity.this,ThirdActivity.class);
                    intent2.putExtra("provalue",0);
                    startActivity(intent2);
                }*/

            }

    }

