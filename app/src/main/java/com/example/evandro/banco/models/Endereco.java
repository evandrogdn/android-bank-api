package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Endereco implements Serializable {
    @SerializedName("logradouro")
    private String logradouro;
    @SerializedName("bairro")
    private String bairro;
    @SerializedName("cidade")
    private String cidade;
    @SerializedName("cep")
    private String cep;
    @SerializedName("numero")
    private String numero;
    @SerializedName("complemento")
    private String complemento;

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "{" +
                "\"logradouro\":\"" + logradouro + "\"" +
                ", \"bairro\":\"" + bairro + "\"" +
                ", \"cidade\":\"" + cidade + "\"" +
                ", \"cep\":\"" + cep + "\"" +
                ", \"numero\":\"" + numero + "\"" +
                ", \"complemento\":\"" + complemento + "\"" +
                '}';
    }
}
