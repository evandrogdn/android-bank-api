package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Transfer implements Serializable {
    @SerializedName("contaOrigem")
    private String contaOrigem;
    @SerializedName("agenciaContaDestinoNumero")
    private String agenciaContaDestinoNumero;
    @SerializedName("agenciaContaDestinoDigito")
    private String agenciaContaDestinoDigito;
    @SerializedName("contaDestinoNumero")
    private String contaDestinoNumero;
    @SerializedName("contaDestinoDigito")
    private String contaDestinoDigito;
    @SerializedName("valorMovimento")
    private Float valorMovimento;

    public String getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public String getAgenciaContaDestinoNumero() {
        return agenciaContaDestinoNumero;
    }

    public void setAgenciaContaDestinoNumero(String agenciaContaDestinoNumero) {
        this.agenciaContaDestinoNumero = agenciaContaDestinoNumero;
    }

    public String getAgenciaContaDestinoDigito() {
        return agenciaContaDestinoDigito;
    }

    public void setAgenciaContaDestinoDigito(String agenciaContaDestinoDigito) {
        this.agenciaContaDestinoDigito = agenciaContaDestinoDigito;
    }

    public String getContaDestinoNumero() {
        return contaDestinoNumero;
    }

    public void setContaDestinoNumero(String contaDestinoNumero) {
        this.contaDestinoNumero = contaDestinoNumero;
    }

    public String getContaDestinoDigito() {
        return contaDestinoDigito;
    }

    public void setContaDestinoDigito(String contaDestinoDigito) {
        this.contaDestinoDigito = contaDestinoDigito;
    }

    public Float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(Float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }
}
