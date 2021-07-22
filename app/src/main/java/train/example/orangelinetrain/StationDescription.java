package train.example.orangelinetrain;

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

        station_title.setText("Station name");
       
    }
}