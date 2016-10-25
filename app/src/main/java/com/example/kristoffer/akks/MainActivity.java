package com.example.kristoffer.akks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

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

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
