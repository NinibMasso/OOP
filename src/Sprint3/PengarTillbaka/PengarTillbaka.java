package Sprint3.PengarTillbaka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class PengarTillbaka extends JFrame implements ActionListener {
    JFrame jfr = new JFrame();
    JPanel panel = new JPanel();
    JLabel prisLabel = new JLabel("Ange pris: ");
    JLabel beloppLabel = new JLabel("Ange hur mycket du betalar: ");
    JTextField pris = new JTextField(20);
    JTextField belopp = new JTextField(20);

    JPanel textPanel = new JPanel();
    JPanel boxPanel = new JPanel();
    JPanel valuePanel = new JPanel();
    JPanel resultPanel = new JPanel();
    JLabel resultat1000 = new JLabel();
    JLabel resultat500 = new JLabel();
    JLabel resultat200 = new JLabel();
    JLabel resultat100 = new JLabel();
    JLabel resultat50 = new JLabel();
    JLabel resultat20 = new JLabel();
    JLabel resultat10 = new JLabel();
    JLabel resultat5 = new JLabel();
    JLabel resultat2 = new JLabel();
    JLabel resultat1 = new JLabel();
    JLabel result2 = new JLabel(" ");
    JLabel result1 = new JLabel(" ");

    JCheckBox jcb1000 = new JCheckBox("1000-lapp");
    JCheckBox jcb500 = new JCheckBox("500-lapp");
    JCheckBox jcb200 = new JCheckBox("200-lapp");
    JCheckBox jcb100 = new JCheckBox("100-lapp");
    JCheckBox jcb50 = new JCheckBox("50-lapp");
    JCheckBox jcb20 = new JCheckBox("20-lapp");
    JCheckBox jcb10 = new JCheckBox("10-krona");
    JCheckBox jcb5 = new JCheckBox("5-krona");
    JCheckBox jcb2 = new JCheckBox("2-krona");
    JCheckBox jcb1 = new JCheckBox("1-krona");

    Scanner sc = new Scanner(System.in);


    PengarTillbaka() {

        this.add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(textPanel, BorderLayout.WEST);
        panel.add(boxPanel, BorderLayout.EAST);
        panel.add(valuePanel, BorderLayout.NORTH);
        panel.add(resultPanel, BorderLayout.SOUTH);
        textPanel.setLayout(new GridLayout(2, 1));
        boxPanel.setLayout(new GridLayout(2, 1));
        valuePanel.setLayout(new GridLayout(10, 1));
        resultPanel.setLayout(new GridLayout(10, 1));
        textPanel.add(prisLabel);
        textPanel.add(beloppLabel);
        boxPanel.add(pris);
        boxPanel.add(belopp);
        valuePanel.add(jcb1000);
        valuePanel.add(jcb500);
        valuePanel.add(jcb200);
        valuePanel.add(jcb100);
        valuePanel.add(jcb50);
        valuePanel.add(jcb20);
        valuePanel.add(jcb10);
        valuePanel.add(jcb5);
        valuePanel.add(jcb2);
        valuePanel.add(jcb1);
        resultPanel.add(result1);
        resultPanel.add(result2);
        resultPanel.add(resultat1000);
        resultPanel.add(resultat500);
        resultPanel.add(resultat200);
        resultPanel.add(resultat100);
        resultPanel.add(resultat50);
        resultPanel.add(resultat20);
        resultPanel.add(resultat10);
        resultPanel.add(resultat5);
        resultPanel.add(resultat2);
        resultPanel.add(resultat1);


        pris.addActionListener(this);
        belopp.addActionListener(this);

        jcb1000.addActionListener(this);
        jcb500.addActionListener(this);
        jcb200.addActionListener(this);
        jcb100.addActionListener(this);
        jcb50.addActionListener(this);
        jcb20.addActionListener(this);
        jcb10.addActionListener(this);
        jcb5.addActionListener(this);
        jcb2.addActionListener(this);
        jcb1.addActionListener(this);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pris || e.getSource() == belopp) {
            int enteredPris = Integer.parseInt(pris.getText());
            int enteredBetalt = Integer.parseInt(belopp.getText());
            int tillbaka = enteredBetalt - enteredPris;
            if (jcb1000.isSelected()) {
                resultat1000.setText(tillbaka / 1000 + " tusenlappar");
                tillbaka = tillbaka % 1000;
            } else resultat1000.setText(0 + " tusenlappar");
            if (jcb500.isSelected()) {
                resultat500.setText(tillbaka / 500 + " femhundralappar");
                tillbaka = tillbaka % 500;
            } else resultat500.setText(0 + " femhundralappar");
            if (jcb200.isSelected()) {
                resultat200.setText(tillbaka / 200 + " tvåhundralappar");
                tillbaka = tillbaka % 200;
            } else resultat200.setText(0 + " tvåhundralappar");
            if (jcb100.isSelected()) {
                resultat100.setText(tillbaka / 100 + " hundralappar");
                tillbaka = tillbaka % 100;
            } else resultat100.setText(0 + " hundralappar");
            if (jcb50.isSelected()) {
                resultat50.setText(tillbaka / 50 + " femtiolappar");
                tillbaka = tillbaka % 50;
            } else resultat50.setText(0 + " femtiolappar");
            if (jcb20.isSelected()) {
                resultat20.setText(tillbaka / 20 + " tjugor");
                tillbaka = tillbaka % 20;
            } else resultat20.setText(0 + " tjugor");
            if (jcb10.isSelected()) {
                resultat10.setText(tillbaka / 10 + " tior");
                tillbaka = tillbaka % 10;
            } else resultat10.setText(0 + " tior");
            if (jcb5.isSelected()) {
                resultat5.setText(tillbaka / 5 + " femmor");
                tillbaka = tillbaka % 5;
            } else resultat5.setText(0 + " femmor");
            if (jcb2.isSelected()) {
                resultat2.setText(tillbaka / 2 + " tvåkronor");
                tillbaka = tillbaka % 2;
            } else resultat2.setText(0 + " tvåkronor");
            resultat1.setText(tillbaka + " enkronor");
        }
    }
    public static void main(String[] args) {
        PengarTillbaka pt = new PengarTillbaka();
    }
}
