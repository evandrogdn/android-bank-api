package com.example.evandro.banco.models;

import java.io.Serializable;

public class Transfer implements Serializable {
    private String agenciaContaOrigemNumero;
    private String agenciaContaOrigemDigito;
    private String contaOrigemNumero;
    private String contaOrigemDigito;
    private String agenciaContaDestinoNumero;
    private String agenciaContaDestinoDigito;
    private String contaDestinoNumero;
    private String contaDestinoDigito;
    private String valorTransferencia;

    public String getAgenciaContaOrigemNumero() {
        return agenciaContaOrigemNumero;
    }

    public void setAgenciaContaOrigemNumero(String agenciaContaOrigemNumero) {
        this.agenciaContaOrigemNumero = agenciaContaOrigemNumero;
    }

    public String getAgenciaContaOrigemDigito() {
        return agenciaContaOrigemDigito;
    }

    public void setAgenciaContaOrigemDigito(String agenciaContaOrigemDigito) {
        this.agenciaContaOrigemDigito = agenciaContaOrigemDigito;
    }

    public String getContaOrigemNumero() {
        return contaOrigemNumero;
    }

    public void setContaOrigemNumero(String contaOrigemNumero) {
        this.contaOrigemNumero = contaOrigemNumero;
    }

    public String getContaOrigemDigito() {
        return contaOrigemDigito;
    }

    public void setContaOrigemDigito(String contaOrigemDigito) {
        this.contaOrigemDigito = contaOrigemDigito;
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

    public String getValorTransferencia() {
        return valorTransferencia;
    }

    public void setValorTransferencia(String valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }
}
