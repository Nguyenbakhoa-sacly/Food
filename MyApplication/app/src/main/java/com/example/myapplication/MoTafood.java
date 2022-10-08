package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MoTafood extends AppCompatActivity {
    ImageView imgMoTa;
    TextView txtMoTaTenfood,txt_mo_ta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mo_ta_food);
        imgMoTa =(ImageView) findViewById(R.id.imgMoTa);
        txtMoTaTenfood =(TextView) findViewById(R.id.txtMoTaTenfood);

        txt_mo_ta =(TextView) findViewById(R.id.txt_mo_ta);
        Intent intent =getIntent();
        imgMoTa.setImageResource(intent.getIntExtra("key1",0));
        txtMoTaTenfood.setText(intent.getStringExtra("key2"));
        txt_mo_ta.setText(intent.getStringExtra("key3"));


    }

}