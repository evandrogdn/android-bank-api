package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.WithdrawActivity;
import com.example.evandro.banco.models.Withdraw;

public class WithdrawHelper {
    private EditText valorSaque;

    private Withdraw dadosWithdraw;

    public WithdrawHelper (WithdrawActivity form) {
        this.valorSaque = form.findViewById(R.id.valor_saque);

        this.dadosWithdraw = new Withdraw();
    }

    public Withdraw getDadosForm() {
        this.dadosWithdraw.setValorMovimento(Float.parseFloat(this.valorSaque.getEditableText().toString()));

        return this.dadosWithdraw;
    }
}
