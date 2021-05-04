package com.example.ott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class avg3 extends AppCompatActivity {
    TextView tv1, tv2, tv3;
    ImageView avg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg3);
        avg3 = (ImageView)findViewById(R.id.avg3);
        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);

        Intent i= getIntent();
        String n= i.getStringExtra("n");
        String r = i.getStringExtra("r");
    }
}