package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Withdraw implements Serializable {
    @SerializedName("valorMovimento")
    private Float valorMovimento;

    public Float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(Float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }
}
