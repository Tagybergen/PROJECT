/**
 * Фабрика для создания объектов Student
 */
public class StudentFactory extends UserFactory {

    // Конструктор по умолчанию
    public StudentFactory() {
    }

    @Override
    public User createUser() {
        // Пример создания студента
        return new Student(
                "S1", // id
                "Alice Smith", // имя
                "alice.smith@example.com", // email
                "securepassword", // пароль
                Role.STUDENT, // роль
                Language.EN, // язык
                2 // год обучения
        );
    }
}
