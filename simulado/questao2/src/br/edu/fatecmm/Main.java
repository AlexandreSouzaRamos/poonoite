package br.edu.fatecmm;

public class Main {

    public static void main(String[] args) {
	    //Neste exercício temos tres métodos
        //para efetuar a soma. Todos com o mesmo
        //nome, mas com parâmetros diferentes.
        //Usamos isto quando temos uma lógica diferente
        //para uma mesma operação. Neste
        //caso o primeiro somar, sempre devolve 22,
        //o segundo devolve a soma de dois valores
        //passados ao ser invocado, e o terceiro
        //retorna a soma de três valores ao ser invocado
        System.out.println(somar());
        System.out.println(somar(5, 23));
        System.out.println(somar(3,5,6));

    }

    private static int somar(){
        int x = 12;
        int z = 10;
        return  x + z;
    }
    private static int somar(int a, int b){
        return a + b;
    }
    private static int somar(int a, int b, int c){
        return a+b+c;
    }
}
