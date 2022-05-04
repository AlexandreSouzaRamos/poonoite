import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<Conta> lista = new ArrayList<>();

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(1);
        cliente.setNomeCliente("Oscar Santos");
        //Conta corrente
        Corrente cc = new Corrente(111, cliente, 5000.0);
        //Poupanca
        Poupanca poup = new Poupanca(222, cliente, 26);

        boolean r = cc.depositar(5000);
        if(r){
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido");
        }
        System.out.println("Dados da Conta Corrente: " + cc.toString());

        r = poup.depositar(1000);
        if(r){
            System.out.println("Depósito efetuado com sucesso");
        }else{
            System.out.println("Valor inválido");
        }

        r = cc.sacar(9000);
        if(r){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente para o saque");
        }

        System.out.println("Dados da Poupança: " + poup.toString());

        System.out.println("Dados da conta corrente: " + cc.toString());

        Main main = new Main();

        main.adicionarConta(cc);
        main.adicionarConta(poup);

    }

    public void adicionarConta(Conta c){
        lista.add(c);
    }
}