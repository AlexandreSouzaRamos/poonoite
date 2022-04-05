package br.edu.fatecmm.enumerador;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João Carlos");
        aluno1.setRa(123);
        aluno1.setSexo(Sexo.masculino);


        System.out.println("O aluno " + aluno1.getNome());
        System.out.println("Seu sexo é: " + aluno1.getSexo());
    }
}
