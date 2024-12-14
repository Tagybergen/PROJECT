import java.util.ArrayList;
import java.util.List;

public class Course {

    public String name;
    public CourseType type;
    public List<Teacher> instructors = new ArrayList<>();
    public List<Student> students = new ArrayList<>();

    // Конструктор
    public Course(String name, CourseType type) {
        this.name = name;
        this.type = type;
    }

    public void addMark(Student student, Mark mark) {
        // Реализация добавления оценки для студента
        System.out.println("Mark " + mark.getValue() + " added for " + student.getName());
    }

    public Teacher getTeacher() {
        return instructors != null && !instructors.isEmpty() ? instructors.get(0) : null;
    }

    // Метод для добавления инструктора
    public void addInstructor(Teacher instructor) {
        instructors.add(instructor);
        System.out.println("Instructor " + instructor.getName() + " added to course " + name);
    }

    // Метод для добавления студента
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " enrolled in course " + name);
    }

    // Метод для получения списка инструкторов
    public List<Teacher> getInstructors() {
        return instructors;
    }

    // Метод для получения списка студентов
    public List<Student> getStudents() {
        return students;
    }

    // Геттер для имени курса
    public String getName() {
        return name;
    }

    // Сеттер для имени курса
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для типа курса
    public CourseType getType() {
        return type;
    }

    // Сеттер для типа курса
    public void setType(CourseType type) {
        this.type = type;
    }
}

