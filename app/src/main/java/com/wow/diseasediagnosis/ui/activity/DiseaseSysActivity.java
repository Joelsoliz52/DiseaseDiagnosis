package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
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
        }else if(image.equals("rinion")) {
            system.setImageResource(R.mipmap.rinion);
            systemS.setText(" Sistema renal");
        }else{
            systemS.setText("Disease Diagnosis");
            system.setImageResource(R.drawable.logo);
        }
    }
}