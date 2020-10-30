package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.wow.diseasediagnosis.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int touch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout diagnosis = findViewById(R.id.DiagnosisBySymptoms);
        diagnosis.setOnClickListener(this);

        LinearLayout diagnosiSys = findViewById(R.id.DiagnosisBySystem);
        diagnosiSys.setOnClickListener(this);

        LinearLayout diseases = findViewById(R.id.DiseasesAZ);
        diseases.setOnClickListener(this);

        LinearLayout diseaseSys = findViewById(R.id.DiseasesBySystem);
        diseaseSys.setOnClickListener(this);

        LinearLayout secret = findViewById(R.id.secret);
        secret.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.DiagnosisBySymptoms:
                break;
            case R.id.DiagnosisBySystem:
                Intent systemDiagnosis = new Intent(this, SystemsActivity.class);
                systemDiagnosis.putExtra("action","diagnosis");
                startActivity(systemDiagnosis);
                break;
            case R.id.DiseasesAZ:
                Intent viewDisease = new Intent(this, DiseasesActivity.class);
                startActivity(viewDisease);
                break;
            case R.id.DiseasesBySystem:
                Intent viewDiseaseSys = new Intent(this, SystemsActivity.class);
                viewDiseaseSys.putExtra("action","view");
                startActivity(viewDiseaseSys);
                break;
            case R.id.secret:
                touch++;
                if(touch==5){
                    Intent intent5 = new Intent(this, SecretActivity.class);
                    startActivity(intent5);
                    touch=0;
                }
        }
    }
}