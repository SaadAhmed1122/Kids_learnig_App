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

    public void questionsActcolour(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","Colour");
        startActivity(ii);
    }

    public void questionsActshape(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","shapes");
        startActivity(ii);
    }

    public void questionsActartist(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","selectname");
        startActivity(ii);
    }

    public void questionsActfruits(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","fruits");
        startActivity(ii);
    }

    public void questionsActnumber(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","numbers");
        startActivity(ii);
    }

    public void questionsActarticles(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","articles");
        startActivity(ii);
    }

    public void questionsActobjects(View view) {
        Intent ii= new Intent(GraphicActivity.this,FirstQuestionAct.class);
        ii.putExtra("Emo","objects");
        startActivity(ii);

    }

    public void showimgmain(View view) {
        startActivity(new Intent(GraphicActivity.this,Show_ImagesMain.class));
    }
}