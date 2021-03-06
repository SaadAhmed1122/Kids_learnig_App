package com.kidsapp.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class EmoQuestionsActivity extends AppCompatActivity {
    private static final String TAG = "GETB";
    int mCurrentIndex=-1;
    int[] questions;
    int seq;
    int[][] answers;
    int[] wrong_questions;
    View greendot1,greendot2,greendot3,greendot4,greendot5,greendot6,greendot7,greendot8,greendot9,greendot10;

    int wrong_question_counter =0;
    ImageView mainimg,img1,img2,img3,checkboxanswer1,checkboxanswer2,checkboxanswer3,checkboxanswer4,checkboxanswer5,checkboxanswer6,checkboxanswer7,checkboxanswer8,checkboxanswer9,checkboxanswer10;

    int queue[]=new int[10];
    int numberofquestioncomplete = 0;
    LinearLayout linearLayoutop1,linearLayoutop2,linearLayoutop3;
    int answerlog[] = new int[10];
    int anscnt = 0,wrong_ans_count=0;
    TextView scorcetxt;
    int correct_ans_count=0;
    int correct_answer[] = new int[10];
//    String user_name;

    //function for generating unique number
    private int[] random_number_generator(){
        int question_list[] = new int[10];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<10; i++) {
            question_list[i] = list.get(i);
        }
        //final question list is return
        return question_list;
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
        else {
            showSystemUI();}
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.emoquestionact);


        scorcetxt= findViewById(R.id.sctxt);
        linearLayoutop1 = (LinearLayout) findViewById(R.id.linearLayout_opt1);
        linearLayoutop2 = (LinearLayout) findViewById(R.id.linearLayout_opt2);
        linearLayoutop3 = (LinearLayout) findViewById(R.id.linearLayout_opt3);
        setupview();
        setgrendot();

       // sequence= getIntent().getExtras().getString("Seq");
        seq = getIntent().getIntExtra("value",0);
       // Toast.makeText(this, ""+seq, Toast.LENGTH_SHORT).show();



        //  Log.d("user_name", user_name);
        //question array is assigned with values
        questions= new int[]{R.drawable.e0,
                R.drawable.e1,
                R.drawable.e2, R.drawable.e3, R.drawable.e4,
         R.drawable.e5,
         R.drawable.e6,
         R.drawable.e7,
         R.drawable.e8,
         R.drawable.e9};

        //answer array is asigned with options to be given and last index is of correct answer

        answers= new int[][] {
                {R.drawable.p0 ,R.drawable.d4, R.drawable.g3},
                {R.drawable.a4 ,R.drawable.d1, R.drawable.p2},
                {R.drawable.w7 ,R.drawable.m3, R.drawable.p2},
                {R.drawable.p0 ,R.drawable.m1, R.drawable.d19},
                {R.drawable.p0 ,R.drawable.d3, R.drawable.m7},
                {R.drawable.p0 ,R.drawable.m4, R.drawable.o2},
                {R.drawable.g12 ,R.drawable.m8, R.drawable.p2},
                {R.drawable.w16 ,R.drawable.p1, R.drawable.m8},
                {R.drawable.m9 ,R.drawable.g2, R.drawable.p2},
                {R.drawable.g1 ,R.drawable.p1, R.drawable.m7}
        };
        // 0 1 2
        correct_answer[0] =0;
        correct_answer[1] =2;
        correct_answer[2] =2;
        correct_answer[3] =0;
        correct_answer[4] =0;
        correct_answer[5] =0;
        correct_answer[6] =2;
        correct_answer[7] =1;
        correct_answer[8] =2;
        correct_answer[9] =1;

        queue = random_number_generator();
        displayquestion();

        // scorcetxt.setText(questions[queue[numberofquestioncomplete-1]]);


        seq = getIntent().getIntExtra("value",0);
        if(seq==1 || seq==2 || seq==3 || seq==4 ||seq==5 || seq==6|| seq==7){
            show_mark(seq);
        }
