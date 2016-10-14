package com.example.kristoffer.akks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lokaler(View v)
    {
        Intent intent;
        switch (v.getId())  {
            case R.id.lokaler: // R.id.textView1
                intent = new Intent(this, Second.class);
        }
        startActivity(intent)
    }



}
