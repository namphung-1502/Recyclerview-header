package com.sict.app.sectionrecyclerviewheader;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import com.sict.app.sectionrecyclerviewheader.adapter.personAdapter;
import com.sict.app.sectionrecyclerviewheader.model.person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Object> list;
    personAdapter adapter;
    RecyclerView rcv;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView)findViewById(R.id.rcv);
        list = new ArrayList<>();
        list.add("A");
        list.add(new person("Nam","0348374832"));
        list.add(new person("Huy","543543534"));
        list.add(new person("Khai","4253453345"));
        list.add("B");
        list.add(new person("Tuan","5457657568"));
        list.add(new person("Manh","234345566644"));
        list.add(new person("Truong","633533345"));
        list.add("C");
        list.add(new person("An","6547567585"));
        list.add(new person("Vu","2526266662"));
        list.add(new person("Khanh","5675685885"));

        adapter = new personAdapter(list);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adapter);

    }
}
