
import java.time.LocalDateTime;

public class Comment {

    public User author;                 // Автор комментария
    public LocalDateTime date;          // Дата и время комментария
    public String content;
    public String text; // Содержание комментария

    // Конструктор по умолчанию
    public Comment() {
        this.date = LocalDateTime.now();// Устанавливаем текущую дату по умолчанию
    }

    // Конструктор с параметрами
    public Comment(User author, String content, String text) {
        this.author = author;
        this.content = content;
        this.date = LocalDateTime.now();
        this.text=text; // Устанавливаем текущую дату по умолчанию
    }

    // Геттеры и сеттеры
    public User getAuthor() {
        return author;
    }

    // Геттер для текста комментария
    public String getText() {
        return text;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Переопределение метода toString() для удобного вывода
    @Override
    public String toString() {
        return "Comment{" +
                "author=" + (author != null ? author.getName() : "Anonymous") +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}' + "text='" + text + '\'' +
                '}';
    }
}
