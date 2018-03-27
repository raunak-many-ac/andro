
package com.battleofsunnygmail.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstOne extends AppCompatActivity {

    Button nextbutton;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_one);
        nextbutton  = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.name);



    }


    public void nextmethod(View view){
       /* nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstOne.this,NextActivity.class);
                intent.putExtra("name",name.getText().toString());
                startActivity(intent);
            }
        });*/

       String susername = new String();
       susername = name.getText().toString();
        if (susername.matches("")) {
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            Intent intent = new Intent(FirstOne.this,NextActivity.class);
            intent.putExtra("username",name.getText().toString());

            startActivity(intent);
        }

    }
}
