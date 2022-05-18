import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno a1, a2, a3, a4;
        a1 = new Aluno(567, "Antonio", "x@gmail.com");
        a2 = new Aluno(123, "Mariana", "m@gmail.com");
        a3 = new Aluno(42, "Ana", "ana@gmail.com");
        a4 = new Aluno(888, "Baroneza", "b@gmail.com");
        List<Aluno> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(a4);
        Collections.sort(lista);
        if(a1.hashCode()==a2.hashCode()){
            System.out.println("Mesma caixa");
            if(a1 == a2){
                System.out.println("Mesma pessoa");
            }else{
                System.out.println("Outra pessoa");
            }
        }

        for (Aluno a : lista){
            System.out.println(a);
        }

    }
}