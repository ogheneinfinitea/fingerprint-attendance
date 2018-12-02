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
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    private Button btnSignup;
    private EditText edttextPassword;
    private EditText edttextEmail;
    private TextView txtviewlogin;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intializing firebase auth object
        firebaseAuth=FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser() !=null){
            //profile activity here
            startActivity(new Intent(getApplicationContext(), profile.class));
        }



        progressDialog = new ProgressDialog(this);
        btnSignup = (Button) findViewById(R.id.btnSignup);
        edttextEmail=(EditText) findViewById(R.id.edttextEmail);
        edttextPassword=(EditText) findViewById(R.id.edttextPassword);

        txtviewlogin= (TextView) findViewById(R.id.txtviewlogin);

        btnSignup.setOnClickListener(this);
        txtviewlogin.setOnClickListener(this);

    }

    private void registerUser(){
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


        }
        //if validations are ok
        //we will first show Progessbar


        progressDialog.setMessage("Registering User...");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            finish();
                                //profile activity here
                                startActivity(new Intent(getApplicationContext(), profile.class));



                            //user is successfully registered and logged in
                           //we will start the profile activity here
                            //right now lets Display a toast only
                            Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(MainActivity.this, "Registration failed", Toast.LENGTH_SHORT);
                        }
                    }
                });
    }

@Override
    public void  onClick(View view) {
if(view == btnSignup){
    registerUser();
}

if (view == txtviewlogin){
    //will open login activity here
    startActivity(new Intent(this, login.class) );
}
}
}
