package Sprint3.MouseListener;

import javax.swing.*;

public class Mouse extends JFrame {
    JPanel jp = new JPanel();
    JButton jb = new JButton("Click me");

    Mouse(){
        this.add(jp);
        jp.add(jb);
        jb.addMouseListener(new Mouse2(jb));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
    }
}
