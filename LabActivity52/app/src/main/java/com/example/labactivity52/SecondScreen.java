package com.example.labactivity52;

import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class SecondScreen extends AppCompatActivity{
    MediaPlayer mySong;
    TextView textOutput1, textOutput2, textOutput3, textOutput4, textOutput5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gold)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("You're a Wizard!");
        setContentView(R.layout.second_activity);

        textOutput1 = findViewById(R.id.textViewName);
        textOutput1.setText(getIntent().getExtras().getString("name"));

        textOutput2 = findViewById(R.id.textViewProgram);
        textOutput2.setText(getIntent().getExtras().getString("program"));

        textOutput3 = findViewById(R.id.textViewCourse1);
        textOutput3.setText(getIntent().getExtras().getString("course1"));

        textOutput4 = findViewById(R.id.textViewCourse2);
        textOutput4.setText(getIntent().getExtras().getString("course2"));

        textOutput5 = findViewById(R.id.textViewCourse3);
        textOutput5.setText(getIntent().getExtras().getString("course3"));

        mySong = MediaPlayer.create(SecondScreen.this,R.raw.bgmusic3);
        mySong.setLooping(true);
        mySong.start();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        mySong.stop();
        mySong.release();
    }


}
