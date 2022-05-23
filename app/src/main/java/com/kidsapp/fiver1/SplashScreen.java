package com.kidsapp.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashScreen extends AppCompatActivity {

    private static final String TAG = "Intersitial Ads facebook" ;
    ImageView image1,image2,image3,imagebtn;
    TextView main_text;

    MediaPlayer mediaPlayer;
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
        main_text=(TextView) findViewById(R.id.textView11);
        image1= (ImageView) findViewById(R.id.imageView11);
        image2= (ImageView) findViewById(R.id.imageView13);
        image3= (ImageView) findViewById(R.id.imageView16);
        imagebtn = (ImageView) findViewById(R.id.imageView15);
        mediaPlayer = MediaPlayer.create(SplashScreen.this, R.raw.background_music);
        mediaPlayer.start();

        zoom0.reset();
        main_text.clearAnimation();
        main_text.startAnimation(zoom0);

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
        startActivity(new Intent(SplashScreen.this,Select_act.class));
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        mediaPlayer.release();

    }

    @Override
    protected void onRestart() {
        mediaPlayer = MediaPlayer.create(SplashScreen.this, R.raw.background_music);
        super.onRestart();
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