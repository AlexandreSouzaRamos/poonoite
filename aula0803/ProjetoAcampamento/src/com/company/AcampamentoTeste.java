package com.company;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do escoteiro: ");
        membro.nome = input.nextLine();
        System.out.println("Digite a idade do escoteiro: ");
        membro.idade = Integer.parseInt(input.nextLine());
        //invocar o metodo imprimir
        membro.imprimir();

        membro.separarGrupo();

        membro.imprimir();
    }
}
