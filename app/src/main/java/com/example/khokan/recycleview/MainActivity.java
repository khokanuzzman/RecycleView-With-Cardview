package com.example.khokan.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

    }
}
