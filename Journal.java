import java.util.*;

/**
 * Класс Journal представляет научный журнал с возможностью подписки пользователей и публикации статей.
 */
public class Journal {

    public String name;
    public List<User> subscribers = new ArrayList<>();
    public List<ResearchPaper> papers = new ArrayList<>();

    // Конструктор
    public Journal(String name) {
        this.name = name;
    }

    // Метод для подписки пользователя на журнал
    public void subscribe(User user) {
        if (!subscribers.contains(user)) {
            subscribers.add(user);
            System.out.println(user.getName() + " подписался на журнал: " + name);
        } else {
            System.out.println(user.getName() + " уже подписан на журнал: " + name);
        }
    }

    // Метод для публикации научной статьи
    public void publishPaper(ResearchPaper paper) {
        if (!papers.contains(paper)) {
            papers.add(paper);
            System.out.println("Статья \"" + paper.title + "\" опубликована в журнале: " + name);
            notifySubscribers(paper); // Уведомляем подписчиков о новой статье
        } else {
            System.out.println("Статья \"" + paper.title + "\" уже опубликована в журнале: " + name);
        }
    }

    // Метод для уведомления подписчиков о новой статье
    public void notifySubscribers(ResearchPaper paper) {
        System.out.println("Уведомляем подписчиков журнала \"" + name + "\" о новой статье: " + paper.title);
        for (User subscriber : subscribers) {
            System.out.println("Уведомление отправлено пользователю: " + subscriber.getName());
        }
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getSubscribers() {
        return subscribers;
    }

    public List<ResearchPaper> getPapers() {
        return papers;
    }
}
