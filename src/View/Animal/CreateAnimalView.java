package View.Animal;

import javax.swing.*;
import java.awt.*;

public class CreateAnimalView {

    JFrame frame;
    JTextField field;

    public void init()
    {
        frame = new JFrame("ANIMAL VIEW");
        field = new JTextField();
        field.setColumns(10);

        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(field);

        frame.setVisible(true);
        frame.pack();
    }


    public JFrame getFrame() {
        return frame;
    }

    public JTextField getField() {
        return field;
    }
}
