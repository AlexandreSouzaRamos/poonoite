package com.company;

public class ComputadorTeste {

    public static void main(String[] args) {
	    Computador c1 = new Computador();
        c1.marca = "HP";
        c1.numeroSerie = 123;
        c1.cor = "Branca";
        c1.preco = 1500.0;
        c1.modelo = "Novo";

        c1.imprimir();

        c1.calcularValor();

        c1.imprimir();

        Computador c2 = new Computador();
        c2.marca = "IBM";
        c2.cor = "Branca";
        c2.modelo = "Velho";
        c2.preco = 5000.0;
        c2.numeroSerie = 2345;

        c2.imprimir();

        c2.calcularValor();

        c2.imprimir();

        if(c2.alterarValor(4500.0)==1){
            System.out.println("Valor Alterado");
        }else{
            System.out.println("Valor não alterado");
        }

        c2.imprimir();

    }
}
