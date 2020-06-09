package com.example.evandro.banco.models;

import java.io.Serializable;
import com.google.gson.annotations.SerializedName;

public class ContaCliente implements Serializable{
    @SerializedName("_id")
    private String id;
    @SerializedName("titular")
    private String titular;
    @SerializedName("inscrFederal")
    private String inscrFederal;
    @SerializedName("saldo")
    private Float saldo;
    @SerializedName("endereco")
    private Endereco endereco;
    @SerializedName("contato")
    private Contato contato;
    @SerializedName("agencia")
    private Agencia agencia;
    @SerializedName("conta")
    private Conta conta;

    public ContaCliente(String id, String titular, String inscrFederal, Float saldo, Endereco endereco, Contato contato, Agencia agencia, Conta conta) {
        this.id = id;
        this.titular = titular;
        this.inscrFederal = inscrFederal;
        this.saldo = saldo;
        this.endereco = endereco;
        this.contato = contato;
        this.agencia = agencia;
        this.conta = conta;
    }

    public String getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public String getInscrFederal() {
        return inscrFederal;
    }

    public Float getSaldo() {
        return saldo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Conta getConta() {
        return conta;
    }

    public static class Endereco implements Serializable {
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

        public Endereco(String logradouro, String bairro, String cidade, String cep, String numero, String complemento) {
            this.logradouro = logradouro;
            this.bairro = bairro;
            this.cidade = cidade;
            this.cep = cep;
            this.numero = numero;
            this.complemento = complemento;
        }

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
    }

    public static class Contato implements Serializable {
        @SerializedName("telefone")
        private String telefone;
        @SerializedName("celular")
        private String celular;
        @SerializedName("email")
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

    public static class Agencia implements Serializable {
        @SerializedName("nome")
        private String nome;
        @SerializedName("numero")
        private String numero;
        @SerializedName("digito")
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

    public static class Conta implements Serializable {
        @SerializedName("tipo")
        private int tipo;
        @SerializedName("numero")
        private String numero;
        @SerializedName("digito")
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
}
