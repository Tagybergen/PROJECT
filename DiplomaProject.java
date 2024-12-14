
import java.util.*;

public class DiplomaProject {

    private Student student; // The student assigned to the diploma project
    private List<ResearchPaper> publishedPapers = new ArrayList<>(); // List of published research papers

    // Default constructor
    public DiplomaProject() {
    }

    // Constructor with parameters
    public DiplomaProject(Student student) {
        this.student = student;
    }

    // Method to add a research paper to the published papers list
    public void addResearchPaper(ResearchPaper paper) {
        if (paper != null) {
            publishedPapers.add(paper);
            System.out.println("Research paper added: " + paper.getTitle());
        } else {
            System.out.println("Invalid research paper.");
        }
    }

    // Getters and setters
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(List<ResearchPaper> publishedPapers) {
        this.publishedPapers = publishedPapers;
    }
}
