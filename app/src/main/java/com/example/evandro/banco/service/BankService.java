package com.example.evandro.banco.service;

import com.example.evandro.banco.models.ContaCliente;
import com.example.evandro.banco.models.ContaClienteRequest;
import com.example.evandro.banco.models.Deposit;
import com.example.evandro.banco.models.Transfer;
import com.example.evandro.banco.models.Withdraw;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface BankService {
    // cadastrar uma conta
    @POST("api/v1/conta-cliente")
    Call<ContaCliente> bankInsert(@Body ContaClienteRequest contaCliente);
    // atualizar uma conta
    @PUT("api/v1/conta-cliente/{id}")
    Call<ContaCliente> bankUpdate(@Body ContaClienteRequest contaCliente, @Path("id") String id);
    // buscar uma conta
    @GET("api/v1/conta-cliente/{id}")
    Call<ContaCliente> bankGetOne(@Path("id") String id);
    // buscar as contas
    @GET("api/v1/conta-cliente/")
    Call<List<ContaCliente>> bankGet();
    // remover a conta
    @DELETE("api/v1/conta-cliente/{id}")
    Call<ContaCliente> bankDelete(@Path("id") String id);
    // realizar saque
    @POST("api/v1/conta-cliente/movimentar/saque")
    Call<ContaCliente> bankWithdraw(@Body Withdraw withdraw);
    // realizar deposito
    @POST("api/v1/conta-cliente/movimentar/deposito")
    Call<ContaCliente> bankDeposit(@Body Deposit deposit);
    // realizar transferencia
    @POST("api/v1/conta-cliente/movimentar/transferencia")
    Call<ContaCliente> bankTransfer(@Body Transfer transfer);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://192.168.0.105:3030/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
