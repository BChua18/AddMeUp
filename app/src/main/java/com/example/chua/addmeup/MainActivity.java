package com.example.chua.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mAdd;
    private EditText mFirst, mSecond;
    private TextView mAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        mAdd = (Button) findViewById(R.id.mbtnAdd);
        mFirst = (EditText) findViewById(R.id.mtxtFirst);
        mSecond = (EditText) findViewById(R.id.mtxtSecond);
        mAnswer = (TextView) findViewById(R.id.mtxtAnswer);

        mAdd.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        try{
            mAnswer.setText(String.valueOf(Float.parseFloat(mFirst.getText().toString()) + Float.parseFloat(mSecond.getText().toString())));
            }
        catch(Exception e){
            mAnswer.setText("Invalid Input");
        }
    }
}
