package Lab11;

import java.util.ArrayList;
import java.util.List;


public class StudentSortingTest3  {
    public static List<Student> mergeSortedStudentLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).gpa < list2.get(j).gpa) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));
        list1.add(new Student("Charlie", 4.0));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("David", 3.9));
        list2.add(new Student("Eve", 3.7));

        List<Student> mergedList = mergeSortedStudentLists(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
