package com.ketannayak.trialapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.EditText;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Locale;
import android.content.res.Configuration;
import android.util.Log;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        Configuration config = getBaseContext().getResources().getConfiguration();

        String lang = settings.getString("language_preference", "");


        //TextView textviewsetting = (TextView)findViewById(R.id.copyright_text);
        //textviewsetting.setText(lang);

        if (! "".equals(lang) && ! config.locale.getLanguage().equals(lang)) {
            Locale locale = new Locale(lang);
            Locale.setDefault(locale);
            config.locale = locale;
            getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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

    /*Called when the user clicks the View All Stutis button */
    public void viewAllStutis(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,ViewAllStutis.class);
        startActivity(intent);

    }

    /*Called when the user clicks the View All Stutis button */
    public void viewSettings(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);

    }



}


