public class Poupanca extends Conta {
    private int diaAniversario;


    public Poupanca(int numConta, Cliente cliente,
                    int diaAniversario) {
        super(numConta, cliente);
        this.diaAniversario = diaAniversario;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Dia de Aniversário: " + diaAniversario + "\n";
    }
}
