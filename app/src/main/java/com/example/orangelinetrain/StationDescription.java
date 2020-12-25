package com.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class StationDescription extends AppCompatActivity {

    TextView station_title, station_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_description);

        station_title = findViewById(R.id.station_title);
        station_info = findViewById(R.id.station_info);

        station_title.setText("Station name");
        station_info.setText("Tandoor restaurant(1 mint, 26m),PUBG Restaurant(1mint , 46m),Dal Daal(9mint, 700m),Yasir Broast(3 mint 250),Signature Teahouse & Rooftop Restaurant(13 mint, 1km), Al Khan Restaurant(6m,500m), Ilyas Dumba Karahi(1m, 29m), Musa Tawazo Chinese restaurant, Mast Mahool Café(6m,450), Fri-Chiks Raiwind(1m, 82m),grilled thrilled burgers(2m,190), Marhaba restaurant(6,450), Galito’s – flame Grilled Chicken,Captain cook restaurant & naan shop(10m,850), Buddies fast Food & restaurant(5,400), Al-Desi Restaurant, Ravi Restaurant, Al-Madina Family Restaurant(7,550), Zafar Restaurant(6,450), Jhalandri hotel Tandoor restaurant(1 mint, 26m),PUBG Restaurant(1mint , 46m),Dal Daal(9mint, 700m),Yasir Broast(3 mint 250),Signature Teahouse & Rooftop Restaurant(13 mint, 1km), Al Khan Restaurant(6m,500m), Ilyas Dumba Karahi(1m, 29m), Musa Tawazo Chinese restaurant, Mast Mahool Café(6m,450), Fri-Chiks Raiwind(1m, 82m),grilled thrilled burgers(2m,190), Marhaba restaurant(6,450), Galito’s – flame Grilled Chicken,Captain cook restaurant & naan shop(10m,850), Buddies fast Food & restaurant(5,400), Al-Desi Restaurant, Ravi Restaurant, Al-Madina Family Restaurant(7,550), Zafar Restaurant(6,450), Jhalandri hotel Tandoor restaurant(1 mint, 26m),PUBG Restaurant(1mint , 46m),Dal Daal(9mint, 700m),Yasir Broast(3 mint 250),Signature Teahouse & Rooftop Restaurant(13 mint, 1km), Al Khan Restaurant(6m,500m), Ilyas Dumba Karahi(1m, 29m), Musa Tawazo Chinese restaurant, Mast Mahool Café(6m,450), Fri-Chiks Raiwind(1m, 82m),grilled thrilled burgers(2m,190), Marhaba restaurant(6,450), Galito’s – flame Grilled Chicken,Captain cook restaurant & naan shop(10m,850), Buddies fast Food & restaurant(5,400), Al-Desi Restaurant, Ravi Restaurant, Al-Madina Family Restaurant(7,550), Zafar Restaurant(6,450), Jhalandri hotel,, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel, Zafar Restaurant(6,450), Jhalandri hotel ");

    }
}