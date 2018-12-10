package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentcom402 extends AppCompatActivity implements View.OnClickListener {
    private Button btncom402s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcom402);

        btncom402s = (Button) findViewById(R.id.btncom402s);


        btncom402s.setOnClickListener(this);
    }

        public void onClick (View view){
            if (view == btncom402s) {

                startActivity(new Intent(this, com402.class));
            }
        }
    }
