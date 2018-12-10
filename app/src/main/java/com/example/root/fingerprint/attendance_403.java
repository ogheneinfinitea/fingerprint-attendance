package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class com403 extends AppCompatActivity implements View.OnClickListener  {
    private  Button com_407s;
    private  Button com_407a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com402);


        com_407s = (Button) findViewById(R.id.btncom402s);
        com_407a = (Button) findViewById(R.id.btncom402s);


        com_407s.setOnClickListener(this);
        com_407a.setOnClickListener(this);

    }

    public void onClick (View view){
        if (view == com_407s ) {

            startActivity(new Intent(this, studentcom402.class));
        }

        if (view == com_407a ) {

            startActivity(new Intent(this, attendance_402.class));
        }
    }
}


