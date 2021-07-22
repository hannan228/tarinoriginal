package train.example.orangelinetrain;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import train.example.orangelinetrain.Adapter.ItemListAdapter;


public class Ali_Town extends AppCompatActivity {


    private ListAdapter mAdapter;
    private RecyclerView categoryList;
    private InterstitialAd mInterstitialAd;



    private TextView station_title,station_address;
    private static final String TAG = "MapsActivity";
    String educationalString,restaurantString;
    String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ali__town);

        station_title = findViewById(R.id.station_title);
        station_address = findViewById(R.id.station_adress);

        RecyclerView categoryList = findViewById(R.id.recyclerView);
        categoryList.setLayoutManager(new LinearLayoutManager(this));


        Intent intent = getIntent();
        title = intent.getStringExtra("stationName");
        station_title.setText(title);

        station_address.setText(intent.getStringExtra("stationLocation"));
        String station_roads = intent.getStringExtra("station_roads");

        String[] words = station_roads.split(",");

        categoryList.setAdapter(new ItemListAdapter(Ali_Town.this,words));

        Log.d(TAG, "roadds: "+station_roads+"n"+words[1]);
        educationalString = intent.getStringExtra("station_Education");
        restaurantString = intent.getStringExtra("station_restaurent");

        // ads code start from here
        loadAd();


    }

    public void onClicks(View view) {
        Intent intent = new Intent(getApplicationContext(),StationFurtherInformation.class);
        switch (view.getId()){
            case R.id.educationImage:
                showInterstitial();

                intent.putExtra("stationName",""+title);
                intent.putExtra("info",""+educationalString);
                startActivity(intent);
                break;
            case R.id.restaurantImage:
                showInterstitial();

                intent.putExtra("stationName",""+title);
                intent.putExtra("info",""+restaurantString);
                startActivity(intent);
                break;
        }
    }

    // interstitial ads
    public void loadAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(
                this,
                getResources().getString(R.string.interstitial),
                adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        Ali_Town.this.mInterstitialAd = interstitialAd;
                        Log.i("TAG", "onAdLoaded");
//                        Toast.makeText(Ali_Town.this, "onAdLoaded()", Toast.LENGTH_SHORT).show();
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        Ali_Town.this.mInterstitialAd = null;
                                        Log.d("TAG", "The ad was dismissed.");
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        Ali_Town.this.mInterstitialAd = null;
                                        Log.d("TAG", "The ad failed to show.");
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when fullscreen content is shown.
                                        Log.d("TAG", "The ad was shown.");
                                    }
                                });
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;

                    }
                });

    }
    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
          //  Toast.makeText(this, "Ad did not load", Toast.LENGTH_SHORT).show();
        }
    }

    // end of interstitial ads

}