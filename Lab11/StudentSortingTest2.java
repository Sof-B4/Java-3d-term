package Lab11;

import java.util.Comparator;
import java.util.Arrays;

class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Сравнение студентов по их итоговым баллам в порядке убывания
        if (student1.getGPA() < student2.getGPA()) {
            return 1; // Если первый студент имеет более низкий балл, он идет после второго.
        } else if (student1.getGPA() > student2.getGPA()) {
            return -1; // Если первый студент имеет более высокий балл, он идет перед вторым.
        } else {
            return 0; // Если баллы равны, порядок не важен.
        }
    }
}

public class StudentSortingTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Alice", 3.8),
                new Student("Bob", 3.5),
                new Student("Charlie", 4.0),
                new Student("David", 3.9),
                new Student("Eve", 3.7)
        };

        System.out.println("Исходный массив студентов:");
        printStudents(students);

        // Сортируем массив студентов с использованием SortingStudentsByGPA
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nОтсортированный массив студентов по убыванию GPA:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
