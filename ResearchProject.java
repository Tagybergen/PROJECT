import java.util.*;

/**
 *
 */
public class ResearchProject {

    // Поля
    public String topic;
    public List<Researcher> participants;
    public List<ResearchPaper> papers;

    // Конструктор по умолчанию
    public ResearchProject() {
        this.participants = new ArrayList<>();
        this.papers = new ArrayList<>();
    }

    // Конструктор с параметрами
    public ResearchProject(String topic) {
        this.topic = topic;
        this.participants = new ArrayList<>();
        this.papers = new ArrayList<>();
    }

    // Метод для добавления участника
    public void addParticipant(Researcher researcher) {
        if (researcher != null && !participants.contains(researcher)) {
            participants.add(researcher);
            System.out.println("Участник " + researcher.getName() + " добавлен в проект по теме: " + topic);
        } else {
            System.out.println("Этот участник уже добавлен или null.");
        }
    }

    // Метод для добавления статьи
    public void addPaper(ResearchPaper paper) {
        if (paper != null && !papers.contains(paper)) {
            papers.add(paper);
            System.out.println("Статья '" + paper.getTitle() + "' добавлена в проект по теме: " + topic);
        } else {
            System.out.println("Эта статья уже добавлена или null.");
        }
    }

    // Метод для получения списка участников
    public List<Researcher> getParticipants() {
        return participants;
    }

    // Метод для получения списка статей
    public List<ResearchPaper> getPapers() {
        return papers;
    }

    // Метод для получения темы проекта
    public String getTopic() {
        return topic;
    }

    // Метод для установки темы проекта
    public void setTopic(String topic) {
        this.topic = topic;
    }
}
