package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wow.diseasediagnosis.R;

public class DiseaseSysActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_sys);

        String image = getIntent().getStringExtra("Image");

        ImageView system = findViewById(R.id.iconoDS);
        TextView systemS = findViewById(R.id.textDS);

        if(image.equals("corazon")) {
            system.setImageResource(R.mipmap.corazon);
            systemS.setText(" Sistema circulatorio");
        }else if(image.equals("general")) {
            system.setImageResource(R.mipmap.general);
            systemS.setText(" Cuerpo en general");
        }else if(image.equals("huesos")) {
            system.setImageResource(R.mipmap.huesos);
            systemS.setText(" Sistema oseo");
        }else if(image.equals("estomago")) {
            system.setImageResource(R.mipmap.estomago);
            systemS.setText(" Sistema digestivo");
        }else if(image.equals("pulmon")) {
            system.setImageResource(R.mipmap.pulmon);
            systemS.setText(" Sistema respiratorio");
        }else if(image.equals("vejiga")) {
            system.setImageResource(R.mipmap.vejiga);
            systemS.setText(" Sistema urinario");
        }else if(image.equals("reproductor")) {
            system.setImageResource(R.mipmap.reproductor);
            systemS.setText(" Sistema reproductor");
        }else if(image.equals("cerebro")) {
            system.setImageResource(R.mipmap.cerebro);
            systemS.setText(" Sistema nervioso");
        }else{
            systemS.setText("Disease Diagnosis");
            system.setImageResource(R.drawable.logo);
        }

        LinearLayout back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}