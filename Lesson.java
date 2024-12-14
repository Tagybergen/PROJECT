import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Lesson {

    public LessonType type;             // Тип занятия (Lecture, Practice, etc.)
    public Course course;               // Курс, к которому относится урок
    public LocalDate date;              // Дата занятия
    public List<Teacher> instructors;   // Преподаватели, ведущие занятие

    // Конструктор по умолчанию
    public Lesson() {
        this.instructors = new ArrayList<>();
    }

    // Конструктор с параметрами
    public Lesson(LessonType type, Course course, LocalDate date) {
        this.type = type;
        this.course = course;
        this.date = date;
        this.instructors = new ArrayList<>();
    }

    // Метод для добавления преподавателя
    public void addInstructor(Teacher instructor) {
        if (!instructors.contains(instructor)) {
            instructors.add(instructor);
            System.out.println("Instructor " + instructor.getName() + " added to lesson on " + date);
        } else {
            System.out.println("Instructor " + instructor.getName() + " is already assigned to this lesson.");
        }
    }

    // Метод для удаления преподавателя
    public void removeInstructor(Teacher instructor) {
        if (instructors.contains(instructor)) {
            instructors.remove(instructor);
            System.out.println("Instructor " + instructor.getName() + " removed from lesson on " + date);
        } else {
            System.out.println("Instructor " + instructor.getName() + " is not assigned to this lesson.");
        }
    }

    // Геттеры и сеттеры
    public LessonType getType() {
        return type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Teacher> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Teacher> instructors) {
        this.instructors = instructors;
    }
}
