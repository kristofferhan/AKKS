package com.example.kristoffer.akks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class LokalerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView rom_a = (TextView) findViewById(R.id.rom_a);
        rom_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_aIntent = new Intent(LokalerActivity.this, RomA.class);
                startActivity(rom_aIntent);
            }
        });

        TextView rom_b = (TextView) findViewById(R.id.rom_b);
        rom_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_bIntent = new Intent(LokalerActivity.this, RomB.class);
                startActivity(rom_bIntent);
            }
        });

        TextView rom_c = (TextView) findViewById(R.id.rom_c);
        rom_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_cIntent = new Intent(LokalerActivity.this, RomC.class);
                startActivity(rom_cIntent);
            }
        });

        TextView rom_d = (TextView) findViewById(R.id.rom_d);
        rom_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_dIntent = new Intent(LokalerActivity.this, RomD.class);
                startActivity(rom_dIntent);
            }
        });

        TextView rom_e = (TextView) findViewById(R.id.rom_e);
        rom_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rom_eIntent = new Intent(LokalerActivity.this, RomE.class);
                startActivity(rom_eIntent);
            }
        });


    }

}
