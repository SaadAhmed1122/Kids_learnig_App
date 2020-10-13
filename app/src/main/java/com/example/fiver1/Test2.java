package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 extends AppCompatActivity {
    int[] questions;
    int[][] answers;
    int[] wrong_questions;
    int wrong_question_counter =0;
    int queue[]=new int[10];
    int numberofquestioncomplete = 0;
    LinearLayout linearLayoutop1,linearLayoutop2,linearLayoutop3;
    int answerlog[] = new int[10];
    int anscnt = 0,wrong_ans_count=0;
    TextView scorcetxt;
    int correct_ans_count=0;
    int correct_answer[] = new int[10];
    String user_name;

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_test2);
        scorcetxt= findViewById(R.id.sctxt);
        linearLayoutop1 = (LinearLayout) findViewById(R.id.linearLayout_opt1);
        linearLayoutop2 = (LinearLayout) findViewById(R.id.linearLayout_opt2);
        linearLayoutop3 = (LinearLayout) findViewById(R.id.linearLayout_opt3);

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

        scorcetxt.setText(questions[queue[numberofquestioncomplete-1]]);

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
        }
    }

    // on every selection of option this method is called
    public void onClickCard(View view) {
        anscnt++;
        if (anscnt > 10) {
            Toast.makeText(getApplicationContext(),"Quiz is completed. Thankyou"+correct_ans_count, Toast.LENGTH_LONG).show();
            scorcetxt.setText("Your_Score_is_:"+correct_ans_count);

            showwronglist();
            //Intent i = new Intent(this,ScoringPage.class);
          //  String user_name = i.getStringExtra("name");
            //here i just want to pass array to next activity
          //  Intent intd = new Intent(getApplicationContext(), ScoringPage.class);
          //  intd.putExtra("user_name",user_name);
          //  i.putExtra("total", Integer.toString(correct_ans_count));
           // startActivity(i);
        }

        ImageView opt1 = (ImageView) findViewById(R.id.image1x);
        ImageView opt2 = (ImageView) findViewById(R.id.imagce2);
        ImageView opt3 = (ImageView) findViewById(R.id.imagne3);
       // ImageButton opt4 = (ImageButton) findViewById(R.id.option4);


        if (anscnt <= 10) {

            if (opt1.isPressed() == true) {
                if ((correct_answer[queue[numberofquestioncomplete - 1]] == 0)) {
                    correct_ans_count++;
                    Toast.makeText(this, "Your Answer is true", Toast.LENGTH_SHORT).show();
                    scorcetxt.setText("Your Score is :" + correct_ans_count);
                    //displayquestion();
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();

                    //wrong_ans_count++;
                    //  linearLayoutop1.setVisibility(View.GONE);
                    int a = questions[queue[numberofquestioncomplete - 1]];
                    scorcetxt.setText(a);


                    wrong_questions[wrong_question_counter]=a;
                    wrong_question_counter++;

                    //  wrong_questions[wrong_question_counter] = a;
                    // wrong_question_counter++;

                }
                //ans
            }
            if (opt2.isPressed() == true) {
                if ((correct_answer[queue[numberofquestioncomplete - 1]] == 1)) {
                    correct_ans_count++;
                    Toast.makeText(this, "Your Answer is true", Toast.LENGTH_SHORT).show();
                    scorcetxt.setText("Your Score is :" + correct_ans_count);
                    //displayquestion();
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
                    int a = questions[queue[numberofquestioncomplete - 1]];
                    scorcetxt.setText(a);
                    // wrong_questions[wrong_question_counter] = a;
                    //wrong_question_counter++;
                    //wrong_ans_count++;
                    //  linearLayoutop2.setVisibility(View.GONE);
                }
                //anscnt++;
            }
            if (opt3.isPressed() == true) {
                if (correct_answer[queue[numberofquestioncomplete - 1]] == 2) {
                    correct_ans_count++;
                    Toast.makeText(this, "Your Answer is true", Toast.LENGTH_SHORT).show();
                    scorcetxt.setText("Your Score is :" + correct_ans_count);

                    //         displayquestion();
                } else {
                    Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
                    int a = questions[queue[numberofquestioncomplete - 1]];
                    scorcetxt.setText(a);
                    //  wrong_questions[wrong_question_counter] = a;
                    // wrong_question_counter++;
                    //wrong_ans_count++;
                    //           linearLayoutop3.setVisibility(View.GONE);
                }
                // anscnt++;

            }
            if (anscnt <= 10) {
                displayquestion();
            }
        }
    }

    private void showwronglist() {
        for(int i=0;i<wrong_questions.length;i++){
            Toast.makeText(this, ""+wrong_questions[i], Toast.LENGTH_SHORT).show();
        }
    }
}