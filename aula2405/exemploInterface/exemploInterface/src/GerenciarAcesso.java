import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {
    public static List<Logavel> listaLogados = new ArrayList<>();

    public static void main(String[] args) {
        Secretaria s = new Secretaria();
        Operador op = new Operador();
        Diretor diretor = new Diretor();
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        s.efetuarLogin();
        cliente.efetuarLogin();
        diretor.efetuarLogin();

        System.out.println("Existem " + listaLogados.size() +
                " logados no sistema, são eles: ");

        for (Logavel pessoa: listaLogados){
            System.out.println(pessoa);
        }

        diretor.efetuarLogoff();

        System.out.println("Existem " + listaLogados.size() +
                " logados no sistema, são eles: ");

        for (Logavel pessoa: listaLogados){
            System.out.println(pessoa);
        }

    }
}