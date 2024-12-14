import java.util.Date;

public class Complaint {
    public String description;
    public Urgency urgencyLevel;
    public Student student;
    public Teacher teacher;
    public Date date;

    // Конструктор
    public Complaint(String description, Urgency urgencyLevel, Student student, Teacher teacher, Date date) {
        this.description = description;
        this.urgencyLevel = urgencyLevel;
        this.student = student;
        this.teacher = teacher;
        this.date = date;
    }

    // Геттеры и сеттеры
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Urgency getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(Urgency urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Метод toString для удобного вывода информации о жалобе
    @Override
    public String toString() {
        return "Complaint{" +
                "description='" + description + '\'' +
                ", urgencyLevel=" + urgencyLevel +
                ", student=" + (student != null ? student.getName() : "N/A") +
                ", teacher=" + (teacher != null ? teacher.getName() : "N/A") +
                ", date=" + date +
                '}';
    }
}
