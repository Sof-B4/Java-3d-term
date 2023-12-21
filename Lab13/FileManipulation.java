package Lab13;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Реализовать запись в файл введенной с клавиатуры информации
        System.out.println("Введите информацию для записи в файл:");
        String input = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write(input);
            writer.close();
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }

        // 2. Реализовать вывод информации из файла на экран
        try {
            FileReader reader = new FileReader("example.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
        }

        // 3. Заменить информацию в файле на информацию, введенную с клавиатуры
        System.out.println("\nВведите новую информацию для замены в файле:");
        String newInput = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write(newInput);
            writer.close();
            System.out.println("Информация в файле успешно заменена.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }

        // 4. Добавить в конец исходного файла текст, введенный с клавиатуры
        System.out.println("Введите текст для добавления в файл:");
        String textToAdd = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter("example.txt", true); // Добавление в конец файла
            writer.write(textToAdd);
            writer.close();
            System.out.println("Текст успешно добавлен в файл.");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
