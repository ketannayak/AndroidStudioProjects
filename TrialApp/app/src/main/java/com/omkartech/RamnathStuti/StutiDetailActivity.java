package com.omkartech.RamnathStuti;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StutiDetailActivity extends AppCompatActivity {

    TextView Stuti_page_fulltext;
    TextView Stuti_page_title;
    Button previousbutton;
    Button nextbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stutidetailactivitylayout);

        //Assign the title and the content in the new activity being created
        Stuti_page_fulltext = (TextView) findViewById(R.id.Ramnath_stuti_page_fulltext);
        Stuti_page_title = (TextView) findViewById(R.id.Ramnath_stuti_page_title);

        Intent intent = getIntent();

        String pagetitle = intent.getStringExtra("pagetitle");
        String fulltext = intent.getStringExtra("pagecontent");

        Stuti_page_title.setText(pagetitle);
        Stuti_page_fulltext.setText(fulltext);

    }

    /*Called when the user clicks the View All Stutis button */
    public void AllStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,AllStutisActivity.class);
        startActivity(intent);
    }



}
