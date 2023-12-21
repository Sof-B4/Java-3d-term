package Lab17;

import java.util.Scanner;
public class LabClassDriver {
    private static Scanner scanner = new Scanner(System.in);
    private static LabClass labClass = new LabClass();

    public static void main(String[] args) {
        LabClassUI ui = new LabClassUI();
        boolean exit = false;
        System.out.println("Выберите операцию:");
        System.out.println("0. Напечатать студентов");
        System.out.println("1. Добавить студента");
        System.out.println("2. Исключить студента");
        System.out.println("3. Отсортировать студентов по среднему значению оценок");
        System.out.println("4. Найти студента по имени");
        System.out.println("5. Выход");
        while (!exit) {

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 0:
                    ui.printStudents();
                    break;
                case 1:
                    ui.addStudent();
                    break;
                case 2:
                    ui.removeStudent();
                    break;
                case 3:
                    ui.sortStudents();
                    break;
                case 4:
                    ui.searchStudent();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }


}