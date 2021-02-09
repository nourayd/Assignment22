package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button a1;
    EditText c1;
    TextView b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1= (Button) findViewById(R.id.a);
        c1= (EditText) findViewById(R.id.c);
        b1= (TextView) findViewById(R.id.b);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = c1.getText().toString();
                b1.setText("Hello ,"+ str);
            }
        });

    }
}