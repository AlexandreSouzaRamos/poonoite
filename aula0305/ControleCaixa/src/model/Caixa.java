package model;

import utils.SemSaldoException;

public class Caixa {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public void sacar(double valor) throws SemSaldoException {
        if(valor > saldo){
            throw new SemSaldoException();
        }
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
}
