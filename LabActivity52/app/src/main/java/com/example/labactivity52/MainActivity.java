package com.example.labactivity52;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;


import android.graphics.drawable.ColorDrawable;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText myText1, myText2, myText3, myText4, myText5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gold)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        myText1 = findViewById(R.id.editText1);
        myText2 = findViewById(R.id.editText2);
        myText3 = findViewById(R.id.editText3);
        myText4 = findViewById(R.id.editText4);
        myText5 = findViewById(R.id.editText5);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, SecondScreen.class);
        myIntent.putExtra("name",myText1.getText().toString());
        myIntent.putExtra("program",myText2.getText().toString());
        myIntent.putExtra("course1",myText3.getText().toString());
        myIntent.putExtra("course2",myText4.getText().toString());
        myIntent.putExtra("course3",myText5.getText().toString());
        startActivity(myIntent);


    }


}