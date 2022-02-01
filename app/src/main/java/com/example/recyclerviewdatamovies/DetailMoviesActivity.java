package com.example.recyclerviewdatamovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailMoviesActivity extends AppCompatActivity {

    TextView textViewTittle, textViewRating, textViewGenre, textViewReleaseDate, textViewDirector, textViewDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movies);

        textViewTittle = findViewById(R.id.tvTittle);
        textViewRating = findViewById(R.id.tvRating);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

        Movies movies = getIntent().getParcelableExtra("MOVIES");
        textViewTittle.setText(movies.getTittle());
        textViewRating.setText(String.valueOf(movies.getRating()));
        textViewGenre.setText(movies.getGenre());
        textViewReleaseDate.setText(movies.getReleasedate());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());
    }
}