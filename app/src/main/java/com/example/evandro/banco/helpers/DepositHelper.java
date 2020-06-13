package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.DepositActivity;
import com.example.evandro.banco.models.Deposit;

public class DepositHelper {
    private EditText numeroAgencia;
    private EditText digitoAgencia;
    private EditText numeroConta;
    private EditText digitoConta;
    private EditText valorDeposito;

    private Deposit dadosDeposit;

    public DepositHelper (DepositActivity form) {
        this.numeroAgencia = form.findViewById(R.id.numero_agencia_conta_deposito);
        this.digitoAgencia = form.findViewById(R.id.digito_agencia_conta_deposito);
        this.numeroConta = form.findViewById(R.id.conta_deposito_numero);
        this.digitoConta = form.findViewById(R.id.conta_deposito_digito);
        this.valorDeposito = form.findViewById(R.id.valor_deposito);

        this.dadosDeposit = new Deposit();
    }

    public Deposit getDadosForm() {
        this.dadosDeposit.setAgenciaNumero(this.numeroAgencia.getEditableText().toString());
        this.dadosDeposit.setAgenciaDigito(this.digitoAgencia.getEditableText().toString());
        this.dadosDeposit.setContaNumero(this.numeroConta.getEditableText().toString());
        this.dadosDeposit.setContaDigito(this.digitoConta.getEditableText().toString());
        this.dadosDeposit.setValorDeposito(Float.parseFloat(this.valorDeposito.getEditableText().toString()));

        return this.dadosDeposit;
    }
}
