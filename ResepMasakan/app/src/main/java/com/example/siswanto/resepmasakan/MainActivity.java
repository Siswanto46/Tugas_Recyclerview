package com.example.siswanto.resepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[];
    int imageResource[]={R.drawable.nasigoreng,R.drawable.gurami,R.drawable.sate,R.drawable.gulai,R.drawable.semur};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView)findViewById(R.id.myRecycler);

        s1 = getResources().getStringArray(R.array.judul);
        s2 = getResources().getStringArray(R.array.deskripsi);

        ad = new MyOwnAdapter(this, s1, s2, imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
