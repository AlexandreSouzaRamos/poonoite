package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int v[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(v[i]);
        }

        int vetor[] = {3,5,7};
        for(int x : vetor){
            System.out.println(x);
        }

        for(int i=0; i<10; i++){
            v[i] = 55;
        }
        Arrays.fill(v, 55);

        



    }
}
