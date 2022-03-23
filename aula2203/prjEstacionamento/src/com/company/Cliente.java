package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int codigoCliente;
    private String nome;
    private String email;
    private List<Veiculo> carros;

    public Cliente(){
        carros = new ArrayList<>();
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
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

    public List<Veiculo> getCarros() {
        return carros;
    }

    public void setCarros(List<Veiculo> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        String dados = "Dados do Cliente \n" +
                "Cod. Cliente: " + codigoCliente + "\n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n";
        for(Veiculo veiculo : carros){
            dados += veiculo.toString() + "\n";
        }
        return dados;

    }

    public void adicionarCarro(Veiculo veiculo){
        carros.add(veiculo);
    }
}
