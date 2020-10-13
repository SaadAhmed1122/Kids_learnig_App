package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class TestActivity<c> extends AppCompatActivity {
    ImageView opt1,op2,op3,mainimg;
    Random random;
    int a,b,c=0,d=0;
    int a1,b1,c1;
    int scroe,counter=0;
    int indexmain,indexop1,indexop2,indexop3;
    int indexToGetImage,indexToGetImage2, indexquestion,questionid;

    int Allquestionemo[]=new int [10];{
        Allquestionemo[0]= R.drawable.e0;
        Allquestionemo[1]= R.drawable.e1;
        Allquestionemo[2]= R.drawable.e2;
        Allquestionemo[3]= R.drawable.e3;
        Allquestionemo[4]= R.drawable.e4;
        Allquestionemo[5]= R.drawable.e5;
        Allquestionemo[6]= R.drawable.e6;
        Allquestionemo[7]= R.drawable.e7;
        Allquestionemo[8]= R.drawable.e8;
        Allquestionemo[9]= R.drawable.e9;
       // Allquestionemo[10]= R.drawable.e10;
    }

//    int correctindex[] = new int [10];{
//            Allquestion[0]=10;
//    }
    int AllAnswer [] = new int[22];{
        AllAnswer[0]= R.drawable. p0;
        AllAnswer[1] = R.drawable.p1;
        AllAnswer[2]= R.drawable. p2;
        AllAnswer[3] = R.drawable.a0;
        AllAnswer[4] = R.drawable.a1;
        AllAnswer[5] = R.drawable.a2;
        AllAnswer[6] = R.drawable.a3;
        AllAnswer[7] = R.drawable.a4;
        AllAnswer[8] = R.drawable.a5;
        AllAnswer[9] = R.drawable.a6;
        AllAnswer[10] = R.drawable.a7;
        AllAnswer[11]= R.drawable. a8;
        AllAnswer[12] = R.drawable.a9;
        AllAnswer[13]= R.drawable. a10;
        AllAnswer[14] = R.drawable.a11;
        AllAnswer[15] = R.drawable.a12;
        AllAnswer[16] = R.drawable.a13;
        AllAnswer[17] = R.drawable.a14;
        AllAnswer[18] = R.drawable.a15;
        AllAnswer[19] = R.drawable.a16;
        AllAnswer[20] = R.drawable.a17;
        AllAnswer[21] = R.drawable.a18;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_test);

        opt1= findViewById(R.id.image1x);
        op2 = findViewById(R.id.imagce2);
        op3 = findViewById(R.id.imagne3);
        mainimg = findViewById(R.id.mainsimg);

//        nextimg();
            randomwork(0);
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomwork(3);
                // randomwork();
//                if (c == 1) {
//                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
//                    randomwork();
//                }
//                else if (c == 2) {
//                    mainimg.setImageResource(questionid);
//                    op3.setImageResource(a);
//                    op2.setImageResource(questionid);
//                    opt1.setImageResource(b);
//                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
//                    randomwork();
//                } else if (c == 3) {
//                    mainimg.setImageResource(questionid);
//                    opt1.setImageResource(questionid);
//                    op2.setImageResource(a);
//                    op3.setImageResource(b);
//                    Toast.makeText(TestActivity.this, "your answerr is wrong", Toast.LENGTH_SHORT).show();
//                    randomwork();
//
//                } else if (c == 4) {
//                    mainimg.setImageResource(questionid);
//                    op2.setImageResource(questionid);
//                    opt1.setImageResource(a);
//                    op3.setImageResource(b);
//                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
//                    randomwork();
//
//                }
//                if (indexmain == indexop3){
//                    Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//                    counter++;
//                scroe++;
//                    Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//                randomwork(2);
////                counter++;
////                swap(counter);
//
//                 //   if(counter==1){swap(counter);}
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//                }
//                else{
//                    Toast.makeText(TestActivity.this, "Try Again !!", Toast.LENGTH_SHORT).show();
//                    d++;
//                    if(d==1){
//                        Toast.makeText(TestActivity.this, "Last Chance !!", Toast.LENGTH_SHORT).show();
//                        d++;
//                    }
//                    else {
//                        randomwork();
//                        counter++;
//                        swap(counter);
//                    }
//                }

                        }

        });

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                randomwork(1);
//                if (indexmain== indexop1){
//                    Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//                    scroe++;
//                    Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//                    randomwork();
//                    counter++;
//                  if(counter==1){swap(counter);
//     }
//                 //   if(counter==4){swap(counter);}
//                 //   if(counter==6){swap(counter);}
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//
//                }
//                else{
//                    Toast.makeText(TestActivity.this, "Try Again !!", Toast.LENGTH_SHORT).show();
//                    d++;
//                    if(d==1){
//                        Toast.makeText(TestActivity.this, "Last Chance !!", Toast.LENGTH_SHORT).show();
//                        d++;
//                    }
//                    else {
//                        randomwork();
//                        counter++;
//                        swap(counter);
//                    }
//                }
////                randomwork();
////                if (c == 1) {
////                    Toast.makeText(TestActivity.this, "Your answer is Right", Toast.LENGTH_SHORT).show();
////                    randomwork();
////                }
////                else if (c == 2) {
////                    mainimg.setImageResource(questionid);
////                    op3.setImageResource(a);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(b);
////                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
////                    randomwork();
////                } else if (c == 3) {
////                    mainimg.setImageResource(questionid);
////                    opt1.setImageResource(questionid);
////                    op2.setImageResource(a);
////                    op3.setImageResource(b);
////                    c++;
////                    Toast.makeText(TestActivity.this, "your answerr is right", Toast.LENGTH_SHORT).show();
////                    randomwork();
////
////                } else if (c == 4) {
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
////                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
////                    randomwork();
////
////                }
            }
        });

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                randomwork(2);
            }
