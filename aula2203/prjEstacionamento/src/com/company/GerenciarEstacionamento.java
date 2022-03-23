package com.company;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	    // Criar um objeto cliente, este cliente terá
        //dois carros
        Cliente cliente = new Cliente();
        Veiculo carro1 = new Veiculo();
        Veiculo carro2 = new Veiculo();
        //dados do cliente
        cliente.setCodigoCliente(1);
        cliente.setNome("Carlos Santana");
        cliente.setEmail("carlossanta@guitarra.com");
        //dados de um carro
        carro1.setIdVeiculo(1);
        carro1.setModelo("Fusca");
        carro1.setMarca("VW");
        carro1.setAno(1970);
        carro1.setCor("Verde Abacate");
        //dados de outro carro
        carro2.setIdVeiculo(2);
        carro2.setModelo("Fiat 147");
        carro2.setMarca("Fiat");
        carro2.setAno(1977);
        carro2.setCor("Vermelho");



        //Adicionar os carros na lista do cliente
        cliente.adicionarCarro(carro1);
        cliente.adicionarCarro(carro2);
        System.out.println(cliente);
    }
}
