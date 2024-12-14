import java.util.ArrayList;
import java.util.List;

public class Book {

    public String title;
    public String author;
    public String isbn;
    public int copiesAvailable;
    public List<Student> borrowers;

    public Book() {
        this.borrowers = new ArrayList<>();
    }

    public Book(String title, String author, String isbn, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.copiesAvailable = copiesAvailable;
        this.borrowers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public List<Student> getBorrowers() {
        return borrowers;
    }

    public boolean borrowBook(Student student) {
        if (copiesAvailable > 0) {
            borrowers.add(student);
            copiesAvailable--;
            System.out.println(student.getName() + " borrowed the book: " + title);
            return true;
        } else {
            System.out.println("No copies available for the book: " + title);
            return false;
        }
    }

    public boolean returnBook(Student student) {
        if (borrowers.contains(student)) {
            borrowers.remove(student);
            copiesAvailable++;
            System.out.println(student.getName() + " returned the book: " + title);
            return true;
        } else {
            System.out.println(student.getName() + " did not borrow the book: " + title);
            return false;
        }
    }

    public boolean isAvailable() {
        return copiesAvailable > 0;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Copies Available: " + copiesAvailable);
        System.out.println("Borrowers: ");
        for (Student borrower : borrowers) {
            System.out.println("- " + borrower.getName());
        }
    }
}
