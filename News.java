
import java.util.ArrayList;
import java.util.List;

public class News {

    public String title;                // Заголовок новости
    public boolean priority;            // Приоритет новости (true - важная новость)
    public String content;              // Содержание новости
    public List<Comment> comments;      // Список комментариев
    public NewsTopic topic;
    public String text; // Тема новости (использует перечисление NewsTopic)

    // Конструктор по умолчанию
    public News() {
        this.comments = new ArrayList<>();
    }

    // Конструктор с параметрами
    public News(String title, boolean priority, String content, NewsTopic topic) {
        this.title = title;
        this.priority = priority;
        this.content = content;
        this.topic = topic;
        this.comments = new ArrayList<>();
    }

    // Метод для добавления комментария
    public void addComment(Comment comment) {
        if (comment != null) {
            comments.add(comment);
            System.out.println("Comment added: " + comment.getText());
        } else {
            System.out.println("Comment is null. Cannot add.");
        }
    }

    // Метод для установки приоритета
    public void setPriority(boolean priority) {
        this.priority = priority;
        System.out.println("Priority for news \"" + title + "\" set to " + (priority ? "high" : "low"));
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isPriority() {
        return priority;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public NewsTopic getTopic() {
        return topic;
    }

    public void setTopic(NewsTopic topic) {
        this.topic = topic;
    }

    // Переопределение метода toString() для удобного вывода
    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", content='" + content + '\'' +
                ", topic=" + topic +
                ", comments=" + comments +
                '}';
    }
}
