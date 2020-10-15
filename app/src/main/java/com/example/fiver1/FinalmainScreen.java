package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class FinalmainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_finalmain_screen);
    }

    public void sequenceact(View view) {
        startActivity(new Intent(FinalmainScreen.this,Sequencegame.class));
    }

    public void numberact(View view) {
        startActivity(new Intent(FinalmainScreen.this,NumbersAct.class));

    }

    public void showemoact(View view) {
        startActivity(new Intent(FinalmainScreen.this,EmoQuestionsActivity.class));
    }

    public void showgellery(View view) {
        startActivity(new Intent(FinalmainScreen.this,Show_ImagesMain.class));
    }

    public void showcoloract(View view) {
        startActivity(new Intent(FinalmainScreen.this,Colours_question_act.class));
    }

    public void animalact(View view) {
        startActivity(new Intent(FinalmainScreen.this,Animals_question.class));
    }

    public void fruitsAct(View view) {
        startActivity(new Intent(FinalmainScreen.this,FoodActivity.class));

    }

    public void travelAct(View view) {
        startActivity(new Intent(FinalmainScreen.this,TravelAct.class));

    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}