package com.example.getimagefrominternet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntentPlicitActivity2 extends AppCompatActivity {
    ImageView imgChrome, imgPhone, imgGallery, imgCamera, imgMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_plicit2);
        mapping();


    }
    public void camera(View v) {
    }
    public void phone(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("0961137486"));
        startActivity(intent);
    }
    public void gallery(View v) {

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