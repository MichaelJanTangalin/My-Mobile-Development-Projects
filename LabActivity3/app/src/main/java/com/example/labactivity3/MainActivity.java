package com.example.labactivity3;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText1);
        textView = (TextView)findViewById(R.id.myTextView1);

        button.setOnClickListener(this);
    }




public void onClick(View v) {
    if (v.getId() == R.id.button) {
        String myText = editText.getText().toString();
        textView.setText(myText);

        }

    }

}