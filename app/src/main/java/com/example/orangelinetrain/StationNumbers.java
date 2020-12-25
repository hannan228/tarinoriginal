package com.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StationNumbers extends AppCompatActivity {

    CardView dashboard,station1,station2,station3,station4,station5,station6,station7,station8,station9,station10,station11,station12,station13;
    CardView station14,station15,station16,station17,station18,station19,station20,station21,station22,station23,station24,station25,station26;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_numbers);

        station1 = findViewById(R.id.st1);
        station1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StationNumbers.this,StationDescription.class));

            }
        });
    }
}