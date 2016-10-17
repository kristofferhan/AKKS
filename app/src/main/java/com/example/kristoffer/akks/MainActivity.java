package com.example.kristoffer.akks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the reserver category
        TextView reserver = (TextView) findViewById(R.id.reserver);

        // Set a click listener on that View
        reserver.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ReserverActivity}
                Intent reserverIntent = new Intent(MainActivity.this, ReserverActivity.class);

                // Start the new activity
                startActivity(reserverIntent);
            }
        });

        // Find the View that shows the bookinger categoty
        TextView bookinger = (TextView) findViewById(R.id.bookinger);

        // Set a click listener on that View
        bookinger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link BookingerActivity}
                Intent bookingerIntent = new Intent(MainActivity.this, BookingerActivty.class);

                // Start the new activity
                startActivity(bookingerIntent);
            }
        });

        // Find the View that shows the lokaler category
        TextView lokaler = (TextView) findViewById(R.id.lokaler);

        // Set a click listener on that View
        lokaler.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the lokaler category is clicked
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LokalerActivity}
                Intent lokalerIntent = new Intent(MainActivity.this, LokalerActivity.class);

                // Start the new activity
                startActivity(lokalerIntent);
            }

        });

        // Find the View that shows the om categoty
        TextView om = (TextView) findViewById(R.id.om);

        // Set a click listener on that View
        om.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OmActivity}
                Intent omIntent = new Intent(MainActivity.this, OmActivity.class);

                // Start the new activity
                startActivity(omIntent);
            }
        });

    }


}
