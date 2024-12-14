public class Employee extends User {
    public String department;
    public String position;

    public Employee(String id, String name, String email, String password, Role role, Language language, String department, String position) {
        super(id, name, email, password, role, language);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public void sendMessage(Employee recipient, String message) {
        System.out.println(getName() + " sent a message to " + recipient.getName() + ": " + message);
    }
    public void sendRequest(Request request) {
        System.out.println(getName() + " sent a request: " + request.getDescription());
    }

}
