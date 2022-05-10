import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try {
            System.out.println("Digite um valor: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Digite um valor: ");
            b = Integer.parseInt(sc.nextLine());
            c = a / b;
            System.out.println("Resultado: " + c);
        }catch (NumberFormatException e){
            System.out.println("Dado inválido");
        }catch(ArithmeticException e1){
            System.out.println("Imposssível dividir por zero");
        }catch (Exception ex){
            System.out.println("Aconteceu o erro: ");
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Passe aqui com erro ou sem erro");
        }


    }
}