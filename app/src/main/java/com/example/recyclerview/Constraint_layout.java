package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Constraint_layout extends AppCompatActivity {

    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint_layout);

        btn = findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Constraint_layout.this, "hii...!!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Constraint_layout.this , Tablelayout.class);
                startActivity(intent);
            }
        });
    }
}