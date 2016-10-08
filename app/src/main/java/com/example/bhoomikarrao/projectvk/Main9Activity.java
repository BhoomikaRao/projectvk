package com.example.bhoomikarrao.projectvk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {
    Button b15;
    TextView t9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        t9=(TextView)findViewById(R.id.textView4);
        b15=(Button)findViewById(R.id.button8);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main9Activity.this, "Are You Sure You Want To End The Quiz", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
