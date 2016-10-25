package com.example.kchw1.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Coach_Mode extends AppCompatActivity {

    Button exercise_list_1;
    Button exercise_list_2;
    Button exercise_list_3;
    Button exercise_list_4;
    Button exercise_list_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coach__mode);

        exercise_list_1 = (Button) findViewById(R.id.ex_list_1);
        exercise_list_2 = (Button) findViewById(R.id.ex_list_2);
        exercise_list_3 = (Button) findViewById(R.id.ex_list_3);
        exercise_list_4 = (Button) findViewById(R.id.ex_list_4);
        exercise_list_5 = (Button) findViewById(R.id.ex_list_5);

        exercise_list_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Timer.class);
                startActivity(intent);
            }
        });

        exercise_list_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Timer.class);
                startActivity(intent);
            }
        });

        exercise_list_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Timer.class);
                startActivity(intent);
            }
        });

        exercise_list_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Timer.class);
                startActivity(intent);
            }
        });

        exercise_list_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Coach_Timer.class);
                startActivity(intent);
            }
        });
    }
}
