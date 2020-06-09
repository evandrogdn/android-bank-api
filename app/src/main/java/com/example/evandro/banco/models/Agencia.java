package com.example.evandro.banco.models;

import java.io.Serializable;

public class Agencia implements Serializable {
    private String nome;
    private String numero;
    private String digito;

    public Agencia(String nome, String numero, String digito) {
        this.nome = nome;
        this.numero = numero;
        this.digito = digito;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }
}
