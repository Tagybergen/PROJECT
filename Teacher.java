import java.util.*;

public class Teacher extends User {
    public List<Student> studentsSupervised = new ArrayList<>();
    public String subject;
    public boolean isProfessor;
    public List<MyObserver> observers = new ArrayList<>();

    // Конструктор
    public Teacher(String id, String name, String email, String password, Role role, Language language, String subject, boolean isProfessor) {
        super(id, name, email, password, role, language);
        this.subject = subject;
        this.isProfessor = isProfessor;
    }


    // Метод для добавления наблюдателя
    public void attach(MyObserver myObserver) {
        observers.add(myObserver);
    }

    // Метод для удаления наблюдателя
    public void detach(MyObserver myObserver) {
        observers.remove(myObserver);
    }

    // Метод для уведомления всех наблюдателей
    public void notifyObservers(String message) {
        for (MyObserver myObserver : observers) {
            myObserver.update(message);
        }
    }


    // Метод для отправки жалобы
    public void sendComplaint(Student student, Dean dean, Urgency urgency, String description) {
        Complaint complaint = new Complaint(description, urgency, student, this, new Date());
        dean.receiveComplaint(complaint);
        System.out.println("Жалоба отправлена учителем " + getName() + " на студента " + student.getName());
    }

    // Метод для назначения оценки студенту
    public void assignMark(Student student, Course course, Mark mark) {
        course.addMark(student, mark);
        System.out.println("Оценка " + mark.getValue() + " назначена студенту " + student.getName() + " по курсу " + course.getName());
    }

    // Геттеры
    public String getSubject() {
        return subject;
    }

    public boolean isProfessor() {
        return isProfessor;
    }
}
