package br.edu.fatecmm;

import java.util.Scanner;

public class PrincipalComputador {

    public static void main(String[] args) {
	// Questão 4
        Scanner sc = new Scanner(System.in);
        Computador c1 = new Computador();
        ler(c1, sc);
        Computador c2 = new Computador();
        ler(c2, sc);
        Usuario usuario = new Usuario();
        usuario.setNivel(2);
        int r = c1.atualizarPreco(usuario, 1000);
        exibeMensagem(r);
        r = c2.atualizarPreco(usuario, 2000);
        exibeMensagem(r);
        System.out.println(c1.listarDados());
        System.out.println(c2.listarDados());

    }

    private static void exibeMensagem(int r) {
        if(r ==0){
            System.out.println("Valor atualizado");
        }else{
            System.out.println("Valor não atualizado");
        }
    }

    private static void ler(Computador comp, Scanner sc) {
        System.out.println("Digite o id do computador: \n");
        comp.setIdComp(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descrição: \n");
        comp.setDescricao(sc.nextLine());
        System.out.println("Digite o valor do computador: \n");
        comp.setValor(Double.parseDouble(sc.nextLine()));
    }
}
