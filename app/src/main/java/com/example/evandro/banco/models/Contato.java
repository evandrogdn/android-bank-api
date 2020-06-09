package com.example.evandro.banco.models;

import java.io.Serializable;

public class Contato implements Serializable {
    private String telefone;
    private String celular;
    private String email;

    public Contato(String telefone, String celular, String email) {
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }
}
