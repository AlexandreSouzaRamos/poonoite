package com.company;

public class Acampamento {
    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Nome do Membro do Acamp. " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Equipe: " + equipe);
        System.out.println("------------------------------");
    }

    public void separarGrupo(){
        if(idade < 6) {
            equipe = '-';
            return;
        }
        if(idade<=10){
            equipe = 'A';
            return;
        }
        if(idade<=20){
            equipe = 'B';
            return;
        }
        equipe = 'C';

    }
}
