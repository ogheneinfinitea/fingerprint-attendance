package com.example.root.fingerprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class student_reg extends AppCompatActivity {
    EditText edttextsLevel;
    EditText edttextsReg_no;
    EditText edttextsName;
    EditText edttextsPhone;
    EditText edttextsAddress;
    EditText edttextsEmail;
    Button btnsSave;


    DatabaseReference databaseStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reg);


        databaseStudent= FirebaseDatabase.getInstance().getReference("student");

        edttextsAddress = (EditText) findViewById(R.id.edttextsAddress);
        edttextsLevel =(EditText) findViewById(R.id.edttextsLevel);
        edttextsName = (EditText) findViewById(R.id.edttextsName);
        edttextsPhone = (EditText) findViewById(R.id.edttextsPhone);
        edttextsReg_no = (EditText) findViewById(R.id.edttextsReg_no);
        edttextsEmail = (EditText) findViewById(R.id.edttextsEmail);

        btnsSave = (Button) findViewById(R.id.btnsSave);


        btnsSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_student_reg();
            }
        });
    }
    private  void add_student_reg() {
        String Student_regno =edttextsReg_no.getText().toString().trim();
        String Student_address = edttextsAddress.getText().toString().trim();
        String Student_phone =edttextsPhone.getText().toString().trim();
        String Student_level =edttextsLevel.getText().toString().trim();
        String Student_name =edttextsName.getText().toString().trim();
        String Student_email =edttextsEmail.getText().toString().trim();

        if(!TextUtils.isEmpty(Student_name)) {
            String id = databaseStudent.push().getKey();
            add_student_reg  student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);
            databaseStudent.child(id).setValue(student);
            Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You Should enter a name", Toast.LENGTH_SHORT).show();

        if(!TextUtils.isEmpty(Student_regno)) {
            String id =databaseStudent.push().getKey();
            add_student_reg student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);
            databaseStudent.child(id).setValue(student);
            Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You Should enter  Your Reg No", Toast.LENGTH_SHORT).show();

        if(!TextUtils.isEmpty(Student_address)) {
            String id = databaseStudent.push().getKey();
            add_student_reg student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);
            databaseStudent.child(id).setValue(student);
            Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "You Should enter an Address", Toast.LENGTH_SHORT).show();

            if (!TextUtils.isEmpty(Student_level)) {
                String id = databaseStudent.push().getKey();
                add_student_reg student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);
                databaseStudent.child(id).setValue(student);
                Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "You Should enter a Level", Toast.LENGTH_SHORT).show();


                if (!TextUtils.isEmpty(Student_phone)) {
                    String id = databaseStudent.push().getKey();
                    add_student_reg student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);
                    databaseStudent.child(id).setValue(student);
                    Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "You Should enter a Phone Number", Toast.LENGTH_SHORT).show();
                        }
                if (!TextUtils.isEmpty(Student_email)) {
                    String id = databaseStudent.push().getKey();
                    add_student_reg student = new add_student_reg (id, Student_regno,Student_name,   Student_level,Student_phone,  Student_address, Student_email);

                    databaseStudent.child(id).setValue(student);
                    Toast.makeText(this, "Student Added Successfully", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "You Should enter a Phone Number", Toast.LENGTH_SHORT).show();
                }
                    }


                }
            }
        }
    }

}



