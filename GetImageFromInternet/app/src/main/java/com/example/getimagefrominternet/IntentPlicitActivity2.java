package com.example.getimagefrominternet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class IntentPlicitActivity2 extends AppCompatActivity {
    private static final int PICK_IMAGE = 100;
    ImageView imgChrome, imgPhone, imgGallery, imgCamera, imgMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_plicit2);
        mapping();


    }
    public void camera(View v) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
    public void phone(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("0988888888"));
        startActivity(intent);
    }
    public void gallery(View v) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);

    }
    public void message(View v) {

    }
    public void chrome(View v) {

    }
    public void mapping() {
        ImageView imgChrome = (ImageView) findViewById(R.id.imgChrome);
        ImageView imgPhone = (ImageView) findViewById(R.id.imgPhone);
        ImageView imgGallery = (ImageView) findViewById(R.id.imgGallery);
        ImageView imgCamera = (ImageView) findViewById(R.id.imgCamera);
        ImageView imgMessage = (ImageView) findViewById(R.id.imgMessage);
    }
}