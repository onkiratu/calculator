package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTvAnswer;
    EditText mEdtFnum, mEdtSnum;
    Button mBt1Add, mBt2Subtract;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvAnswer = findViewById(R.id.mTvAnswer);
        mEdtFnum = findViewById(R.id.mEdtFnum);
       mEdtSnum = findViewById(R.id.mEdtSnum);
        mBt1Add = findViewById(R.id.mBt1Add);
        mBt2Subtract = findViewById(R.id.mBtn2Subtract);

        //Start by setting on click listeners on the buttons
        mBt1Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //start by receiving the values from the user
                String Fnum = mEdtFnum.getText().toString().trim();
                String Snum = mEdtSnum.getText().toString().trim();

                //Ascertain if the user has submitted values
                if(Fnum.isEmpty() || Snum.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    //calculate the values
                    Double answer = Double.parseDouble(Fnum) + Double.parseDouble(Snum);
                    mTvAnswer.setText(String.valueOf(answer));
                }
            }
        });

        mBt2Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // start by receiving the value from the user
                //start by receiving the values from the user
                String Fnum = mEdtFnum.getText().toString().trim();
                String Snum = mEdtSnum.getText().toString().trim();

                //Ascertain if the user has submitted values
                if(Fnum.isEmpty() || Snum.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    //calculate the values
                    Double answer = Double.parseDouble(Fnum) - Double.parseDouble(Snum);
                    mTvAnswer.setText(String.valueOf(answer));
                }
            }
        });
    }
}