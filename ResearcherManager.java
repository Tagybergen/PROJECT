import java.util.*;

/**
 * Класс ResearcherManager управляет исследователями и их публикациями.
 */
public class ResearcherManager {

    public List<Researcher> researchers = new ArrayList<>();

    // Конструктор по умолчанию
    public ResearcherManager() {
    }

    // Метод для сортировки статей по дате публикации
    public List<ResearchPaper> sortByDate() {
        List<ResearchPaper> allPapers = getAllResearchPapers();
        allPapers.sort(Comparator.comparing(ResearchPaper::getDatePublished));
        System.out.println("Статьи отсортированы по дате публикации.");
        return allPapers;
    }

    // Метод для сортировки статей по количеству цитирований
    public List<ResearchPaper> sortByCitations() {
        List<ResearchPaper> allPapers = getAllResearchPapers();
        allPapers.sort(Comparator.comparingInt(ResearchPaper::getCitations).reversed());
        System.out.println("Статьи отсортированы по количеству цитирований.");
        return allPapers;
    }

    // Метод для сортировки статей по количеству страниц
    public List<ResearchPaper> sortByPages() {
        List<ResearchPaper> allPapers = getAllResearchPapers();
        allPapers.sort(Comparator.comparingInt(ResearchPaper::getPages));
        System.out.println("Статьи отсортированы по количеству страниц.");
        return allPapers;
    }

    // Метод для получения всех статей всех исследователей
    private List<ResearchPaper> getAllResearchPapers() {
        List<ResearchPaper> allPapers = new ArrayList<>();
        for (Researcher researcher : researchers) {
            allPapers.addAll(researcher.getResearchPapers());
        }
        return allPapers;
    }

    // Метод для добавления исследователя в список
    public void addResearcher(Researcher researcher) {
        if (!researchers.contains(researcher)) {
            researchers.add(researcher);
            System.out.println("Исследователь " + researcher.getName() + " добавлен в систему.");
        } else {
            System.out.println("Исследователь " + researcher.getName() + " уже существует в системе.");
        }
    }

    // Геттеры и сеттеры
    public List<Researcher> getResearchers() {
        return researchers;
    }

    public void setResearchers(List<Researcher> researchers) {
        this.researchers = researchers;
    }
}
