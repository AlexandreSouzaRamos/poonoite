package com.company;

public class Conta {
    //atributos
    private int idConta;
    private String nomeCliente;
    private String agencia;
    private double saldo;

    //gerar getters and setters
    //<ALT><INSERT>

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Id da Conta: " + idConta + "\n" +
                "Nome Cliente: " + nomeCliente + "\n" +
                "Agência: " + agencia + "\n" +
                "Saldo Atual R$ " + saldo + "\n";
    }

    //Métodos (lógica de negócios)
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
}
