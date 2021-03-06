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

public class attendance_403 extends AppCompatActivity {
    private Button btnSign_attendance;
    private EditText edttextid;

    DatabaseReference databaseattendance403;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_403);

        databaseattendance403= FirebaseDatabase.getInstance().getReference("attendance403");
        btnSign_attendance = (Button) findViewById(R.id.btnSign_attendance);
        edttextid =(EditText) findViewById(R.id.edttextid);


        btnSign_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_attendance();
            }
        });
    }



    private  void add_attendance() {
        String attendance_id =edttextid.getText().toString().trim();
        if(!TextUtils.isEmpty(attendance_id)) {
            String id = databaseattendance403.push().getKey();
            getattendance_403  attendance403 = new getattendance_403 (attendance_id);
            databaseattendance403.child(id).setValue(attendance403);
            Toast.makeText(this, "Attendance Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "id not detected", Toast.LENGTH_SHORT).show();

        }



    }}

