package com.example.quizeapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    List list= new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView)findViewById(R.id.l);
        list.add(11811342);
        list.add(11811343);
        list.add(11811344);
        list.add(11811345);
        list.add(11811346);
        list.add(11811347);
        list.add(11811348);
        list.add(11811349);
        list.add(11811350);
        list.add(11811351);
        list.add(11811352);
        list.add(11811353);
        list.add(11811354);
        list.add(11811355);

        adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_expandable_list_item_1,list);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(),quess.class);
                startActivity(intent);

            }
        });

    }
}