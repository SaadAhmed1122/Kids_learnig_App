package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ScoringPage extends AppCompatActivity {

    ImageView rewords;
    TextView scoretext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_page);
        int a= getIntent().getExtras().getInt("Wrong");
        scoretext= (TextView) findViewById(R.id.scrore);
        scoretext.setText("Your Pressed on Answers "+a+" Times");
        rewords= findViewById(R.id.reword);
        if(a>=7){
    rewords.setImageResource(R.drawable.reinforce);
        }
        else if(a<7 && a>3){
            rewords.setImageResource(R.drawable.reinforce2);
        }
        else if(a<3){
            rewords.setImageResource(R.drawable.reinforce1);
        }

    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ScoringPage.this,FinalmainScreen.class));
        finish();
        super.onBackPressed();

    }
}