package com.example.fiver1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.fiver1.layout.PuzzleLayout;
import com.example.fiver1.view.PuzzleView;

public class Puzzlestart extends AppCompatActivity implements Runnable, View.OnTouchListener {

    private PuzzleView mPuzzleView;
    private PuzzleLayout puzzleLayout;
    int squareRootNum = 3;
    ImageView imgshow;
    ImageView ivTips;
    Bitmap IMG = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzlestart);

        imgshow= (ImageView) findViewById(R.id.imageView9);

        Intent intent = getIntent();
        IMG = intent.getParcelableExtra("bmIMG");

        if(IMG==null){
            IMG= BitmapFactory.decodeResource(getResources(),R.drawable.birds);
        }
        //IMGBitmap = icon;
        //img.setImageBitmap(icon);

        imgshow.setImageBitmap(IMG);
        puzzleLayout = (PuzzleLayout) findViewById(R.id.activity_swipe_card);
        puzzleLayout.setImage(IMG, squareRootNum);
        puzzleLayout.setOnCompleteCallback(new PuzzleLayout.OnCompleteCallback() {
            @Override
            public void onComplete() {

                puzzleLayout.postDelayed(Puzzlestart.this, 800);
            }
        });
    }
    @Override
    public void run() {
        squareRootNum++;
        if(squareRootNum > 2){
            showDialog();
        }else {
            ivTips.setImageBitmap(IMG);
            puzzleLayout.setImage(IMG, squareRootNum);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                ivTips.setVisibility(View.VISIBLE);
                break;
            default:
                ivTips.setVisibility(View.GONE);
        }
        return true;
    }

    private void showDialog() {
        new AlertDialog.Builder(Puzzlestart.this)
                .setTitle(R.string.TituloGanar)
                .setMessage(R.string.DescGanar)
                .setPositiveButton(R.string.OK,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }).show();
    }

}