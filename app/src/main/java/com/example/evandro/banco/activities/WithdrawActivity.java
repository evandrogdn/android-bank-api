package com.example.evandro.banco.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evandro.banco.R;
import com.example.evandro.banco.helpers.WithdrawHelper;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.Return;
import com.example.evandro.banco.models.Withdraw;
import com.example.evandro.banco.service.BankService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WithdrawActivity extends AppCompatActivity {

    private Button btn;
    private ContaCliente contaCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            ContaCliente contaClienteSelecioanda = (ContaCliente) getIntent().getSerializableExtra("conta_cliente_selecionada");
            if (contaClienteSelecioanda != null) {
                this.contaCliente = contaClienteSelecioanda;
            }
        }

        btn = findViewById(R.id.botao_withdraw);
        addListeners();
    }

    private void contaClienteSaque() {
        Withdraw saque = (new WithdrawHelper(WithdrawActivity.this)).getDadosForm();
        BankService service = BankService.retrofit.create(BankService.class);
        final Call<Return> call = service.bankWithdraw(saque, this.contaCliente.getId());

        call.enqueue(new Callback<Return>() {
            @Override
            public void onResponse(Call<Return> call, Response<Return> response) {
                Toast.makeText(
                        WithdrawActivity.this,
                        response.body().getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }

            @Override
            public void onFailure(Call<Return> call, Throwable throwable) {
                Toast.makeText(
                        WithdrawActivity.this,
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
                contaClienteSaque();
                finish();
            }
        });
    }
}
