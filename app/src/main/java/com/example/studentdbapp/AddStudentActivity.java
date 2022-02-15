package com.example.studentdbapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudentActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4;
    AppCompatButton b1,b2;
    String getname,getadmn,getrollno,getclg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.admn);
        ed3=(EditText) findViewById(R.id.rollno);
        ed4=(EditText) findViewById(R.id.clg);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.menu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getadmn=ed2.getText().toString();
                getrollno=ed3.getText().toString();
                getclg=ed4.getText().toString();
                Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getadmn, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getrollno, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), getclg, Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}