package com.company;

public class Main {

    public static void main(String[] args) {
	    //Instanciar dois produtos. Dar entrada e saída em ambos.
        //Ao final, apresentar os dados de ambos produtos.
        Produto p1 = new Produto(11,"Bola", 100.0);
        Produto p2 = new Produto(22, "Peteca", 22.0);
        if(p1.entrar(55)){
            System.out.println("Entrada efetuada com sucesso");
        }else{
            System.out.println("Entrada inválida");
        }

        if(p1.sair(45)){
            System.out.println("Saída efetuada com sucesso");
        }else{
            System.out.println("Valor inválido para retirada");
        }
        System.out.println(p1.mostrarProduto());

    }
}
