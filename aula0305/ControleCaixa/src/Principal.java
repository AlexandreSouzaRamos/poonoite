import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        JFrame tela2 = new JFrame();
        tela2.setContentPane(new Tela2().getPanelTela());
        tela2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela2.setSize(350,400);
        tela2.setTitle("Controle de Caixa");
        tela2.setVisible(true);
    }
}