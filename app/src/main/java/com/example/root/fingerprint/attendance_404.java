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

public class attendance_404 extends AppCompatActivity {
    private Button btnSign_attendance;
    private EditText edttextid;

    DatabaseReference databaseattendance404;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_404);

        databaseattendance404= FirebaseDatabase.getInstance().getReference("attendance404");
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
            String id = databaseattendance404.push().getKey();
            getattendance_404  attendance404 = new getattendance_404 (attendance_id);
            databaseattendance404.child(id).setValue(attendance404);
            Toast.makeText(this, "Attendance Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "id not detected", Toast.LENGTH_SHORT).show();

        }



    }}

