package Lab11;

import java.util.Scanner;

class Student1 {
    int iDNumber;

    public Student1(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                '}';
    }
}

public class StudentSortingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();
        Student1[] students = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите iDNumber для студента " + (i + 1) + ": ");
            int iDNumber = scanner.nextInt();
            students[i] = new Student1(iDNumber);
        }

        System.out.println("Исходный массив:");
        printStudents(students);

        // Сортируем массив вставками
        insertionSort(students);

        System.out.println("\nОтсортированный массив:");
        printStudents(students);

        scanner.close();
    }

    // Метод для сортировки массива студентов методом вставок по полю iDNumber
    private static void insertionSort(Student1[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student1 currentStudent = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > currentStudent.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = currentStudent;
        }
    }

    // Метод для вывода массива студентов
    private static void printStudents(Student1[] students) {
        for (Student1 student : students) {
            System.out.println(student);
        }
    }
}
