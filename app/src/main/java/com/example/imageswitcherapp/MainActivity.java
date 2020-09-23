package com.example.imageswitcherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchImage(View view){
        Log.i("info","Button pressed");
        ImageView image = (ImageView)findViewById(R.id.jackImageView);
        image.setImageResource(R.drawable.jackpic);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}