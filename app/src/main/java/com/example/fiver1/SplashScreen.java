package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView image1,image2,image3,imagebtn;
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
        else {
        showSystemUI();}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Animation zoom0 = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        Animation zoom1 = AnimationUtils.loadAnimation(this, R.anim.zoom1);
        Animation zoom2 = AnimationUtils.loadAnimation(this, R.anim.zoom2);
        Animation zoom3 = AnimationUtils.loadAnimation(this, R.anim.zoom3);
        Animation zoom4 = AnimationUtils.loadAnimation(this, R.anim.zoom4);
        Animation zoom5 = AnimationUtils.loadAnimation(this, R.anim.zoom5);
        image1= (ImageView) findViewById(R.id.imageView11);
        image2= (ImageView) findViewById(R.id.imageView13);
        image3= (ImageView) findViewById(R.id.imageView16);
        imagebtn = (ImageView) findViewById(R.id.imageView15);



        zoom2.reset();
        image2.clearAnimation();
        image2.startAnimation(zoom2);

        zoom1.reset();
        image1.clearAnimation();
        image1.startAnimation(zoom1);

        zoom3.reset();
        image3.clearAnimation();
        image3.startAnimation(zoom3);

        zoom4.reset();
        imagebtn.clearAnimation();
        imagebtn.startAnimation(zoom4);
    }

    public void showmain(View view) {
        startActivity(new Intent(SplashScreen.this,FinalmainScreen.class));
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}