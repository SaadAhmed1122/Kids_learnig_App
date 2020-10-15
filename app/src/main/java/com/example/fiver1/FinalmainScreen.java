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
        finish();
        super.onBackPressed();
    }
}