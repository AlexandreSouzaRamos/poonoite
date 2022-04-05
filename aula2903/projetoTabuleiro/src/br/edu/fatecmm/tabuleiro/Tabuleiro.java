package br.edu.fatecmm.tabuleiro;

import java.util.Random;

public class Tabuleiro {
    private int[][] matriz = new int[10][10];
    public int[] palpites = new int[2];

    public Tabuleiro(){
        //construtor do tabuleiro
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = gerador.nextInt(101);
            }
        }
    }

    public double jogar(){
        //lógica do jogo
        int cont = 0;
        double total = 0.0;
        //varrer os dois palpites
        for(int p=0; p<2; p++){
            //varrer o tabuleiro a procura de acertos
            for(int i=0; i<10; i++){
                for (int j = 0; j < 10; j++) {
                    if(palpites[p] == matriz[i][j]) cont++;
                }
            }
        }
        total = cont * 1000;
        imprimirResultado();
        return total;
    }
    public void imprimirResultado(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%2d] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
