package com.example.evandro.banco.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Contato implements Serializable {
    @SerializedName("telefone")
    private String telefone;
    @SerializedName("celular")
    private String celular;
    @SerializedName("email")
    private String email;

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" +
                "\"telefone\":\"" + telefone + "\"" +
                ", \"celular\":\"" + celular + "\"" +
                ", \"email\":\"" + email + "\"" +
                '}';
    }
}
