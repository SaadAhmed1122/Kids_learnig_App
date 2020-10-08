package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FirstQuestionAct extends AppCompatActivity {
    TextView scoretext;
    ImageView mainimg,img1,img2,img3;
    public Bitmap ep1,ep2,ep3,ep4,a1,a2,a3;
    int mCurrentIndex = 0;
    Model[] mQuestionBank = new Model[]
            {
                    new Model(2,R.drawable.w0, R.drawable.x3 ,R.drawable.x4, R.drawable.x5),
            };
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

//        Drawable myDrawable = getResources().getDrawable(R.drawable.w0);
//        ep1 = ((BitmapDrawable)myDrawable).getBitmap();
//        Drawable myDrawable2 = getResources().getDrawable(R.drawable.x3);
//        ep2 = ((BitmapDrawable)myDrawable2).getBitmap();
//        Drawable myDrawable3 = getResources().getDrawable(R.drawable.x4);
//        ep3 = ((BitmapDrawable)myDrawable3).getBitmap();
//        Drawable myDrawable4 = getResources().getDrawable(R.drawable.x5);
//        ep4 = ((BitmapDrawable)myDrawable4).getBitmap();




        if(val.equals("Emo")){
//            byte[] decodedString = Base64.decode()
             int epmain = mQuestionBank[mCurrentIndex].getMain_pro_images();
             mainimg.setImageResource(epmain);

            int opt1 = mQuestionBank[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBank[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBank[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);

        }
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnsewer(1);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnsewer(3);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnsewer(2);
            }
        });
    }

    private void checkAnsewer(int i) {
        int ans = mQuestionBank[mCurrentIndex].getTrueAnswer();
        scoretext.setText(""+i);

        if (i == ans) {
            a++;
           // scoretext.setText("Your Score is :"+a);
            Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
            //resetTimer();
            next_question();

        } else {
            Toast.makeText(FirstQuestionAct.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
            //resetTimer();
            next_question();

        }

    }

    private void next_question() {
    }

}