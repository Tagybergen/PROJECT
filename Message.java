import java.time.LocalDateTime;

public class Message {

    public Teacher sender;             // Отправитель сообщения (учитель)
    public Employee recipient;         // Получатель сообщения (сотрудник)
    public String text;                // Текст сообщения
    public LocalDateTime date;         // Дата и время отправки
    public Status status;              // Статус сообщения (например, прочитано/не прочитано)

    // Конструктор по умолчанию
    public Message() {
        this.date = LocalDateTime.now(); // Устанавливаем текущую дату по умолчанию
        this.status = Status.UNREAD;    // Статус по умолчанию — "не прочитано"
    }

    // Конструктор с параметрами
    public Message(Teacher sender, Employee recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.date = LocalDateTime.now(); // Устанавливаем текущую дату
        this.status = Status.UNREAD;    // Статус по умолчанию — "не прочитано"
    }

    // Метод для пометки сообщения как прочитанного
    public void markAsRead() {
        this.status = Status.READ;
        System.out.println("Message from " + sender.getName() + " to " + recipient.getName() + " marked as read.");
    }

    // Геттеры и сеттеры
    public Teacher getSender() {
        return sender;
    }

    public void setSender(Teacher sender) {
        this.sender = sender;
    }

    public Employee getRecipient() {
        return recipient;
    }

    public void setRecipient(Employee recipient) {
        this.recipient = recipient;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    // Переопределение метода toString() для удобного вывода информации о сообщении
    @Override
    public String toString() {
        return "Message{" +
                "sender=" + (sender != null ? sender.getName() : "Unknown") +
                ", recipient=" + (recipient != null ? recipient.getName() : "Unknown") +
                ", text='" + text + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
