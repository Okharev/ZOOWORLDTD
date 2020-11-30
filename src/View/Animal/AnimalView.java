package View.Animal;

import Model.Animal.Animal;

import javax.swing.*;
import java.awt.*;

public class AnimalView {

    JFrame frame;
    JLabel label;

    public void init()
    {
        frame = new JFrame("ANIMAL VIEW");
        label = new JLabel();

        frame.setLayout(new FlowLayout());
        frame.getContentPane().add(label);

        frame.setVisible(true);
        frame.pack();
    }

    public void showAnimal(String data)
    {
        label.setText(data);
    }

}
