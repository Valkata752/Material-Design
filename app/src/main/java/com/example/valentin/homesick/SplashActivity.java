package com.example.valentin.homesick;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by valentin on 17.09.16.
 *

 */

public class SplashActivity extends AppCompatActivity {

        @Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent i = new Intent(SplashActivity.this, WelcomeActivity.class);
        startActivity(i);
            finish();
        }
}

