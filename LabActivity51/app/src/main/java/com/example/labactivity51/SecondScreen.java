package com.example.labactivity51;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {

    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue_700)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Intent Sample");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        textOutput = findViewById(R.id.textView);
        textOutput.setText(getIntent().getExtras().getString("myKey"));
    }
}
