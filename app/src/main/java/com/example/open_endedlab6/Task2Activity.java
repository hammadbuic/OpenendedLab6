package com.example.open_endedlab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Task2Activity extends AppCompatActivity {
    Button btnToast;
    EditText customText;
    Spinner spinner;
    private void showCustomToast(String msg,String pos){
        //method for displaying custom toast
        LayoutInflater layoutInflater=getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.customToastLayout));
        TextView toasttext = layout.findViewById(R.id.textCustomToast);
        Toast toast=new Toast(getApplicationContext());
        if(pos.equals("Top-Left")){
            toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
        }
        else if(pos.equals("Top-Right")){
            toast.setGravity(Gravity.TOP|Gravity.RIGHT,0,0);
        }
        else if(pos.equals("Bottom-Left")){
            toast.setGravity(Gravity.BOTTOM|Gravity.LEFT,0,0);
        }
        else if(pos.equals("Bottom-Right")){
            toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT,0,0);
        }
        toasttext.setText(msg);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        //Referencig Component with XML
        spinner=(Spinner)findViewById(R.id.spinnerPosition);
        btnToast=(Button)findViewById(R.id.btnToastDisplay);
        customText=(EditText)findViewById(R.id.etCustomText);
        //Populating Spinner Items from resources
        ArrayAdapter<CharSequence> arrayAdapter = ArrayAdapter.createFromResource(this,R.array.positionArray,R.layout.support_simple_spinner_dropdown_item);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        //Displaying Custom Toast
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String toastMsg = customText.getText().toString();
                String enteredPosition=spinner.getSelectedItem().toString();
                showCustomToast(toastMsg,enteredPosition);
            }
        });
    }
}
