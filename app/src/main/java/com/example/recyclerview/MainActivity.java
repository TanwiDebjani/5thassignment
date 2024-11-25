package com.example.recyclerview;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapter.RecyclerViewAdapter;
import com.example.recyclerview.model.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    List<Model> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        modelList = new ArrayList<>();
        modelList.add(new Model("Opekka", "Opekkha by Humayun Ahmed is a poignant exploration of longing, unspoken emotions, and the complexities of human relationships.", R.drawable.img_4
        ));
        modelList.add(new Model("Shesher kobita", "Sesher Kobita is a remarkable love poem by Rabindranath Tagore that beautifully portrays human emotions and nature, capturing the deepest expressions of the heart.", R.drawable.img_1));
        modelList.add(new Model("Devdas", "Devdas is a tragic novel by Sarat Chandra Chattopadhyay that explores the themes of unrequited love, despair, and self-destruction.", R.drawable.img_2));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(modelList, this);
        recyclerView.setAdapter(adapter);
    }
}


