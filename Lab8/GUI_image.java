package Lab8;


import javax.swing.*;

public class GUI_image extends JFrame {
    GUI_image(String filename) {
        super("Image");
        setSize(1200,500);
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        JLabel jl = new JLabel(icon);
        jl.setBounds(0,0,563,413);
        setLocationRelativeTo(null);
        add(jl);
        setVisible(true);
    }
    public static void main(String[] args) {
        String filename = "567fgh678.jpg";
        for (int i = 0; i < args.length; i++) {
            filename = args[i];
        }
        new GUI_image(filename);
    }
}