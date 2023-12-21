package Lab17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabClass {
    private List<Student> students;
    public LabClass() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(String name) throws StudentNotFoundException {
        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            throw new StudentNotFoundException("Студент не найден");
        }
    }
    public void sortStudentsByAverageGrade() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getAverageGrade(), s2.getAverageGrade());
            }
        });
    }
    public Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент не найден");
    }
    public List<Student> getStudents() {
        return students;
    }
}
