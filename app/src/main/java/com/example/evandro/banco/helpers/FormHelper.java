package com.example.evandro.banco.helpers;

import android.widget.EditText;

// ids
import com.example.evandro.banco.R;
// activitu
import com.example.evandro.banco.activities.FormActivity;
// models
import com.example.evandro.banco.models.ContaCliente;

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
    }

    public ContaCliente getDadosFromForm() {
        this.contaCliente.setId(this.id.getEditableText().toString());
        this.contaCliente.setTitular(this.titular.getEditableText().toString());
        this.contaCliente.setInscrFederal(this.inscrFederal.getEditableText().toString());
        this.contaCliente.getAgencia().setNome(this.agenciaNome.getEditableText().toString());
        this.contaCliente.getAgencia().setNumero(this.agenciaNumero.getEditableText().toString());
        this.contaCliente.getAgencia().setDigito(this.agenciaDigito.getEditableText().toString());
        this.contaCliente.getConta().setTipo(Integer.parseInt(this.contaTipo.getEditableText().toString()));
        this.contaCliente.getConta().setNumero(this.contaNumero.getEditableText().toString());
        this.contaCliente.getConta().setDigito(this.contaDigito.getEditableText().toString());
        this.contaCliente.getContato().setCelular(this.contatoCelular.getEditableText().toString());
        this.contaCliente.getContato().setTelefone(this.contatoTelefone.getEditableText().toString());
        this.contaCliente.getContato().setEmail(this.contatoEmail.getEditableText().toString());
        this.contaCliente.getEndereco().setBairro(this.enderecoBairro.getEditableText().toString());
        this.contaCliente.getEndereco().setCep(this.enderecoCep.getEditableText().toString());
        this.contaCliente.getEndereco().setCidade(this.enderecoCidade.getEditableText().toString());
        this.contaCliente.getEndereco().setLogradouro(this.enderecoLogradouro.getEditableText().toString());
        this.contaCliente.getEndereco().setComplemento(this.enderecoComplemento.getEditableText().toString());
        this.contaCliente.getEndereco().setNumero(this.enderecoNumero.getEditableText().toString());

        return this.contaCliente;
    }

    public void setDadosIntoForm(ContaCliente contaCliente) {
        this.contaCliente = contaCliente;

        this.id.setText(this.contaCliente.getId());
        this.titular.setText(this.contaCliente.getTitular());
        this.inscrFederal.setText(this.contaCliente.getInscrFederal());
        this.enderecoLogradouro.setText(this.contaCliente.getEndereco().getLogradouro());
        this.enderecoBairro.setText(this.contaCliente.getEndereco().getBairro());
        this.enderecoCidade.setText(this.contaCliente.getEndereco().getCidade());
        this.enderecoCep.setText(this.contaCliente.getEndereco().getCep());
        this.enderecoNumero.setText(this.contaCliente.getEndereco().getNumero());
        this.enderecoComplemento.setText(this.contaCliente.getEndereco().getComplemento());
        this.contatoTelefone.setText(this.contaCliente.getContato().getTelefone());
        this.contatoCelular.setText(this.contaCliente.getContato().getCelular());
        this.contatoEmail.setText(this.contaCliente.getContato().getEmail());
        this.agenciaNome.setText(this.contaCliente.getAgencia().getNome());
        this.agenciaNumero.setText(this.contaCliente.getAgencia().getNumero());
        this.agenciaDigito.setText(this.contaCliente.getAgencia().getDigito());
        this.contaTipo.setText(this.contaCliente.getConta().getTipo());
        this.contaNumero.setText(this.contaCliente.getConta().getNumero());
        this.contaDigito.setText(this.contaCliente.getConta().getDigito());
    }
}
