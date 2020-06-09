package com.example.evandro.banco.models;

import java.io.Serializable;

public class Conta implements Serializable {
    private int tipo;
    private String numero;
    private String digito;

    public Conta(int tipo, String numero, String digito) {
        this.tipo = tipo;
        this.numero = numero;
        this.digito = digito;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public String getDigito() {
        return digito;
    }
}
