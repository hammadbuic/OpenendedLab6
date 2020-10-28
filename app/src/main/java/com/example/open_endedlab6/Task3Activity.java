package com.example.open_endedlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Task3Activity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnClear,btnAdd,btnSub,btnMul,btnDiv,btnEqual;
    EditText etNumbers;
    float valOne,valTwo;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        //Referencing all the elements with xml
        etNumbers=(EditText)findViewById(R.id.etNumbers);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        //Setting Buttons for input in text box
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText(etNumbers.getText()+"9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumbers==null){
                    etNumbers.setText("");
                } else {
                    valOne=Float.parseFloat(etNumbers.getText()+"");
                    add=true;
                    etNumbers.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumbers==null){
                    etNumbers.setText("");
                } else {
                    valOne=Float.parseFloat(etNumbers.getText()+"");
                    sub=true;
                    etNumbers.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumbers==null){
                    etNumbers.setText("");
                } else {
                    valOne=Float.parseFloat(etNumbers.getText()+"");
                    mul=true;
                    etNumbers.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etNumbers==null){
                    etNumbers.setText("");
                } else {
                    valOne=Float.parseFloat(etNumbers.getText()+"");
                    div=true;
                    etNumbers.setText(null);
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNumbers.setText("");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valTwo=Float.parseFloat(etNumbers.getText()+"");
                if(add==true){
                    etNumbers.setText(valOne + valTwo + "");
                    Toast.makeText(getApplicationContext(),"Result after addition is "+etNumbers.getText().toString(),Toast.LENGTH_SHORT).show();
                    add=false;
                }
                if(sub==true){
                    etNumbers.setText(valOne-valTwo+"");
                    Toast.makeText(getApplicationContext(),"Result after Subtraction is "+etNumbers.getText().toString(),Toast.LENGTH_SHORT).show();
                    sub=false;
                }
                if(mul==true){
                    etNumbers.setText(valOne*valTwo+"");
                    Toast.makeText(getApplicationContext(),"Result after Multiplication is is "+etNumbers.getText().toString(),Toast.LENGTH_SHORT).show();
                    mul=false;
                }
                if(div==true){
                    etNumbers.setText(valOne/valTwo+"");
                    Toast.makeText(getApplicationContext(),"Result after Division is "+etNumbers.getText().toString(),Toast.LENGTH_SHORT).show();
                    div=false;
                }
            }
        });
    }
}
