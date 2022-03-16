package com.company;

import java.util.Scanner;

public class GerenciarProduto {
    Produto produto = new Produto();

    public static void main(String[] args) {
        GerenciarProduto gp = new GerenciarProduto();
        Scanner input = new Scanner(System.in);
        int opc = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar Produto");
            System.out.println("2.. Registrar Entrada");
            System.out.println("3.. Registrar Saída");
            System.out.println("4.. Consultar");
            System.out.println("5.. Apresentar Nível");
            System.out.println("9.. Sair");
            System.out.println("Sua opção: ");
            opc = Integer.parseInt(input.nextLine());
            switch (opc){
                case 1:
                    gp.execCadastrar();
                    break;
                case 2:
                    gp.execDarEntrada();
                    break;
                case 3:
                    gp.execDarSaida();
                    break;
                case 4:
                    gp.execConsultar();
                    break;
                case 5:
                    gp.execMostrarNivel();
                    break;
                case 9:
                    System.out.println("Acabou...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o id do produto: ");
        produto.setIdProduto(Integer.parseInt(input.nextLine()));
        System.out.println("Digite a descrição do produto: ");
        produto.setDescricao(input.nextLine());
        System.out.println("Nível mínimo no estoque: ");
        produto.setNivel(Long.parseLong(input.nextLine()));
        System.out.println("Digite o valor do produto: ");
        produto.setValor(Double.parseDouble(input.nextLine()));
        System.out.println("Produto cadastrado com sucesso");
    }

    public void execDarEntrada(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor a ser acrescido ao estoque: ");
        double valor = Double.parseDouble(input.nextLine());
        if(produto.entrada(valor)){
            System.out.println("Entrada Registrada com sucesso");
        }else{
            System.out.println("Valor não pode ser negativo ou zero");
        }

    }

    public void execDarSaida(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor a ser abatido do estoque: ");
        double valor = Double.parseDouble(input.nextLine());
        if(produto.saida(valor)){
            System.out.println("Saída Registrada com sucesso");
        }else{
            System.out.println("Esta quantia supera o estoque. ");
        }
    }

    public void execMostrarNivel(){
        produto.checarNivel();
    }

    public void execConsultar(){
        produto.imprimir();
    }

}
