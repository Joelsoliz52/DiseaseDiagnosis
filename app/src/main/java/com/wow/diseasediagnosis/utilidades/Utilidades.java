package com.wow.diseasediagnosis.utilidades;

public class Utilidades {

    //Constantes campos tabla disease
    public static final String TABLE_DISEASE="disease";
    public static final String FIELD_ID="id";
    public static final String FIELD_NAME="name";
    public static final String FIELD_REVIEW="review";
    public static final String FIELD_TREATMENT="treatment";

    public static final String CREATE_TABLE_DISEASE="CREATE TABLE "+TABLE_DISEASE+" ("+FIELD_ID+" INTEGER, "+FIELD_NAME+" TEXT, "+FIELD_REVIEW+" TEXT, "+FIELD_TREATMENT+" TEXT)";

}
