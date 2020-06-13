package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.WithdrawActivity;
import com.example.evandro.banco.models.Withdraw;

public class WithdrawHelper {
    private EditText numeroAgencia;
    private EditText digitoAgencia;
    private EditText numeroConta;
    private EditText digitoConta;
    private EditText valorSaque;

    private Withdraw dadosWithdraw;

    public WithdrawHelper (WithdrawActivity form) {
        this.numeroAgencia = form.findViewById(R.id.numero_agencia_conta_saque);
        this.digitoAgencia = form.findViewById(R.id.digito_agencia_conta_saque);
        this.numeroConta = form.findViewById(R.id.conta_saque_numero);
        this.digitoConta = form.findViewById(R.id.conta_saque_digito);
        this.valorSaque = form.findViewById(R.id.valor_saque);

        this.dadosWithdraw = new Withdraw();
    }

    public Withdraw getDadosForm() {
        this.dadosWithdraw.setAgenciaNumero(this.numeroAgencia.getEditableText().toString());
        this.dadosWithdraw.setAgenciaDigito(this.digitoAgencia.getEditableText().toString());
        this.dadosWithdraw.setContaNumero(this.numeroConta.getEditableText().toString());
        this.dadosWithdraw.setContaDigito(this.digitoConta.getEditableText().toString());
        this.dadosWithdraw.setValorSaque(Float.parseFloat(this.valorSaque.getEditableText().toString()));

        return this.dadosWithdraw;
    }
}
