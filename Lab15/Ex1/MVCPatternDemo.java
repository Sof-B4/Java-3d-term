package Lab15.Ex1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new
                StudentController(model, view);
        controller.updateView();
        controller.setStudentRollNo("0119");
        System.out.println("\nПосле обновления информация о курсе, вывод выглядит следующим образом.");
        controller.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setName("Ванечка");
        student.setRollNo("0119");
        return student;
    }
}
