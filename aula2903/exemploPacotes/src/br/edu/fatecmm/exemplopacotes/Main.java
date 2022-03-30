package br.edu.fatecmm.exemplopacotes;

import br.edu.fatecmm.exemplopacotes.visao.ProfessorVisao;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Abra a janela Professor (Visao)
        ProfessorVisao tela = new ProfessorVisao();
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
