package com.ketannayak.trialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Method;

public class Ramnath_Stuti extends AppCompatActivity {

    TextView Stuti_page_fulltext;
    TextView Stuti_page_title;
    Button previousbutton;
    Button nextbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramnath_stuti);

        //Assign the title and the content in the new activity being created
        Stuti_page_fulltext = (TextView) findViewById(R.id.Ramnath_stuti_page_fulltext);
        Stuti_page_title = (TextView) findViewById(R.id.Ramnath_stuti_page_title);

        Intent intent = getIntent();

        String pagetitle = intent.getStringExtra("pagetitle");
        String fulltext = intent.getStringExtra("pagecontent");

        Stuti_page_title.setText(pagetitle);
        Stuti_page_fulltext.setText(fulltext);

        /*
        //Assign the onclick actions for each of the previous and the next buttons
        Button previousButton = (Button) findViewById(R.id.ramnath_stuti_page_previous);
        assert previousButton != null;
        previousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AllStutiView(v);

            }
        });


        Button nextButton = (Button) findViewById(R.id.ramnath_stuti_page_next);
        assert nextButton != null;
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Method method = getClass().getMethod("ShantadurgaStutiView", );
                method.invoke(this,v);
            }
        });

        */

    }

    /*Called when the user clicks the View All Stutis button */
    public void AllStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,ViewAllStutis.class);
        startActivity(intent);
    }



}
