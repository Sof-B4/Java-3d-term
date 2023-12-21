package Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DisplayImage extends JPanel {

    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            // Загрузка изображения из файла
            image = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Отрисовка изображения на панели
        g.drawImage(image, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в качестве аргумента командной строки.");
            System.exit(1);
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Отображение изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            DisplayImage panel = new DisplayImage(imagePath);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
