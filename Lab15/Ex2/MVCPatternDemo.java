package Lab15.Ex2;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new
                EmployeeController(model, view);
        controller.updateView();
        controller.setEmployeeSalary("0");
        System.out.println("\nПосле обновления информация о курсе, вывод выглядит следующим образом.");
        controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee employee = new Employee();
        employee.setName("Ванечка");
        employee.setSalary("1000000");
        return employee;
    }
}