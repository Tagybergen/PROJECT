/**
 * Класс для записи информации о курсе в транскрипт студента
 */
public class TranscriptEntry {

    // Курс, связанный с записью
    public Course course;

    // Оценка по курсу
    public String grade;

    // Количество кредитов курса
    public int credits;

    // Конструктор по умолчанию
    public TranscriptEntry() {
    }

    // Конструктор с параметрами
    public TranscriptEntry(Course course, String grade, int credits) {
        this.course = course;
        this.grade = grade;
        this.credits = credits;
    }

    // Геттеры и сеттеры
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Метод для отображения записи транскрипта в удобочитаемом виде
    @Override
    public String toString() {
        return "TranscriptEntry{" +
                "course=" + (course != null ? course.getName() : "N/A") +
                ", grade='" + grade + '\'' +
                ", credits=" + credits +
                '}';
    }
}
