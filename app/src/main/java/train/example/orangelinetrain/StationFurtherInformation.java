package train.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.TextView;

import train.example.orangelinetrain.Adapter.ItemListAdapter;




public class StationFurtherInformation extends AppCompatActivity {
    private ListAdapter mAdapter;
    private RecyclerView categoryList;
    private TextView stationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_further_information);

        TextView stationName = findViewById(R.id.stationName);
        RecyclerView categoryList = findViewById(R.id.recyclerViewInfo);
        categoryList.setLayoutManager(new LinearLayoutManager(this));


        Intent intent = getIntent();
        String title = intent.getStringExtra("stationName");
        stationName.setText(title);

        String stationInfo = intent.getStringExtra("info");

        String[] words = stationInfo.split(",");

        categoryList.setAdapter(new ItemListAdapter(StationFurtherInformation.this,words));


    }
}