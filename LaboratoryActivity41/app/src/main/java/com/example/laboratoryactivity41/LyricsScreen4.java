package com.example.laboratoryactivity41;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;

public class LyricsScreen4 extends AppCompatActivity{
    MediaPlayer mySong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_lyrics4);
        getSupportActionBar().setTitle("Stray Heart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gray_700)));

        mySong = MediaPlayer.create(LyricsScreen4.this,R.raw.strayhearts);
        mySong.setLooping(true);
        mySong.start();
    }
    protected void onDestroy(){
        super.onDestroy();
        mySong.stop();
        mySong.release();
    }
}
