package com.example.kristoffer.akks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;


public class LokalerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // View finders and on click listeners for the different rooms
        CardView card_view_a = (CardView) findViewById(R.id.card_view_a);
        card_view_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_aIntent = new Intent(LokalerActivity.this, RomA.class);
                startActivity(rom_aIntent);
            }
        });

        CardView card_view_b = (CardView) findViewById(R.id.card_view_b);
        card_view_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_bIntent = new Intent(LokalerActivity.this, RomB.class);
                startActivity(rom_bIntent);
            }
        });

        CardView card_view_c = (CardView) findViewById(R.id.card_view_c);
        card_view_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_cIntent = new Intent(LokalerActivity.this, RomC.class);
                startActivity(rom_cIntent);
            }
        });

        CardView card_view_d = (CardView) findViewById(R.id.card_view_d);
        card_view_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_dIntent = new Intent(LokalerActivity.this, RomD.class);
                startActivity(rom_dIntent);
            }
        });

        CardView card_view_e = (CardView) findViewById(R.id.card_view_e);
        card_view_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_eIntent = new Intent(LokalerActivity.this, RomE.class);
                startActivity(rom_eIntent);
            }
        });


    }

}
