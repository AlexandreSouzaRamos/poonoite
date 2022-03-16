package com.company;

public class Produto {
    //atributos
    private int idProduto;
    private String descricao;
    private long quantidade;
    private long nivel;
    private double valor;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getNivel() {
        return nivel;
    }

    public void setNivel(long nivel) {
        this.nivel = nivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean entrada(double valor){
        if(valor > 0){
            quantidade += valor;
            return true;
        }
        return false;
    }
    public boolean saida(double valor){
        if(valor < quantidade){
            quantidade -= valor;
            return true;
        }
        return false;
    }
    public void imprimir(){
        System.out.println("Id do Produto: " + idProduto);
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade em Estoque: " + quantidade);
        System.out.println("Nível no Estoque: " + nivel);
        System.out.println("Valor: " + valor);
    }
    public void checarNivel(){
        //verifica o nivel se esta abaixo da quantidade em estoque
        if(nivel > quantidade){
            System.out.println("Nível do estoque baixo. Avisar o Compras");
        }else{
            System.out.println("Estoque em ordem. Qtde atual: " + quantidade);
        }
    }
}
