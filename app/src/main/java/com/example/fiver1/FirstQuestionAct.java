package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstQuestionAct extends AppCompatActivity {
    TextView scoretext;
    ImageView mainimg,img1,img2,img3;
int a=0;
String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        scoretext= findViewById(R.id.scroetxt);
        mainimg= findViewById(R.id.mainimg);
        img1= findViewById(R.id.image1);
        img2= findViewById(R.id.image2);
        img3 = findViewById(R.id.image3);
        val= getIntent().getExtras().getString("Emo");
        if(val.equals("Emo")){
            mainimg.setImageResource(R.drawable.e0);
            img1.setImageResource(R.drawable.p0);
            img2.setImageResource(R.drawable.p1);
            img3.setImageResource(R.drawable.p2);
        }

    }

    public void img1(View view) {

        int imageid = getResources().getIdentifier("e0", "drawable", getPackageName());
        String imageName = getResources().getResourceName(imageid);

        Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
    }



    public void img2(View view) {
        Toast.makeText(this, "Rignt Answer", Toast.LENGTH_SHORT).show();

        scoretext.setText(""+a++);

    }

    public void img3(View view) {
        Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();

    }
}