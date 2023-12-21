package Lab15.Ex2;

//• Класс Employee – сотрудник будет выступать в качестве слоя модели
//• Класс EmployeeView будет действовать как слой представления.
//• Класс EmployeeContoller будет действовать как уровень
public class Employee {
    private String name;
    private String salary;
    public String getName() {
        return name;
    }
    public String getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
}