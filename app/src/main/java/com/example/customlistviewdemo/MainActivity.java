package com.example.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView simplelist;
    ArrayList<Item> animallist=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simplelist=findViewById(R.id.listview);
        animallist.add(new Item("Lion",R.raw.lion));
        animallist.add(new Item("Tiger",R.raw.tiger));
        animallist.add(new Item("Monkey",R.raw.monkey));
        animallist.add(new Item("Elephant",R.raw.elephant));
        animallist.add(new Item("Dog",R.raw.dog));
        animallist.add(new Item("Cat",R.raw.cat));;
        animallist.add(new Item("Money",R.raw.money));
        animallist.add(new Item("Jenny",R.raw.jenny));;

        MyAdapter myAdapter=new MyAdapter(this,R.layout.items,animallist);
        simplelist.setAdapter(myAdapter);
    }
}
