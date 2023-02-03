package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Tablelayout extends AppCompatActivity {
Button login_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablelayout);
        login_btn = findViewById(R.id.loginBtn);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Tablelayout.this, "going to frame layout", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Tablelayout.this , framelayout.class);
                startActivity(intent);
            }
        });
    }
}