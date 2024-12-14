import java.util.*;

public class Manager extends Employee {

    private List<News> managedNews = new ArrayList<>();
    private List<Request> employeeRequests = new ArrayList<>();

    // Конструктор по умолчанию
    public Manager() {
        super("", "", "", "", Role.MANAGER, Language.EN, "", "");
    }

    // Конструктор с параметрами
    public Manager(String id, String name, String email, String password, Role role, Language language, String department, String position) {
        super(id, name, email, password, role, language, department, position);
    }

    // Метод для получения списка новостей, которыми управляет менеджер
    public List<News> getManagedNews() {
        return managedNews;
    }

    // Метод для приоритизации новостей о научных исследованиях
    public void prioritizeResearchNews() {
        for (News news : managedNews) {
            if (news.getTopic() == NewsTopic.RESEARCH) {
                news.setPriority(true);
                System.out.println("News \"" + news.getTitle() + "\" marked as priority.");
            }
        }
    }

    // Метод для объявления исследователя с самым высоким числом цитирований
    public void announceTopCitedResearcher(Researcher researcher) {
        System.out.println("Top cited researcher: " + researcher.getName());
    }

    // Метод для подтверждения регистрации студента
    public void approveStudentRegistration(Student student, Course course) {
        course.addStudent(student);
        System.out.println("Student " + student.getName() + " approved for registration in course: " + course.getName());
    }

    // Метод для добавления курсов для регистрации
    public void addCoursesForRegistration(Course course, Major major, int year) {
        System.out.println("Course \"" + course.getName() + "\" added for registration for major \"" + major.getName() + "\", year: " + year);
    }

    // Метод для назначения курса преподавателю
    public void assignCourseToTeacher(Course course, Teacher teacher) {
        course.addInstructor(teacher);
        System.out.println("Course \"" + course.getName() + "\" assigned to teacher " + teacher.getName());
    }

    // Метод для создания статистического отчета
    public void createStatisticalReport() {
        System.out.println("Statistical report created.");
    }

    // Метод для просмотра информации о студентах и преподавателях
    public List<Employee> viewInfoAboutStudentsAndTeachers(SortingOrder order) {
        System.out.println("Viewing information about students and teachers sorted by: " + order);
        return new ArrayList<>();
    }

    // Метод для просмотра запросов от сотрудников
    public List<Request> viewRequestsFromEmployees() {
        return employeeRequests;
    }
}
