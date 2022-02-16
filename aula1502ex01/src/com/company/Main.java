package com.company;

public class Main {

    public static void main(String[] args) {
        //03 alunos a serem matriculados
        //o segundo trancaremos a matricula
        //o terceiro transferiremos
        Aluno joao, pedro, maria;
        joao = new Aluno();
        pedro = new Aluno();
        maria = new Aluno();
        joao.ra = 11;
        joao.nome = "João Pedro Barbosa";
        joao.email = "joaobarbosa@gmail.com";

        pedro.ra = 22;
        pedro.nome = "Pedro Henrique";
        pedro.email = "pedro@gmail.com";

        maria.ra = 33;
        maria.nome = "Maria da Silva";
        maria.email = "maria@gmail.com";

        joao.matricular();
        maria.matricular();
        pedro.matricular();

        pedro.trancarMatricula();

        maria.transferir();
    }
}
