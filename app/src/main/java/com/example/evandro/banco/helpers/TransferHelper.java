package com.example.evandro.banco.helpers;

import android.widget.EditText;

import com.example.evandro.banco.R;
import com.example.evandro.banco.activities.TransferActivity;
import com.example.evandro.banco.models.Transfer;

public class TransferHelper {
    private EditText agenciaContaDestinoNumero;
    private EditText agenciaContaDestinoDigito;
    private EditText contaDestinoNumero;
    private EditText contaDestinoDigito;
    private EditText valorTransferencia;

    private Transfer dadosTransfer;

    public TransferHelper (TransferActivity form) {
        this.agenciaContaDestinoNumero = form.findViewById(R.id.numero_agencia_conta_destino);
        this.agenciaContaDestinoDigito = form.findViewById(R.id.digito_agencia_conta_destino);
        this.contaDestinoNumero = form.findViewById(R.id.conta_destino_numero);
        this.contaDestinoDigito = form.findViewById(R.id.conta_destino_digito);
        this.valorTransferencia = form.findViewById(R.id.valor_transfer);

        this.dadosTransfer = new Transfer();
    }

    public Transfer getDadosForm() {
        this.dadosTransfer.setAgenciaContaDestinoNumero(this.agenciaContaDestinoNumero.getEditableText().toString());
        this.dadosTransfer.setAgenciaContaDestinoDigito(this.agenciaContaDestinoDigito.getEditableText().toString());
        this.dadosTransfer.setContaDestinoNumero(this.contaDestinoNumero.getEditableText().toString());
        this.dadosTransfer.setContaDestinoDigito(this.contaDestinoDigito.getEditableText().toString());
        this.dadosTransfer.setValorMovimento(Float.parseFloat(this.valorTransferencia.getEditableText().toString()));

        return this.dadosTransfer;
    }
}
