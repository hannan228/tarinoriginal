package com.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {

    CardView station_information, token_info, train_info, ask_us, job_us, other_jobs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        station_information = findViewById(R.id.staion_info);
        token_info = findViewById(R.id.token_information);
        train_info = findViewById(R.id.trainInfo);
        ask_us = findViewById(R.id.call_us);
        job_us = findViewById(R.id.join_us);
        other_jobs = findViewById(R.id.jobs);

        other_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,Other_Jobs.class));

            }
        });

        station_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,StationNumbers.class));
            }
        });

        token_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,token_category.class));
            }
        });

        train_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Dashboard.this,Station_Info.class));
            }
        });


    }
}