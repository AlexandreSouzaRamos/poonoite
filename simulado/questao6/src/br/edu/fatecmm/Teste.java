package br.edu.fatecmm;

public class Teste {

    public Teste(){
        //Método construtor, invocado no momento
        //de instanciar um objeto do tipo teste
        //neste caso, quando pretendemos personalizar
        //um objeto (atribuindo caracteristicas iniciais)
        System.out.println("Mensagem personalizada");

    }
    private static int contador  = 0;
    //atributo estático é compartilhado por todos
    //os objetos de um mesmo tipo.
    public static void main(String[] args) {
        System.out.println("Mostrei contador com " + ++contador + " na mensagem");
        Teste t = new Teste();
        t.contador++; //uso inadequado
        System.out.println("Meu contador, com uso inadequado: ");
        System.out.println("Valendo " + contador);
    }

    //Objeto = intancia de uma classe. (objeto teste)
    //Classe = meu molde (classe Teste)

}
