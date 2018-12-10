package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class com403 extends AppCompatActivity implements View.OnClickListener  {
    private  Button com_403s;
    private  Button com_403a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com403);


        com_403s = (Button) findViewById(R.id.com_403s);
        com_403a= (Button) findViewById(R.id.com_403a);



        com_403s.setOnClickListener(this);
        com_403a.setOnClickListener(this);

    }

    public void onClick (View view){
        if (view == com_403s ) {

            startActivity(new Intent(this, studentcom407.class));
        }

        if (view == com_403a ) {

            startActivity(new Intent(this, attendance_407.class));
        }
    }
}


