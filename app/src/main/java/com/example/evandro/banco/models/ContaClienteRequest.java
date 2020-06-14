package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ContaClienteRequest implements Serializable {

    @SerializedName("_id")
    private String id;
    @SerializedName("titular")
    private String titular;
    @SerializedName("inscrFederal")
    private String inscrFederal;
    @SerializedName("saldo")
    private Float saldo;
    @SerializedName("endereco")
    private String endereco;
    @SerializedName("contato")
    private String contato;
    @SerializedName("agencia")
    private String agencia;
    @SerializedName("conta")
    private String conta;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getInscrFederal() {
        return inscrFederal;
    }

    public void setInscrFederal(String inscrFederal) {
        this.inscrFederal = inscrFederal;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
}
