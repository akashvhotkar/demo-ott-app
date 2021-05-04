package com.example.ott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class avg1 extends AppCompatActivity {
    TextView textView1, textView2, textView3;
    ImageView iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg1);
        iv2 = (ImageView)findViewById(R.id.iv2);
        textView1 =(TextView)findViewById(R.id.textView1);
        textView2 =(TextView)findViewById(R.id.textView2);
        textView3 =(TextView)findViewById(R.id.textView3);

        Intent i= getIntent();
        String n= i.getStringExtra("n");
        String r = i.getStringExtra("r");
    }
}