package com.example.naruto.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PopularMoviePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_movie_page);
        //checking for the network connectivity
        if(Network_state.IsNetworkAvailable(getApplicationContext())){
            SetMovieView();
        }else{
            SetAlertView();
        }
    }


    //creating fragment view of the movie app
    private void SetMovieView() {
        //creating and begning transaction of the popular movie app
        getSupportFragmentManager().beginTransaction().add(R.id.popular_movies_container, new PopularMovieFragment()).commit();
    }
    //inflating the network alert dialogue
    private void SetAlertView(){
        //set the view to alert view
        setContentView(R.layout.network_alert_page);
    }

}
