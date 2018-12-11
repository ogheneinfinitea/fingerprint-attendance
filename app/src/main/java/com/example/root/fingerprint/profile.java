package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile extends AppCompatActivity implements View.OnClickListener{
    private FirebaseAuth firebaseAuth;

    private TextView textViewUserEmail;
    private Button buttonLogout;
    private Button buttonPtest;
    private Button buttoncourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firebaseAuth =FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() ==null) {
            finish();
            startActivity(new Intent(this, login.class));
        }
        FirebaseUser user =firebaseAuth.getCurrentUser();

        textViewUserEmail = (TextView) findViewById(R.id.textviewUserEmail);
        textViewUserEmail.setText("Welcome "+user.getEmail());

        //assiging of buttons
        buttonLogout =(Button) findViewById(R.id.buttonLogout);
        buttonPtest = (Button) findViewById(R.id.buttonPtest);
        buttoncourse = (Button) findViewById(R.id.btncourse);




        buttonLogout.setOnClickListener(this);
        buttonPtest.setOnClickListener(this);
        buttoncourse.setOnClickListener(this);
    }


    @Override
    public  void onClick(View view) {
       if (view == buttonLogout) {
           firebaseAuth.signOut();
           finish();
           startActivity(new Intent(this, login.class));
       }
if(view == buttonPtest) {
           startActivity(new Intent(this, profile.class));

}

        if(view == buttoncourse) {
            startActivity(new Intent(this, course_outline.class));
        }


    }
}
