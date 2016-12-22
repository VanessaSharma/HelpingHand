package com.example.guest.helpinghand.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.guest.helpinghand.R;

public class EvaluationActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button nxt;
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evalution_1);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            //added radiogroup in front of oncheckedchangelistener to import class

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if (checkedId == R.id.radio1) {
                    setContentView(R.layout.activity_evaluation_2);
                }
                else if (checkedId == R.id.radio2){
                    setContentView(R.layout.activity_evaluation_2);
                }
                else if (checkedId == R.id.radio3) {
                    setContentView(R.layout.activity_evaluation_2);
                }
                else{
                    setContentView(R.layout.activity_evaluation_2);
                }
            }
        });

    }
}