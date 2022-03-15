package com.company;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {
	// Menu com as opções
        Scanner input = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        int opc = 0;
        do{
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Consultar");
            System.out.println("9.. Sair");
            System.out.println("Entre com sua opção: ");
            opc = Integer.parseInt(input.nextLine());
            switch (opc){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execDepositar();
                    break;
                case 3:
                    teste.execSacar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastrando a conta");
        System.out.println("Digite a conta: ");
        cc.conta = input.nextLine();
        System.out.println("Digite a agência: ");
        cc.agencia = input.nextLine();
        System.out.println("Digite o nome do cliente: ");
        cc.nomeCliente = input.nextLine();
        System.out.println("Conta cadastrada com sucesso");
    }
    public void execConsultar(){
        cc.imprmir();
    }
    public void execSacar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(input.nextLine());
        if(cc.sacar(valorSaque) == 1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Não há saldo suficiente para o saque");
        }
    }
    public void execDepositar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = Double.parseDouble(input.nextLine());
        cc.depositar(valorDeposito);
        System.out.println("Depósito efetuado com sucesso");
    }
}
