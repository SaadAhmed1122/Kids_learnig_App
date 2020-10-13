package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScoringPage extends AppCompatActivity {

    TextView scoretext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_page);
        int a= getIntent().getExtras().getInt("total");
        scoretext= (TextView) findViewById(R.id.scrore);
        scoretext.setText("Your score is "+scoretext);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ScoringPage.this,GraphicActivity.class));
        finish();
        super.onBackPressed();

    }
}