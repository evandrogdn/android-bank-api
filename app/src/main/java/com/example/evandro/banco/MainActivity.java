package com.example.evandro.banco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.evandro.banco.activities.DepositActivity;
import com.example.evandro.banco.activities.FormularioActivity;
import com.example.evandro.banco.activities.TransferActivity;
import com.example.evandro.banco.activities.WithdrawActivity;
import com.example.evandro.banco.adapters.ContaClienteAdapter;
import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.Return;
import com.example.evandro.banco.models.Transfer;
import com.example.evandro.banco.models.Withdraw;
import com.example.evandro.banco.service.BankService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    protected ListView listAccounts;
    protected ContaCliente contaClienteSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listAccounts = findViewById(R.id.accounts_list);
        onLoadListeners();
        onLoadListAccounts();
    }

    private void getContaClienteSelecionada(int position) {
        this.contaClienteSelecionada = (ContaCliente) listAccounts.getAdapter().getItem(position);
    }

    private void contaClienteUpdate() {
        Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
        intent.putExtra("conta_cliente_selecionada", this.contaClienteSelecionada);
        startActivity(intent);
        onLoadListAccounts();
    }

    private void contaClienteDelete() {
        BankService service = BankService.retrofit.create(BankService.class);
        final Call<Return> call = service.bankDelete(this.contaClienteSelecionada.getId());
        call.enqueue(new Callback<Return>() {
            @Override
            public void onResponse(Call<Return> call, Response<Return> response) {
                Toast.makeText(
                        MainActivity.this,
                        response.body().getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }

            @Override
            public void onFailure(Call<Return> call, Throwable throwable) {
                Toast.makeText(
                        MainActivity.this,
                        "Erro: " + throwable.getMessage(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        onLoadListAccounts();
    }

    private void contaClienteDeposito() {
        Intent intent = new Intent(MainActivity.this, DepositActivity.class);
        intent.putExtra("conta_cliente_selecionada", this.contaClienteSelecionada);
        startActivity(intent);
        onLoadListAccounts();
    }

    private void contaClienteSaque() {
        Intent intent = new Intent(MainActivity.this, WithdrawActivity.class);
        intent.putExtra("conta_cliente_selecionada", this.contaClienteSelecionada);
        startActivity(intent);
        onLoadListAccounts();
    }

    private void contaClienteTransferencia() {
        Intent intent = new Intent(MainActivity.this, TransferActivity.class);
        intent.putExtra("conta_cliente_selecionada", this.contaClienteSelecionada);
        startActivity(intent);
        onLoadListAccounts();
    }

    public void popUpMenuAction(MenuItem item) {
        switch (item.getTitle().toString()) {
            case "Editar":
                contaClienteUpdate();
                break;
            case "Remover":
                contaClienteDelete();
                break;
            case "Deposito":
                contaClienteDeposito();
                break;
            case "Saque":
                contaClienteSaque();
                break;
            case "Transferência":
                contaClienteTransferencia();
                break;
            default:
                Toast.makeText(
                        MainActivity.this,
                        "NOT IMPLEMENTED YET",
                        Toast.LENGTH_LONG
                ).show();
        }
    }

    private void onLoadListeners() {
        listAccounts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                getContaClienteSelecionada(position);

                PopupMenu menu = new PopupMenu(MainActivity.this, view);
                menu.getMenu().add("Editar");
                menu.getMenu().add("Remover");
                menu.getMenu().add("Deposito");
                menu.getMenu().add("Saque");
                menu.getMenu().add("Transferência");
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        popUpMenuAction(item);
                        onLoadListAccounts();
                        return true;
                    }
                });
                menu.show();
            }
        });
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
            case R.id.refresh_option:
                onLoadListAccounts();
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
