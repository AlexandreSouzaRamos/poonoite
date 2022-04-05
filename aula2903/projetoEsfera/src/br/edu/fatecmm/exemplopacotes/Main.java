package br.edu.fatecmm.exemplopacotes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Programa para calculo do volume da esfera");
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do Raio: ");
        double r = Double.parseDouble(input.nextLine());
        //Objeto do tipo esfera
        Esfera esfera = new Esfera();
        esfera.setRaio(r);
        System.out.println("Volume: " + esfera.calcularVolume());
    }
}
