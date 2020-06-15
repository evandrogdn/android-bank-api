package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.DepositActivity;
import com.example.evandro.banco.models.Deposit;

public class DepositHelper {
    private EditText valorDeposito;

    private Deposit dadosDeposit;

    public DepositHelper (DepositActivity form) {
        this.valorDeposito = form.findViewById(R.id.valor_deposito);

        this.dadosDeposit = new Deposit();
    }

    public Deposit getDadosForm() {
        this.dadosDeposit.setValorMovimento(Float.parseFloat(this.valorDeposito.getEditableText().toString()));

        return this.dadosDeposit;
    }
}
