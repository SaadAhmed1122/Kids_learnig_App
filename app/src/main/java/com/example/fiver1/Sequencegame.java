package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Sequencegame extends AppCompatActivity {

    Spinner sp1,sp2,sp3,sp4,sp5,sp6,sp7;
    ImageView sqstart;
    String sp1txt,sp2txt,sp3txt,sp4txt,sp5txt,sp6txt,sp7txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencegame);
        setview();
        sqstart = (ImageView) findViewById(R.id.imageView_seq);
        String[] cat= {"Emozioni","Cibo","Colori","Forms","Transporti","Numeri","IMMAGINI"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cat);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);
        sp3.setAdapter(adapter);
        sp4.setAdapter(adapter);
        sp5.setAdapter(adapter);
        sp6.setAdapter(adapter);
        sp7.setAdapter(adapter);




        sqstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp1txt= sp1.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp1txt, Toast.LENGTH_SHORT).show();

                sp2txt= sp2.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp2txt, Toast.LENGTH_SHORT).show();

                sp3txt= sp3.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp3txt, Toast.LENGTH_SHORT).show();

                sp4txt= sp4.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp4txt, Toast.LENGTH_SHORT).show();

                sp5txt= sp5.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp5txt, Toast.LENGTH_SHORT).show();

                sp6txt= sp6.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp6txt, Toast.LENGTH_SHORT).show();

                sp7txt= sp7.getSelectedItem().toString();
                //Toast.makeText(Sequencegame.this, ""+sp7txt, Toast.LENGTH_SHORT).show();



                if(sp7txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "Cibo") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "IMMAGINI") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }
                else if(sp7txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",6);
                    startActivity(ii);
                }

                if(sp6txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "Cibo") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "IMMAGINI") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }
                else if(sp6txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",5);
                    startActivity(ii);
                }

                if(sp5txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "Cibo") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "IMMAGINI") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }
                else if(sp5txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",4);
                    startActivity(ii);
                }


                if(sp4txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "Cibo") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "IMMAGINI") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }
                else if(sp4txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",3);
                    startActivity(ii);
                }

                if(sp3txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "Cibo") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "IMMAGINI") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }
                else if(sp3txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",2);
                    startActivity(ii);
                }


                if(sp2txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "Cibo"){ Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "IMMAGINI"){ Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }
                else if(sp2txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",1);
                    startActivity(ii);
                }


                if(sp1txt== "Emozioni"){
                    Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
                    //ii.putExtra("Seq","emo");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "Cibo"){ Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
                    // ii.putExtra("Seq","food");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "Colori"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "Forms"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
                    //ii.putExtra("Seq","colour");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "Transporti"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
                    //ii.putExtra("Seq","transport");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "IMMAGINI"){ Intent ii= new Intent(Sequencegame.this,Animals_question.class);
                    //ii.putExtra("Seq","animals");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }
                else if(sp1txt== "Numeri"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
                    //ii.putExtra("Seq","numbers");
                    ii.putExtra("value",0);
                    startActivity(ii);
                }





            }
        });

    }

    private void setview() {
        sp1 = (Spinner) findViewById(R.id.spinner1);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        sp3 = (Spinner) findViewById(R.id.spinner3);
        sp4 = (Spinner) findViewById(R.id.spinner4);
        sp5 = (Spinner) findViewById(R.id.spinner5);
        sp6 = (Spinner) findViewById(R.id.spinner6);
        sp7 = (Spinner) findViewById(R.id.spinner7);
    }


}