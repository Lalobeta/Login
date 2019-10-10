package com.example.splitac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends AppCompatActivity {

    public static final String  user="names";
private TextView counterTxt;
private Button plusBoton;
private Button resetboton;
private int counter;

    private View.OnClickListener clickListener= new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.plusBtn:
                    plusCounter();
                    break;
                case R.id.resetBtn:
                    initCounter();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        counterTxt = (TextView) findViewById(R.id.counterTxt);
        plusBoton =(Button)findViewById(R.id.plusBtn);
        plusBoton.setOnClickListener(clickListener);
        resetboton=(Button)findViewById(R.id.resetBtn);
        resetboton.setOnClickListener(clickListener);

        initCounter();
    }

    private void initCounter(){
        counter=0;
        counterTxt.setText(counter + "");

    }

    private void plusCounter(){
        counter++;
        counterTxt.setText(counter + "");

    }


}
