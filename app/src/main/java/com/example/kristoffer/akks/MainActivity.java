package com.example.kristoffer.akks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class MainActivity extends AppCompatActivity {

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // View finders and click listeners
        TextView reserver = (TextView) findViewById(R.id.reserver);
        reserver.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reserverIntent = new Intent(MainActivity.this, ReserverActivity.class);
                startActivity(reserverIntent);
            }
        });

        TextView bookinger = (TextView) findViewById(R.id.bookinger);
        bookinger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bookingerIntent = new Intent(MainActivity.this, BookingerActivity.class);
                startActivity(bookingerIntent);
            }
        });

        TextView lokaler = (TextView) findViewById(R.id.lokaler);
        lokaler.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the lokaler category is clicked
            @Override
            public void onClick(View view) {
                Intent lokalerIntent = new Intent(MainActivity.this, LokalerActivity.class);
                startActivity(lokalerIntent);
            }

        });

        TextView om = (TextView) findViewById(R.id.om);
        om.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent omIntent = new Intent(MainActivity.this, OmActivity.class);
                startActivity(omIntent);
            }
        });

        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page")
                .setUrl(Uri.parse("http://www.akks.no/bergen"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

}
