package com.kidsapp.fiver1;

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
    int one=1,two=2,three=3,four=4, five=5, six=6,seven=7,eight=8,nine=9,zero=0;
    ImageView sqstart;
    String sp1txt,sp2txt,sp3txt,sp4txt,sp5txt,sp6txt,sp7txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequencegame);
        setview();
        sqstart = (ImageView) findViewById(R.id.imageView_seq);
        String[] cat= {"Null","Emotions","Food","Shapes","Transport","Number","Animals","Things"};
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
                Toast.makeText(Sequencegame.this, ""+sp1txt, Toast.LENGTH_SHORT).show();
                spinners1_condition();

                sp2txt= sp2.getSelectedItem().toString();
                spinners2_condition();
                //Toast.makeText(Sequencegame.this, ""+sp2txt, Toast.LENGTH_SHORT).show();

                sp3txt= sp3.getSelectedItem().toString();
                spinners3_condition();
                //Toast.makeText(Sequencegame.this, ""+sp3txt, Toast.LENGTH_SHORT).show();

                sp4txt= sp4.getSelectedItem().toString();
                spinners4_condition();
                //Toast.makeText(Sequencegame.this, ""+sp4txt, Toast.LENGTH_SHORT).show();

                sp5txt= sp5.getSelectedItem().toString();
                spinners5_condition();
                //Toast.makeText(Sequencegame.this, ""+sp5txt, Toast.LENGTH_SHORT).show();

                sp6txt= sp6.getSelectedItem().toString();
                spinners6_condition();
                //Toast.makeText(Sequencegame.this, ""+sp6txt, Toast.LENGTH_SHORT).show();

                sp7txt= sp7.getSelectedItem().toString();
                spinners7_condition();
                //Toast.makeText(Sequencegame.this, ""+sp7txt, Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void spinners7_condition() {
        if(sp7txt == "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Food") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Animals") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",one);
            startActivity(ii);
        }
        else if(sp7txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",one);
            startActivity(ii);
        }

    }

    private void spinners6_condition() {
        if(sp6txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Food") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Animals") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",two);
            startActivity(ii);
        }
        else if(sp6txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",two);
            startActivity(ii);
        }

    }

    private void spinners5_condition() {
        if(sp5txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Food") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Animals") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",three);
            startActivity(ii);
        }
        else if(sp5txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",three);
            startActivity(ii);
        }

    }

    private void spinners4_condition() {
        if(sp4txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Food") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Animals") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",four);
            startActivity(ii);
        }
        else if(sp4txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",four);
            startActivity(ii);
        }
    }

    private void spinners3_condition() {

        if(sp3txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Food") { Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Animals") { Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",five);
            startActivity(ii);
        }
        else if(sp3txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",five);
            startActivity(ii);
        }
    }

    private void spinners2_condition() {
        if(sp2txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Food"){ Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Animals"){ Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",six);
            startActivity(ii);
        }
        else if(sp2txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",six);
            startActivity(ii);
        }

    }

    private void spinners1_condition() {
        if(sp1txt== "Emotions"){
            Intent ii= new Intent(Sequencegame.this, EmoQuestionsActivity.class);
            //ii.putExtra("Seq","emo");
            ii.putExtra("value",seven);
            startActivity(ii);
        }
        else if(sp1txt== "Food"){ Intent ii= new Intent(Sequencegame.this,FoodActivity.class);
            // ii.putExtra("Seq","food");
            ii.putExtra("value",seven);
            startActivity(ii);
        }

        else if(sp1txt== "Shapes"){ Intent ii= new Intent(Sequencegame.this,Colours_question_act.class);
            //ii.putExtra("Seq","colour");
            ii.putExtra("value",seven);
            startActivity(ii);
        }
        else if(sp1txt== "Transport"){ Intent ii= new Intent(Sequencegame.this,TravelAct.class);
            //ii.putExtra("Seq","transport");
            ii.putExtra("value",seven);
            startActivity(ii);
        }
        else if(sp1txt== "Animals"){ Intent ii= new Intent(Sequencegame.this,Animals_question.class);
            //ii.putExtra("Seq","animals");
            ii.putExtra("value",seven);
            startActivity(ii);
        }
        else if(sp1txt== "Number"){ Intent ii= new Intent(Sequencegame.this,NumbersAct.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",seven);
            startActivity(ii);
        }
        else if(sp1txt== "Things"){ Intent ii= new Intent(Sequencegame.this,Vehicals_Act.class);
            //ii.putExtra("Seq","numbers");
            ii.putExtra("value",seven);
            startActivity(ii);
        }

    }

    private void setview() {
        sp1 = (Spinner) findViewById(R.id.spinner7);
        sp2 = (Spinner) findViewById(R.id.spinner6);
        sp3 = (Spinner) findViewById(R.id.spinner5);
        sp4 = (Spinner) findViewById(R.id.spinner4);
        sp5 = (Spinner) findViewById(R.id.spinner3);
        sp6 = (Spinner) findViewById(R.id.spinner2);
        sp7 = (Spinner) findViewById(R.id.spinner1);
    }
}