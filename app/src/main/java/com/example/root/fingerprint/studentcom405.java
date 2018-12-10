package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentcom405 extends AppCompatActivity implements View.OnClickListener {
    private Button btncom405s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcom405);

        btncom405s = (Button) findViewById(R.id.btncom405s);


        btncom405s.setOnClickListener(this);
    }

    public void onClick (View view){
        if (view == btncom405s) {

            startActivity(new Intent(this, com405.class));
        }
    }
}
