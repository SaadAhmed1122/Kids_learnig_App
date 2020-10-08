package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView head;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        head= findViewById(R.id.textView);
        String a= head.getText().toString();
        SpannableString content = new SpannableString(a);
        content.setSpan(new UnderlineSpan(),0,a.length(),0);
        head.setText(content);
    }

    public void showanotherac(View view) {
        startActivity(new Intent(MainActivity.this,GraphicActivity.class));
    }

    public void showgetgallery(View view) {
        startActivity(new Intent(MainActivity.this,GetimagesGallery.class));
    }
}