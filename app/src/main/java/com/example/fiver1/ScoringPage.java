package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ScoringPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_page);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ScoringPage.this,GraphicActivity.class));
        finish();
        super.onBackPressed();

    }
}