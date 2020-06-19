package com.github.dashboardproject.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.github.dashboardproject.R;

public class SplashActivity extends AppCompatActivity {

    Animation topAnim, middleAnim, bottomAnim;
    View first,sec,third,fourth,fifth,sixth;
    TextView firstText,android;
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        topAnim = AnimationUtils.loadAnimation(this,R.anim.anim_top);
        middleAnim = AnimationUtils.loadAnimation(this,R.anim.anim_middle);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.anim_bottom);

        first = findViewById(R.id.first_line);
        sec = findViewById(R.id.sec_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);
        sixth = findViewById(R.id.sixth_line);

        first.setAnimation(topAnim);
        sec.setAnimation(topAnim);
        third.setAnimation(topAnim);
        fourth.setAnimation(topAnim);
        fifth.setAnimation(topAnim);
        sixth.setAnimation(topAnim);

        firstText = findViewById(R.id.tv_firstText);
        android = findViewById(R.id.tv_android);

        firstText.setAnimation(middleAnim);
        android.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, DashBoardActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}