package Lab15;

//В шаблоне проектирования модель MVC представляет собой уровень
//данных, который определяет бизнес-логику системы, а также представляет
//состояние приложения. Объекты модели извлекают и сохраняют состояние
//модели в базе данных. На этом уровне мы применяем правила к данным,
//которые в конечном итоге представляют концепции, которыми управляет
//наше приложение. Теперь создадим модель с помощью класса Course.

public class Course {
    private String CourseName;
    private String CourseId;
    private String CourseCategory;
    public String getId() {
        return CourseId;
    }
    public void setId(String id) {
        this.CourseId = id;
    }
    public String getName() {
        return CourseName;
    }
    public void setName(String name) {
        this.CourseName = name;
    }
    public String getCategory() {
        return CourseCategory;
    }
    public void setCategory(String category) {
        this.CourseCategory = category;
    }
}