//                    scorcetxt.setText(questions[queue[numberofquestioncomplete-1]]);

    }
    public void displayquestion () {
        if(anscnt < 10) {
            //  TextView ques = (TextView) findViewById(R.id.lbl_question);
            ImageView opt1 = (ImageView) findViewById(R.id.image1x);
            ImageView opt2 = (ImageView) findViewById(R.id.imagce2);
            ImageView opt3 = (ImageView) findViewById(R.id.imagne3);
            ImageView mainimg= (ImageView) findViewById(R.id.mainsimg);
            //ImageButton opt4 = (ImageButton) findViewById(R.id.option4);

            mainimg.setImageResource(questions[queue[numberofquestioncomplete]]);
            opt1.setImageResource(answers[queue[numberofquestioncomplete]][0]);
            opt2.setImageResource(answers[queue[numberofquestioncomplete]][1]);
            opt3.setImageResource(answers[queue[numberofquestioncomplete]][2]);
            // opt4.setImageResource(answers[queue[numberofquestioncomplete]][3]);

            linearLayoutop1.setVisibility(View.VISIBLE);
            linearLayoutop2.setVisibility(View.VISIBLE);
            linearLayoutop3.setVisibility(View.VISIBLE);

            //counter for number of completed queation
            numberofquestioncomplete++;
            mCurrentIndex++;

        }
    }

    // on every selection of option this method is called
    public void onClickCard(View view) {
        condition();
    }

    private void condition() {

        if (anscnt >= 10) {
            if(seq==0 || seq==1 || seq==2 || seq==3 ||seq==4 || seq==5|| seq==6){
                finish();
            }
            else {
                Toast.makeText(getApplicationContext(),"Quiz is completed. Thankyou", Toast.LENGTH_LONG).show();
                //  scorcetxt.setText("Your_Score_is_:"+correct_ans_count+"Wrong :"+wrong_ans_count);

                // showwronglist();
                Intent i = new Intent(this,ScoringPage.class);
                //    String user_name = i.getStringExtra("name");
                // here i just want to pass array to next activity
                // Intent intd = new Intent(getApplicationContext(), ScoringPage.class);
                //intd.putExtra("user_name",user_name);
                i.putExtra("Wrong", wrong_ans_count);
                startActivity(i);
                finish();
            }
        }

        else {
            ImageView opt1 = (ImageView) findViewById(R.id.image1x);
            ImageView opt2 = (ImageView) findViewById(R.id.imagce2);
            ImageView opt3 = (ImageView) findViewById(R.id.imagne3);
            // ImageButton opt4 = (ImageButton) findViewById(R.id.option4);


            //if (anscnt < 10 ) {

            if (opt1.isPressed()) {
                if ((correct_answer[queue[numberofquestioncomplete - 1]] == 0)) {
                    correct_ans_count++;
                    if(mCurrentIndex == 9){
                        Intent i = new Intent(this,ScoringPage.class);
                        i.putExtra("Wrong", wrong_ans_count);
                        startActivity(i);
                        finish();
                    }
                    else {
                        showgreen(mCurrentIndex);
                        displayquestion();
                        anscnt++;}
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
                    wrong_ans_count++;
                    linearLayoutop1.setVisibility(View.GONE);

                    // int a = questions[queue[numberofquestioncomplete - 1]];
                    //int c=queue[numberofquestioncomplete - 1];
                    //int b =correct_answer[queue[numberofquestioncomplete - 1]];
                    //if(!(correct_answer[queue[n
                    // umberofquestioncomplete - 1]] == 1)){
                    // displayquestion_another(a,c,b,0);
                    //}
                    //Toast.makeText(this, ""+b, Toast.LENGTH_SHORT).show();

                    //  linearLayoutop1.setVisibility(View.GONE);

                    //scorcetxt.setText(a);


                    // wrong_questions[wrong_question_counter]=a;
                    //wrong_question_counter++;

                    //  wrong_questions[wrong_question_counter] = a;
                    // wrong_question_counter++;
                }
                //ans
            }
            if (opt2.isPressed()) {
                if ((correct_answer[queue[numberofquestioncomplete - 1]] == 1)) {
                    correct_ans_count++;
                    //Toast.makeText(this,"Your Answer is true", Toast.LENGTH_SHORT).show();
                    //scorcetxt.setText("Your Score is :" + correct_ans_count);
                    //show_mark(mCurrentIndex);
                    if(mCurrentIndex == 9){
                        Intent i = new Intent(this,ScoringPage.class);
                        i.putExtra("Wrong", wrong_ans_count);
                        startActivity(i);
                        finish();
                    }
                    else {
                        showgreen(mCurrentIndex);
                        displayquestion();
                        anscnt++;}
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
                    linearLayoutop2.setVisibility(View.GONE);
                    wrong_ans_count++;

                }
            }
            if (opt3.isPressed()) {
                if (correct_answer[queue[numberofquestioncomplete - 1]] == 2) {
                    correct_ans_count++;
                    if(mCurrentIndex == 9){
                        Intent i = new Intent(this,ScoringPage.class);
                        i.putExtra("Wrong", wrong_ans_count);
                        startActivity(i);
                        finish();
                    }
                    else {
                        showgreen(mCurrentIndex);
                        displayquestion();
                        anscnt++;
                    }
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
                    wrong_ans_count++;
                    linearLayoutop3.setVisibility(View.GONE);
                }
            }}
        if (anscnt <= 10) {
            //   displayquestion();
        }
        //}
    }

    //    private void displayquestion_another(int a,int b,int c,int d) {
