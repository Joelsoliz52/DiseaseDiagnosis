package com.wow.diseasediagnosis.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.wow.diseasediagnosis.R;

public class SystemsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systems);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.SystemCi);
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.SystemGe);
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.SystemOs);
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.SystemRe);
        linearLayout4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.SystemCi:
                Intent intent = new Intent(this, DiseaseSysActivity.class);
                intent.putExtra("Image","corazon");
                startActivity(intent);
                break;
            case R.id.SystemGe:
                Intent intent2 = new Intent(this, DiseaseSysActivity.class);
                intent2.putExtra("Image","general");
                startActivity(intent2);
                break;
            case R.id.SystemOs:
                Intent intent3 = new Intent(this, DiseaseSysActivity.class);
                intent3.putExtra("Image","huesos");
                startActivity(intent3);
                break;
            case R.id.SystemRe:
                Intent intent4 = new Intent(this, DiseaseSysActivity.class);
                intent4.putExtra("Image","rinion");
                startActivity(intent4);
                break;
        }
    }

}