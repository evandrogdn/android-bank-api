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
import com.example.evandro.banco.models.Agencia;
import com.example.evandro.banco.models.Conta;
import com.example.evandro.banco.models.ContaCliente;
import com.github.rtoshiro.util.format.MaskFormatter;
import com.google.gson.Gson;

import java.text.NumberFormat;
import java.util.List;

public class ContaClienteAdapter extends ArrayAdapter<ContaCliente> {
    public ContaClienteAdapter(Context context, List<ContaCliente> contasCliente) {
        super(context, 0, contasCliente);
    }

    /**
     * Aplica mascara a inscrição federal
     * @param String inscrFederal
     * @return String
     */
    private String maskInscrFederal(String inscrFederal) {
        if (inscrFederal.length() == 11) {
            MaskFormatter maskCpf = new MaskFormatter("###.###.###-##");
            return maskCpf.format(inscrFederal);
        } else if (inscrFederal.length() == 14) {
            MaskFormatter maskCnpj = new MaskFormatter("##.###.###/####-##");
            return maskCnpj.format(inscrFederal);
        }
        return inscrFederal;
    }

    /**
     * Gera a String referente aos dados da conta e da agencia
     * @param Conta conta
     * @param Agencia agencia
     * @return String
     */
    private String getMaskedAgenciaConta(Conta conta, Agencia agencia) {
        String maskedAgencia = agencia.getNumero() + "-" + agencia.getDigito();
        String maskedConta = conta.getNumero() + "-" + conta.getDigito();
        return maskedAgencia + " / " + maskedConta;
    }

    /**
     * Método que monta as adaptações necessárias para adicionar os dados em tela
     * @param int position
     * @param View convertView
     * @param ViewGroup parent
     * @return View
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ContaCliente contaCliente = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.conta_cliente, parent, false);
        }

        Agencia agencia = (new Gson()).fromJson(contaCliente.getAgencia(), Agencia.class);
        Conta conta = (new Gson()).fromJson(contaCliente.getConta(), Conta.class);

        TextView titularConta = (TextView) convertView.findViewById(R.id.nome_completo);
        TextView inscrFederal = (TextView) convertView.findViewById(R.id.inscr_federal);
        TextView agenciaConta = (TextView) convertView.findViewById(R.id.agencia_conta);
        TextView saldoConta = (TextView) convertView.findViewById(R.id.conta_saldo);

        String inscrFederalMasked = maskInscrFederal(contaCliente.getInscrFederal());
        String agenciaContaMasked = getMaskedAgenciaConta(conta, agencia);
        String saldoContaMasked = NumberFormat.getCurrencyInstance().format(contaCliente.getSaldo());

        titularConta.setText(contaCliente.getTitular());
        inscrFederal.setText(inscrFederalMasked);
        agenciaConta.setText(agenciaContaMasked);
        saldoConta.setText(saldoContaMasked);

        return convertView;
    }
}
