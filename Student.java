import java.util.ArrayList;
import java.util.List;

public class Student extends User implements MyObserver{
    public List<Course> majorCourses = new ArrayList<>();
    public List<Course> electiveCourses = new ArrayList<>();
    public List<Course> minorCourses = new ArrayList<>();
    public List<Book> borrowedBooks = new ArrayList<>();
    public List<StudentOrganization> organizations = new ArrayList<>();
    public List<TranscriptEntry> transcript = new ArrayList<>();
    public DiplomaProject diplomaProject;
    public Researcher supervisor;
    public int year;

    // Constructor
    public Student(String id, String name, String email, String password, Role role, Language language, int year) {
        super(id, name, email, password, role, language);
        this.year = year;
    }


    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    // Methods for interacting with courses
    public void enrollCourse(Course course) {
        majorCourses.add(course);
        course.addStudent(this);
        System.out.println(getName() + " enrolled in " + course.getName());
    }

    public void addElectiveCourse(Course course) {
        electiveCourses.add(course);
        System.out.println(getName() + " added elective course: " + course.getName());
    }

    public void viewCourses() {
        System.out.println(getName() + " is viewing their courses:");
        for (Course course : majorCourses) {
            System.out.println("Major: " + course.getName());
        }
        for (Course course : minorCourses) {
            System.out.println("Minor: " + course.getName());
        }
        for (Course course : electiveCourses) {
            System.out.println("Elective: " + course.getName());
        }
    }

    public Teacher viewTeacherInfo(Course course) {
        System.out.println(getName() + " is viewing teacher info for course: " + course.getName());
        return course.getTeacher();
    }

    // Methods for interacting with books
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(getName() + " borrowed the book: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(getName() + " returned the book: " + book.getTitle());
    }

    // Methods for interacting with organizations
    public void joinOrganization(StudentOrganization org) {
        organizations.add(org);
        System.out.println(getName() + " joined organization: " + org.getName());
    }

    public void leaveOrganization(StudentOrganization org) {
        organizations.remove(org);
        System.out.println(getName() + " left organization: " + org.getName());
    }

    // Methods for interacting with supervisors
    public void assignSupervisor(Researcher supervisor) {
        this.supervisor = supervisor;
        System.out.println(getName() + " assigned a supervisor: " + supervisor);
    }

    // Methods for interacting with transcript
    public List<TranscriptEntry> viewTranscript() {
        return transcript;
    }

    // Getter and Setter for Diploma Project
    public DiplomaProject getDiplomaProject() {
        return diplomaProject;
    }

    public void setDiplomaProject(DiplomaProject diplomaProject) {
        this.diplomaProject = diplomaProject;
    }

    // Getters and setters for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters for courses
    public List<Course> getMajorCourses() {
        return majorCourses;
    }

    public List<Course> getElectiveCourses() {
        return electiveCourses;
    }

    public List<Course> getMinorCourses() {
        return minorCourses;
    }

    // Getters for books and organizations
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<StudentOrganization> getOrganizations() {
        return organizations;
    }
}
