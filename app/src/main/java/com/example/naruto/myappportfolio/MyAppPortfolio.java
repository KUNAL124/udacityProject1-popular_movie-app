package com.example.naruto.myappportfolio;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.naruto.myappportfolio.LogDisplay.Toast_making;

//launcher activity
public class MyAppPortfolio extends AppCompatActivity {

    //creating objects for Buttons
    Button popular_movies;
    Button stock_hawk;
    Button build_it_bigger;
    Button make_your_app_material;
    Button go_qbiquitous;
    Button capstone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //get the current orientation and inflate proper view
        onConfigurationChanged(getResources().getConfiguration());
        //functioning of buttons when configuration not changed at all
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE){
            //set the landscape view
            setContentView(R.layout.activity_my_app_portfolio_landscape);
            //functioning of buttons when configuration changed to landscape
            ButtonFunctioning();
        }else{
            //set the portrait view
            setContentView(R.layout.activity_my_app_portfolio);
            //functioning of buttons when configuration changed to portrait
            ButtonFunctioning();
        }
    }
    public void ButtonFunctioning(){
        //assosiating all button objects with the resource ids
        popular_movies=(Button)findViewById(R.id.popular_movies);
        stock_hawk=(Button)findViewById(R.id.stock_hawk);
        build_it_bigger=(Button)findViewById(R.id.build_it_bigger);
        make_your_app_material=(Button)findViewById(R.id.make_your_app_material);
        go_qbiquitous=(Button)findViewById(R.id.go_ubiquitous);
        capstone=(Button)findViewById(R.id.capstone);
        //Array of string object to show message in toast
        final String[] message = new String[6];
        //creating six messages to show in toat for different onclick listeners
        message[0]="Launching my popular movie app!!!";
        message[1]="Launching my stock hawk app!!!";
        message[2]="Launching my build it bigger app!!!";
        message[3]="Launching my make your app material app!!!";
        message[4]="Launching my go ubiquitous app!!!";
        message[5]="Launching my capstone app!!!";
        //onclick call for popular movies
        popular_movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[0]);
                startActivity(new Intent(getApplicationContext(),PopularMoviePage.class));
            }
        });

        //on click for stock hawk
        stock_hawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[1]);
            }
        });

        //on click for build it bigger
        build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[2]);
            }
        });

        //on click for  make your app material
        make_your_app_material.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[3]);
            }
        });

        //on click for go ubiquitous
        go_qbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[4]);
            }
        });

        //on click for capstone
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast_making.short_length(getApplicationContext(),message[5]);
            }
        });
    }
}
