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

public class attendance_402 extends AppCompatActivity {
    private Button btnSign_attendance;
    private EditText edttextid;

    DatabaseReference databaseattendance402;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_402);

        databaseattendance402= FirebaseDatabase.getInstance().getReference("attendance402");
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
            String id = databaseattendance402.push().getKey();
            getattendance_402  attendance402 = new getattendance_402 (attendance_id);
            databaseattendance402.child(id).setValue(attendance402);
            Toast.makeText(this, "Attendance Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "id not detected", Toast.LENGTH_SHORT).show();

    }



    }}

