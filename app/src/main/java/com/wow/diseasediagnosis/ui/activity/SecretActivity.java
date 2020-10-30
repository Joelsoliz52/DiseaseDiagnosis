package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wow.diseasediagnosis.R;
import com.wow.diseasediagnosis.io.ConexionSQLiteHelper;

public class SecretActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"db_disease",null,1);
    }
}