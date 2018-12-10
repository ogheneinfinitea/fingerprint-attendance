package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class com404 extends AppCompatActivity implements View.OnClickListener  {
    private  Button com_404s;
    private  Button com_404a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com404);


        com_404s = (Button) findViewById(R.id.com_405s);
        com_404a = (Button) findViewById(R.id.com_405a);


        com_404s.setOnClickListener(this);
        com_404a.setOnClickListener(this);

    }

    public void onClick (View view){
        if (view == com_404s ) {

            startActivity(new Intent(this, studentcom404.class));
        }

        if (view == com_404a ) {

            startActivity(new Intent(this, attendance_404.class));
        }
    }
}