//        if (anscnt < 10) {
//            //  TextView ques = (TextView) findViewById(R.id.lbl_question);
//            ImageView opt1 = (ImageView) findViewById(R.id.image1x);
//            ImageView opt2 = (ImageView) findViewById(R.id.imagce2);
//            ImageView opt3 = (ImageView) findViewById(R.id.imagne3);
//            ImageView mainimg = (ImageView) findViewById(R.id.mainsimg);
//            //ImageButton opt4 = (ImageButton) findViewById(R.id.option4);
//
//            mainimg.setImageResource(a);
//
//            if(d==0)
//            {
//                opt1.setImageResource(answers[queue[numberofquestioncomplete]][0]);
//                opt2.setImageResource(answers[b][0]);
//                opt3.setImageResource(answers[queue[numberofquestioncomplete]][2]);
//                linearLayoutop1.setVisibility(View.VISIBLE);
//                linearLayoutop2.setVisibility(View.VISIBLE);
//                linearLayoutop3.setVisibility(View.VISIBLE);
//
//            }
//            if(d==1)
//            {
//
//                opt1.setImageResource(answers[queue[numberofquestioncomplete]][0]);
//                opt3.setImageResource(answers[b][0]);
//                opt2.setImageResource(answers[queue[numberofquestioncomplete]][2]);
//                linearLayoutop1.setVisibility(View.VISIBLE);
//                linearLayoutop2.setVisibility(View.VISIBLE);
//                linearLayoutop3.setVisibility(View.VISIBLE);
//
//            }
//            if(d==2)
//            {
//
//                opt3.setImageResource(answers[queue[numberofquestioncomplete]][0]);
//                opt1.setImageResource(answers[b][0]);
//                opt2.setImageResource(answers[queue[numberofquestioncomplete]][2]);
//                linearLayoutop1.setVisibility(View.VISIBLE);
//                linearLayoutop2.setVisibility(View.VISIBLE);
//                linearLayoutop3.setVisibility(View.VISIBLE);
//
//            }
//
//            // opt4.setImageResource(answers[queue[numberofquestioncomplete]][3]);
//
//            condition();
//
//        }
//    }
//    private void showwronglist() {
////        for(int i=0;i<wrong_questions.length;i++){
////            Toast.makeText(this, ""+wrong_questions[i], Toast.LENGTH_SHORT).show();
////        }
//    }
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
    private void showgreen(int count){
        if(count==0){
            greendot1.setVisibility(View.VISIBLE);
        }
        if(count == 1){
            greendot2.setVisibility(View.VISIBLE);
        }
        else if(count == 2){
            greendot3.setVisibility(View.VISIBLE);
        }
        else if(count == 3){
            greendot4.setVisibility(View.VISIBLE);

        }
        else if(count == 4){
            greendot5.setVisibility(View.VISIBLE);

        }
        else if(count == 5){
            greendot6.setVisibility(View.VISIBLE);

        }
        else if(count == 6){
            greendot7.setVisibility(View.VISIBLE);

        }
        else if(count == 7){
            greendot8.setVisibility(View.VISIBLE);

        }
        else if(count == 8){
            greendot9.setVisibility(View.VISIBLE);

        }

        else if(count == 9){
            greendot10.setVisibility(View.VISIBLE);
        }

    }

    private void show_mark(int count) {
        if(count==1){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            // greendot1.setVisibility(View.VISIBLE);
        }
        if(count == 2){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);

        }
        else if(count == 3){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);

        }
        else if(count ==4){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);

        }
        else if(count == 5){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);
            checkboxanswer5.setImageResource(R.drawable.ok_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);


        }
        else if(count == 6){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);
            checkboxanswer5.setImageResource(R.drawable.ok_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);
            checkboxanswer6.setImageResource(R.drawable.ok_mark);
            checkboxanswer6.setVisibility(View.VISIBLE);

        }
        else if(count == 7){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);
            checkboxanswer5.setImageResource(R.drawable.ok_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);
            checkboxanswer6.setImageResource(R.drawable.ok_mark);
            checkboxanswer6.setVisibility(View.VISIBLE);
            checkboxanswer7.setImageResource(R.drawable.ok_mark);
            checkboxanswer7.setVisibility(View.VISIBLE);

        }
        else if(count == 8){
            checkboxanswer1.setImageResource(R.drawable.ok_mark);
            checkboxanswer1.setVisibility(View.VISIBLE);
            checkboxanswer2.setImageResource(R.drawable.ok_mark);
            checkboxanswer2.setVisibility(View.VISIBLE);
            checkboxanswer3.setImageResource(R.drawable.ok_mark);
            checkboxanswer3.setVisibility(View.VISIBLE);
            checkboxanswer4.setImageResource(R.drawable.ok_mark);
            checkboxanswer4.setVisibility(View.VISIBLE);
            checkboxanswer5.setImageResource(R.drawable.ok_mark);
            checkboxanswer5.setVisibility(View.VISIBLE);
            checkboxanswer6.setImageResource(R.drawable.ok_mark);
            checkboxanswer6.setVisibility(View.VISIBLE);
            checkboxanswer7.setImageResource(R.drawable.ok_mark);
            checkboxanswer7.setVisibility(View.VISIBLE);
            checkboxanswer8.setImageResource(R.drawable.ok_mark);

            //     greendot8.setVisibility(View.VISIBLE);

        }

        else if(count == 9){
            checkboxanswer9.setImageResource(R.drawable.ok_mark);
            checkboxanswer9.setVisibility(View.VISIBLE);
            //   greendot9.setVisibility(View.VISIBLE);

        }
        else if(count == 10){
            checkboxanswer10.setImageResource(R.drawable.ok_mark);
            checkboxanswer10.setVisibility(View.VISIBLE);
            // greendot10.setVisibility(View.VISIBLE);

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}