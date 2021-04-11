package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvThing;
    private ElectricThinAdapter electricThinAdapter;
    private ArrayList<ElectricThing> electricThings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvThing = findViewById(R.id.rcvThing);
        electricThings = new ArrayList<>();
        electricThings.add(new ElectricThing("day cuon 1", 100, 1000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 2", 100, 10000000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 3", 100, 1000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 4", 100, 1000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 2", 100, 10000000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 3", 100, 1000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 4", 100, 1000, 2000, R.drawable.giacchuyen1, 20));
        electricThings.add(new ElectricThing("day cuon 4", 100, 1000, 2000, R.drawable.giacchuyen1, 20));



        electricThinAdapter = new ElectricThinAdapter(this, electricThings);
        rcvThing.setAdapter(electricThinAdapter);


       // rcvThing.setLayoutManager(new LinearLayoutManager(this));

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        rcvThing.setLayoutManager(gridLayoutManager);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rcvThing.setLayoutManager(linearLayoutManager);
    }
}