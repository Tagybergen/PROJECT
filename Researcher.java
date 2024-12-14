import java.util.*;

public interface Researcher {
    List<ResearchProject> getResearchProjects();

    List<ResearchPaper> getResearchPapers();

    int getHIndex();

    String getName(); // Добавлено

    void printPapers(Comparator<ResearchPaper> comparator);

    List<ResearchPaper> getResearchPapersSortedByDate();

    int calculateHIndex();

    List<ResearchPaper> getResearchPapersSortedByCitations();

    List<ResearchPaper> getResearchPapersSortedByLength();

    List<Researcher> getTopCitedResearchers();
}