//            {
////                //randomwork();
////                if (c == 1) {
////                    Toast.makeText(TestActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
////                    randomwork();
////                }
////               else if (c == 2) {
////                    mainimg.setImageResource(questionid);
////                    op3.setImageResource(a);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(b);
////                    Toast.makeText(TestActivity.this, "Your answer is right", Toast.LENGTH_SHORT).show();
////                    randomwork();
////                } else if (c == 3) {
////                    mainimg.setImageResource(questionid);
////                    opt1.setImageResource(questionid);
////                    op2.setImageResource(a);
////                    op3.setImageResource(b);
////                    Toast.makeText(TestActivity.this, "your answerr is wrong", Toast.LENGTH_SHORT).show();
////                    randomwork();
////
////                } else if (c == 4) {
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
////                    Toast.makeText(TestActivity.this, "Your answer is right", Toast.LENGTH_SHORT).show();
////                    randomwork();
////
////                }
//                if (indexmain== indexop2){
//                    Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//                    scroe++;
//                    Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//                    randomwork();
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//                }
//                else{
//
//                    Toast.makeText(TestActivity.this, "Try Again !!", Toast.LENGTH_SHORT).show();
//                    d++;
//                    if(d==1){
//                        Toast.makeText(TestActivity.this, "Last Chance !!", Toast.LENGTH_SHORT).show();
//                        d++;
//                    }
//                    else {
//                        randomwork();
//                        counter++;
//                        swap(counter);
//                    }
//                }
//            }
        });

    }

    private void swap(int counter) {
    if(counter==1){
     //   int opp1= AllAnswer[indexToGetImage];

        int p1,p2,p3;
        p1= a;
        p2=b;
        p3= questionid;


        op2.setImageResource(p3);
        op3.setImageResource(p1);
        opt1.setImageResource(p2);
        mainimg.setImageResource(questionid);


        if(p3==p3){
        scroe++;
            Toast.makeText(this, "Your Answer is true"+scroe, Toast.LENGTH_SHORT).show();

        }
        if(p1==p3){
            scroe++;
            Toast.makeText(this, "Your Answer is true"+scroe, Toast.LENGTH_SHORT).show();

        }
        if(p2==p3){
            scroe++;
            Toast.makeText(this, "Your Answer is true"+scroe, Toast.LENGTH_SHORT).show();

        }


//        //        a1= a;
////        b1= b;
////        c1= questionid;
////
////        int ans1 = c1;
////
////
////
////        opt1.setImageResource(b1);
////        op3.setImageResource(c1);
////        op2.setImageResource(a1);
////        mainimg.setImageResource(a1);
//        if (m==n){
//            Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//            scroe++;
//            Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//            //randomwork();
//            counter++;
//            //indexmain++;
//           // randomwork();
//            //   if(counter==4){swap(counter);}
//            //   if(counter==6){swap(counter);}
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//
//        }
//  if (m== k){
//            Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//            scroe++;
//            Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//            //randomwork();
//            counter++;
//      //indexmain++;
//     // randomwork();
//            //   if(counter==4){swap(counter);}
//            //   if(counter==6){swap(counter);}
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//
//        }
//if (m==l){
//            Toast.makeText(TestActivity.this, "Your Answer is true", Toast.LENGTH_SHORT).show();
//            scroe++;
//            Toast.makeText(TestActivity.this, ""+scroe, Toast.LENGTH_SHORT).show();
//            //randomwork();
//
//            counter++;
//    indexmain++;
//    randomwork();
//            //   if(counter==4){swap(counter);}
//            //   if(counter==6){swap(counter);}
////                    mainimg.setImageResource(questionid);
////                    op2.setImageResource(questionid);
////                    opt1.setImageResource(a);
////                    op3.setImageResource(b);
//
//        }

    }
    }

    private void checkans(int s) {
    }

    private void randomwork(int number) {
        random= new Random();

        indexToGetImage= random.nextInt(AllAnswer.length);

       /// int j=1;
        a=AllAnswer[indexToGetImage];


            b=AllAnswer[indexToGetImage++];
     //       indexToGetImage2= random.nextInt(AllAnswer.length);

        indexquestion= random.nextInt(Allquestionemo.length);
        questionid= Allquestionemo[indexquestion];

///        Question change here
        mainimg.setImageResource(questionid);
        op3.setImageResource(questionid);
        opt1.setImageResource(a);
        op2.setImageResource(b);


        indexmain = questionid;
        indexop1 = a;
        indexop2 = b;
        indexop3 = questionid;

        int p1, p2, p3;
        p1 = a;
        p2 = b;
        p3 = questionid;
        if(number==1) {

            if (indexmain == indexop1) {
                scroe++;
                Toast.makeText(this, "Your Answer is true" + scroe, Toast.LENGTH_SHORT).show();
//Random Number
                indexToGetImage= random.nextInt(AllAnswer.length);

                /// int j=1;
                a=AllAnswer[indexToGetImage];

                    b=AllAnswer[indexToGetImage++];
     //    indexToGetImage2= random.nextInt(AllAnswer.length);

                indexquestion= random.nextInt(Allquestionemo.length);
                questionid= Allquestionemo[indexquestion];
                indexmain = questionid;
                indexop1 = a;
                indexop2 = b;
                indexop3 = questionid;

                op2.setImageResource(questionid);
                op3.setImageResource(a);
                opt1.setImageResource(b);
                mainimg.setImageResource(questionid);
            }
            else {
                Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
            }

        }
        if(number==2){

            if (indexmain == indexop2) {
                scroe++;
                Toast.makeText(this, "Your Answer is true" + scroe, Toast.LENGTH_SHORT).show();

                //Random Number
                indexToGetImage= random.nextInt(AllAnswer.length);

                /// int j=1;
                a=AllAnswer[indexToGetImage];

                    indexToGetImage++;
                    b=AllAnswer[indexToGetImage];
                }
//       indexToGetImage2= random.nextInt(AllAnswer.length);

                indexquestion= random.nextInt(Allquestionemo.length);
                questionid= Allquestionemo[indexquestion];

                indexmain = questionid;
                indexop1 = a;
                indexop2 = b;
                indexop3 = questionid;

                op2.setImageResource(a);
                op3.setImageResource(b);
                opt1.setImageResource(questionid);
                mainimg.setImageResource(questionid);
            }
            else {
                Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
            }



        if(number==3){

            if (indexmain == indexop3) {
                scroe++;
                Toast.makeText(this, "Your Answer is true" + scroe, Toast.LENGTH_SHORT).show();

                //Random Number
                indexToGetImage= random.nextInt(AllAnswer.length);

                /// int j=1;
                a=AllAnswer[indexToGetImage];

                    indexToGetImage++;
                    b=AllAnswer[indexToGetImage];
        //        }
//       indexToGetImage2= random.nextInt(AllAnswer.length);

                indexquestion= random.nextInt(Allquestionemo.length);
                questionid= Allquestionemo[indexquestion];
                indexmain = questionid;
                indexop1 = a;
                indexop2 = b;
                indexop3 = questionid;

                op2.setImageResource(b);
                op3.setImageResource(questionid);
                opt1.setImageResource(a);
                mainimg.setImageResource(questionid);
            }
            else {
                Toast.makeText(this, "Your Answer is wrong", Toast.LENGTH_SHORT).show();
            }

        }
        //updatequestion(questionid,a,b,2);
    }

    private void updatequestion(int questionid, int a, int b,int number) {
        if(questionid==10 && a>AllAnswer.length && b>AllAnswer.length){
            Toast.makeText(this, "Question Khatam", Toast.LENGTH_SHORT).show();
        }
        else {
            if(number ==2){
                mainimg.setImageResource(questionid);
                op3.setImageResource(a);
                op2.setImageResource(b);
                opt1.setImageResource(questionid);
            }
            else if(number ==3){
                mainimg.setImageResource(questionid);
                op3.setImageResource(questionid);
                op2.setImageResource(b);
                opt1.setImageResource(a);
            }
        }
    }

    private void nextimg() {
      //  randomwork();
        if(c==0){
            mainimg.setImageResource(Allquestionemo[indexquestion]);
            op3.setImageResource(Allquestionemo[indexquestion]);
            op2.setImageResource(b);
            opt1.setImageResource(a);
        }
        if (c == 1) {
            op3.setImageResource(a);
            op2.setImageResource(Allquestionemo[indexquestion]);
            opt1.setImageResource(b);
            c++;
            op2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(TestActivity.this, "Your Answer is Right", Toast.LENGTH_SHORT).show();
        //            randomwork();
                    nextimg();
                }
            });
        }
        else  if(c==2){
            opt1.setImageResource(Allquestionemo[indexquestion]);
            op2.setImageResource(a);
            op3.setImageResource(b);
            c++;
            opt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(TestActivity.this, "Your Answer is Right", Toast.LENGTH_SHORT).show();
          //          randomwork();
                    nextimg();
                }
            });

        }

        else  if(c==3){
            op2.setImageResource(Allquestionemo[indexquestion]);
            opt1.setImageResource(a);
            op3.setImageResource(b);
            c++;
            op2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(TestActivity.this, "Your Answer is Right", Toast.LENGTH_SHORT).show();
            ///        randomwork();
                    nextimg();
                }
            });

        }

    }


}