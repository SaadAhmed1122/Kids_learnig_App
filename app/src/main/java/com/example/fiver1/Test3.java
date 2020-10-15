package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.BindException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Test3 extends AppCompatActivity {


    ImageView opt1, opt2, opt3, mainimg;
    TextView scoretext;
    int Allquestionemo[] = new int[10];

    {
        Allquestionemo[0] = R.drawable.e0;
        Allquestionemo[1] = R.drawable.e1;
        Allquestionemo[2] = R.drawable.e2;
        Allquestionemo[3] = R.drawable.e3;
        Allquestionemo[4] = R.drawable.e4;
        Allquestionemo[5] = R.drawable.e5;
        Allquestionemo[6] = R.drawable.e6;
        Allquestionemo[7] = R.drawable.e7;
        Allquestionemo[8] = R.drawable.e8;
        Allquestionemo[9] = R.drawable.e9;
        // Allquestionemo[10]= R.drawable.e10;
    }

    int Anseremo[] = new int[10];

    {
        Anseremo[0] = R.drawable.p0;
        Anseremo[1] = R.drawable.p2;
        Anseremo[2] = R.drawable.p2;
        Anseremo[3] = R.drawable.p0;
        Anseremo[4] = R.drawable.p0;
        Anseremo[5] = R.drawable.p0;
        Anseremo[6] = R.drawable.p2;
        Anseremo[7] = R.drawable.p1;
        Anseremo[8] = R.drawable.p2;
        Anseremo[9] = R.drawable.p1;
    }

    int options[] = new int[10];

    {
        options[0] = R.drawable.m1;
        options[1] = R.drawable.a4;
        options[2] = R.drawable.w7;
        options[3] = R.drawable.g4;
        options[4] = R.drawable.m5;
        options[5] = R.drawable.h3;
        options[6] = R.drawable.g1;
        options[7] = R.drawable.w1;
        options[8] = R.drawable.m9;
        options[9] = R.drawable.g5;
        // Allquestionemo[10]= R.drawable.e10;
    }

    int options2[] = new int[10];

    {
        options2[0] = R.drawable.m2;
        options2[1] = R.drawable.a5;
        options2[2] = R.drawable.w6;
        options2[3] = R.drawable.g7;
        options2[4] = R.drawable.m6;
        options2[5] = R.drawable.h4;
        options2[6] = R.drawable.g2;
        options2[7] = R.drawable.w2;
        options2[8] = R.drawable.m7;
        options2[9] = R.drawable.g9;
        // Allq2uestionemo[10]= R.drawable.e10;
    }

    int qes, ans, op1, op2, c, i;
    int score = 0, size = 10;

    int queue[] = new int[10];

    {
        queue[0] = 0;
        queue[1] = 1;
        queue[2] = 2;
        queue[3] = 3;
        queue[4] = 4;
        queue[5] = 5;
        queue[6] = 6;
        queue[7] = 7;
        queue[8] = 8;
        queue[9] = 9;


    }

    Random random = new Random();
    Random random2 = new Random();

    public int random() {

        return random.nextInt(10);
    }

    public int randomp() {

        return random2.nextInt(3);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        opt1 = (ImageView) findViewById(R.id.image1x3);
        opt2 = (ImageView) findViewById(R.id.imagce23);
        opt3 = (ImageView) findViewById(R.id.imagne33);
        mainimg = (ImageView) findViewById(R.id.mainsimg3);
        scoretext = (TextView) findViewById(R.id.sctxt3);


        c = randomp();
        qes = random();
        queue[qes] = qes;
        op1 = random();
        op2 = random();
        displayquestion(qes, op1, op2, c);


        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == 0) {

                    Toast.makeText(Test3.this, "true", Toast.LENGTH_SHORT).show();


                    score++;
                    qes = random();
                    op1 = random();
                    op2 = random();
                    c = randomp();
                    displayquestion(qes, op1, op2, c);
                } else {
                    Log.d("logs", "onClick: q" + " " + qes + "op1  " + op1 + "op2  " + op2);
                    Toast.makeText(Test3.this, "false", Toast.LENGTH_SHORT).show();

                }

            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == 1) {

                    Toast.makeText(Test3.this, "true", Toast.LENGTH_SHORT).show();

                    score++;
                    qes = random();
                    op1 = random();
                    op2 = random();
                    c = randomp();
                    displayquestion(qes, op1, op2, c);
                } else {
                    Log.d("logs", "onClick: q" + " " + qes + "op1  " + op1 + "op2  " + op2);
                    Toast.makeText(Test3.this, "false", Toast.LENGTH_SHORT).show();

                }
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == 2) {


                    Toast.makeText(Test3.this, "true", Toast.LENGTH_SHORT).show();
                    score++;
                    qes = random();
                    op1 = random();
                    op2 = random();
                    c = randomp();
                    displayquestion(qes, op1, op2, c);
                } else {
                    Log.d("logs", "onClick: q" + " " + qes + "op1  " + op1 + "op2  " + op2);
                    Toast.makeText(Test3.this, "false", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    public void displayquestion(int q, int op1, int op2, int c) {
   /*     int i = 0;
        while (i <= 10) {

                if (queue[q] == i) {*/

                scoretext.setText("" + score);
                qes = q;
                ans = qes;
                queue[q] = -1;
                Log.d("kl", "new: " + queue[i]);
                mainimg.setImageResource(Allquestionemo[qes]);

                if (c == 0) {


                    opt1.setImageResource(Anseremo[ans]);
                    opt2.setImageResource(options[op1]);
                    opt3.setImageResource(options2[op2]);

                } else if (c == 1) {

                    opt2.setImageResource(Anseremo[ans]);
                    opt1.setImageResource(options[op1]);
                    opt3.setImageResource(options2[op2]);

                } else if (c == 2) {
                    opt3.setImageResource(Anseremo[ans]);
                    opt2.setImageResource(options[op1]);
                    opt1.setImageResource(options2[op2]);

                /*} else if (queue[q] == -1) {

                    continue;
                }


            } else
                i++;*/
        }
    }
}