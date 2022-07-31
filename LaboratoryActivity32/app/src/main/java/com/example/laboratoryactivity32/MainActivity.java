package com.example.laboratoryactivity32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText calculation;
    private TextView result;
    private String curr, res;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAC,
            btnDivision, btnMultiplication, btnAddition, btnSubtraction, btnEqual, btnPoint;
    //For Point Variable//
    private boolean point_inserted, operator_inserted;
    //For Point Variable//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization of variables//
                calculation = (EditText) findViewById(R.id.Calculation);
                result = (TextView) findViewById(R.id.Result);

        curr = "";
        res = "";

        //For Point Var//
        point_inserted = false;
        operator_inserted = false;
        //For Point Var//


        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnEqual = (Button) findViewById(R.id.btnEquals);
        btnAC = (Button) findViewById(R.id.btnAC);


        btn0.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "0";
                displayOne();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                curr = curr + "1";
                displayOne();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                curr = curr + "2";
                displayOne();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                curr = curr + "3";
                displayOne();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                curr = curr + "4";
                displayOne();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "5";
                displayOne();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "6";
                displayOne();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "7";
                displayOne();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "8";
                displayOne();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                curr = curr + "9";
                displayOne();
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //check if it's empty-- if yes, append "0." and set point_inserted variable to true//
                if (curr.isEmpty()) {
                    curr = "0.";
                    point_inserted = true;
                }


                //check if point_inserted is false-- if false, append "."//
                if (point_inserted == false) {
                    curr = curr + ".";
                    point_inserted = true;
                }
                displayOne();
            }
        });

        btnAC.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                clear();
                displayOne();
                displayTwo();
            }
        });


        btnDivision.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                // set point_inserted = false//
                point_inserted = false;

                //check if curr is not empty//
                if(!curr.isEmpty()){


                    //check if operated_inserted == false => append operator to curr//
                    if(operator_inserted == false){
                        curr = curr + " / ";
                        operator_inserted = true;
                    }
                }
                //displayOne//
                displayOne();
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                // set point_inserted = false//
                point_inserted = false;

                //check if curr is not empty//
                if(!curr.isEmpty()){


                    //check if operated_inserted == false => append operator to curr//
                    if(operator_inserted == false){
                        curr = curr + " x ";
                        operator_inserted = true;
                    }
                }
                //displayOne//
                displayOne();
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                // set point_inserted = false//
                point_inserted = false;

                //check if curr is not empty//
                if(!curr.isEmpty()){



                    //check if operated_inserted == false => append operator to curr//
                    if(operator_inserted == false){
                        curr = curr + " - ";
                        operator_inserted = true;
                    }
                }
                //displayOne//
                displayOne();
            }
        });

        btnAddition.setOnClickListener(new View.OnClickListener(){

            public void onClick (View v){
                // set point_inserted = false//
                point_inserted = false;

                //check if curr is not empty//
                if(!curr.isEmpty()){

                    //check if operated_inserted == false => append operator to curr//
                    if(operator_inserted == false){
                        curr = curr + " + ";
                        operator_inserted = true;
                    }
                }
                //displayOne//
                displayOne();
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                if(operator_inserted==true && !curr.substring(curr.length()-1,curr.length()).equals(" ")){
                    String [] tokens = curr.split(" ");
                    switch (tokens[1].charAt(0)){

                        case '+':
                            res = Double.toString( Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]));
                            break;
                        case '-':
                            res = Double.toString( Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
                            break;
                        case 'x':
                            res = Double.toString( Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
                            break;
                        case '/':
                            res = Double.toString( Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });
    }

    //------------------------------------------------------------------------------//

    //Functionality//
    public void displayOne() {
        calculation.setText(curr);
    }

    public void displayTwo() {
        result.setText(res);
    }

    public void clear() {
        curr = "";
        res = "";
        point_inserted = false;
        operator_inserted = false;
    }


}