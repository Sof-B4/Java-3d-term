package Lab15;

//Этот уровень шаблона проектирования MVC представляет выходные
//данные приложения или пользовательского интерфейса. Он отображает
//данные, полученные контроллером из уровня модели, и предоставляет данные
//пользователю по запросу. Он получает всю необходимую информацию от
//контроллера, и ему не нужно напрямую взаимодействовать с бизнес-уровнем.
//Создадим представление с помощью класса CourseView

public class CourseView {
    public void printCourseDetails(String CourseName, String
            CourseId, String CourseCategory){
        System.out.println("Детали курса: ");
        System.out.println("Имя: " + CourseName);
        System.out.println("ID: " + CourseId);
        System.out.println("Категория: " +
                CourseCategory);
    }
}
