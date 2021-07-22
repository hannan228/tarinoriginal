package train.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

//import com.example.orangelinetrain.R;

public class MainActivity extends AppCompatActivity {


    private int SLEEP_TIMER = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();

        SplashScreen splashscreen = new SplashScreen();
        splashscreen.start();

    }

    private class SplashScreen extends Thread{
        public void run(){
            try{
                sleep(1000 * SLEEP_TIMER);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            Intent intent = new Intent(MainActivity.this, Dashboard.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    }
}