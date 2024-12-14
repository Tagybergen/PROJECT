import java.util.Objects;

public class BookEntry {

    public Book book;      // Книга, связанная с записью
    public int quantity;   // Количество доступных копий

    // Конструктор по умолчанию
    public BookEntry() {
    }

    // Конструктор с параметрами
    public BookEntry(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Метод для уменьшения количества копий
    public boolean borrowBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Book borrowed: " + book.getTitle() + ". Remaining copies: " + quantity);
            return true;
        } else {
            System.out.println("No copies available for the book: " + book.getTitle());
            return false;
        }
    }

    // Метод для возврата книги
    public void returnBook() {
        quantity++;
        System.out.println("Book returned: " + book.getTitle() + ". Available copies: " + quantity);
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "BookEntry{" +
                "book=" + (book != null ? book.getTitle() : "Unknown") +
                ", quantity=" + quantity +
                '}';
    }

    // Переопределение методов equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntry bookEntry = (BookEntry) o;
        return quantity == bookEntry.quantity &&
                Objects.equals(book, bookEntry.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, quantity);
    }
}
