package com.company;

public class Produto {

    //atributos
    public int codigo;
    public String descricao;
    public double valor;
    private int quantidadeEstoque;

    //construtor personalizado
    public Produto(int codigo, String descricao, double valor){
           this.codigo = codigo;
           this.descricao = descricao;
           this.valor = valor;
           this.quantidadeEstoque = 0;
    }

    //métodos
    public boolean entrar(int qtd){
        if(qtd > 0 ){
            quantidadeEstoque += qtd;
            return true;
        }
        return false;
    }

    public boolean sair(int qtd){
        if(qtd <quantidadeEstoque){
            quantidadeEstoque -= qtd;
            return true;
        }
        return false;
    }
    public String mostrarProduto(){
        return "Dados do produto \n" +
            "Código: " + codigo + " \n" +
            "Descrição: " + descricao + "\n" +
            "Valor: " + valor + "\n" +
            "Quantidade em Estoque: " + quantidadeEstoque + "\n";
    }
}
