package com.example.root.fingerprint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class studentcom402 extends AppCompatActivity  {
    private Button btncom402s;
    EditText edttextid;
    EditText edttextName;
    EditText edttextPhone;
    EditText edttextAddress;


    DatabaseReference databasecom402;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcom402);
        databasecom402= FirebaseDatabase.getInstance().getReference("com402");
        btncom402s = (Button) findViewById(R.id.btncom402s);




        btncom402s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_com402();
            }
        });
        }

    private void add_com402()
    {
        String student_id = edttextid.getText().toString().trim();
        String student_name = edttextName.getText().toString().trim();
        String student_address = edttextAddress.getText().toString().trim();
        String student_phone = edttextPhone.getText().toString().trim();



        if(!TextUtils.isEmpty(student_id)) {
            String id = databasecom402.push().getKey();
            getstudent_402  com402 = new getstudent_402 (student_id, student_name, student_address,student_phone);
            databasecom402.child(id).setValue(com402);
            Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You Should enter the Student ID", Toast.LENGTH_SHORT).show();

            if(!TextUtils.isEmpty(student_name)) {
                String id = databasecom402.push().getKey();
                getstudent_402  com402 = new getstudent_402 (student_id, student_name, student_address,student_phone);
                databasecom402.child(id).setValue(com402);
                Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "You Should enter the Course name", Toast.LENGTH_SHORT).show();



        if(!TextUtils.isEmpty(student_phone)) {
            String id = databasecom402.push().getKey();
            getstudent_402  com402 = new getstudent_402 (student_id, student_name, student_address,student_phone);
            databasecom402.child(id).setValue(com402);
            Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You Should enter the student phone", Toast.LENGTH_SHORT).show();

            if (!TextUtils.isEmpty(student_address)) {
                String id = databasecom402.push().getKey();
                getstudent_402  com402 = new getstudent_402 (student_id, student_name, student_address,student_phone);
                databasecom402.child(id).setValue(com402);
                Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You Should enter the Student Address", Toast.LENGTH_SHORT).show();
            }

        }}}}}

