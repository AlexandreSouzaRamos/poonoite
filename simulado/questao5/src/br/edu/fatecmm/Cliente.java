package br.edu.fatecmm;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private String email;
    private List<Carro> carros;

    public Cliente(){
        carros = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void adicionarCarro(Carro c){
        carros.add(c);
        System.out.println("Carro de Id: " + c.getIdCarro() + " adicionardo");
    }
}
