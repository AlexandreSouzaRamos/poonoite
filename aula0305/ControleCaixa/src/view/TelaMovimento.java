package view;

import model.Caixa;
import utils.SemSaldoException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMovimento extends JFrame implements ActionListener {
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdSaldo, cmdSair;
    protected TextArea txtMsg;
    protected Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    private Caixa caixa;
    public TelaMovimento(){
        caixa = new Caixa();
        //Definir a aparencia e o comportamento da janela
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //Definir propriedades da janela de movimento
        setTitle("Controle de model.Caixa");
        setResizable(false);
        setSize(dFrame);
        setLocation(200, 200);
        setLayout(null);
        //definir propriedades dos outros elementos
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        add(lblValor);
        lblSaldo = new Label("Saldo:");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        add(cmdEntrada);
        cmdEntrada.addActionListener(this);

        cmdSaldo = new Button("Consultar");
        cmdSaldo.setSize(dButton);
        cmdSaldo.setLocation(25,185);
        add(cmdSaldo);
        cmdSaldo.addActionListener(this);

        cmdRetirada = new Button("Sacar");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180,150);
        add(cmdRetirada);
        cmdRetirada.addActionListener(this);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180,185);
        add(cmdSair);
        cmdSair.addActionListener(this);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            System.exit(0);
        }
        if(e.getSource()==cmdSaldo){
            double saldo = caixa.getSaldo();
            txtSaldo.setText(Double.toString(saldo));
            String frase = "Consulta efetuada";
            txtMsg.append(frase + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==cmdEntrada){
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
        if(e.getSource()==cmdRetirada){
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
    }
}
