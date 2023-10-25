package Sprint3.Github;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Githubtest extends JFrame implements FocusListener {

    JFrame jfr = new JFrame();
    JPanel jp = new JPanel();
    JButton jb1 = new JButton("Knapp 1");
    JButton jb2 = new JButton("Knapp 2");
    JTextField text = new JTextField("Första");



    Githubtest(){

        this.add(jp);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(text);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                text.requestFocus();
            }
        });
        text.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                text.setBackground(Color.BLUE);
            }

            @Override
            public void focusLost(FocusEvent e) {
                text.setBackground(Color.WHITE);

            }
        });
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Githubtest f = new Githubtest();
    }
    @Override
    public void focusGained(FocusEvent e) {
        text.setBackground(Color.BLUE);

    }

    @Override
    public void focusLost(FocusEvent e) {
        text.setBackground(Color.WHITE);

    }
}
