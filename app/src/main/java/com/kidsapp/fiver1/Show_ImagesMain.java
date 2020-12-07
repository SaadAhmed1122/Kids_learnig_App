package com.kidsapp.fiver1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CursorAdapter;
import android.widget.GridView;

import com.kidsapp.fiver1.db.MemoriesAdapter;
import com.kidsapp.fiver1.db.MemoryDbHelper;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Show_ImagesMain extends AppCompatActivity {
    private MemoryDbHelper dbHelper;
    private GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__images_main);
        this.gridView = (GridView) findViewById(R.id.activity_main_grid_view);
        this.dbHelper = new MemoryDbHelper(this);
        this.gridView.setAdapter(new MemoriesAdapter(this, this.dbHelper.readAllMemories(), false));
        this.gridView.setEmptyView(findViewById(R.id.activity_main_empty_view));
        AdView adView = new AdView(this);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    protected void onResume() {
        super.onResume();

        ((CursorAdapter)gridView.getAdapter()).swapCursor(this.dbHelper.readAllMemories());
    }

    public void addNewMemory(View view) {
        Intent intent = new Intent(this, AddImge.class);
        startActivity(intent);
    }
}