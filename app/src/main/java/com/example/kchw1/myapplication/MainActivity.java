package com.example.kchw1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button personal_mode;
    Button coach_mode;
    Button calendar_mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personal_mode = (Button) findViewById(R.id.ps_mode);
        coach_mode = (Button) findViewById(R.id.c_mode);
        calendar_mode = (Button) findViewById(R.id.calendar);

        personal_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Personal_Mode.class);
                startActivity(intent);
            }
        });

        coach_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Mode.class);
                startActivity(intent);
            }
        });

        calendar_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Calendar.class);
                startActivity(intent);
            }
        });
    }

}
