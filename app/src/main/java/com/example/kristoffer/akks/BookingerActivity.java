package com.example.kristoffer.akks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BookingerActivity extends AppCompatActivity {

    private ListView reservasjoner;

    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_bookinger);

        reservasjoner = (ListView) findViewById(R.id.reservasjoner);

        List<String> reservert = new ArrayList<>();
        reservert.add("Rom A 1400 1600");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                reservert );

        reservasjoner.setAdapter(arrayAdapter);
    }
}