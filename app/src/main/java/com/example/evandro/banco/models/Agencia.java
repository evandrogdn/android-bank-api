package com.example.evandro.banco.models;

import java.io.Serializable;

public class Agencia implements Serializable {
    private String nome;
    private String numero;
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
}
