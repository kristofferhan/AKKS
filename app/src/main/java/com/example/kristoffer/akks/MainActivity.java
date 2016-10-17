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
    }




}
