package com.tarun.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecyclerView();

    }

    private void initRecyclerView() {
        mRecyclerView = findViewById(R.id.mRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        adapter = new UserAdapter(userList);
        mRecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.adam,
                "adam.dev","Adam | Web developer"));

        userList.add(new ModelClass(R.drawable.carol,
                "carolcodes","Carol | iOS developer"));

        userList.add(new ModelClass(R.drawable.cynthia,
                "cynthia.ui","Cynthia UI/UX"));

        userList.add(new ModelClass(R.drawable.daniel,
                "danieldev","Daniel | Android developer"));

        userList.add(new ModelClass(R.drawable.david,
                "davidui","David | UI Designer"));

        userList.add(new ModelClass(R.drawable.emma,
                "emma_codes","Emma | Flutter dev"));

        userList.add(new ModelClass(R.drawable.harry,
                "coderharry","Harry | ML | AI"));

        userList.add(new ModelClass(R.drawable.kevin,
                "kevin.dev","Kevin | Game developer"));

        userList.add(new ModelClass(R.drawable.lisa,
                "lisa.ui","Lisa | UI Designer"));

        userList.add(new ModelClass(R.drawable.michele,
                "michele.design","Michele | Illustrator"));

        userList.add(new ModelClass(R.drawable.rebecca,
                "rebecca.codes","Rebecca | Android Developer"));

        userList.add(new ModelClass(R.drawable.stephen,
                "stephen.tech","Tech Enthusiast"));

        userList.add(new ModelClass(R.drawable.susan,
                "susan.ui","Susan | UI Designer"));

        userList.add(new ModelClass(R.drawable.tiffany,
                "tiffanycodes","Tiffany | Programmer"));

        userList.add(new ModelClass(R.drawable.tracy,
                "tracy_ui","Tracy | UI/UX"));

        userList.add(new ModelClass(R.drawable.yennefer,
                "yennefer.web","Web designer"));
    }
}
