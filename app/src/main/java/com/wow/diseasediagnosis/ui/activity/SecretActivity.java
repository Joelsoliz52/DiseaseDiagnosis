package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.wow.diseasediagnosis.R;
import com.wow.diseasediagnosis.io.ConexionSQLiteHelper;

public class SecretActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);

        Button registro = findViewById(R.id.registerData);
        registro.setOnClickListener(this);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"db_disease",null,1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registerData:
                Intent registro = new Intent(this, SecretRegisterActivity.class);
                startActivity(registro);
        }
    }
}