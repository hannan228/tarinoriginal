package train.example.orangelinetrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import train.example.orangelinetrain.R;

public class token_category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_category);

    }

    public void onClicks(View view) {

        Intent intent = new Intent(getApplicationContext(),YouTubeLinks.class);
        switch (view.getId()){
            case R.id.token_basics:
                intent.putExtra("URL","https://www.youtube.com/watch?v=lR9X75OUG6g");
                startActivity(intent);
                break;

            case R.id.token_machine:
                intent.putExtra("URL","https://www.youtube.com/watch?v=OsWCCjR-IjA");
                startActivity(intent);
                break;
        }

    }
}