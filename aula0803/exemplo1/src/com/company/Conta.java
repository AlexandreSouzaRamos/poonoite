package com.company;

public class Conta {
    public int numConta;
    public String nomeCliente;
    public double saldo;
    public static double cpmf = 0.0038;

    public void depositar(double valor){
        saldo+= valor;
    }

    public void sacar(double valor){
        double vlrImposto;
        vlrImposto = valor * cpmf;
        valor += vlrImposto;
        saldo -= valor;
    }
}
