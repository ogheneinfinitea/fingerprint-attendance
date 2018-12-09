package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class course_outline extends AppCompatActivity implements View.OnClickListener{
    private Button com401;
    private Button com402;
    private Button com403;
    private Button com404;
    private Button com405;
    private Button com406;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_outline);

        com401= (Button) findViewById(R.id.btncom401);
        com402= (Button) findViewById(R.id.btncom402);
        com403= (Button) findViewById(R.id.btncom403);
        com404= (Button) findViewById(R.id.btncom404);
        com405= (Button) findViewById(R.id.btncom405);
        com406= (Button) findViewById(R.id.btncom406);



        com401.setOnClickListener(this);
        com402.setOnClickListener(this);
        com403.setOnClickListener(this);
        com404.setOnClickListener(this);
        com405.setOnClickListener(this);
        com406.setOnClickListener(this);




    }

    public void  onClick(View view) {
        if(view == com401){

        }

        if (view == com402){
            finish();
            startActivity(new Intent(this, studentcom402.class));
            //will open login activity here

            if (view == com403){
                finish();
                startActivity(new Intent(this, studentcom403.class));
                //will open login activity here

                if (view == com404){
                    finish();
                    startActivity(new Intent(this, studentcom404.class));
                    //will open login activity here
                    if (view == com405) {
                        finish();
                        startActivity(new Intent(this, studentcom405.class));
                        //will open login activity here
                        if (view == com406) {
                            finish();
                            startActivity(new Intent(this, studentcom406.class));
                            //will open login activity here
                            
                        }
                    }}}}}}
