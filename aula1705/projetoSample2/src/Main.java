import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long inicio, fim;
        int n = 2600000;
        inicio = System.currentTimeMillis();
        List<Aluno> array = new LinkedList<>();
        for(int i=0; i<n;i++){
            array.add(new Aluno(i, "N" + i, "e@gmail.com"));
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para inserir: " + (fim-inicio)/1000.0 + " segundo");
        inicio = System.currentTimeMillis();
        Iterator o = array.iterator();
        for(Aluno a : array){
            Aluno x = a;
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo para iterar: " + (fim-inicio)/1000.0 + " segundo");

    }
}