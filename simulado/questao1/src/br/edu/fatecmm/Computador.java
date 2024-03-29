package br.edu.fatecmm;

public class Computador {
    private int idComp;
    private String descricao;
    private double valor;

    public int getIdComp() {
        return idComp;
    }

    public void setIdComp(int idComp) {
        this.idComp = idComp;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Questão 3
    public String listarDados(){
        return "Computador \n" +
                "Id: " + idComp + "\n" +
                "Descrição: " + descricao + "\n" +
                "Valor: " + valor + "\n";
    }

    public int atualizarPreco(Usuario usu, double preco){
        if(usu.getNivel()==2){
            valor = preco;
            return 0;
        }
        return 1;
    }



}
