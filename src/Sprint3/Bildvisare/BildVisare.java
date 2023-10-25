package Sprint3.Bildvisare;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BildVisare extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton button = new JButton("Växla bild");
    private String imageString1 = "C:\\Users\\ninib\\OneDrive\\Skrivbord\\RandomPictures\\nedladdning.jpg";
    private String imageString2 = "C:\\Users\\ninib\\OneDrive\\Skrivbord\\RandomPictures\\nedladdning3.jpg";
    JLabel label = new JLabel(new ImageIcon(imageString1));

    BildVisare(){
        this.add(panel);
        panel.add(button);
        panel.add(label);

        button.addActionListener(this);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setIcon(new ImageIcon(imageString2));

    }

    public static void main(String[] args) {
        BildVisare bv = new BildVisare();
    }


}
