package com.wow.diseasediagnosis.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.wow.diseasediagnosis.R;

public class SystemsActivity extends AppCompatActivity implements View.OnClickListener {
    String extra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_systems);

        LinearLayout circulatorio = findViewById(R.id.SystemCi);
        circulatorio.setOnClickListener(this);

        LinearLayout general = findViewById(R.id.SystemGe);
        general.setOnClickListener(this);

        LinearLayout oseo = findViewById(R.id.SystemOs);
        oseo.setOnClickListener(this);

        LinearLayout digestivo = findViewById(R.id.SystemDi);
        digestivo.setOnClickListener(this);

        LinearLayout respiratorio = findViewById(R.id.SystemRes);
        respiratorio.setOnClickListener(this);

        LinearLayout urinario = findViewById(R.id.SystemUri);
        urinario.setOnClickListener(this);

        LinearLayout reproductor = findViewById(R.id.SystemRe);
        reproductor.setOnClickListener(this);

        LinearLayout nervioso = findViewById(R.id.SystemNer);
        nervioso.setOnClickListener(this);

        LinearLayout back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        extra = getIntent().getStringExtra("action");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.SystemCi:
                if(extra.equals("view")) {
                    Intent viewCirculatorio = new Intent(this, DiseaseSysActivity.class);
                    viewCirculatorio.putExtra("Image", "corazon");
                    startActivity(viewCirculatorio);
                    break;
                }
            case R.id.SystemGe:
                if(extra.equals("view")) {
                    Intent viewGeneral = new Intent(this, DiseaseSysActivity.class);
                    viewGeneral.putExtra("Image", "general");
                    startActivity(viewGeneral);
                    break;
                }
            case R.id.SystemOs:
                if(extra.equals("view")) {
                    Intent viewOseo = new Intent(this, DiseaseSysActivity.class);
                    viewOseo.putExtra("Image", "huesos");
                    startActivity(viewOseo);
                    break;
                }
            case R.id.SystemDi:
                if (extra.equals("view")) {
                    Intent viewRenal = new Intent(this, DiseaseSysActivity.class);
                    viewRenal.putExtra("Image", "estomago");
                    startActivity(viewRenal);
                    break;
                }
            case R.id.SystemUri:
                if (extra.equals("view")) {
                    Intent viewUrinario = new Intent(this, DiseaseSysActivity.class);
                    viewUrinario.putExtra("Image", "vejiga");
                    startActivity(viewUrinario);
                    break;
                }
            case R.id.SystemRe:
                if (extra.equals("view")) {
                    Intent viewReproductor = new Intent(this, DiseaseSysActivity.class);
                    viewReproductor.putExtra("Image", "reproductor");
                    startActivity(viewReproductor);
                    break;
                }
            case R.id.SystemRes:
                if (extra.equals("view")) {
                    Intent viewRespiratorio = new Intent(this, DiseaseSysActivity.class);
                    viewRespiratorio.putExtra("Image", "pulmon");
                    startActivity(viewRespiratorio);
                    break;
                }
            case R.id.SystemNer:
                if (extra.equals("view")) {
                    Intent viewNervioso = new Intent(this, DiseaseSysActivity.class);
                    viewNervioso.putExtra("Image", "cerebro");
                    startActivity(viewNervioso);
                    break;
                }
        }
    }
}