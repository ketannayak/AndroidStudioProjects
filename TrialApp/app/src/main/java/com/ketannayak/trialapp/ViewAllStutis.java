package com.ketannayak.trialapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ViewAllStutis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_stutis);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /*Called when the user clicks the View All Stutis button */
    public void RamnathStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.ramnath_stuti_page_title));
        intent.putExtra("pagecontent", getResources().getString(R.string.ramnath_stuti_fulltext));
        intent.putExtra("nextpagetitle", getResources().getString(R.string.shantadurga_stuti_page_title));
        intent.putExtra("nextpagecontent", getResources().getString(R.string.shantadurga_stuti_fulltext));
        //intent.putExtra("previousfunc", ViewAllStutis.class);
        //intent.putExtra("nextfunc", ShantadurgaStutiView.class);
        startActivity(intent);
    }


    public void ShantadurgaStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.shantadurga_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.shantadurga_stuti_fulltext));
        //intent.putExtra("previousfunc",RamnathStutiView);
        //intent.putExtra("nextfunc",ViewAllStutis.class);
        startActivity(intent);
    }


    public void LakshminarayanStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.lakshminarayan_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.lakshminarayan_stuti_fulltext));
        startActivity(intent);
    }


    public void KamakshiStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.kamakshi_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.kamakshi_stuti_fulltext));
        startActivity(intent);
    }


    public void GanapatiStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.ganapati_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.ganapati_stuti_fulltext));
        startActivity(intent);
    }


    public void BetalStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.betal_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.betal_stuti_fulltext));
        startActivity(intent);
    }


    public void KalabhairavStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.kalabhairav_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.kalabhairav_stuti_fulltext));
        startActivity(intent);
    }


    public void MangalashtakamStutiView(View view) {
        //Do something in response to the button
        Intent intent = new Intent(this,Ramnath_Stuti.class);
        intent.putExtra("pagetitle",getResources().getString(R.string.mangalashtakam_stuti_page_title));
        intent.putExtra("pagecontent",getResources().getString(R.string.mangalashtakam_stuti_fulltext));
        startActivity(intent);
    }


}
