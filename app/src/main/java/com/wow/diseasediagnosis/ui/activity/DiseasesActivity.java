package com.wow.diseasediagnosis.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.wow.diseasediagnosis.R;
import com.wow.diseasediagnosis.io.DiagnosisApiAdapter;
import com.wow.diseasediagnosis.model.Disease;
import com.wow.diseasediagnosis.ui.adapter.DiseaseAdapter;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DiseasesActivity extends AppCompatActivity implements Callback<ArrayList<Disease>> {
    private DiseaseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerViewDiseases);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        DiseaseAdapter mAdapter = new DiseaseAdapter();
        mRecyclerView.setAdapter(mAdapter);

        //Petición asincrona al api
        Call<ArrayList<Disease>> call = DiagnosisApiAdapter.getApiService().getDiseases();
        //Poner petición en cola
        call.enqueue(this);
    }

    //Llamado si se obtuvo respuesta
    @Override
    public void onResponse(Call<ArrayList<Disease>> call, Response<ArrayList<Disease>> response) {
        //Preguntar si la respuesta fue exitosa
        if(response.isSuccessful()) {
            ArrayList<Disease> diseases = response.body();
            //impresión por consola del tamaño del arreglo
            Log.d("onResponse diseases", "Size of diseases =>"+diseases.size());

            mAdapter.setDataSet(diseases);
        }
    }

    @Override
    public void onFailure(Call<ArrayList<Disease>> call, Throwable t) {

    }
}