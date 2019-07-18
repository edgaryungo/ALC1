package com.example.alc1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 Intent AlcIntent = new Intent(getApplicationContext(),AlcActivity.class);
                 startActivity(AlcIntent);
            }
        });

        Button button1 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent pIntent = new Intent(getApplicationContext(),pActivity.class);
                startActivity(pIntent);
            }
        });
//
//        ImageView m = findViewById(R.id.iprofile);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.edgar);
//        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
//        mDrawable.setCircular(true);
//        m.setImageBitmap(mDrawable);
    }

    public void sendMessage(View view) {
    }
}
