package com.example.evandro.banco.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.evandro.banco.models.ContaCliente;

import java.util.List;

public class ContaClienteAdapter extends ArrayAdapter<ContaCliente> {
    public ContaClienteAdapter(Context context, List<ContaCliente> contasCliente) {
        super(context, 0, contasCliente);
    }
}
