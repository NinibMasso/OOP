package Sprint3.Bildvisare;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class BensinRäknare extends JFrame implements ActionListener {
    Scanner sc = new Scanner(System.in);
    JPanel panel = new JPanel();
    JLabel mätarställningNuLabel = new JLabel("Ange mätarställning nu: ");
    JLabel mätarställningGammalLabel = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel förbrukadBensinLabel = new JLabel("Ange antal liter förbrukad bensin: ");
    JTextField mätarställningNu = new JTextField(50);
    JTextField mätarställningGammal = new JTextField(50);
    JTextField förbrukadBensin = new JTextField(50);
    JLabel antalKördaMil = new JLabel(" ");
    JLabel antalLiterBensinLabel = new JLabel(" ");
    JLabel förbrukningPerMilLabel = new JLabel(" ");
    JPanel questions = new JPanel();
    JPanel answers = new JPanel();

    JPanel finalVerdictPanel = new JPanel();

    BensinRäknare(){
        this.add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(questions, BorderLayout.WEST);
        panel.add(answers, BorderLayout.EAST);
        panel.add(finalVerdictPanel, BorderLayout.SOUTH);
        questions.setLayout(new GridLayout(3, 1));
        questions.add(mätarställningNuLabel);
        questions.add(mätarställningGammalLabel);
        questions.add(förbrukadBensinLabel);
        answers.setLayout(new GridLayout(3,1));
        answers.add(mätarställningNu);
        answers.add(mätarställningGammal);
        answers.add(förbrukadBensin);
        finalVerdictPanel.setLayout(new GridLayout(1,3));
        finalVerdictPanel.add(antalKördaMil);
        finalVerdictPanel.add(antalLiterBensinLabel);
        finalVerdictPanel.add(förbrukningPerMilLabel);

        panel.setBackground(Color.black);
        questions.setBackground(Color.cyan);

        mätarställningNu.addActionListener(this);
        mätarställningGammal.addActionListener(this);
        förbrukadBensin.addActionListener(this);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mätarställningNu || e.getSource() == mätarställningGammal
        || e.getSource() == förbrukadBensin){
            Scanner scMätarställningNu = new Scanner(mätarställningNu.getText());
            Scanner scMätarställningGammal = new Scanner(mätarställningGammal.getText());
            Scanner scFörbrukadBensin = new Scanner(förbrukadBensin.getText());

            if (scMätarställningNu.hasNextDouble() && scMätarställningGammal.hasNextDouble()
            && scFörbrukadBensin.hasNextDouble()){
                double enteredMätarställningNu = scMätarställningNu.nextDouble();
                double enteredMätarställningGammal = scMätarställningGammal.nextDouble();
                double enteredFörbrukadBensin = scFörbrukadBensin.nextDouble();

                double kördamil = enteredMätarställningNu - enteredMätarställningGammal;

                double förbrukningPerMil = (enteredFörbrukadBensin / kördamil);

                antalKördaMil.setText(String.format("Antal körda mil: %8.0f \n", kördamil));
                antalLiterBensinLabel.setText(String.format("Antal liter bensin: %7.1f \n",
                        enteredFörbrukadBensin));
                förbrukningPerMilLabel.setText(String.format("Förbrukning per mil : %1.2f \n",
                        förbrukningPerMil));
            }
        }
    }

    public static void main(String[] args) {
        BensinRäknare bv = new BensinRäknare();
    }


}
