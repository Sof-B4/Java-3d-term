package Lab19;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Черный\n" +
                "Оранжевый\n" +
                "Бежевый\n" +
                "Белый\n" +
                "Зеленый\n" +
                "Синий\n" +
                "Красный/Желтый\n" +
                "Солнечный\n" +
                "Блестящий\n" +
                "Белоснежный\n" +
                "Выбеленный\n" +
                "Мягкий\n" +
                "Ярко красный";
        try {
            String path = "Pr_19_4.txt";
            FileWriter writer = new FileWriter(path);
            writer.write(text);
            writer.close();
            First5 testCatalog = new First5();
            testCatalog.Catalog(path);
        } catch (IOException e) {
            System.out.println("Ошибка!");
            e.printStackTrace();
        }
    }
}