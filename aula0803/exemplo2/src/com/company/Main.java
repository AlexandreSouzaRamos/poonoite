package com.company;

/**
 * @author maromo
 * @since mar 08
 * @version 0.01 Beta
 */
public class Main {

    /**
     *
     * @param args argumentos passados pela linha de comando
     */
    public static void main(String[] args) {
	    int valor = 15;
        String strValor = "3300";

        int x = valor * Integer.parseInt(strValor);
        System.out.println("Valor x: " + x);

        String resultado = strValor + Integer.toString(x);
        System.out.println("Resultado: " + resultado);

    }
}
