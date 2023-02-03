package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class framelayout extends AppCompatActivity {

    Button next_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout);
        next_btn = findViewById(R.id.next);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(framelayout.this,constrain_ex.class);
                startActivity(intent);
            }
        });

        FrameLayout frame=(FrameLayout)findViewById(R.id.frameLayout);
        frame.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int width = frame.getMeasuredWidth();
        int height = frame.getMeasuredHeight();
        Toast.makeText(getApplicationContext(),"width="+width+"  height="+height,Toast.LENGTH_SHORT).show();
    }
}