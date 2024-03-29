public class Cliente {
    private int idCliente;
    private String nomeCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Id do Cliente: " + idCliente + "\n" +
                "Nome: " + nomeCliente + "\n";
    }
}
