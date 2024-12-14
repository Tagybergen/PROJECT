
import java.util.Objects;

/**
 * Представляет студенческую организацию.
 */
public class StudentOrganization {

    // Поля
    public String name;
    public String description;

    // Конструктор по умолчанию
    public StudentOrganization() {
    }

    // Конструктор с параметрами
    public StudentOrganization(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Геттер для имени
    public String getName() {
        return name;
    }

    // Сеттер для имени
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для описания
    public String getDescription() {
        return description;
    }

    // Сеттер для описания
    public void setDescription(String description) {
        this.description = description;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "StudentOrganization{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    // Переопределение equals для сравнения организаций
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentOrganization that = (StudentOrganization) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
    }

    // Переопределение hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
