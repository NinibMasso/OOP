package Sprint3.MouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse2 extends MouseAdapter {

    JButton jb = new JButton();
    Mouse2(JButton jb){
        this.jb = jb;
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        jb.setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jb.setBackground(Color.WHITE);

    }
}
