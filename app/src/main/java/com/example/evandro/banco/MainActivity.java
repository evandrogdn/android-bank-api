package com.example.evandro.banco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.evandro.banco.activities.FormularioActivity;
import com.example.evandro.banco.adapters.ContaClienteAdapter;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.service.BankService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    protected ListView listAccounts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listAccounts = findViewById(R.id.accounts_list);
        onLoadListAccounts();
    }

    private void onLoadListAccounts() {
        BankService bankService = BankService.retrofit.create(BankService.class);
        final Call<List<ContaCliente>> call = bankService.bankGet();
        call.enqueue(new Callback<List<ContaCliente>>() {
            @Override
            public void onResponse(Call<List<ContaCliente>> call, Response<List<ContaCliente>> response) {
                List<ContaCliente> contasCliente = (List<ContaCliente>) response.body();
                ContaClienteAdapter adapter = new ContaClienteAdapter(MainActivity.this, contasCliente);
                listAccounts.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<ContaCliente>> call, Throwable t) {
                Toast.makeText(
                    MainActivity.this,
                    "Erro: " + t.getMessage(),
                    Toast.LENGTH_LONG
                ).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        onLoadListAccounts();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_option:
                Intent intent = new Intent(
                        MainActivity.this,
                        FormularioActivity.class
                );
                startActivity(intent);
                break;
            default:
                Toast.makeText(
                        MainActivity.this,
                        "NOT IMPLEMENTED YET",
                        Toast.LENGTH_LONG
                ).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
