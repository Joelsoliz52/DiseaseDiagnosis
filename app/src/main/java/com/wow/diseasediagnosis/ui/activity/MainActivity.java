package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.wow.diseasediagnosis.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.DiagnosisBySymptoms);
        linearLayout.setOnClickListener(this);

        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.DiagnosisBySystem);
        linearLayout2.setOnClickListener(this);

        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.DiseasesAZ);
        linearLayout3.setOnClickListener(this);

        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.DiseasesBySystem);
        linearLayout4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.DiagnosisBySymptoms:
                break;
            case R.id.DiagnosisBySystem:
                Intent intent2 = new Intent(this, SystemsActivity.class);
                startActivity(intent2);
                break;
            case R.id.DiseasesAZ:
                Intent intent3 = new Intent(this, DiseasesActivity.class);
                startActivity(intent3);
                break;
            case R.id.DiseasesBySystem:
                Intent intent4 = new Intent(this, SystemsActivity.class);
                intent4.putExtra("","2");
                startActivity(intent4);
                break;
        }
    }
}