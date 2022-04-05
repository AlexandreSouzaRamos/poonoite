package br.edu.fatecmm.tabuleiro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tabuleiro meuJogo = new Tabuleiro();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro palpite ");
        meuJogo.palpites[0] = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo palpite ");
        meuJogo.palpites[1] = Integer.parseInt(input.nextLine());
        double premio = meuJogo.jogar();
        if(premio==0.0){
            System.out.println("Que pena você perdeu ");
        }else{
            System.out.println("Pegue a grana R$ " + premio);
        }
    }
}
