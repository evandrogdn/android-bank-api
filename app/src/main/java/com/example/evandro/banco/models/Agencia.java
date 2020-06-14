package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Agencia implements Serializable {
    @SerializedName("nome")
    private String nome;
    @SerializedName("numero")
    private String numero;
    @SerializedName("digito")
    private String digito;

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
                "\"nome\":\"" + nome + "\"" +
                ", \"numero\":\"" + numero + "\"" +
                ", \"digito\":\"" + digito + "\"" +
                '}';
    }
}
