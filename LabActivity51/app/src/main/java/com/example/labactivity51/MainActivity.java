package com.example.labactivity51;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue_700)));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        myText = findViewById(R.id.editText);

        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(MainActivity.this, SecondScreen.class);
        myIntent.putExtra("myKey",myText.getText().toString());
        startActivity(myIntent);
    }
}