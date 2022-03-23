package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o valor para x: ");
        x = input.nextInt();
        System.out.println("Digite o valor para y: ");
        y = input.nextInt();

        int soma = x + y;
        System.out.println("Soma: " + soma);


    }
}
