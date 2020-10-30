package com.wow.diseasediagnosis.io;

import com.wow.diseasediagnosis.model.Disease;

import java.util.ArrayList;

import retrofit2.Call;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DiagnosisApiService {

    //Llamada a las enfermedades
    @GET("diseases")
    Call<ArrayList<Disease>> getDiseases();

    //Llamada a las enfermedades por sistema
    @GET("system/{id}/diseases")
    Call<ArrayList<Disease>> getDiseasesBySystem(@Path("id") int system_id);
}
