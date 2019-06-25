package com.blaze.meeles;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView logo,circle;
    private int sleep_timer =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        logo = findViewById(R.id.meeles);
        circle = findViewById(R.id.circle_icon);
        circle.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000).start();
        logo.animate().alpha(0.6f).setDuration(2000).start();



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        },sleep_timer);
    }
}
