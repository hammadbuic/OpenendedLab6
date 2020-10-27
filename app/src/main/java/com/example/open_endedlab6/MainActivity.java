package com.example.open_endedlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReset,btnCalculate;
    EditText etName,etEnrollment,etSubject1,etSubject2,etSubject3,etSubject4,etSubject5;
    String enteredName,enteredEnroll;
    String grade1,grade2,grade3,grade4,grade5;
    int enteredSubject1,enteredSubject2,enteredSubject3,enteredSubject4,enteredSubject5;
    private String calcGrades(int marks){
        String grade;
        if(marks>=50 && marks<60){
            grade="D";
        }
        else if(marks>=60 && marks<66){
            grade="C";
        }
        else if(marks>=66 && marks< 72){
            grade="C+";
        }
        else if(marks>=72 && marks<80)
        {
            grade="B";
        }
        else if(marks>=80 && marks<86){
            grade="B+";
        }
        else if(marks>=86 && marks<99)
        {
            grade="A";
        }
        else{
            grade="F";
        }
        return grade;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Referencing buttons to the xml
        btnReset=(Button)findViewById(R.id.btnReset);
        btnCalculate=(Button)findViewById(R.id.btnCalc);
        //Referencing text with XML for inputs
        etName=(EditText)findViewById(R.id.etName);
        etEnrollment=(EditText)findViewById(R.id.etEnroll);
        etSubject1=(EditText)findViewById(R.id.etSubject1);
        etSubject2=(EditText)findViewById(R.id.etSubject2);
        etSubject3=(EditText)findViewById(R.id.etSubject3);
        etSubject4=(EditText)findViewById(R.id.etSubject4);
        etSubject5=(EditText)findViewById(R.id.etSubject5);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Resetting the Edit Text
                etName.setText("");
                etEnrollment.setText("");
                etSubject1.setText("");
                etSubject2.setText("");
                etSubject3.setText("");
                etSubject4.setText("");
                etSubject5.setText("");
            }
        });
        //going in the second activity
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enteredName=etName.getText().toString();
                enteredEnroll=etEnrollment.getText().toString();
                enteredSubject1=Integer.parseInt(etSubject1.getText().toString());
                enteredSubject2=Integer.parseInt(etSubject2.getText().toString());
                enteredSubject3=Integer.parseInt(etSubject3.getText().toString());
                enteredSubject4=Integer.parseInt(etSubject4.getText().toString());
                enteredSubject5=Integer.parseInt(etSubject5.getText().toString());
                //Getting grades for the Subjects
                grade1=calcGrades(enteredSubject1);
                grade2=calcGrades(enteredSubject2);
                grade3=calcGrades(enteredSubject3);
                grade4=calcGrades(enteredSubject4);
                grade5=calcGrades(enteredSubject5);
                Intent intent=new Intent(MainActivity.this,DisplayActivity.class);
                //Sending data to the second activity
                intent.putExtra("name",enteredName);
                intent.putExtra("enroll",enteredEnroll);
                intent.putExtra("grades1",grade1);
                intent.putExtra("grades2",grade2);
                intent.putExtra("grades3",grade3);
                intent.putExtra("grades4",grade4);
                intent.putExtra("grades5",grade5);
                Toast.makeText(getApplicationContext(),"Wait While We process your information",Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
