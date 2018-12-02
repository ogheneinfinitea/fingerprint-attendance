package com.example.root.fingerprint;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class login extends AppCompatActivity  implements View.OnClickListener {
    private Button btnLogin;
    private EditText edttextPassword;
    private EditText edttextEmail;
    private TextView txtviewsignup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() !=null){
            //profile activity here
            startActivity(new Intent(getApplicationContext(), profile.class));
        }

        btnLogin = (Button) findViewById(R.id.btnLogin);
        edttextEmail=(EditText) findViewById(R.id.edttextEmail);
        edttextPassword=(EditText) findViewById(R.id.edttextPassword);
        txtviewsignup= (TextView) findViewById(R.id.txtviewsignup);

        progressDialog = new ProgressDialog(this);
        btnLogin.setOnClickListener(this);
        txtviewsignup.setOnClickListener(this);


    }

    private void userLogin() {
        String email =edttextEmail.getText().toString().trim();
        String password =edttextPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            //email is empty
            Toast.makeText(this, "Please Enter Email", Toast.LENGTH_SHORT) .show();
            //Stopping the function from further execution
            return;
        }
        if (TextUtils.isEmpty(password)){
            //password is empty
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT) .show();
            //Stopping the function from further execution
            return;
            //if the email and password are not empty
            //displaying a progress dialog

        }
            progressDialog.setMessage("Login Please Wait......");
            progressDialog.show();

            firebaseAuth.signInWithEmailAndPassword(email, password)
                  .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                      @Override
                      public void onComplete(@NonNull Task<AuthResult> task) {
                                 progressDialog.dismiss();
                            if(task.isSuccessful()) {
                            //start the profile activity
                                finish();
                                startActivity(new Intent(getApplicationContext(), profile.class));
                            }
                        }
                    });



    }
    @Override
    public void  onClick(View view) {
        if(view == btnLogin){
            userLogin();
        }

        if (view == txtviewsignup){
            finish();
            startActivity(new Intent(this, MainActivity.class));
            //will open login activity here

        }
    }


    }

