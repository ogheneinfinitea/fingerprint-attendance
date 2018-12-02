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

public class edtprofile extends AppCompatActivity {
    EditText edttextName;
    EditText edttextAddress;
    EditText edttextPhone;
    EditText edttextCourse_code;
    Button btnSave;


    DatabaseReference datbaseArtist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edtprofile);

        datbaseArtist= FirebaseDatabase.getInstance().getReference("artists");

        edttextName = (EditText) findViewById(R.id.edttextName);
        edttextAddress= (EditText) findViewById(R.id.edttextAddress);
        edttextPhone =(EditText) findViewById(R.id.edttextPhone);
        edttextCourse_code= (EditText) findViewById(R.id.edttextCourse_code);

        btnSave = (Button) findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProfie();
            }
        });

    }
    private void addProfie() {
        String name =edttextName.getText().toString().trim();
        String address = edttextAddress.getText().toString().trim();
        String phone =edttextPhone.getText().toString().trim();
        String Course =edttextCourse_code.getText().toString().trim();

        if(!TextUtils.isEmpty(name)) {
            String id = datbaseArtist.push().getKey();
            addedtprofile artist = new addedtprofile (id, name, address,  phone, Course);
            datbaseArtist.child(id).setValue(artist);
            Toast.makeText(this, "Artist Added", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "You Should enter a name", Toast.LENGTH_SHORT).show();
        }

    }


}
