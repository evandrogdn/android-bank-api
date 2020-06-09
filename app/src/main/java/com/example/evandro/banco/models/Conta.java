package com.example.evandro.banco.models;

import java.io.Serializable;

public class Conta implements Serializable {
    private int tipo;
    private String numero;
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
}
