package com.example.open_endedlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class DisplayActivity extends AppCompatActivity {
    EditText etNames,etEnrolls,etSubjects1,etSubjects2,etSubjects3,etSubjects4,etSubjects5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //Referencing EditText with XML
        etNames=(EditText)findViewById(R.id.etdisName);
        etEnrolls=(EditText)findViewById(R.id.etdisEnroll);
        etSubjects1=(EditText)findViewById(R.id.etdisGrade1);
        etSubjects2=(EditText)findViewById(R.id.etdisGrade2);
        etSubjects3=(EditText)findViewById(R.id.etdisGrade3);
        etSubjects4=(EditText)findViewById(R.id.etdisGrade4);
        etSubjects5=(EditText)findViewById(R.id.etdisGrade5);
        //Displaying data got from first activity
        Intent intent=getIntent();
        etNames.setText(intent.getStringExtra("name"));
        etEnrolls.setText(intent.getStringExtra("enroll"));
        etSubjects1.setText(intent.getStringExtra("grades1"));
        etSubjects2.setText(intent.getStringExtra("grades2"));
        etSubjects3.setText(intent.getStringExtra("grades3"));
        etSubjects4.setText(intent.getStringExtra("grades4"));
        etSubjects5.setText(intent.getStringExtra("grades5"));
    }
}
