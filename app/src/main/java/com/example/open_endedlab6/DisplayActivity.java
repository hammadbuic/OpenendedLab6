package com.example.open_endedlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayActivity extends AppCompatActivity {
    EditText etNames,etEnrolls,etSubjects1,etSubjects2,etSubjects3,etSubjects4,etSubjects5;
    Button btntsk2,btnTsk3;
    private void showCustomToast(String s){
        //method for displaying custom toast
        LayoutInflater layoutInflater=getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.customToastLayout));
        TextView toasttext = layout.findViewById(R.id.textCustomToast);
        toasttext.setText(s);
        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
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
        //Referencing task2 and task 3 buttons
        btntsk2=(Button)findViewById(R.id.btnTask2);
        btnTsk3=(Button)findViewById(R.id.btnTask3);
        //Launching Task 2 Activity by pressing task2 btn
        btntsk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DisplayActivity.this,Task2Activity.class);
                startActivity(intent);
                showCustomToast("Going to Task 2 Activity");
            }
        });
        //Launching Task 3 activity when Task 3 button is pressed
        btnTsk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(DisplayActivity.this,Task3Activity.class);
                startActivity(intent1);
                showCustomToast("Going to Task 3 Activity");
            }
        });
    }
}
