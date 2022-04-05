package br.edu.fatecmm.exemplopacotes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("2 ^ 10: " + Math.pow(2.0, 10.0));
        System.out.println("Valor do PI: " + Math.PI);
        System.out.println("Constante E: " + Math.E);
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int x = Integer.parseInt(leitor.nextLine());
        System.out.println(x);
    }
}
