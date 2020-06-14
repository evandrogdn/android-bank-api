package com.example.evandro.banco.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.evandro.banco.R;
import com.example.evandro.banco.helpers.FormHelper;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.ContaClienteRequest;
import com.example.evandro.banco.service.BankService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FormularioActivity extends AppCompatActivity {
    private Button btn;
    private ContaCliente contaCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        btn = findViewById(R.id.botao_save);
        addListeners();
    }

    private void sendCreateContaCliente(ContaClienteRequest contaClienteRequest) {
        BankService service = BankService.retrofit.create(BankService.class);
        final Call<ContaCliente> call = service.bankInsert(contaClienteRequest);

        call.enqueue(new Callback<ContaCliente>() {
            @Override
            public void onResponse(Call<ContaCliente> call, Response<ContaCliente> response) {
                Toast.makeText(
                        FormularioActivity.this,
                        "Conta inserida com sucesso!",
                        Toast.LENGTH_LONG
                ).show();
            }

            @Override
            public void onFailure(Call<ContaCliente> call, Throwable throwable) {
                Toast.makeText(
                        FormularioActivity.this,
                        "Erro: " + throwable.getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }

    private void contaClienteCreate() {
        ContaClienteRequest contaClientePost = (new FormHelper(FormularioActivity.this)).getDadosFromForm();

        sendCreateContaCliente(contaClientePost);
    }

    /**
     * Método que adiciona os listeners da tela
     */
    private void addListeners() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (contaCliente == null) {
                    contaClienteCreate();
                }
                finish();
            }
        });
    }
}
