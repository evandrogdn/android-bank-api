package com.example.evandro.banco.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evandro.banco.R;
import com.example.evandro.banco.helpers.TransferHelper;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.Return;
import com.example.evandro.banco.models.Transfer;
import com.example.evandro.banco.service.BankService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TransferActivity extends AppCompatActivity {

    private Button btn;
    private ContaCliente contaCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_form);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ContaCliente contaClienteSelecioanda = (ContaCliente) getIntent().getSerializableExtra("conta_cliente_selecionada");
            if (contaClienteSelecioanda != null) {
                this.contaCliente = contaClienteSelecioanda;
            }
        }

        btn = findViewById(R.id.botao_transfer);
        addListeners();
    }

    private void contaClienteTransferencia() {
        Transfer transferencia = (new TransferHelper(TransferActivity.this)).getDadosForm();
        transferencia.setContaOrigem(this.contaCliente.getId());
        BankService service = BankService.retrofit.create(BankService.class);
        final Call<Return> call = service.bankTransfer(transferencia);

        call.enqueue(new Callback<Return>() {
            @Override
            public void onResponse(Call<Return> call, Response<Return> response) {
                Toast.makeText(
                        TransferActivity.this,
                        "Sucesso: " + response.body().getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }

            @Override
            public void onFailure(Call<Return> call, Throwable throwable) {
                Toast.makeText(
                        TransferActivity.this,
                        "Erro: " + throwable.getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }

    private void addListeners() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contaClienteTransferencia();
                finish();
            }
        });
    }
}
