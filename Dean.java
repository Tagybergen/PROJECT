public class Dean extends Employee {

    public String faculty;

    // Конструктор с параметрами
    public Dean(String id, String name, String email, String password, Role role, Language language, String department, String position, String faculty) {
        super(id, name, email, password, role, language, department, position);
        this.faculty = faculty;
    }

    // Метод для обработки жалобы
    public void receiveComplaint(Complaint complaint) {
        if (complaint != null) {
            System.out.println("Dean of faculty " + faculty + " received a complaint:");
            System.out.println("Description: " + complaint.description);
            System.out.println("Urgency: " + complaint.urgencyLevel);
            System.out.println("From student: " + complaint.student.getName());
        } else {
            System.out.println("No complaint received.");
        }
    }

    // Геттер для факультета
    public String getFaculty() {
        return faculty;
    }

    // Сеттер для факультета
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
