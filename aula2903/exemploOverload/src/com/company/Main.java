package com.company;

public class Main {

    public static void main(String[] args) {
	    dizOla();
        dizOla("João");
        dizOla("Joao", 29);
        Aluno aluno1 = new Aluno(11, "Paulo");
        Aluno aluno2 = new Aluno();
        aluno2.setRa(22);
        aluno2.setNome("Maria das Neves");
        System.out.println(aluno1.getNome());
        System.out.println(aluno2.getNome());
        Aluno aluno3 = new Aluno(1, "Chico",
                "333-3333", "emaildochico@.",
                "Santos", "SP");


    }
    public static void dizOla(){
        System.out.println("Ola Pessoa");
    }
    public static void dizOla(String nome){
        System.out.println("Ola " + nome);
    }
    public static void dizOla(String nome, int dia){
        System.out.println("Hoje é " + dia + ", ola " + nome);
    }


}
