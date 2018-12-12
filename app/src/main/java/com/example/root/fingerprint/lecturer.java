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

public class lecturer extends AppCompatActivity  {
    private Button btncom402s;
    private EditText edttextid;
    private EditText edttextName;
    private     EditText edttextPhone;
    private  EditText edttextAddress;


    DatabaseReference lecturerdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentcom402);
        //this code is resposible for creating database lecturer
        lecturerdb= FirebaseDatabase.getInstance().getReference("lecturer");
        btncom402s = (Button) findViewById(R.id.btncom402s);
        edttextid = (EditText) findViewById(R.id.edttextid);
        edttextName =(EditText) findViewById(R.id.edttextName);
        edttextPhone =(EditText) findViewById(R.id.edttextPhone);
        edttextPhone =(EditText) findViewById(R.id.edttextPhone);
        edttextAddress =(EditText) findViewById(R.id.edttextAddress);





        btncom402s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lecturer();
            }
        });
    }

    private void lecturer() {
        String lecturer_id = edttextid.getText().toString().trim();
        String lecturer_name = edttextName.getText().toString().trim();
        String lecturer_address = edttextAddress.getText().toString().trim();
        String lecturer_phone = edttextPhone.getText().toString().trim();
        if(!TextUtils.isEmpty(lecturer_id)) {
            String id = lecturerdb.push().getKey();
            getlecturer  lecturer = new getlecturer (lecturer_id, lecturer_name, lecturer_address,lecturer_phone);
            lecturerdb.child(id).setValue(lecturer);
            Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You Should enter the Student ID", Toast.LENGTH_SHORT).show();

            if(!TextUtils.isEmpty(lecturer_name)) {
                String id = lecturerdb.push().getKey();
                getlecturer  lecturer = new getlecturer (lecturer_id, lecturer_name, lecturer_address,lecturer_phone);
                lecturerdb.child(id).setValue(lecturer);
                Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "You Should enter the Course name", Toast.LENGTH_SHORT).show();



                if(!TextUtils.isEmpty(lecturer_phone)) {
                    String id = lecturerdb.push().getKey();
                    //getlecturer passes the entered details from d fields entered by the user to the lecturer database
                    getlecturer  lecturer = new getlecturer (lecturer_id, lecturer_name, lecturer_address,lecturer_phone);
                    lecturerdb.child(id).setValue(lecturer);
                    Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "You Should enter the student phone", Toast.LENGTH_SHORT).show();

                    if (!TextUtils.isEmpty(lecturer_address)) {
                        String id = lecturerdb.push().getKey();
                        getlecturer  lecturer = new getlecturer (lecturer_id, lecturer_name, lecturer_address,lecturer_phone);
                        lecturerdb.child(id).setValue(lecturer);
                        Toast.makeText(this, "Student  Added Successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, "You Should enter the Student Address", Toast.LENGTH_SHORT).show();
                    }

                }}}}}

