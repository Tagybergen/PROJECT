/**
 * Фабрика для создания объектов Teacher
 */
public class TeacherFactory extends UserFactory {

    // Конструктор по умолчанию
    public TeacherFactory() {
    }

    @Override
    public User createUser() {
        // Пример создания учителя
        return new Teacher(
                "T1", // id
                "John Doe", // имя
                "john.doe@example.com", // email
                "password123", // пароль
                Role.TEACHER, // роль
                Language.EN, // язык
                "Mathematics", // предмет
                true // является ли профессором
        );
    }
}
