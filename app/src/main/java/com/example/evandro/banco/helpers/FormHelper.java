package com.example.evandro.banco.helpers;

import android.widget.EditText;

// ids
import com.example.evandro.banco.R;
// activitu
// models
import com.example.evandro.banco.activities.FormularioActivity;
import com.example.evandro.banco.models.Agencia;
import com.example.evandro.banco.models.Conta;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.ContaClienteRequest;
import com.example.evandro.banco.models.Contato;
import com.example.evandro.banco.models.Endereco;

public class FormHelper {
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
    private ContaClienteRequest contaCliente;

    public FormHelper (FormularioActivity form) {
        // captura dos componentes do form
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

        contaCliente = new ContaClienteRequest();
    }

    public ContaClienteRequest getDadosFromForm() {
        this.contaCliente.setTitular(this.titular.getEditableText().toString());
        this.contaCliente.setInscrFederal(this.inscrFederal.getEditableText().toString());
        // agencia
        Agencia agencia = new Agencia();
        agencia.setNome(this.agenciaNome.getEditableText().toString());
        agencia.setNumero(this.agenciaNumero.getEditableText().toString());
        agencia.setDigito(this.agenciaDigito.getEditableText().toString());
        this.contaCliente.setAgencia(agencia.toString());
        // conta
        Conta conta = new Conta();
        conta.setTipo(Integer.parseInt(this.contaTipo.getEditableText().toString()));
        conta.setNumero(this.contaNumero.getEditableText().toString());
        conta.setDigito(this.contaDigito.getEditableText().toString());
        this.contaCliente.setConta(conta.toString());
        // contato
        Contato contato = new Contato();
        contato.setCelular(this.contatoCelular.getEditableText().toString());
        contato.setTelefone(this.contatoTelefone.getEditableText().toString());
        contato.setEmail(this.contatoEmail.getEditableText().toString());
        this.contaCliente.setContato(contato.toString());
        // endereco
        Endereco endereco = new Endereco();
        endereco.setBairro(this.enderecoBairro.getEditableText().toString());
        endereco.setCep(this.enderecoCep.getEditableText().toString());
        endereco.setCidade(this.enderecoCidade.getEditableText().toString());
        endereco.setLogradouro(this.enderecoLogradouro.getEditableText().toString());
        endereco.setComplemento(this.enderecoComplemento.getEditableText().toString());
        endereco.setNumero(this.enderecoNumero.getEditableText().toString());
        this.contaCliente.setEndereco(endereco.toString());

        return this.contaCliente;
    }

    public void setDadosIntoForm(ContaCliente contaCliente) {
        this.titular.setText(contaCliente.getTitular());
        this.inscrFederal.setText(contaCliente.getInscrFederal());
        this.enderecoLogradouro.setText(contaCliente.getEndereco().getLogradouro());
        this.enderecoBairro.setText(contaCliente.getEndereco().getBairro());
        this.enderecoCidade.setText(contaCliente.getEndereco().getCidade());
        this.enderecoCep.setText(contaCliente.getEndereco().getCep());
        this.enderecoNumero.setText(contaCliente.getEndereco().getNumero());
        this.enderecoComplemento.setText(contaCliente.getEndereco().getComplemento());
        this.contatoTelefone.setText(contaCliente.getContato().getTelefone());
        this.contatoCelular.setText(contaCliente.getContato().getCelular());
        this.contatoEmail.setText(contaCliente.getContato().getEmail());
        this.agenciaNome.setText(contaCliente.getAgencia().getNome());
        this.agenciaNumero.setText(contaCliente.getAgencia().getNumero());
        this.agenciaDigito.setText(contaCliente.getAgencia().getDigito());
        this.contaTipo.setText(contaCliente.getConta().getTipo());
        this.contaNumero.setText(contaCliente.getConta().getNumero());
        this.contaDigito.setText(contaCliente.getConta().getDigito());
    }
}
