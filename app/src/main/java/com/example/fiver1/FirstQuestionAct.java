package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fiver1.model.Model;

import java.util.Random;

public class FirstQuestionAct extends AppCompatActivity {
    TextView scoretext;
    ImageView mainimg,img1,img2,img3,checkboxanswer1,checkboxanswer2,checkboxanswer3,checkboxanswer4,checkboxanswer5,checkboxanswer6,checkboxanswer7,checkboxanswer8,checkboxanswer9,checkboxanswer10;
    public Bitmap ep1,ep2,ep3,ep4,a1,a2,a3;
    View greendot1,greendot2,greendot3,greendot4,greendot5,greendot6,greendot7,greendot8,greendot9,greendot10;
    int mCurrentIndex = 0;
    int count =0,checkwrong=1;


    Model[] mQuestionBankemo = new Model[]
            {
//                    new Model(3,R.drawable.e1, R.drawable.p0 ,R.drawable.p1, R.drawable.p2),
//                    new Model(1,R.drawable.e2, R.drawable.p2 ,R.drawable.p0, R.drawable.p2),
//                    new Model(3,R.drawable.e3, R.drawable.p2 ,R.drawable.p1, R.drawable.p0),
//                    new Model(2,R.drawable.e4, R.drawable.p1 ,R.drawable.p0, R.drawable.p2),
//                    new Model(1,R.drawable.e5, R.drawable.p1 ,R.drawable.p2, R.drawable.p0),
//                    new Model(1,R.drawable.e6, R.drawable.p2 ,R.drawable.p1, R.drawable.p0),
//                    new Model(1,R.drawable.e7, R.drawable.p1 ,R.drawable.p2, R.drawable.p0),
//                    new Model(2,R.drawable.e8, R.drawable.p1 ,R.drawable.p2, R.drawable.p0),
//                    new Model(1,R.drawable.e9, R.drawable.p0 ,R.drawable.p1, R.drawable.p2),
//                    new Model(3,R.drawable.e10, R.drawable.p1 ,R.drawable.p2, R.drawable.p0),
            };
    Model[] mQuestionBankcolor = new Model[]
            {
//                    new Model(2,R.drawable.i0, R.drawable.g2 ,R.drawable.g0, R.drawable.g1),
//                    new Model(1,R.drawable.i1, R.drawable.g1 ,R.drawable.g2, R.drawable.g0),
//                    new Model(3,R.drawable.i2, R.drawable.g0 ,R.drawable.d4, R.drawable.g2),
//                    new Model(1,R.drawable.i3, R.drawable.g3 ,R.drawable.g1, R.drawable.g2),
//                    new Model(2,R.drawable.i10, R.drawable.g6 ,R.drawable.g5, R.drawable.g12),
//                    new Model(2,R.drawable.i11, R.drawable.c4 ,R.drawable.g6, R.drawable.g12),
//                    new Model(1,R.drawable.i12, R.drawable.g12 ,R.drawable.g6, R.drawable.g5),
//                    new Model(1,R.drawable.i20, R.drawable.g20 ,R.drawable.m4, R.drawable.g22),
//                    new Model(2,R.drawable.i21, R.drawable.g22 ,R.drawable.g21, R.drawable.g20),
//                    new Model(3,R.drawable.i22, R.drawable.g20 ,R.drawable.d12, R.drawable.g22),
                               };
    Model[] mQuestionBankshape = new Model[]
            {
//                    new Model(2,R.drawable.h0, R.drawable.g0,R.drawable.g1, R.drawable.g2),
//                    new Model(1,R.drawable.h1, R.drawable.g1,R.drawable.g3, R.drawable.g1),
//                    new Model(3,R.drawable.h3, R.drawable.g0,R.drawable.g2, R.drawable.g3),
//                    new Model(3,R.drawable.h4, R.drawable.g2,R.drawable.g1, R.drawable.g4),
//                    new Model(2,R.drawable.h11, R.drawable.g7 ,R.drawable.g6, R.drawable.g8),
//                    new Model(2,R.drawable.h12, R.drawable.c5 ,R.drawable.g7, R.drawable.g9),
//                    new Model(3,R.drawable.h14, R.drawable.g4 ,R.drawable.g1, R.drawable.g9),
//                    new Model(1,R.drawable.h20, R.drawable.g10 ,R.drawable.g12, R.drawable.g13),
//                    new Model(1,R.drawable.h23, R.drawable.g13 ,R.drawable.d5, R.drawable.g11),
//                    new Model(2,R.drawable.h22, R.drawable.g14 ,R.drawable.g12, R.drawable.g10),
                  //  new Model(2,R.drawable.ho, R.drawable.g0 ,R.drawable.g1, R.drawable.g2),
            };
    Model[] mQuestionBankcompletename = new Model[]
            {
//                    new Model(1,R.drawable.x3, R.drawable.w3 ,R.drawable.w4, R.drawable.w5),
//                    new Model(3,R.drawable.x4, R.drawable.w3 ,R.drawable.w6, R.drawable.w4),
//                    new Model(1,R.drawable.x5, R.drawable.w5 ,R.drawable.w10, R.drawable.w3),
//                    new Model(2,R.drawable.x8, R.drawable.w6 ,R.drawable.w8, R.drawable.w7),
//                    new Model(1,R.drawable.x16, R.drawable.w16 ,R.drawable.w15, R.drawable.w12),
//                    new Model(2,R.drawable.x12, R.drawable.w15 ,R.drawable.w12, R.drawable.w14),
//                    new Model(3,R.drawable.x10, R.drawable.w11 ,R.drawable.w9, R.drawable.w10),
//                    new Model(2,R.drawable.x17, R.drawable.w14 ,R.drawable.w17, R.drawable.w18),
//                    new Model(2,R.drawable.x20, R.drawable.w11 ,R.drawable.w20, R.drawable.w19),
//                    new Model(1,R.drawable.x7, R.drawable.w7 ,R.drawable.w4, R.drawable.w12),

            };
    Model[] mQuestionBankcompletefruit = new Model[]
            {
//                    new Model(1,R.drawable.c0, R.drawable.d0 ,R.drawable.d7, R.drawable.d5),
//                    new Model(1,R.drawable.c8, R.drawable.d8 ,R.drawable.d10, R.drawable.d11),
//                    new Model(1,R.drawable.c5, R.drawable.d5 ,R.drawable.d0, R.drawable.d13),
//                    new Model(3,R.drawable.c2, R.drawable.d6 ,R.drawable.d3, R.drawable.d2),
//                    new Model(1,R.drawable.c9, R.drawable.d9 ,R.drawable.d6, R.drawable.d3),
//                    new Model(2,R.drawable.c18, R.drawable.d12 ,R.drawable.d10, R.drawable.d8),
//                    new Model(2,R.drawable.c16, R.drawable.d17 ,R.drawable.d16, R.drawable.d15),
//                    new Model(1,R.drawable.c13, R.drawable.d13 ,R.drawable.d12, R.drawable.d11),
//                    new Model(3,R.drawable.c24, R.drawable.d16 ,R.drawable.d20, R.drawable.d24),
//                    new Model(2,R.drawable.c21, R.drawable.d23 ,R.drawable.d21, R.drawable.d17),

            };
    Model[] mQuestionBankcompletenumbers = new Model[]
            {
//                    new Model(1,R.drawable.n0, R.drawable.m0 ,R.drawable.m8, R.drawable.m9),
//                    new Model(1,R.drawable.n1, R.drawable.m1 ,R.drawable.m2, R.drawable.m6),
//                    new Model(3,R.drawable.n3, R.drawable.m8 ,R.drawable.m6, R.drawable.m3),
//                    new Model(1,R.drawable.n5, R.drawable.m5 ,R.drawable.m2, R.drawable.m6),
//                    new Model(2,R.drawable.n7, R.drawable.m1 ,R.drawable.m7, R.drawable.m9),
//                    new Model(2,R.drawable.n9, R.drawable.m1 ,R.drawable.m9, R.drawable.m8),
//                    new Model(3,R.drawable.n2, R.drawable.m0 ,R.drawable.m7, R.drawable.m2),
//                    new Model(1,R.drawable.n4, R.drawable.m4 ,R.drawable.m9, R.drawable.m3),
//                    new Model(2,R.drawable.n6, R.drawable.m1 ,R.drawable.m6, R.drawable.m8),
//                    new Model(1,R.drawable.n8, R.drawable.m8 ,R.drawable.m2, R.drawable.m6),

            };
    Model[] mQuestionBankcompleteanimals = new Model[]{
//            {
//                    new Model(2,R.drawable.b0, R.drawable.a0 ,R.drawable.a4, R.drawable.a5),
//                    new Model(1,R.drawable.b1, R.drawable.a1 ,R.drawable.a7, R.drawable.a8),
//                    new Model(2,R.drawable.b2, R.drawable.a6 ,R.drawable.a2, R.drawable.a11),
//                    new Model(3,R.drawable.b3, R.drawable.a1 ,R.drawable.a8, R.drawable.a3),
//                    new Model(2,R.drawable.b10, R.drawable.a12 ,R.drawable.a10, R.drawable.a21),
//                    new Model(1,R.drawable.b23, R.drawable.a23 ,R.drawable.a22, R.drawable.a24),
//                    new Model(3,R.drawable.b18, R.drawable.a17 ,R.drawable.a13, R.drawable.a18),
//                    new Model(2,R.drawable.b12, R.drawable.a14 ,R.drawable.a12, R.drawable.a19),
//                    new Model(1,R.drawable.b16, R.drawable.a16 ,R.drawable.a11, R.drawable.a5),
//                    new Model(2,R.drawable.b22, R.drawable.a23 ,R.drawable.a22, R.drawable.a24),

            };
    Model[] mQuestionBankcompleteobjects = new Model[]
            {
//                    new Model(3,R.drawable.q0, R.drawable.o1 ,R.drawable.o4, R.drawable.o0),
//                    new Model(1,R.drawable.q1, R.drawable.o1 ,R.drawable.o4, R.drawable.o7),
//                    new Model(1,R.drawable.q2, R.drawable.o2 ,R.drawable.o9, R.drawable.o6),
//                    new Model(2,R.drawable.q3, R.drawable.o7 ,R.drawable.o3, R.drawable.o5),
//                    new Model(3,R.drawable.q4, R.drawable.o1 ,R.drawable.o0, R.drawable.o4),
//                    new Model(2,R.drawable.q5, R.drawable.o2 ,R.drawable.o5, R.drawable.o6),
//                    new Model(2,R.drawable.q6, R.drawable.o9 ,R.drawable.o6, R.drawable.o5),
//                    new Model(3,R.drawable.q7, R.drawable.o1 ,R.drawable.o8, R.drawable.o7),
//                    new Model(1,R.drawable.q8, R.drawable.o8 ,R.drawable.o4, R.drawable.o0),
//                    new Model(3,R.drawable.q9, R.drawable.o1 ,R.drawable.o4, R.drawable.o9),

            };
int a=0;
    int rand = 0;
String val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);
        scoretext= findViewById(R.id.scroetxt);
        mainimg= findViewById(R.id.mainimg);

        setupview();
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
             int epmain = mQuestionBankemo[mCurrentIndex].getMain_pro_images();
             mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankemo[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankemo[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankemo[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);

        }

        else if(val.equals("Colour")){
            int epmain = mQuestionBankcolor[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcolor[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcolor[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcolor[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);
        }
        else if(val.equals("shapes")){
            int epmain = mQuestionBankshape[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankshape[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankshape[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankshape[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);

        }
        else if(val.equals("selectname")){
            int epmain = mQuestionBankcompletename[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompletename[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompletename[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompletename[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);
        }
        else if(val.equals("fruits")){
            int epmain = mQuestionBankcompletefruit[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompletefruit[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompletefruit[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompletefruit[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);

        }
        else if(val.equals("numbers")){
            int epmain = mQuestionBankcompletenumbers[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompletenumbers[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompletenumbers[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompletenumbers[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);


        }
        else if(val.equals("articles")){
            int epmain = mQuestionBankcompleteanimals[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompleteanimals[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompleteanimals[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompleteanimals[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);

        }
        else if(val.equals("objects")){
            int epmain = mQuestionBankcompleteobjects[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompleteobjects[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompleteobjects[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompleteobjects[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);
        }



        Random random = new Random();

        while (true){
            rand = random.nextInt(11);
            if(rand !=0) break;
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

        setgrendot();


    }

    private void setgrendot() {
        greendot1.setVisibility(View.INVISIBLE);
        greendot2.setVisibility(View.INVISIBLE);
        greendot3.setVisibility(View.INVISIBLE);
        greendot4.setVisibility(View.INVISIBLE);
        greendot5.setVisibility(View.INVISIBLE);
        greendot6.setVisibility(View.INVISIBLE);
        greendot7.setVisibility(View.INVISIBLE);
        greendot8.setVisibility(View.INVISIBLE);
        greendot9.setVisibility(View.INVISIBLE);
        greendot10.setVisibility(View.INVISIBLE);

    }
    private void showgrendot(int mCurrentIndex) {
        if(mCurrentIndex == 0){
            greendot1.setVisibility(View.VISIBLE);
        }
        else if(mCurrentIndex == 1){
            greendot2.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 2){
            greendot3.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 3){
            greendot4.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 4){
            greendot5.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 5){
            greendot6.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 6){
            greendot7.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 7){
            greendot8.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 8){
            greendot9.setVisibility(View.VISIBLE);
        } else if(mCurrentIndex == 9){
            greendot10.setVisibility(View.VISIBLE);
        }
    }



    private void checkAnsewer(int i) {
        if(val.equals("Emo")){
            int ans = mQuestionBankemo[mCurrentIndex].getTrueAnswer();
           // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
//                checkboxanswer1.setImageResource(R.drawable.ok_mark);
//                checkboxanswer1.setVisibility(View.VISIBLE);
//                //resetTimer();
                next_question();
                //count++;
                show_mark(mCurrentIndex);

            } else {
            //    Toast.makeText(FirstQuestionAct.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                //resetTimer();
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    next_question();
                    show_mark(mCurrentIndex+20);

                }

            }

        }
         else if(val.equals("Colour")){ int ans = mQuestionBankcolor[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
//                String uri = "@drawable/ok_mark";
//                int imageResource= getResources().getIdentifier(uri,null,getPackageName());
//                Drawable res = getResources().getDrawable(imageResource);
//                checkboxanswer1.setImageDrawable(res);
//                //resetTimer();

                //checkboxanswer1.setImageDrawable(getResources().getDrawable(R.drawable.ok_mark));
               // checkboxanswer1.setImageDrawable(ContextCompat.getDrawable(FirstQuestionAct.this,R.drawable.ok_mark));
                show_mark(mCurrentIndex);
                next_question();
                count++;

            } else {
                //Toast.makeText(FirstQuestionAct.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                //resetTimer();
//                String uri = "@drawable/delete_mark";
//                int imageResource= getResources().getIdentifier(uri,null,getPackageName());
//                Drawable res = getResources().getDrawable(imageResource);
//                checkboxanswer1.setImageDrawable(res);
//               // checkboxanswer1.setImageDrawable(R.drawable.delete_mark);
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }
            }
        }
        else if(val.equals("shapes")){
            int ans = mQuestionBankshape[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();
                show_mark(mCurrentIndex);
                next_question();
                count++;

            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }
            }

        }
        else if(val.equals("selectname")){
            int ans = mQuestionBankcompletename[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();
                show_mark(mCurrentIndex);
                next_question();
                count++;

            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }
               }

        }
        else if(val.equals("fruits")){
            int ans = mQuestionBankcompletefruit[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();
                show_mark(mCurrentIndex);
                next_question();
                count++;

            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }
               }

        }
        else if(val.equals("numbers")){ int ans = mQuestionBankcompletenumbers[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();
                show_mark(mCurrentIndex);
                next_question();
                count++;
            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }

            }
        }
        else if(val.equals("articles")){
            int ans = mQuestionBankcompleteanimals[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();

                show_mark(mCurrentIndex);
                next_question();
                count++;

            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else  {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }
            }

        }
        else if(val.equals("objects")){
            int ans = mQuestionBankcompleteobjects[mCurrentIndex].getTrueAnswer();
            // scoretext.setText(""+i);
            if (i == ans) {
                a++;
                scoretext.setText("Your Score is :"+a);
                Toast.makeText(this, "Your answer is true", Toast.LENGTH_SHORT).show();
                //resetTimer();
//                checkboxanswer1.setImageResource(R.drawable.ok_mark);
//                checkboxanswer1.setVisibility(View.VISIBLE);

                show_mark(mCurrentIndex);
                next_question();
                count++;
            } else {
                if(checkwrong ==1){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else if(checkwrong==2){
                    checkwrong++;
                    Toast.makeText(this, "Try Again !!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    show_mark(mCurrentIndex + 20);
                    next_question();
                }

            }
        }
    }

    private void show_mark(int count) {
        if(mCurrentIndex==0){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
                checkboxanswer1.setVisibility(View.VISIBLE);
        }
        else if (mCurrentIndex==20){
            checkboxanswer1.setImageResource(R.drawable.delete_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
        }
        if(count == 1){
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
        }
        else if(count == 21){
            checkboxanswer2.setImageResource(R.drawable.delete_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
        }
        else if(count == 2){
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
        }
       else if(count == 22){
            checkboxanswer3.setImageResource(R.drawable.delete_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
        }
        else if(count == 3){
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);

        }
        else if(count == 23){
            checkboxanswer4.setImageResource(R.drawable.delete_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);

        }
        else if(count == 4){
            checkboxanswer5.setImageResource(R.drawable.ok_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);

        }
        else if(count == 24){
            checkboxanswer5.setImageResource(R.drawable.delete_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);

        }
        else if(count == 5){
            checkboxanswer6.setImageResource(R.drawable.ok_mark);
            checkboxanswer6.setVisibility(View.VISIBLE);

        }
        else if(count == 25){
            checkboxanswer6.setImageResource(R.drawable.delete_mark);
            checkboxanswer6.setVisibility(View.VISIBLE);

        }
        else if(count == 6){
            checkboxanswer7.setImageResource(R.drawable.ok_mark);
            checkboxanswer7.setVisibility(View.VISIBLE);

        }
        else if(count == 26){
            checkboxanswer7.setImageResource(R.drawable.delete_mark);
            checkboxanswer7.setVisibility(View.VISIBLE);

        }
        else if(count == 7){
            checkboxanswer8.setImageResource(R.drawable.ok_mark);
            checkboxanswer8.setVisibility(View.VISIBLE);

        }
        else if(count == 27){
            checkboxanswer8.setImageResource(R.drawable.delete_mark);
            checkboxanswer8.setVisibility(View.VISIBLE);

        }
        else if(count == 8){
            checkboxanswer9.setImageResource(R.drawable.ok_mark);
            checkboxanswer9.setVisibility(View.VISIBLE);

        }
        else if(count == 28){
            checkboxanswer9.setImageResource(R.drawable.delete_mark);
            checkboxanswer9.setVisibility(View.VISIBLE);

        }
        else if(count == 9){
            checkboxanswer10.setImageResource(R.drawable.ok_mark);
            checkboxanswer10.setVisibility(View.VISIBLE);

        }
        else if(count == 29){
            checkboxanswer10.setImageResource(R.drawable.delete_mark);
            checkboxanswer10.setVisibility(View.VISIBLE);

        }
    }

    private void next_question() {
        showgrendot(mCurrentIndex);
        mCurrentIndex = (mCurrentIndex + 1);

        if(val.equals("Emo")){
            if (mCurrentIndex >= mQuestionBankemo.length) {
             startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }

            else {
//            byte[] decodedString = Base64.decode()
                int epmain = mQuestionBankemo[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankemo[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankemo[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankemo[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }
        }
        else if(val.equals("Colour")){
            if (mCurrentIndex >= mQuestionBankcolor.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
            int epmain = mQuestionBankcolor[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcolor[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcolor[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcolor[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);
        }
        }
        else if(val.equals("shapes")){
            if (mCurrentIndex >= mQuestionBankshape.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
                int epmain = mQuestionBankshape[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankshape[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankshape[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankshape[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }
        }
        else if(val.equals("selectname")){
            if (mCurrentIndex >= mQuestionBankcompletename.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
            int epmain = mQuestionBankcompletename[mCurrentIndex].getMain_pro_images();
            mainimg.setImageResource(epmain);

            int opt1 = mQuestionBankcompletename[mCurrentIndex].getF_img();
            img1.setImageResource(opt1);

            int opt2 = mQuestionBankcompletename[mCurrentIndex].getS_img();
            img2.setImageResource(opt2);

            int opt3= mQuestionBankcompletename[mCurrentIndex].getTh_img();
            img3.setImageResource(opt3);
        }
        }
        else if(val.equals("fruits")){
            if (mCurrentIndex >= mQuestionBankcompletefruit.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
                int epmain = mQuestionBankcompletefruit[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankcompletefruit[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankcompletefruit[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankcompletefruit[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }
        }
        else if(val.equals("numbers")){
            if (mCurrentIndex >= mQuestionBankcompletenumbers.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
                int epmain = mQuestionBankcompletenumbers[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankcompletenumbers[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankcompletenumbers[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankcompletenumbers[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }

        }
        else if(val.equals("articles")){
            if (mCurrentIndex >= mQuestionBankcompleteanimals.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {
                int epmain = mQuestionBankcompleteanimals[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankcompleteanimals[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankcompleteanimals[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankcompleteanimals[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }
        }
        else if(val.equals("objects")){
            if (mCurrentIndex >= mQuestionBankcompleteobjects.length) {
                startActivity(new Intent(FirstQuestionAct.this,ScoringPage.class));
                finish();
            }
            else {

                int epmain = mQuestionBankcompleteobjects[mCurrentIndex].getMain_pro_images();
                mainimg.setImageResource(epmain);

                int opt1 = mQuestionBankcompleteobjects[mCurrentIndex].getF_img();
                img1.setImageResource(opt1);

                int opt2 = mQuestionBankcompleteobjects[mCurrentIndex].getS_img();
                img2.setImageResource(opt2);

                int opt3 = mQuestionBankcompleteobjects[mCurrentIndex].getTh_img();
                img3.setImageResource(opt3);
            }        }


//        if (mCurrentIndex >= mQuestionBank.length) {
//            Toast.makeText(Main2Activity.this, "Finished", Toast.LENGTH_SHORT).show();
//            q_tv.setText("Null");
//        }
    }
    private void setupview() {
    checkboxanswer1= (ImageView) findViewById(R.id.crossimg1);
    checkboxanswer2= (ImageView) findViewById(R.id.crossimg2);
    checkboxanswer3= (ImageView) findViewById(R.id.crossimg3);
    checkboxanswer4= (ImageView) findViewById(R.id.crossimg4);
    checkboxanswer5= (ImageView) findViewById(R.id.crossimg5);
    checkboxanswer6= (ImageView) findViewById(R.id.crossimg6);
    checkboxanswer7= (ImageView) findViewById(R.id.crossimg7);
    checkboxanswer8= (ImageView) findViewById(R.id.crossimg8);
    checkboxanswer9= (ImageView) findViewById(R.id.crossimg9);
    checkboxanswer10= (ImageView) findViewById(R.id.crossimg10);

    greendot1 = (View) findViewById(R.id.grenc1);
    greendot2 = (View) findViewById(R.id.grenc2);
    greendot3 = (View) findViewById(R.id.grenc3);
    greendot4 = (View) findViewById(R.id.grenc4);
    greendot5 = (View) findViewById(R.id.grenc5);
    greendot6 = (View) findViewById(R.id.grenc6);
    greendot7 = (View) findViewById(R.id.grenc7);
    greendot8 = (View) findViewById(R.id.grenc8);
    greendot9 = (View) findViewById(R.id.grenc9);
    greendot10 = (View) findViewById(R.id.grenc10);

    }
}