import java.util.HashMap;
import java.util.Map;

public class Librarian extends Employee {
    public Map<Book, Integer> inventory = new HashMap<>();

    // Конструктор с параметрами
    public Librarian(String id, String name, String email, String password, Role role, Language language, String department, String position) {
        super(id, name, email, password, role, language, department, position);
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book book, int quantity) {
        inventory.put(book, inventory.getOrDefault(book, 0) + quantity);
        System.out.println("Added " + quantity + " copies of " + book.getTitle());
    }

    // Метод для выдачи книги студенту
    public void lendBook(Student student, Book book) {
        if (inventory.containsKey(book) && inventory.get(book) > 0) {
            inventory.put(book, inventory.get(book) - 1);
            student.borrowBook(book);
            System.out.println("Lent " + book.getTitle() + " to " + student.getName());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available.");
        }
    }

    // Метод для возврата книги
    public void acceptReturn(Book book) {
        inventory.put(book, inventory.getOrDefault(book, 0) + 1);
        System.out.println("Accepted return of " + book.getTitle());
    }
}
