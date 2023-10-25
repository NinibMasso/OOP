package Sprint3.Github;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StenSaxPåse extends JFrame implements ActionListener {

    JFrame jfr = new JFrame();
    JPanel jp = new JPanel();
    JPanel boxChoices = new JPanel();
    JPanel resultText = new JPanel();

    JButton sten = new JButton("Sten");
    JButton sax = new JButton("Sax");
    JButton påse = new JButton("Påse");

    JLabel userChoice = new JLabel();
    JLabel computerChoiceText = new JLabel();
    JLabel result = new JLabel();
    JLabel score = new JLabel();
    int userScore = 0;
    int computerScore = 0;
    StenSaxPåse(){
        this.add(jp);
        jp.setLayout(new BorderLayout());
        jp.add(boxChoices, BorderLayout.NORTH);
        jp.add(resultText, BorderLayout.SOUTH);
        boxChoices.add(sten);boxChoices.add(sax);boxChoices.add(påse);
        sten.addActionListener(this);sax.addActionListener(this);påse.addActionListener(this);

        resultText.setLayout(new GridLayout(4,1));
        resultText.add(userChoice);
        resultText.add(computerChoiceText);
        resultText.add(result);
        resultText.add(score);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Random random = new Random();
        int computerChoice = random.nextInt(3);

        if (e.getSource() == sten && computerChoice == 1){
            userChoice.setText("Du valde: Sten");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du vann!");
            resultText.setBackground(Color.GREEN);
            userScore++;
            revalidate();
            repaint();
            pack();
        } else if (e.getSource() == sax && computerChoice == 2){
            userChoice.setText("Du valde: Sax");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du vann!");
            resultText.setBackground(Color.GREEN);
            userScore++;
            revalidate();
            repaint();
            pack();
        } else if (e.getSource() == påse && computerChoice == 0){
            userChoice.setText("Du valde: Påse");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du vann!");
            resultText.setBackground(Color.GREEN);
            userScore++;
            revalidate();
            repaint();
            pack();
        }else if (e.getSource() == sten && computerChoice == 0){
            userChoice.setText("Du valde: Sten");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Det blev lika, prova igen!");
            resultText.setBackground(Color.YELLOW);
            revalidate();
            repaint();
            pack();
        } else if (e.getSource() == sten && computerChoice == 2){
            userChoice.setText("Du valde: Sten");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du förlora!");
            resultText.setBackground(Color.RED);
            computerScore++;
            revalidate();
            repaint();
            pack();
        } else if (e.getSource() == sax && computerChoice == 0){
            userChoice.setText("Du valde: Sax");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du förlora!");
            resultText.setBackground(Color.RED);
            computerScore++;
            revalidate();
            repaint();
            pack();
        }else if (e.getSource() == sax && computerChoice == 1){
            userChoice.setText("Du valde: Sax");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Det blev lika, prova igen!");
            resultText.setBackground(Color.YELLOW);
            revalidate();
            repaint();
            pack();
        }else if (e.getSource() == påse && computerChoice == 1){
            userChoice.setText("Du valde: Påse");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Du förlora!");
            resultText.setBackground(Color.RED);
            computerScore++;
            revalidate();
            repaint();
            pack();
        } else if (e.getSource() == påse && computerChoice == 2){
            userChoice.setText("Du valde: Påse");
            computerChoiceText.setText(getComputerChoice(computerChoice));
            result.setText("Det blev lika, prova igen!");
            resultText.setBackground(Color.YELLOW);
            revalidate();
            repaint();
            pack();
        }
        score.setText("Användare " + userScore + "-" + computerScore + " Dator");

    }

    public String getComputerChoice(int computerChoice){
        String s = "";
        if (computerChoice == 0){
            s = "Datorn valde: Sten";
            return s;
        } else if (computerChoice == 1){
            s = "Datorn valde: Sax";
            return s;
        } else{
            s = "Datorn valde: Påse";
            return s;
        }
    }

    public static void main(String[] args) {
        StenSaxPåse ssp = new StenSaxPåse();
    }
}
