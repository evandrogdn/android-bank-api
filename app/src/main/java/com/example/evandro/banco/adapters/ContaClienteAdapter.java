package com.example.evandro.banco.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.evandro.banco.R;
import com.example.evandro.banco.models.ContaCliente;
import com.github.rtoshiro.util.format.MaskFormatter;

import java.text.NumberFormat;
import java.util.List;

public class ContaClienteAdapter extends ArrayAdapter<ContaCliente> {
    public ContaClienteAdapter(Context context, List<ContaCliente> contasCliente) {
        super(context, 0, contasCliente);
    }

    /**
     * Aplica mascara a inscrição federal
     * @param inscrFederal
     * @return String
     */
    private String maskInscrFederal(String inscrFederal) {
        if (inscrFederal.length() == 11) {
            return inscrFederal.substring(0,3) + "." + inscrFederal.substring(3,6) + "." + inscrFederal.substring(6,9) + "-" + inscrFederal.substring(9,11);
        } else if (inscrFederal.length() == 14) {
            return inscrFederal.substring(0,2) + "." + inscrFederal.substring(2,5) + "." + inscrFederal.substring(5,8) + "/" + inscrFederal.substring(8,12) + "-" + inscrFederal.substring(12,14);
        }
        return inscrFederal;
    }

    /**
     * Gera a String referente aos dados da conta e da agencia
     * @param conta
     * @param agencia
     * @return String
     */
    private String getMaskedAgenciaConta(ContaCliente.Conta conta, ContaCliente.Agencia agencia) {
        String maskedAgencia = agencia.getNumero() + "-" + agencia.getDigito();
        String maskedConta = conta.getNumero() + "-" + conta.getDigito();
        return maskedAgencia + " / " + maskedConta;
    }

    /**
     * Método que monta as adaptações necessárias para adicionar os dados em tela
     * @param position
     * @param convertView
     * @param parent
     * @return View
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ContaCliente contaCliente = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.conta_cliente, parent, false);
        }

        TextView titularConta = (TextView) convertView.findViewById(R.id.nome_completo);
        TextView inscrFederal = (TextView) convertView.findViewById(R.id.inscr_federal);
        TextView agenciaConta = (TextView) convertView.findViewById(R.id.agencia_conta);
        TextView saldoConta = (TextView) convertView.findViewById(R.id.conta_saldo);

        String inscrFederalMasked = maskInscrFederal(contaCliente.getInscrFederal());
        String agenciaContaMasked = getMaskedAgenciaConta(contaCliente.getConta(), contaCliente.getAgencia());
        String saldoContaMasked = NumberFormat.getCurrencyInstance().format(contaCliente.getSaldo());

        titularConta.setText("    Titular: " + contaCliente.getTitular());
        inscrFederal.setText("    Inscr. Federal: " + inscrFederalMasked);
        agenciaConta.setText("    Agência / Conta: " + agenciaContaMasked);
        saldoConta.setText("    Saldo: " +
                "" + saldoContaMasked);

        return convertView;
    }
}
