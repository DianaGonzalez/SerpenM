package com.example.edgarmeneses.serpenm;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class ActivityOptions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        ImageView imageViewChange = (ImageView) findViewById(R.id.imgChanges);
        imageViewChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToChange();
            }
        });

        ImageView imageViewPassword = (ImageView) findViewById(R.id.imgPassword);
        imageViewPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToPassword();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void navigateToChange(){
        Intent intent = new Intent(ActivityOptions.this,ActivityChange.class);
        startActivity(intent);
    }

    public void navigateToPassword(){
        Intent intent = new Intent(ActivityOptions.this, ActivityPassword.class);
        startActivity(intent);
    }
}
