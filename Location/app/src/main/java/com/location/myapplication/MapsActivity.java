package com.location.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity implements OnClickListener {
    Button oneTimeLocation;
    Button continuousUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneTimeLocation=(Button)findViewById(R.id.button1);
        continuousUpdate=(Button)findViewById(R.id.button2);
        oneTimeLocation.setOnClickListener(this);
        continuousUpdate.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent intent = new Intent(this, GettingLocation.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, GettingUpdatedLocation.class);
                startActivity(intent2);
                break;

        }
    }
}