package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class com405 extends AppCompatActivity implements View.OnClickListener  {
    private  Button com_405s;
    private  Button com_405a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_com405);


        com_405s = (Button) findViewById(R.id.com_405s);
        com_405a = (Button) findViewById(R.id.com_405a);


        com_405s.setOnClickListener(this);
        com_405a.setOnClickListener(this);

    }

    public void onClick (View view){
        if (view == com_405s ) {

            startActivity(new Intent(this, studentcom405.class));
        }

        if (view == com_405a ) {

            startActivity(new Intent(this, attendance_405.class));
        }
    }
}


