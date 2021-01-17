package com.XSTI.LoginScreenMobile.XSTI.SplashScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.XSTI.LoginScreenMobile.XSTI.LoginScreen.LoginActivity;
import com.XSTI.LoginScreenMobile.R;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                showMainActivity();
            }
        }, 2000);
    }

    private void showMainActivity() {
        Intent intent = new Intent(
                SplashActivity.this, LoginActivity.class
        );
        startActivity(intent);
        finish();
    }
}
