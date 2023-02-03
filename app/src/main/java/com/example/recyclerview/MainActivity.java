package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    ArrayList<String> dataSource;
    LinearLayoutManager linearlayoutmanager;
    ImageButton img_btn;

    MyRvAdapter  myRvadapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.r_view);
        img_btn =findViewById(R.id.home_btn);

        //setting data source
        dataSource = new ArrayList<String>();
        dataSource.add(new String("My Course"));
        dataSource.add("Identity");
        dataSource.add("UI/UX");
        dataSource.add("Branding");


        img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "created home btn", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , Constraint_layout.class );
                startActivity(intent);

            }
        });

        linearlayoutmanager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        myRvadapter = new MyRvAdapter(dataSource);
        rv.setLayoutManager(linearlayoutmanager);
        rv.setAdapter(myRvadapter);
    }
    class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.MyHolder>{
        ArrayList<String> data;
        public MyRvAdapter(ArrayList<String> data) {
           this.data = data;
        }

        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.button,parent,false);
            return new MyHolder(view);
        }

        @SuppressLint("ResourceAsColor")
        @Override
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            holder.Title.setText(data.get(position));

//            if(position==0){
//                holder.Title.setBackgroundColor(R.color.purple_200);                      // color = btn_pink
//            }else if(position == 1 || position== 2 || position == 3){
//                holder.Title.setBackgroundColor(R.color.teal_200);                       // color = h_s_btn
//            }
//            else {
//                holder.Title.setBackgroundColor(R.color.teal_200);
//            }

        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        class MyHolder extends RecyclerView.ViewHolder{

                TextView Title;
            public MyHolder(@NonNull View itemView) {
                super(itemView);
                Title = itemView.findViewById(R.id.title);
            }
        }

    }
}
