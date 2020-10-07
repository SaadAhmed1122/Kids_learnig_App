package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GraphicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphic);
    }

    public void questionsAct(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","Emo");
        startActivity(ii);
    }
}