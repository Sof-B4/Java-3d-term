package Lab17;

import java.util.Scanner;

public class LabClassUI {
    private static Scanner scanner = new Scanner(System.in);
    private static LabClass labClass = new LabClass();

    public static void addStudent() {
        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        System.out.println("Введите сренднюю оценку студента:");
        double averageGrade = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(name, averageGrade);
        labClass.addStudent(student);
        System.out.println("Студент успешно добавлен");
    }

    public static void removeStudent() {
        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        try {
            labClass.removeStudent(name);
            System.out.println("Студент успешно исключен");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void sortStudents() {
        labClass.sortStudentsByAverageGrade();
        System.out.println("Студенты отсортированные по оценкам:");
        for (Student student : labClass.getStudents()) {
            System.out.println(student);
        }
    }

    public static void searchStudent() {
        System.out.println("Введите имя студента:");
        String name = scanner.nextLine();
        try {
            Student student = labClass.findStudentByName(name);
            System.out.println(student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printStudents() {
        System.out.println(labClass.getStudents());
    }
}