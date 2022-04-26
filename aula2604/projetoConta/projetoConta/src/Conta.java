public class Conta {
    private int numConta;
    private Cliente cliente;
    private double saldo;

    public Conta(int numConta, Cliente cliente){
        this.numConta = numConta;
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Num. Conta: " + numConta + "\n" +
                cliente.toString() +
                "Saldo: " + saldo + "\n";
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor<= saldo){
            saldo -=valor;
            return true;
        }
        return false;
    }
}
