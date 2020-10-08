package com.example.fiver1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class GetimagesGallery extends AppCompatActivity {

    ImageView demoimg;
    private static final int LOCATION_REQUEST_CODE = 100;
    private static final int CAMERA_REQUEST_CODE = 200;
    private static final int STORAGE_REQUEST_CODE = 300;
    private static final int IMAGE_PICK_GALLERY_CODE = 400;
    private static final int IMAGE_PICK_CAMERA_CODE = 500;

    //permission Array
    private String[] camerapermission;
    private String[] storagepermission;
    //image picked
    private Uri Imageuri;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getimages_gallery);

        demoimg= findViewById(R.id.demoimg);


        camerapermission = new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
        storagepermission = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE};

    }

    public void pickfromgalery(View view) {
        //Gallery Clicked;
        if (checkstoragePermission()) {
            pickfromGallery();
        } else {
            requestStoragePermission();
        }
    }

    public void pickfromcamera(View view) {
        if (checkcameraPermission()) {
            pickfromCamera();
        } else {
            requestCameraePermission();
        }
    }




    private void pickfromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, IMAGE_PICK_GALLERY_CODE);
    }

    private void pickfromCamera() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(MediaStore.Images.Media.TITLE, "Temp_Image Title");
        contentValues.put(MediaStore.Images.Media.DESCRIPTION, "Temp_Image Title");
        Imageuri = getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, Imageuri);
        startActivityForResult(intent, IMAGE_PICK_CAMERA_CODE);

    }




    private boolean checkstoragePermission(){
        boolean result= ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED;
        return result;
    }
    private void requestStoragePermission(){
        ActivityCompat.requestPermissions(this,storagepermission,STORAGE_REQUEST_CODE);
    }
    private boolean checkcameraPermission(){
        boolean result= ContextCompat.checkSelfPermission(this,Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED;
        boolean result1= ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED;
        return result && result1;
    }
    private void requestCameraePermission(){
        ActivityCompat.requestPermissions(this,camerapermission,CAMERA_REQUEST_CODE);
    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode== RESULT_OK){
            if(requestCode== IMAGE_PICK_GALLERY_CODE){
                //get Picked Image
                Imageuri= data.getData();
                //set to imageview
                demoimg.setImageURI(Imageuri);
            }
            else if(requestCode== IMAGE_PICK_CAMERA_CODE){
                demoimg.setImageURI(Imageuri);
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}