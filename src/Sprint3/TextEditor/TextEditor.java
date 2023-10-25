package Sprint3.TextEditor;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor extends JFrame {
    JPanel jp = new JPanel();
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JButton öppna = new JButton("Öppna");
    JButton spara = new JButton("Spara");
    JButton skrivUt = new JButton("Skriv ut");
    JButton avsluta = new JButton("Avsluta");
    JLabel filnamn = new JLabel("Filnamn: ");
    JTextField filsökväg = new JTextField();
    JTextArea text = new JTextArea(20, 30);
    private String fileName;

    private final JScrollPane sp = new JScrollPane(text, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    Scanner sc = null;

    TextEditor() {
        this.add(jp);
        jp.setLayout(new BorderLayout());
        north.setLayout(new GridLayout(1, 6));
        jp.add(north, BorderLayout.NORTH);
        jp.add(south, BorderLayout.SOUTH);
        north.add(filnamn);
        north.add(filsökväg);
        north.add(öppna);
        north.add(spara);
        north.add(skrivUt);
        north.add(avsluta);
        south.add(text);

        öppna.addActionListener(e -> öppnafil());
        spara.addActionListener(e -> sparaFil());
        skrivUt.addActionListener(e -> {
            try {
                text.print();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        avsluta.addActionListener(e -> System.exit(0));
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void öppnafil() {
        fileName = filsökväg.getText();
        try (FileReader r = new FileReader(fileName)) {
            text.read(r, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void sparaFil() {
        try (FileWriter wr = new FileWriter(fileName)) {
            text.write(wr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        TextEditor txt = new TextEditor();
    }
}
