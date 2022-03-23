package com.company;

public class Main {

    public static void main(String[] args) {
	    Conta conta1, conta2;
        conta1 = new Conta();
        conta2 = new Conta();

        conta1.numConta = 1;
        conta1.nomeCliente = "chico";
        conta1.depositar(1000);
        conta1.sacar(100);
        System.out.println("Saldo: "  +conta1.saldo);
        Conta.cpmf = 0.0040;

        conta2.numConta = 2;
        conta2.nomeCliente ="ze";
        conta2.depositar(1000);
        conta2.sacar(100);
        System.out.println("Saldo da conta 2: " + conta2.saldo );
    }
}
