package com.example.ott;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3;
    Button btnone, btntwo, btnthree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1 =(ImageView)findViewById(R.id.imageView1);
        imageView2 =(ImageView)findViewById(R.id.imageView2);
        imageView3 =(ImageView)findViewById(R.id.imageView3);

        btnone = (Button)findViewById(R.id.btnone);
        btntwo = (Button)findViewById(R.id.btntwo);
        btnthree = (Button)findViewById(R.id.btnthree);

        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, avg1.class);
                i.putExtra("n","n");
                i.putExtra("r","r");
                startActivity(i);
            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, avg2.class);
                i.putExtra("n","n");
                i.putExtra("r","r");
                startActivity(i);

            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, avg3.class);
                i.putExtra("n","n");
                i.putExtra("r","r");
                startActivity(i);
            }
        });






    }
}