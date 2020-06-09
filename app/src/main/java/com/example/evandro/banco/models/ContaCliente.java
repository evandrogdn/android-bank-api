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

    public void setId(String id) {
        this.id = id;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setInscrFederal(String inscrFederal) {
        this.inscrFederal = inscrFederal;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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
    }

    public static class Contato implements Serializable {
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
    }

    public static class Agencia implements Serializable {
        @SerializedName("nome")
        private String nome;
        @SerializedName("numero")
        private String numero;
        @SerializedName("digito")
        private String digito;

        public String getNome() {
            return nome;
        }

        public String getNumero() {
            return numero;
        }

        public String getDigito() {
            return digito;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public void setDigito(String digito) {
            this.digito = digito;
        }
    }

    public static class Conta implements Serializable {
        @SerializedName("tipo")
        private int tipo;
        @SerializedName("numero")
        private String numero;
        @SerializedName("digito")
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
}
