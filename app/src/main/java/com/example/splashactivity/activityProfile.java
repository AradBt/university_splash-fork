package com.example.splashactivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activityProfile extends AppCompatActivity {

private TextView showName;
private TextView showGender;
private TextView showAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);

        showName = findViewById(R.id.tv_main);
        showGender = findViewById(R.id.tv_main2);
        showAge = findViewById(R.id.tv_main3);

        String userName = getIntent().getStringExtra("INPUT_NAME");
        String gender = getIntent().getStringExtra("INPUT_GENDER");
        String age = getIntent().getStringExtra("INPUT_AGE");
        showName.setText(userName);
        showGender.setText(gender);
        showAge.setText(age);
    }
}
