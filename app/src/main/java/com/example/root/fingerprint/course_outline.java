package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class course_outline extends AppCompatActivity implements View.OnClickListener{

    private Button com402;
    private Button com403;
    private Button com405;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_outline);

        com402= (Button) findViewById(R.id.btncom402);
        com403= (Button) findViewById(R.id.btncom403);
        com405= (Button) findViewById(R.id.btncom405);

        com402.setOnClickListener(this);
        com403.setOnClickListener(this);
        com405.setOnClickListener(this);
    }

    public  void onClick(View view) {

        if(view == com402) {
            startActivity(new Intent(this, com402.class));
        }
        if(view == com403) {
            startActivity(new Intent(this, com403.class));
        }


        if (view == com405) {

            startActivity(new Intent(this, com405.class));
        }


    }
}
