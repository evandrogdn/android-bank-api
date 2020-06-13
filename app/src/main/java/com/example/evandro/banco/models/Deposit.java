package com.example.evandro.banco.models;

import java.io.Serializable;

public class Deposit implements Serializable {
    private String agenciaNumero;
    private String agenciaDigito;
    private String contaNumero;
    private String contaDigito;
    private Float valorDeposito;

    public String getAgenciaNumero() {
        return agenciaNumero;
    }

    public void setAgenciaNumero(String agenciaNumero) {
        this.agenciaNumero = agenciaNumero;
    }

    public String getAgenciaDigito() {
        return agenciaDigito;
    }

    public void setAgenciaDigito(String agenciaDigito) {
        this.agenciaDigito = agenciaDigito;
    }

    public String getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(String contaNumero) {
        this.contaNumero = contaNumero;
    }

    public String getContaDigito() {
        return contaDigito;
    }

    public void setContaDigito(String contaDigito) {
        this.contaDigito = contaDigito;
    }

    public Float getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(Float valorDeposito) {
        this.valorDeposito = valorDeposito;
    }
}
