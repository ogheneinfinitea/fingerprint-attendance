package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class com402 extends AppCompatActivity implements View.OnClickListener  {
    private  Button com_402s;
    private  Button com_402a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com402);


        com_402s = (Button) findViewById(R.id.btncom402s);
        com_402a = (Button) findViewById(R.id.btncom402a);


        com_402s.setOnClickListener(this);
        com_402a.setOnClickListener(this);

    }

    public void onClick (View view){
        if (view == com_402s ) {

            startActivity(new Intent(this, studentcom402.class));
        }

        if (view == com_402a ) {

            startActivity(new Intent(this, attendance_402.class));
        }
    }
}


