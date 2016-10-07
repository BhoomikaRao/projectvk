package com.example.bhoomikarrao.projectvk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    TextView t2;
    TextView t3;
    Button b9;
    Button b10;
    RadioGroup rg1;
    RadioButton rb1,r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t2=(TextView)findViewById(R.id.textView);
        t3=(TextView)findViewById(R.id.textView3);
        b9=(Button)findViewById(R.id.button6);
        b10=(Button)findViewById(R.id.button7);
        rg1=(RadioGroup)findViewById(R.id.rg1);
        rb1=(RadioButton)findViewById(R.id.radioButton6);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id=rg1.getCheckedRadioButtonId();
                r=(RadioButton)findViewById(id);
                String answer=r.getText().toString();
                Toast.makeText(Main6Activity.this, "correct answer", Toast.LENGTH_SHORT).show();

            }
        });
        b10=(Button)findViewById(R.id.button6);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Main6Activity.this,Main7Activity.class);
                startActivity(in);
            }
        });






    }
}
