package com.wow.diseasediagnosis.model;

public class Disease {
    //Atributos de las enfermedades en la api
    private Integer id;
    private String name;
    private String review;
    private String treatment;

    public Disease(Integer id, String name, String review, String treatment) {
        this.id = id;
        this.name = name;
        this.review = review;
        this.treatment = treatment;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
