package Lab8;

import javax.swing.*;

public class GUI_gif extends JFrame {
    GUI_gif(String filename) {
        super("Image");
        setSize(600,600);
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        JLabel jl = new JLabel(icon);
        jl.setBounds(0,0,600,600);
        setLocationRelativeTo(null);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        String filename = "image-862209192214338119696.gif";
        new GUI_gif(filename);
    }
}