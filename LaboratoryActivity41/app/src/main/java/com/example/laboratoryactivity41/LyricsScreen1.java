package com.example.laboratoryactivity41;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

public class LyricsScreen1 extends AppCompatActivity{
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_lyrics1);
        getSupportActionBar().setTitle("21 Guns");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray_700)));

        mySong = MediaPlayer.create(LyricsScreen1.this,R.raw.guns);
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
