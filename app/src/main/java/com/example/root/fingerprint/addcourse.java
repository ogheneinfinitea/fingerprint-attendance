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

public class addcourse extends AppCompatActivity {
    EditText edttextcourse_id;
    EditText edttextcourse_name;
    Button btnSave_Course;

    DatabaseReference databaseCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcourse);

        databaseCourse = FirebaseDatabase.getInstance().getReference("course");

        edttextcourse_id = (EditText) findViewById(R.id.edttextcourse_id);
        edttextcourse_name = (EditText) findViewById(R.id.edttextcourse_name);

        btnSave_Course = (Button) findViewById(R.id.btnSave_Course);

        btnSave_Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtadd_course();
            }
        });
    }


    private void edtadd_course() {
        String course_id = edttextcourse_id.getText().toString().trim();
        String course_name = edttextcourse_name.getText().toString().trim();


        if(!TextUtils.isEmpty(course_id)) {
            String id = databaseCourse.push().getKey();
            edtadd_course  course = new edtadd_course (id, course_id,course_name);
            databaseCourse.child(id).setValue(course);
            Toast.makeText(this, "Course Added Successfully", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "You Should enter the Course ID", Toast.LENGTH_SHORT).show();

            if(!TextUtils.isEmpty(course_name)) {
                String id = databaseCourse.push().getKey();
                edtadd_course  course = new edtadd_course (id, course_id,course_name);
                databaseCourse.child(id).setValue(course);
                Toast.makeText(this, "Course Added Successfully", Toast.LENGTH_SHORT).show();
            } else{
                Toast.makeText(this, "You Should enter the Course Name", Toast.LENGTH_SHORT).show();
    }
}}}