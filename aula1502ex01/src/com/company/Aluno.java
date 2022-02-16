package com.company;

public class Aluno {
    //atributos
    int ra;
    String nome;
    String email;

    //métodos
    public void matricular(){
        System.out.println("Matrícula efetuada");
        System.out.println("Dados do aluno: " + nome);
        System.out.println("Seu email: " + email);
    }

    public void transferir(){
        System.out.println("Transferência fora de prazo");
    }

    public void trancarMatricula(){
        System.out.println("Matrícula do ra: " + ra);
        System.out.println("CANCELADA.......");
    }

}
