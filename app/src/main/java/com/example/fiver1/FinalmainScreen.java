package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class FinalmainScreen extends AppCompatActivity {

    int num=1;
    MediaPlayer mediaPlayer;
    ImageView stopmus;

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
        setContentView(R.layout.activity_finalmain_screen);
        stopmus= (ImageView) findViewById(R.id.imageView10);
        mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
       // mediaPlayer.start(); // no need to call prepare(); create() does that for you
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
        mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
        super.onRestart();
    }

    public void sequenceact(View view) {
       // startActivity(new Intent(FinalmainScreen.this,Sequencegame.class));
    }

    public void numberact(View view) {
        Intent ii= new Intent(FinalmainScreen.this,NumbersAct.class);
        //ii.putExtra("Seq","numbers");
        ii.putExtra("value",37);
        startActivity(ii);
    }

    public void showemoact(View view) {
        Intent ii= new Intent(FinalmainScreen.this, EmoQuestionsActivity.class);
        //ii.putExtra("Seq","emo");
        ii.putExtra("value",17);
        startActivity(ii);
    }

    public void showgellery(View view) {
        startActivity(new Intent(FinalmainScreen.this,Show_ImagesMain.class));
    }

    public void showcoloract(View view) {
        Intent ii= new Intent(FinalmainScreen.this,Colours_question_act.class);
        //ii.putExtra("Seq","colour");
        ii.putExtra("value",12);
        startActivity(ii);    }

    public void animalact(View view) {
        Intent ii= new Intent(FinalmainScreen.this,Animals_question.class);
        //ii.putExtra("Seq","animals");
        ii.putExtra("value",99);
        startActivity(ii);    }

    public void fruitsAct(View view) {
        Intent ii= new Intent(FinalmainScreen.this,FoodActivity.class);
        // ii.putExtra("Seq","food");
        ii.putExtra("value",32);
        startActivity(ii);

    }

    public void travelAct(View view) {
        Intent ii= new Intent(FinalmainScreen.this,TravelAct.class);
        //ii.putExtra("Seq","transport");
        ii.putExtra("value",72);
        startActivity(ii);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();System.exit(0);
    }

    public void puzzlemain(View view) {
        startActivity(new Intent(FinalmainScreen.this,Puzzlemainscreen.class));
    }

    public void stopmusic(View view) {
        if(num==1){
        mediaPlayer.release();
        num++;
        stopmus.setImageResource(R.drawable.soundbtn);
        }
        else if(num%2==0){
            mediaPlayer = MediaPlayer.create(FinalmainScreen.this, R.raw.background_music);
            mediaPlayer.start(); // no need to call prepare(); create() does that for you
            stopmus.setImageResource(R.drawable.soundoff);
            num++;
        }
        else {
            mediaPlayer.release();
            num++;
            stopmus.setImageResource(R.drawable.soundbtn);
        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.release();
//        mediaPlayer=null;
    }


    public void showthings(View view) {
        Intent ii= new Intent(FinalmainScreen.this,Vehicals_Act.class);
        //ii.putExtra("Seq","transport");
        ii.putExtra("value",172);
        startActivity(ii);
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