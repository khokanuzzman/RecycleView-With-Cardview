package com.example.khokan.recycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView= findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] title={
          "khokan",
          "Rokan",
          "shipon",
          "Milton",
          "shawon",
          "papon",
          "Rasel",
          "shumon"
        };

        String [] desc={
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",
          "Android and Web Developer",

        };

        recyclerView.setAdapter(new RecycleAdapter(title,desc));

        Button show_volly= findViewById(R.id.vollydata);
        show_volly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,MyVollyList.class);
                startActivity(intent);
            }
        });

    }
}
