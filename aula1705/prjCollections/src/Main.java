import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Maria");
        lista.add(123);
        lista.add(12.89);
        lista.add("Maria");
        lista.add(System.currentTimeMillis());
        lista.add("Maria");
        lista.add(new Object());
        int t = lista.size();
        System.out.println("Tamanho da lista: " + t);
        //Quais são eles
        for(Object x : lista){
            System.out.println(x);
        }
        boolean tem = lista.contains("Maria");
        System.out.println(tem);
        lista.remove("Maria");
        System.out.println();

        while(lista.contains("Maria"))lista.remove("Maria");
        System.out.println("Ficaram: " + lista.size());
        for(Object x : lista){
            System.out.println(x);
        }
        lista.clear();
        System.out.println(lista.size());
    }
}