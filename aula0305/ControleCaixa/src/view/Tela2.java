package view;

import model.Caixa;
import utils.SemSaldoException;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela2 {
    private JPanel panelTela;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdRetirada;
    private JButton cmdConsulta;
    private JButton cmdSair;
    private JTextArea txtMsg;

    public JPanel getPanelTela() {
        return panelTela;
    }
    private Caixa caixa;

    public Tela2(){
        caixa = new Caixa();

        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor =Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                String frase = "Depósito de " + valor + " efetuado.";
                txtMsg.append(frase + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
                JOptionPane.showMessageDialog(null,
                        "Depósito efetuado com sucesso",
                        "Depósito - Sucesso",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                try {
                    caixa.sacar(valor);
                } catch (SemSaldoException ex) {
                    JOptionPane.showMessageDialog(null,
                            ex.getMessage(),
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
                String frase = "Saque de " + valor + " efetuado.";
                txtMsg.append(frase + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldo = caixa.getSaldo();
                txtSaldo.setText(Double.toString(saldo));
                String frase = "Consulta efetuada";
                txtMsg.append(frase + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
    }
}
