package com.example.ott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class avg2 extends AppCompatActivity {
    TextView text1, text2, text3;
    ImageView avg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg2);
        avg2 = (ImageView)findViewById(R.id.avg2);
        text1 =(TextView)findViewById(R.id.text1);
        text2 =(TextView)findViewById(R.id.text2);
        text3 =(TextView)findViewById(R.id.text3);

        Intent i= getIntent();
        String n= i.getStringExtra("n");
        String r = i.getStringExtra("r");
    }
}