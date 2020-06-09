package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.FormActivity;
import com.example.evandro.banco.models.Agencia;
import com.example.evandro.banco.models.Conta;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.Contato;
import com.example.evandro.banco.models.Endereco;

public class FormHelper {
    private EditText id;
    private EditText titular;
    private EditText inscrFederal;
    private EditText enderecoLogradouro;
    private EditText enderecoBairro;
    private EditText enderecoCidade;
    private EditText enderecoCep;
    private EditText enderecoNumero;
    private EditText enderecoComplemento;
    private EditText contatoTelefone;
    private EditText contatoCelular;
    private EditText contatoEmail;
    private EditText agenciaNome;
    private EditText agenciaNumero;
    private EditText agenciaDigito;
    private EditText contaTipo;
    private EditText contaNumero;
    private EditText contaDigito;

    // instancias das classes que compoem os dados presentes no form
    private ContaCliente contaCliente;
    private Agencia agencia;
    private Conta conta;
    private Contato contato;
    private Endereco endereco;

    public FormHelper (FormActivity form) {
        // captura dos componentes do form
        this.id = form.findViewById(R.id.id);
        this.titular = form.findViewById(R.id.titular);
        this.inscrFederal = form.findViewById(R.id.inscrFederal);
        this.enderecoLogradouro = form.findViewById(R.id.endereco_logradouro);
        this.enderecoBairro = form.findViewById(R.id.endereco_bairro);
        this.enderecoCidade = form.findViewById(R.id.endereco_cidade);
        this.enderecoCep = form.findViewById(R.id.endereco_cep);
        this.enderecoNumero = form.findViewById(R.id.endereco_numero);
        this.enderecoComplemento = form.findViewById(R.id.endereco_complemento);
        this.contatoTelefone = form.findViewById(R.id.contato_telefone);
        this.contatoCelular = form.findViewById(R.id.contato_celular);
        this.contatoEmail = form.findViewById(R.id.contato_email);
        this.agenciaNome = form.findViewById(R.id.agencia_nome);
        this.agenciaNumero = form.findViewById(R.id.agencia_numero);
        this.agenciaDigito = form.findViewById(R.id.agencia_digito);
        this.contaTipo = form.findViewById(R.id.conta_tipo);
        this.contaNumero = form.findViewById(R.id.conta_numero);
        this.contaDigito = form.findViewById(R.id.conta_digito);

        contaCliente = new ContaCliente();
        agencia = new Agencia();
        conta = new Conta();
        contato = new Contato();
        endereco = new Endereco();
    }
}
