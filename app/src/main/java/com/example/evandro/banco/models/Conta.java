package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Conta implements Serializable {
    @SerializedName("tipo")
    private int tipo;
    @SerializedName("numero")
    private String numero;
    @SerializedName("digito")
    private String digito;

    public int getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    @Override
    public String toString() {
        return "{" +
                "\"tipo\":" + tipo +
                ", \"numero\":\"" + numero + "\"" +
                ", \"digito\":\"" + digito + "\"" +
                '}';
    }
}
