package com.example.splashactivity;





import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputData = findViewById(R.id.edt_input);
        EditText inputData2 = findViewById(R.id.edt_input2);
        EditText inputData3 = findViewById(R.id.edt_input3);
        Button sendData = findViewById(R.id.btn_submited);

        sendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = inputData.getText().toString().trim();
                String gender = inputData2.getText().toString().trim();
                String age = inputData3.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, activityProfile.class);
                intent.putExtra("INPUT_NAME", name);
                intent.putExtra("INPUT_GENDER", gender);
                intent.putExtra("INPUT_AGE", age);
                startActivity(intent);
            }
        });

    }
}