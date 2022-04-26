public class Corrente extends Conta {

    private double chequeEspecial;

    public Corrente(int numConta, Cliente cliente,
                    double chequeEspecial) {
        super(numConta, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= (getSaldo() + chequeEspecial)){
            setSaldo(getSaldo()-valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Limite do Cheque: " + chequeEspecial + "\n";
    }
}
