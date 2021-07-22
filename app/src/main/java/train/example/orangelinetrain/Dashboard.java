package train.example.orangelinetrain;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class Dashboard extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private FrameLayout adContainerView;
    private AdView adView;
    AdRequest adRequest;

    CardView station_information, token_info, train_info, updates, join_us, other_jobs, news, scholarships;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        station_information = findViewById(R.id.staion_info);
        token_info = findViewById(R.id.token_information);
        train_info = findViewById(R.id.trainInfo);
        updates = findViewById(R.id.update1);
        join_us = findViewById(R.id.join_us);
        other_jobs = findViewById(R.id.jobs);
        scholarships = findViewById(R.id.scholarship);
        news = findViewById(R.id.news);


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

        updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkConnected()){
                    startActivity(new Intent(Dashboard.this, updates.class));
                }else {
                    Toast.makeText(Dashboard.this, "Internet Problems", Toast.LENGTH_SHORT).show();
                }

            }
        });

        join_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkConnected()){
                    startActivity(new Intent(Dashboard.this,Join_Us.class));
                }else {
                    Toast.makeText(Dashboard.this, "Internet Problems", Toast.LENGTH_SHORT).show();
                }
            }
        });

        other_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkConnected()){
                    startActivity(new Intent(Dashboard.this,Other_Jobs.class));
                }else {
                    Toast.makeText(Dashboard.this, "Internet Problems", Toast.LENGTH_SHORT).show();
                }
            }
        });

        scholarships.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkConnected()){
                    startActivity(new Intent(Dashboard.this,Scholarship_News.class));
                }else {
                    Toast.makeText(Dashboard.this, "Internet Problems", Toast.LENGTH_SHORT).show();
                }
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkConnected()){
                    startActivity(new Intent(Dashboard.this,News.class));
                }else {
                    Toast.makeText(Dashboard.this, "Internet Problems", Toast.LENGTH_SHORT).show();
                }
            }
        });


        // ads code start from here
        loadAd();

        // Initialize the Mobile Ads SDK.
        adView = (AdView) findViewById(R.id.ad_View);
        adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


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
                        Dashboard.this.mInterstitialAd = interstitialAd;
                        Log.i("TAG", "onAdLoaded");
//                        Toast.makeText(Dashboard.this, "onAdLoaded()", Toast.LENGTH_SHORT).show();
                        interstitialAd.setFullScreenContentCallback(
                                new FullScreenContentCallback() {
                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when fullscreen content is dismissed.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        Dashboard.this.mInterstitialAd = null;
                                        Log.d("TAG", "The ad was dismissed.");
                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when fullscreen content failed to show.
                                        // Make sure to set your reference to null so you don't
                                        // show it a second time.
                                        Dashboard.this.mInterstitialAd = null;
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
                        mInterstitialAd = null;

                    }
                });

    }
    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null) {
            mInterstitialAd.show(this);
        } else {
//            Toast.makeText(this, "Ad did not load", Toast.LENGTH_SHORT).show();
        }
    }

    // end of interstitial ads

    // start of banner ads
    @Override
    public void onPause() {
        if (adView != null) {
            adView.pause();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adView != null) {
            adView.resume();
        }
    }

    @Override
    public void onDestroy() {
        if (adView != null) {
            adView.destroy();
        }
        super.onDestroy();
    }
    // end of banner



    @Override
    public void onBackPressed() {
        showInterstitial();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Dashboard.this.finish();
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}