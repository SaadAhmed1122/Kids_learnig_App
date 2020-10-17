package com.example.fiver1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Puzzlemainscreen extends AppCompatActivity {

    private static final int PERMIS_CAMARA = 200;
    private static final int PERMIS_CAPTURA_IMATGE = 300;
    private ImageView img;
    private Button bfoto_cap;

    private Button bplay_game;
    private TextView tvplay;
    private Bitmap IMGBitmap = null,icon;

    // Número que identifica l'activitat de l'aplicació de fotos
    private static final int APP_CAMERA = 0;
    // Identificador de la imatge que crearà l'aplicació de fotos
    private Uri identificadorImatge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_puzzlemainscreen);

        bplay_game = (Button) findViewById(R.id.bJugar);

        bfoto_cap = (Button) findViewById(R.id.bFoto);
        img = (ImageView) findViewById(R.id.imageView8);

        icon= BitmapFactory.decodeResource(getResources(),R.drawable.birds);
        //IMGBitmap = icon;
        img.setImageBitmap(icon);

        bfoto_cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(Puzzlemainscreen.this, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMIS_CAMARA);
                    return;
                }
                fesFoto(view);
            }
        });
        bplay_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(IMGBitmap != null) {
                    Intent intent = new Intent(Puzzlemainscreen.this, Puzzlestart.class);
                    //  String n1 = tvplay.getText().toString();
                    intent.putExtra("bmIMG", IMGBitmap);
                    startActivity(intent);
                }
                else{
                    Intent intent2 = new Intent(Puzzlemainscreen.this, Puzzlestart.class);
                    //  String n1 = tvplay.getText().toString();
                    intent2.putExtra("bmIMG", "Birds");
                    startActivity(intent2);
                }
            }
        });

    }
    public void IntentGoPuzzle(View v){

    }

    private void fesFoto(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, PERMIS_CAPTURA_IMATGE);
        }
    }

    public static Bitmap RotateBitmap(Bitmap source, float angle)
    {
        Matrix matrix = new Matrix();
        matrix.postRotate(angle);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == PERMIS_CAPTURA_IMATGE && resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");

                Display display = getWindowManager().getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                int width = size.x;
                int height = size.y;

                IMGBitmap = imageBitmap;

                img.setImageBitmap(IMGBitmap);

            }
        }
    }
}