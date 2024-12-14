/**
 * Базовая фабрика для создания пользователей
 */
public class UserFactory {

    // Конструктор по умолчанию
    public UserFactory() {
    }

    /**
     * Метод для создания пользователя (реализуется в подклассах)
     */
    public User createUser() {
        throw new UnsupportedOperationException("This method should be overridden in a subclass.");
    }
}
