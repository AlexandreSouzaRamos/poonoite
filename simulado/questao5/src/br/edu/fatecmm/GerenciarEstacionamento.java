package br.edu.fatecmm;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNome("Maromo");
        cliente.setEmail("maromo@gmail.com");
        Carro c1 = new Carro();
        c1.setIdCarro(1);
        c1.setMarca("Nissan");
        c1.setModelo("Frontier");
        c1.setAno(2016);
        c1.setValor(100000.0);
        cliente.adicionarCarro(c1);
    }
}
